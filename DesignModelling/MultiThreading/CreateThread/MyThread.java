// creating our thread using runnable

public class MyThread implements Runnable{
    public void run(){
        // task for thread...
        for(int i=0;i<10;i++){
            System.out.println("Value: "+i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) {
        // create obj of thread class
        MyThread t1 = new MyThread();
        Thread thr = new Thread(t1);
        thr.start();


    }
}
