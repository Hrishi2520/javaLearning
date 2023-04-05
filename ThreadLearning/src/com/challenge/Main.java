package com.challenge;

public class Main {
    public static void main(String[] args) {
        final BankAccount account = new BankAccount("12345-678", 1000.00);

        //Create and start the thread here...
//        Thread thread1 = new Thread() {
//            public void run() {
//                account.deposit(300.00);
//                account.withdraw(50.00);
//            }
//        };
//
//        Thread thread2 = new Thread() {
//            public void run() {
//                account.deposit(203.75);
//                account.withdraw(100.00);
//            }
//        };
//

        // other way to create and start the thread...

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(300.00);
                account.withdraw(500.00);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(300.00);
                account.withdraw(500.00);
            }
        });
        thread1.start();
        thread2.start();
    }
}
