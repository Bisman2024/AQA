class FourteenWordPrint {
    // 1
    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
        System.out.println();
    }

    // 2
    public static void checkSumSing() {
        int a = 7;
        int b = 2;
        int c = a + b;
        String d = c >= 0 ? "Сумма положительная" : "Сумма отрицательная";
        System.out.println(d);
        System.out.println();
    }

    // 3
    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
        System.out.println();
    }

    // 4
    public static void compareNumbers() {
        int a = 1;
        int b = 2;
        String c = a >= b ? "a >=b" : "a < b";
        System.out.println(c);
        System.out.println();
    }

    // 5
    public static void main0() {
        System.out.println(myMetod0(9, 11));
    }

        public static boolean myMetod0(int z, int b) {
            return (z + b) >= 10 && (z + b) <= 20;
        }
    // 6
    public static void myMetod1(int a) {
        System.out.println();
        String b = a >= 0 ? "Число положительное" : "Число отрицательное";
        System.out.println(b);
        System.out.println();
    }
    // 7
    public static void main11() {
        System.out.println(myMetod7(7));
    } public static boolean myMetod7(int a) {
        return a < 0;
    }

    // 8
    public static void myMetod3(String t, int a) {
        System.out.println();
        for (int i=0; i<a; i++) {
            System.out.println(t);
        }
        System.out.println();
    }
    // 9
    public static void main9() {
        System.out.println(myMetod9(2024));
    }
    public static boolean myMetod9(int a) {
        return (a % 4 == 0 && a % 100 != 0) || (a % 400 == 0);
    }

    // 10
    public static void main1() {
        System.out.println();
        int[] myMass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < myMass.length; i++) {
            System.out.print(myMass[i] + " ");
        } System.out.println();
        for (int i = 0; i < myMass.length; i++) {
            if (myMass[i] == 0) {
                myMass[i] = 1;
            } else {
                myMass[i] = 0;
            }
        }
        for (int i = 0; i < myMass.length; i++) {
            System.out.print(myMass[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    // 11
    public static void main2() {
        int[] myMass = new int[100];
        for (int i = 0; i < myMass.length; i++) {
            myMass[i] = i + 1;
        }
        for (int i = 0; i < myMass.length; i++) {
            System.out.print(myMass[i] + " ");
        }
        System.out.println();
    }
    // 12
    public static void main3() {
        System.out.println();
        int[] myMass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < myMass.length; i++) {
            System.out.print(myMass[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < myMass.length; i++) {
            if (myMass[i] < 6) {
                myMass[i] *= 2;
            }
        }
        for (int i = 0; i < myMass.length; i++) {
            System.out.print(myMass[i] + " ");
        }
        System.out.println();
        System.out.println();
    }
    // 13
    public static void main4() {
        int abc = 5;
        int[][] table = new int[5][5];
        for (int i = 0; i < 5; i++) {
            table[i][i] = 1;
            table[i][abc - i - 1] = 1;
        }
        for (int i = 0; i < abc; i++) {
            for (int j = 0; j < abc; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
    // 14
    public static void main5() {
        System.out.println();
        int[] abc = myMetod5(10, 5);
        for (int i = 0; i < abc.length; i++) {
            System.out.print(abc[i] + " ");
        }
    } public static int[] myMetod5(int len, int initialValue) {
        int[] dve = new int[len];
        for (int i = 0; i < dve.length; i++) {
            dve[i] = initialValue;
        }
        return dve;
    }
}