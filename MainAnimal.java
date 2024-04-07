public class MainAnimal {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Барсик"), new Cat("Мурзик"), new Cat("Васька")};
        Bowl bowl = new Bowl(30);
        for (Cat cat : cats) {
            cat.eat(bowl);
        }
        for (Cat cat : cats) {
            System.out.println(cat.name + " сытость " + cat.isFull());
        }
        System.out.println("В миске осталось " + bowl.getFoodAmount() + " еды ");
    }
}