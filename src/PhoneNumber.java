public class PhoneNumber {

    private int phoneNumber;
    private String name;

    public PhoneNumber(int phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }
    public boolean isThisName (String searchName){
        if (searchName.equals(name)) return true;
        return false;
    }
    public void printInfo(){
        System.out.printf("Phone number: %d Name: %s%n", phoneNumber, name);
    }
}
