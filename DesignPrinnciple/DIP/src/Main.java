public class Main {
    public static void main(String[] args) {

        //addition
        Calculator add = new Calculator(new AddCalculatorOperation());
        double addition = add.Solve(25, 11);
        System.out.println("Addition of x and y is: "+ addition);

        //Substraction
        Calculator sub = new Calculator(new SubtractCalculatorOperation());
        double substraction = sub.Solve(36, 25);
        System.out.println("Substraction of x and y is: "+ substraction);

        //Multiplication
        Calculator multi = new Calculator(new MultiplyCalculatorOperation());
        double multiplication = multi.Solve(10, 11);
        System.out.println("Multiplication of x and y is: "+ multiplication);

        //Dividision
        Calculator div = new Calculator(new DivideCalculatorOperation());
        double division = div.Solve(100, 10);
        System.out.println("Division of x and y is: "+ division);
    }
}