package University.src.University.Task;

public class GetSet {

    String name;
    int age;
    String gender;

//    public GetSet(String name, int age, String gender) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

class Dog {
    public static void main(String[] args) {

        GetSet getSet = new GetSet();
        getSet.setName("Dog");
        System.out.println(getSet.getName());
        getSet.setAge(20);
        System.out.println(getSet.getAge());
        getSet.setGender("Female");
        System.out.println(getSet.getGender());
    }
}
