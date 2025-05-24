package MentorLessons.Month3.Lesson11.Task3;

public class Main {
    public static void main(String[] args) {
        User user=new User("Ehed" ,25,new String[]{"salam","sagol"});
        String [] word = user.getZ();
        word[0]="asdfg";
        System.out.println(user);

    }
}
