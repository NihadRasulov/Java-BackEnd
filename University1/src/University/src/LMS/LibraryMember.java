package University.src.LMS;

public class LibraryMember {
    private String name;
    private String memberId;

    public LibraryMember(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return this.name;
    }

    public String getMemberId() {
        return this.memberId;
    }
}
