public class Parrot implements Bird, Flyable{
    @Override
    public void makeSound() {
        System.out.println("parrot is makking some sound");
    }

    @Override
    public void eat() {
        System.out.println("parrot is eating some food");
    }

    @Override
    public void fly() {
        System.out.println("parrot is flying");
    }

    @Override
    public void sleep() {
        System.out.println("Parrot is Sleeping");
    }
}
