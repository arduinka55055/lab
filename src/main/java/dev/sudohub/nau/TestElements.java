package dev.sudohub.nau;
class StaticAndDynamic {
    int i = 0; // змінна екземпляра класу
    static int j = 0; // змінна класу
    // статичні методи

    static void setJ(int k) {
        System.out.println("Static Method");
        j = k;
    }

    static int getJ() {
        System.out.println("Static Method");
        return j;
    }

    // динамічні методи
    void setI(int k) {
        System.out.println("Dynamic Method");
        i = k;
    }

    int getI() {
        System.out.println("Dynamic Method");
        return i;
    }

    int summa() {
        // в динамічних методах можна використовувати статичні змінні
        System.out.println("Dynamic Method");
        return i + j;
    }
}

public class TestElements {
    public static void main(String args[]) {
        int ii, jj;
        // використання статичної змінної
        StaticAndDynamic.j = 6;
        jj = StaticAndDynamic.j;
        System.out.println("Main, jj=" + jj);
        // виклик статичних методів
        StaticAndDynamic.setJ(4);
        jj = StaticAndDynamic.getJ();
        System.out.println("Main, jj=" + jj);
        StaticAndDynamic obj = new StaticAndDynamic();
        // використання динамічної змінної
        obj.i = 3;
        ii = obj.i;
        System.out.println("Main, ii=" + ii);
        // виклик динамічних методів
        obj.setI(8);
        ii = obj.getI();
        System.out.println("Main, ii=" + ii);
        ii = obj.summa();
        System.out.println("Main, summa=" + ii);

    }
}