// Interface A
interface A {
    int CONSTANT_A = 10;

    void methodA();
}

// Interface A1 extending A
interface A1 extends A {
    int CONSTANT_A1 = 20;

    void methodA1();
}

// Interface A2 extending A
interface A2 extends A {
    int CONSTANT_A2 = 30;

    void methodA2();
}

// Interface A12 inheriting from A1 and A2
interface A12 extends A1, A2 {
    int CONSTANT_A12 = 40;

    void methodA12();
}

// Class B implementing A12
class B implements A12 {
    @Override
    public void methodA() {
        System.out.println("CONSTANT_A from interface A: " + CONSTANT_A);
    }

    @Override
    public void methodA1() {
        System.out.println("CONSTANT_A1 from interface A1: " + CONSTANT_A1);
    }

    @Override
    public void methodA2() {
        System.out.println("CONSTANT_A2 from interface A2: " + CONSTANT_A2);
    }

    @Override
    public void methodA12() {
        System.out.println("CONSTANT_A12 from interface A12: " + CONSTANT_A12);
    }
}

public class Main {
    public static void main(String[] args) {
        // Instantiate class B
        B b = new B();

        // Invoke methods of class B
        b.methodA();
        b.methodA1();
        b.methodA2();
        b.methodA12();
    }
}