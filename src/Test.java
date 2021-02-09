public class Test {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(4648, "Tom");
        phoneBook.add(5642, "Tom");
        phoneBook.add(3469, "Robin");
        phoneBook.add(1694, "Job");
        phoneBook.add(4689, "Robin");
        phoneBook.add(4686, "Juli");
        phoneBook.add(8549, "Anna");
        phoneBook.get("Robin");
        phoneBook.get("Anna");
        phoneBook.get("Tim");

    }
}
