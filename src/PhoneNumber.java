public class PhoneNumber {

    private int phoneNumber;
    private String name;

    public PhoneNumber(int phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "phoneNumber=" + phoneNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
