public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder().setUserId("Shri123").setUserName("Shri").setEmail("Shri@email.com").build();

        System.out.println(user);
    }
}
