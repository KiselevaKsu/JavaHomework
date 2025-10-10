class AgeException extends Exception {
    // конструктор по умолчанию
    public AgeException() {
        super("Некорректный возраст");
    }
    
    // с сообщением
    public AgeException(String message) {
        super(message);
    }
    
    // с причиной
    public AgeException(Throwable cause) {
        super(cause);
    }
}

public class TestException {
    public static void main(String[] args) {
        try {
            throw new AgeException("Возраст не может быть отрицательным");
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            throw new AgeException();
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}