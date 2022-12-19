public class Duck implements Bird, Flyable, Swimmable{
    @Override
    public void makeSound() {
        System.out.println("Duck can make some sound");
    }

    @Override
    public void eat() {
        System.out.println("duck is eatting some food");
    }

    @Override
    public void sleep() {
        System.out.println("Duck is Sleeping");
    }

    @Override
    public void fly() {
        System.out.println("duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("duck is Swimmable");
    }
}
