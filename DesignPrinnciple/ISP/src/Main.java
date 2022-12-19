public class Main {
    public static void main(String[] args) {
        Parrot p = new Parrot();
        p.fly();
        p.makeSound();

        Ostrich o = new Ostrich();
        o.eat();
        o.sleep();

        Duck d = new Duck();
        d.swim();
        d.fly();
    }
}