import java.util.Optional;

class User {
    private String email;
    public User(String email) { this.email = email; }
    public String getEmail() { return email; }
}

class UserRepository {

    public Optional<User> findByEmail(String email) {
        if ("test@example.com".equals(email)) {
            return Optional.of(new User(email));
        }
        return Optional.empty();
    }
}

public class OptinalTask {
    public void run() {
        UserRepository repo = new UserRepository();

        //wrong@mail.com
        User user1 = repo.findByEmail("unknown@mail.com")
                .orElseGet(() -> new User("guest@example.com"));
        System.out.println("User 1 email: " + user1.getEmail());


        try {
            User user2 = repo.findByEmail("wrong@mail.com")
                    .orElseThrow(() -> new RuntimeException("Користувача не знайдено!"));
            System.out.println("User 2 email: " + user2.getEmail());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new OptinalTask().run();
    }
}