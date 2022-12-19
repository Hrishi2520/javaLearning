public class Ostrich implements Bird {
    @Override
    public void makeSound() {
        System.out.println("Ostrich is making some sound");
    }

    @Override
    public void eat() {
        System.out.println("Ostrich is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Ostrich is sleeping");
    }
}
