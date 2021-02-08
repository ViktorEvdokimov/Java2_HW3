import java.util.LinkedList;

public class PhoneBook {
    public static void main(String[] args) {
        LinkedList<PhoneNumber> phoneNumbers = new LinkedList<>();
        addPhoneNumbers(phoneNumbers);
        printNumbers(phoneNumbers, "Job");
        printNumbers(phoneNumbers, "Anna");

    }
    public static void addPhoneNumbers (LinkedList<PhoneNumber> phoneNumbers){
        phoneNumbers.add(new PhoneNumber(1516, "Job"));
        phoneNumbers.add(new PhoneNumber(6321, "Anna"));
        phoneNumbers.add(new PhoneNumber(6461, "Juli"));
        phoneNumbers.add(new PhoneNumber(5371, "Rob"));
        phoneNumbers.add(new PhoneNumber(9631, "Juli"));
        phoneNumbers.add(new PhoneNumber(1542, "Tom"));
        phoneNumbers.add(new PhoneNumber(5253, "Job"));
    }
    
    public static void printNumbers (LinkedList<PhoneNumber> phoneNumbers, String name){
        for(PhoneNumber number : phoneNumbers){
            if(number.isThisName(name)) number.printInfo();
        }
    }
}
