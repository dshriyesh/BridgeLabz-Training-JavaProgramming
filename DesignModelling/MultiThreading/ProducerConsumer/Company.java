public class Company {
    
    int n;
    boolean f=false;

    synchronized public void produceItem(int n) throws Exception{
        if(f){
            wait();
        }
        this.n=n;
        System.out.println("Item produced: "+this.n);
        f=true;
        notify();
    }

    synchronized public int consumeItem() throws Exception{
        if(!f){

            
            wait();

        }
        System.out.println("Consumed: "+this.n);
        f=false;
        notify();
        return this.n;
    }
}

