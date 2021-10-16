
// Thread in action ...

/*
class First extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("From thread i = " + i);
        }
        System.out.println("Exit from First class");
    }
}

class Second extends Thread{
    public void run(){
        for (int j = 0; j < 100; j++) {
            System.out.println("From thread j = " + j);
        }
        System.out.println("Exit from Second class");
    }
}

class Third extends Thread{
    public void run(){
        for (int k = 0; k < 100; k++) {
            System.out.println("From thread k = " + k);
        }
        System.out.println("Exit from Third class");
    }
}



class First implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("From thread i = " + i);
        }
        System.out.println("Exit from First class");
    }

}

class Second implements Runnable{
    public void run(){
        for (int j = 0; j < 100; j++) {
            System.out.println("From thread j = " + j);
        }
        System.out.println("Exit from Second class");
    }
}

class Third implements Runnable{
    public void run(){
        for (int k = 0; k < 100; k++) {
            System.out.println("From thread i = " + k);
        }
        System.out.println("Exit from Third class");
    }
}

*/
public class WTF{
    public static void main(String ...args) {
/*
        First first = new First();
        Second second = new Second();
        Third third = new Third();

        Thread thread1 = new Thread(first);
        Thread thread2 = new Thread(second);
        Thread thread3 = new Thread(third);

        thread1.start();
        thread2.start();
        thread3.start();
   */
     /*

      Thread thread1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("From thread i = " + i);
                }
            }
        });

        OR NICHER TA ....
        */

        Thread thread1 = new Thread(() ->{
            for (int i = 0; i < 100; i++) {
                System.out.println("From thread i = " + i);
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < 100; j++) {
                    System.out.println("From thread j = " + j);
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int k = 0; k < 100; k++) {
                    System.out.println("From thread k = " + k);
                }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

    }
}



