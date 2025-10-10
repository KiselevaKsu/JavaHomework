import java.util.Date;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        Date now = new Date();
        
        // %tH - час (00-23)
        System.out.printf("Текущий час: %tH%n", now);
        
        // %tM - минуты (00-59)  
        System.out.printf("Текущие минуты: %tM%n", now);
        
        // %tY - год в 4-значном формате
        System.out.printf("Текущий год: %tY%n", now);
        
        // %tB - полное название месяца
        System.out.printf("Текущий месяц: %tB%n", now);
        
        // %tA - полное название дня недели
        System.out.printf("Сегодня: %tA%n", now);
    }
}