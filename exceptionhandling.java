package lab5;

public class exceptionhandling {

    static class Parent {
        void show() throws Exception {
            System.out.println("Parent method");
        }
    }

    static class Child extends Parent {
        void show() throws ArithmeticException {
            System.out.println("Child method");
        }
    }

    public static void main(String[] args) {
        Parent p = new Child();
        try {
            p.show();
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }
}