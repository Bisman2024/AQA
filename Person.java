public class Person {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;
    public Person(String fullName, String position, String email, String phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public void info() {
        System.out.println("ФИО: " + fullName + "; Должность: " + position + "; Email: " + email + "; Телефон: " + phoneNumber + "; Зарплата: " + salary + "; Возраст: " + age);
    }
}

