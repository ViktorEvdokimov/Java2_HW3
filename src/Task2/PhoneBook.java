package Task2;

import java.util.LinkedList;

public class PhoneBook {
        LinkedList<PhoneNumber> phoneNumbers = new LinkedList<>();

        public void add (int number, String name){
            phoneNumbers.add(new PhoneNumber(number,name));
        }
        public void get (String name){
            boolean isBookHaveNotThisName = true;
            for (PhoneNumber phoneNumber: phoneNumbers){
                if(name.equals(phoneNumber.getName())) {
                    System.out.println(phoneNumber.toString());
                    isBookHaveNotThisName = false;
                }
            }
            if (isBookHaveNotThisName) System.out.printf("This book have not %s`s phone.", name);
        }


}
