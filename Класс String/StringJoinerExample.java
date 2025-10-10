import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        // с разделителем
        StringJoiner sj1 = new StringJoiner(", ");
        sj1.add("Яблоко");
        sj1.add("Банан");
        sj1.add("Апельсин");
        System.out.println("Фрукты: " + sj1.toString());
        
        //с префиксом и суффиксом
        StringJoiner sj2 = new StringJoiner(" | ", "[ ", " ]");
        sj2.add("Ксения");
        sj2.add("Мария");
        sj2.add("Анна");
        System.out.println("Имена: " + sj2.toString());
        
        //объединение
        StringJoiner sj3 = new StringJoiner("-");
        sj3.add("2024");
        sj3.add("01");
        sj3.add("15");
        
        StringJoiner sj4 = new StringJoiner(".");
        sj4.add("День");
        sj4.add("Месяц");
        sj4.add("Год");
        
        sj4.merge(sj3);
        System.out.println("Дата: " + sj4.toString());
        
        // с пустым значением
        StringJoiner sj5 = new StringJoiner("/", "Путь: ", "");
        System.out.println("Пустой: " + sj5.toString());
        sj5.add("home");
        sj5.add("user");
        sj5.add("documents");
        System.out.println("Заполненный: " + sj5.toString());
    }
}