package MentorLessons.Month4.Lesson16.Task;

public class Customer {
    private Address address;
    private String name;

    public Customer(Address address, String name) {
        this.address = address;
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{address=%s, name='%s'}".formatted(address, name);
    }
}
