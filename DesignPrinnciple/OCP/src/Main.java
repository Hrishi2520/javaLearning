public class Main {
    public static void main(String[] args) {
// Initializing a cuboid one as well as declaring
        // its dimensions.
        Cuboid cb1 = new Cuboid();
        cb1.length = 5;
        cb1.breadth = 10;
        cb1.height = 15;

        // Initializing a cuboid two as well as declaring
        // its dimensions.
        Cuboid cb2 = new Cuboid();
        cb2.length = 2;
        cb2.breadth = 4;
        cb2.height = 6;

        ////Initializing a cuboid three as well as declaring
        /// its dimensions.
        Cuboid cb3 = new Cuboid();
        cb3.length = 3;
        cb3.breadth = 12;
        cb3.height = 15;

        // Initializing and declaring an array of cuboids
        Cuboid[] c_arr = new Cuboid[3];
        c_arr[0] = cb1;
        c_arr[1] = cb2;
        c_arr[2] = cb3;

        // Initializing a sphere one as well as declaring
        // its dimension.
        Sphere sp1 = new Sphere();
        sp1.radius = 5;

        // Initializing a sphere two as well as declaring
        // its dimension.
        Sphere sp2 = new Sphere();
        sp2.radius = 2;

        // Initializing a sphere three as well as declaring
        // its dimension.
        Sphere sp3 = new Sphere();
        sp3.radius = 3;

        // Initializing and declaring an array of spheres
        Sphere[] s_arr = new Sphere[3];
        s_arr[0] = sp1;
        s_arr[1] = sp2;
        s_arr[2] = sp3;

        // Initializing Application class
        Application app = new Application();

        // Getting the total volume
        // using get_total_volume
        double vol = app.get_total_volume(c_arr, s_arr);

        // Print and display the total volume
        System.out.println("The total volume is " + vol);
    }
}