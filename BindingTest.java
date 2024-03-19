public class BindingTest {
    public static void main(String args[]) {
        parent p = new Child();
        Child  c = new Child();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class parent {
    int x = 100;

    void method() {
        System.out.println("parent Method");
    }
}

class Child extends parent { 
    int x = 200;

    void method() {
        System.out.println("x=" + x); // this.x와 같다
        System.out.println("super.x="  + super.x);
        System.out.println("this.x=" + this.x);
    }
}
