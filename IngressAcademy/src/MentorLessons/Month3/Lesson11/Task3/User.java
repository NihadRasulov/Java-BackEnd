package MentorLessons.Month3.Lesson11.Task3;

import java.util.Arrays;

public final class User {
    private final String name;
    private final int age;
    private final String z[];

    public User(String name, int age, String[] z) {
        this.name = name;
        this.age = age;
        this.z = z.clone();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String[] getZ() {
        return z.clone();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", z=" + Arrays.toString(z) +
                '}';
    }
}
