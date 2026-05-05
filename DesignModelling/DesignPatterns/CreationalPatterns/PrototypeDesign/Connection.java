public class Connection implements Cloneable{
    private String ip;
    private String data;


    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public void loadImportantData(){
        this.data = "very important data";
        // goona take some time
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.ip+" : "+this.data;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
    
    
}
