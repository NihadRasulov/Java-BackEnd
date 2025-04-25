package MentorLessons.Lesson11.Task2;

public class Main {

    public static void main(String[] args) {

        Adress adress = new Adress("Azerbaijan","Oguz");
        User user = new User("Nihad","Rasulov",18,adress);

        System.out.println(user);
        System.out.println(user.getAdress().getCountry());
    }
}
