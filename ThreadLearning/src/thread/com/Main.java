package thread.com;

public class Main {
    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_PURPLE+"Hello From The thread.com.Main Thread...");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println(ThreadColor.ANSI_GREEN+"Hello From Anonymous class Thread");
            }
        }.start();

        Thread myRnnable = new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ThreadColor.ANSI_RED+"Hello from the anonymous class's implementation of run()");
                try {
                    anotherThread.join(2000);
                    System.out.println(ThreadColor.ANSI_RED+ "Another Thread terminated, so i'm running again");
                } catch (InterruptedException e) {
                    System.out.println(ThreadColor.ANSI_RED+"I couldn't wait after all. I was interrupted");
                }
            }
        });
        myRnnable.start();
        anotherThread.interrupt();

        System.out.println(ThreadColor.ANSI_PURPLE+"Hello Again From The thread.com.Main Thread...");

    }
}