import java.util.ArrayList;

public class AddressBook {
    private ArrayList<Address> addressList;
    public AddressBook(ArrayList<Address> addressList) {
        this.addressList = addressList;
    }

    public ArrayList<Address> getAddressList() {
        return addressList;
    }

    public void setAddresslist(ArrayList<Address> addressList) {
        this.addressList = addressList;
    }
}
