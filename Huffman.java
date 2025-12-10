import java.io.*;
import java.util.*;

public class Huffman {

    static class Node implements Comparable<Node>, Serializable {
        private static final long serialVersionUID = 1L;

        int freq;
        byte value;
        Node left;
        Node right;

        Node(byte value, int freq) {
            this.value = value;
            this.freq = freq;
        }

        Node(Node left, Node right) {
            this.left = left;
            this.right = right;
            this.freq = left.freq + right.freq;
        }

        boolean isLeaf() {
            return (left == null) && (right == null);
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.freq, o.freq);
        }
    }

    public static void main(String[] args) throws Exception {
        if (args.length < 3) {
            System.out.println("Usage:");
            System.out.println("  encode <inputFile> <outputFile>");
            System.out.println("  decode <inputFile> <outputFile>");
            return;
        }

        String command = args[0];
        String input = args[1];
        String output = args[2];

        switch (command) {
            case "encode":
                encodeFile(input, output);
                break;
            case "decode":
                decodeFile(input, output);
                break;
            default:
                System.out.println("Unknown command.");
        }
    }

    private static void encodeFile(String inputFile, String outputFile) throws Exception {
        byte[] data = readAllBytes(inputFile);
        if (data.length == 0) {
            throw new RuntimeException("Input file is empty");
        }

        Map<Byte, Integer> freqMap = new HashMap<>();// частоты
        for (byte b : data) {
            freqMap.put(b, freqMap.getOrDefault(b, 0) + 1);
        }

        Node root = buildTree(freqMap);

        Map<Byte, String> codes = new HashMap<>();
        buildCodeTable(root, "", codes);

        StringBuilder bitString = new StringBuilder();
        for (byte b : data) {
            bitString.append(codes.get(b));
        }

        byte[] compressed = bitStringToBytes(bitString.toString());

        // дерево → число бит → байты данных
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(outputFile))) {
            out.writeObject(root);
            out.writeInt(bitString.length());
            out.writeInt(compressed.length);
            out.write(compressed);
        }

        System.out.println("Encoding complete.");
    }

    private static void decodeFile(String inputFile, String outputFile) throws Exception {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(inputFile))) {

            Node root = (Node) in.readObject();
            int bitCount = in.readInt();
            int dataLength = in.readInt();

            byte[] compressed = new byte[dataLength];
            in.readFully(compressed);

            String bits = bytesToBitString(compressed, bitCount);
            List<Byte> result = new ArrayList<>();

            Node cur = root;
            for (int i = 0; i < bits.length(); i++) {
                cur = (bits.charAt(i) == '0') ? cur.left : cur.right;
                if (cur.isLeaf()) {
                    result.add(cur.value);
                    cur = root;
                }
            }

            byte[] decoded = new byte[result.size()];
            for (int i = 0; i < decoded.length; i++) decoded[i] = result.get(i);

            try (FileOutputStream out = new FileOutputStream(outputFile)) {
                out.write(decoded);
            }
        }

        System.out.println("Decoding complete.");
    }

    private static Node buildTree(Map<Byte, Integer> freqMap) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        for (Map.Entry<Byte, Integer> e : freqMap.entrySet()) {
            pq.add(new Node(e.getKey(), e.getValue()));
        }
        while (pq.size() > 1) {
            Node a = pq.poll();
            Node b = pq.poll();
            pq.add(new Node(a, b));
        }
        return pq.poll();
    }

    private static void buildCodeTable(Node node, String prefix, Map<Byte, String> table) {
        if (node.isLeaf()) {
            table.put(node.value, prefix);
        } else {
            buildCodeTable(node.left, prefix + "0", table);
            buildCodeTable(node.right, prefix + "1", table);
        }
    }

    private static byte[] readAllBytes(String path) throws IOException {
        try (FileInputStream in = new FileInputStream(path)) {
            return in.readAllBytes();
        }
    }

    private static byte[] bitStringToBytes(String bits) {
        int len = (bits.length() + 7) / 8;
        byte[] arr = new byte[len];

        for (int i = 0; i < bits.length(); i++) {
            int byteIndex = i / 8;
            int bitIndex = 7 - (i % 8);
            if (bits.charAt(i) == '1') {
                arr[byteIndex] |= (1 << bitIndex);
            }
        }
        return arr;
    }

    private static String bytesToBitString(byte[] arr, int bitCount) {
        StringBuilder sb = new StringBuilder();
        int totalBits = bitCount;
        for (int i = 0; i < arr.length; i++) {
            for (int bit = 7; bit >= 0; bit--) {
                if (sb.length() == totalBits) return sb.toString();
                sb.append(((arr[i] >> bit) & 1) == 1 ? '1' : '0');
            }
        }
        return sb.toString();
    }
}
