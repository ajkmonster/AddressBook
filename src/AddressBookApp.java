import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressBookApp {
    private static Address address;
    private static String name;
    private static String address1;
    private static String city;
    private static String state;
    private static int zip;
    private static String phone;
    private static String email;
    private static boolean isValid;
    private static AddressBook addressBook;
    private static ArrayList<Address>list;
    private static String addNew;
    private static String print;
    public static void main(String[] args) {
        list = new ArrayList<>();
        addressBook = new AddressBook(list);
        do {
            address = new Address();
            System.out.print("\n" + "Please enter your name: ");
            Scanner key = new Scanner(System.in);
            name = key.nextLine().toLowerCase();
            address.setName(name);
            System.out.print("\n" + "Please enter your address: ");
            address1 = key.nextLine();
            address.setAddress(address1);
            System.out.print("\n" + "Please enter your city: ");
            city = key.nextLine();
            address.setCity(city);
            System.out.print("\n" + "Please enter your state: ");
            state = key.nextLine();
            address.setState(state);
            System.out.print("\n" + "Please enter your zip: ");
            zip = key.nextInt();
            key.nextLine();
            address.setZip(zip);
            System.out.print("\n" + "Please enter your telephone: ");
            phone = key.nextLine();
            isValid=isPhoneNumberValid(phone);
            if (isValid == true){
                address.setPhone(phone);
            } else {
                System.out.println("Invalid phone number. Try again.");
                break;
            }
            System.out.print("\n" + "Please enter your email: ");
            email = key.nextLine();
            isValid=isEmailValid(email);
            if (isValid == true) {
                address.setEmail(email);
            } else {
                System.out.println("Invalid email. Try again.");
                break;
            }
            list.add(address);
            addressBook.setAddresslist(list);
            System.out.println("Would you like to see your address' so far? (Y/N)");
            print = key.nextLine();
            if (print.equalsIgnoreCase("y")){
                int y =1;
                for (Address x:addressBook.getAddressList()){
                    System.out.println("Address "+y);
                    System.out.println(x.toString());
                    y+=1;
                }
            }
            System.out.print("\n" + "Do you want to add another address? (Y/N): ");
            addNew = key.nextLine();
        } while (addNew.equalsIgnoreCase("y"));

    }
    private static boolean isEmailValid(String email){
        isValid = false;

        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        CharSequence inputStr = email;
        //Make the comparison case-insensitive.
        Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        if(matcher.matches()){
            isValid = true;
        }
        return isValid;
    }

    private static boolean isPhoneNumberValid(String phoneNumber){
        isValid = false;

        String expression = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
        CharSequence inputStr = phoneNumber;
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(inputStr);
        if(matcher.matches()){
            isValid = true;
        }
        return isValid;
    }
}
