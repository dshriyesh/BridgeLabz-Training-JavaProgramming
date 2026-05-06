import java.io.*;

public class ReaderInput {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(isr);

        String str = br.readLine();

        System.out.println("You entered: " + str);

        br.close();
    }
}