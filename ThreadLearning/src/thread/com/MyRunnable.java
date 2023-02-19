package thread.com;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_RED + "Hello From thread.com.MyRunnable's implementation of run()");
    }
}
