public class Main {
    public static void main(String[] args) {
        Connection con = new Connection();
        con.setIp("12.123.123.123");
        con.loadImportantData();

        System.out.println(con);

        // now new object 
        Connection con2 ;
        try {
            con2 = (Connection)con.clone();
            System.out.println(con2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
