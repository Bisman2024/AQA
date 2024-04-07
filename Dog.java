class Dog  extends Animal {
    private static int dogCount = 0;
    private boolean isFull = false;
    public Dog(String name) {
        super(name);
        maxRunDistance = 500;
        maxSwimDistance = 10;
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }
}
