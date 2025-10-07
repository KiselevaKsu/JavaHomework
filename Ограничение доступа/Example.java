public class Example { //основной класс
    public String publicVar="Все видят";
    String defaultVar="Только в пакете";
    protected String protectedVar="Пакет+наследники";
    private String privateVar="Только этот класс";

    public void test(){
        System.out.println(privateVar); //видно здесь
    }

    public static void main(String[] args) {
        Example ex = new Example();
        ex.test();
        System.out.println("Программа запущена!");
    }
}