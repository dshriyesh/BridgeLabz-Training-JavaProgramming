public class UncheckedException {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());

            int x = 10 / 0;

            int[] arr = {1,2,3};
            System.out.println(arr[5]);

        } catch (NullPointerException e) {
            System.out.println("Null reference error");

        } catch (ArithmeticException e) {
            System.out.println("Math error");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");

        } catch (Exception e) {
            System.out.println("General error");
        }
    }
}
