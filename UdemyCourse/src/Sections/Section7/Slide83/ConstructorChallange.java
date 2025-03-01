package Sections.Section7.Slide83;

public class ConstructorChallange {

    private String name;
    private int creditLimit;
    private String emailAddress;

    public ConstructorChallange(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    public ConstructorChallange() {
        this("Nobody","nobody@nobody.com");
    }

    public ConstructorChallange(String name, String emailAddress) {
        this(name,1000,emailAddress);
        this.name = name;
        this.emailAddress = emailAddress;
    }


    public String getName() {
        return name;
    }
    public int getCreditLimit() {
        return creditLimit;
    }
    public String getEmailAddress() {
        return emailAddress;
    }

    public static void main(String[] args) {

        ConstructorChallange c1 = new ConstructorChallange();
        System.out.println(c1.getName());
        System.out.println(c1.getCreditLimit());
        System.out.println(c1.getEmailAddress());
        ConstructorChallange c2 = new ConstructorChallange("Nihad",1200,"email@gmail.com");
        System.out.println(c2.getName());
        System.out.println(c2.getCreditLimit());
        System.out.println(c2.getEmailAddress());
        ConstructorChallange c3 = new ConstructorChallange("Resilov","email@gmail.com");
        System.out.println(c3.getName());
        System.out.println(c3.getCreditLimit());
    }
}
