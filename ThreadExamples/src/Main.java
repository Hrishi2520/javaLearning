public class Main {
    public static void main(String[] args) {
//        DataReader dr1 = new DataReader();
//        dr1.setName("Thread-1");
//        DataReader dr2 = new DataReader();
//        dr2.setName("Thread-2");
//        dr1.start();
//        dr2.start();


        for (int i = 0; i < 5; i++) {
            DataReader dr = new DataReader();
                dr.start();
        }
    }
}