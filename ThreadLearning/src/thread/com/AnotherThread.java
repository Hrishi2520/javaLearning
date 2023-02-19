package thread.com;

public class AnotherThread extends Thread{
    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_BLUE + "Hello From "+ currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(ThreadColor.ANSI_BLUE+ "Another Thread Woke Me Up");
            return;
        }
        System.out.println(ThreadColor.ANSI_BLUE+"Three seconds have Passed and I'm Awake");
    }
}
