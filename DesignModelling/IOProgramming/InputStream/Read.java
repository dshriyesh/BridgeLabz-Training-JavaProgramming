import java.io.IOException;

public class Read {
    public static void main(String[] args) throws IOException {

        StringBuilder input = new StringBuilder();
        int data;

        // Read characters until Enter key is pressed
        while ((data = System.in.read()) != '\n') {
            input.append((char) data);
        }

        System.out.println(input.toString());
    }
}