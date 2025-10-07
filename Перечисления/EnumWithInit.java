public class EnumWithInit {
    public static void main(String[] args) {
        System.out.println(Size.SMALL.getDescription());
    }
}
enum Size {
    SMALL("Маленький"), MEDIUM("Средний"), LARGE("Большой");
    
    private String description;
    
    Size(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
}
