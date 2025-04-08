package MentorLessons.Lesson8;

public class UserTest {

    private String name;
    private UserRole role;

    public UserTest(String name, UserRole role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    enum UserRole {
        ADMIN, GUEST, UNKNOWN
    }

    public static void main(String[] args) {
        UserTest user1 = new UserTest("name", UserRole.ADMIN);
        System.out.println(user1.getRole());

    }
}
