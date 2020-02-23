package Phone;

public class ManagerPhoneBook {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.insertPhone("Long", "0398961999");
        phoneBook.insertPhone("Don", "0351326882");
        phoneBook.insertPhone("Dat", "0351656870");
        phoneBook.insertPhone("Hoang", "0251326774");
        phoneBook.traversePhoneBook();
        System.out.println("\n\n");
        phoneBook.updatePhone("Manh","0398961909",0);
        phoneBook.traversePhoneBook();
        System.out.println("\n\n");
        phoneBook.removePhone("Hoang");
        phoneBook.traversePhoneBook();
        System.out.println("\n\n");
        System.out.println("Sort array by name:");
        phoneBook.sortPhone();
        phoneBook.traversePhoneBook();
    }
}
