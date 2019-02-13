import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Address {
   private String name;
   private String address;
   private String city;
   private String state;
   private int zip;
   private String phone;
   private String email;
   public Address(){
       name = "";
       address = "";
       city = "";
       state = "";
       zip = 0;
       phone ="";
       email ="";
   }
   public Address(String name,String address, String city, String state, int zip, String phone, String email){
       this.name=name;
       this.address=address;
       this.city=city;
       this.state=state;
       this.zip=zip;
       this.phone=phone;
       this.email=email;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
       return  "Address:   "+name+"\n"+
               "           "+address+"\n"+
               "           "+city+","+state+","+zip+"\n"+
               "Telephone: "+phone+"\n"+
               "Email:     "+email;
    }

}
