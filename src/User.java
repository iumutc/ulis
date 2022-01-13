import java.util.ArrayList;

public class User {
    public static ArrayList<User> Users = new ArrayList<>();
    public String borrowedItem;
    private String id;
    private String password;
    private String phoneNumber;
    private String idNumber;
    private String name;
    private String lastName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBorrowedItem(String borrowedItem) {
        this.borrowedItem = borrowedItem;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return ("Username: " + this.id +
                "   Password: " + this.password +
                "   Borrowed item: " + this.borrowedItem +
                "   Phone number: " + this.phoneNumber +
                "   Id number: " + this.idNumber +
                "   Name: " + this.name +
                "   Last name: " + this.lastName);

    }

}
