class Cat extends Animal {
    private static int catCount = 0;
    private boolean isFull = false;
    public Cat(String name) {
        super(name);
        maxRunDistance = 200;
        maxSwimDistance = 0;
        catCount++;
    }
    @Override
    public void swim (int distance) {
        System.out.println(name + " это же кот! Куда ему плавать!");
    }
    public void eat(Bowl bowl) {
        if (!isFull && bowl.decreaseFood(10)) {
            isFull = true;
            System.out.println(name + " покушал и теперь сыт");
        } else {
            System.out.println(name + " не хватило еды, животное голодно");
        }
    }
    public boolean isFull() {
        return isFull;
    }
    public static int getCatCount() {
        return catCount;
    }
}
