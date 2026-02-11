class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void show() {
        System.out.println(this.x);
        System.out.println(super.x);
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
