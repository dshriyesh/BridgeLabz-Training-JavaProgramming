public class ThreadOP {
    public static void main(String[] args) {
        System.out.println("Program started");

        int sum = 20+10;

        System.out.println("Sum is: "+sum);

        Thread obj = Thread.currentThread();
        String tname = obj.getName();
        System.out.println("Current running thread is: "+tname);

        // renamin thread name
        obj.setName("Mythread");

        System.out.println(obj.getName());

        try {
            Thread.sleep(3000);
    
        } catch (Exception e) {
        }

        System.out.println(obj.getId());

        // user defined thread


        System.out.println("Thread Ended");



        // run stores thread task

        UserThread uthread = new UserThread();
        uthread.start();


    }
}


class UserThread extends Thread{
    public void run(){
        System.out.println("User defined thread");
    }
}