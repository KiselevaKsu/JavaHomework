public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public boolean equals(Object obj) {
        // проверка на тот же объект
        if (this == obj) return true;
        
        // проверка на null и тот же класс
        if (obj == null || getClass() != obj.getClass()) return false;
        
        // сравнение полей
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }
}