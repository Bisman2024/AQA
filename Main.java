// задание №1
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Чучин Илья Александрович", "AQA инженер", "bisman2024@gmail.com", "+79267087762", 1000000.0, 39);
        employee.info();
        System.out.println();
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivian0@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Petrov Petr", "Strelok", "ivian1@mailbox.com", "892312313", 30000, 30);
        persArray[2] = new Person("Sidorov Sidr", "Navodchik", "ivian2@mailbox.com", "892312314", 30000, 30);
        persArray[3] = new Person("Nikolaev Nikolay", "Radist", "ivian3@mailbox.com", "892312315", 30000, 30);
        persArray[4] = new Person("Sergeev Sergey", "Povar", "ivian4@mailbox.com", "892312316", 30000, 30);
        for (Person person : persArray) {
            person.info();
        }
        System.out.println();
        Park park = new Park();
        Park.Attr americanGorky = park.new Attr("Американские горки", "10:00 - 22:00", 150.0);
        Park.Attr kolesoOb = park.new Attr("Колесо обозрения", "09:00 - 20:00", 100.0);
        americanGorky.info();
        kolesoOb.info();
    }

}