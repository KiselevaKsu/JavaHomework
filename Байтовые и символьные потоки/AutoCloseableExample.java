public class AutoCloseableExample {
    public static void main(String[] args) {
        // ресурс закроется автоматически
        try (MyResource resource = new MyResource()) {
            resource.use();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyResource implements AutoCloseable {
    public void use() {
        System.out.println("Используем ресурс");
    }
    
    @Override
    public void close() {
        System.out.println("Ресурс закрыт");
    }
}