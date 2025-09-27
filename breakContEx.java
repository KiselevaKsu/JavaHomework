public class breakContEx {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            if(i == 3) continue; // пропустит 3
            if(i == 5) break;    // остановится на 5
            System.out.println(i);
        }
    }
}
