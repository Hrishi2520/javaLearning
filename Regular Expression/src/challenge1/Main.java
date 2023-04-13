package challenge1;

public class Main {
    public static void main(String[] args) {
        String challenge1 = "I want a bike.";
        System.out.println(challenge1.matches("I want a bike."));

        String regEXp = "I want a \\w+.";
        System.out.println(challenge1.matches(regEXp));
        String challenge2 = "I want a ball.";
        System.out.println(challenge2.matches(regEXp));

        String regExp1 = " I want a (bike|ball).";
        System.out.println(challenge1.matches(regExp1));
        System.out.println(challenge2.matches(regExp1));

    }
}
