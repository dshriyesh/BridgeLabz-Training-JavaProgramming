// creating thread using thread class
public class MyThread2 extends Thread{
    
    public void run(){
        // task for thread
        for(int i=0;i<10;i++){
            System.out.println("Value: "+i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2();
        t1.start();
    }
}
