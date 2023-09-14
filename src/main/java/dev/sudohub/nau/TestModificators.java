package dev.sudohub.nau;

class A {
    // оголошуємо поля класу
    private int n;
    int k;

    A() {
        k = 2;
        n = 11;
    }

    int summa() {
        return k + n;
    }

    // оголошення getters &amp; setters methods
    public int getN() {
        return n;
    }

    public void setN(int nn) {
        n = nn;
    }
}

class TestModificators {
    public static void main(String args[]) {
        A obj = new A(); // створення об’єкта класу А
        // отримати значення змінних
        int kk = obj.k;
        System.out.println("k=" + kk);
        int nn = obj.getN();
        System.out.println("n=" + nn);
        obj.k = 10;
        obj.setN(15);
        int s = obj.summa();
        System.out.println("summa=" + s);
    }
}