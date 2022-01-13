import java.util.ArrayList;

public class user {
    private String id;
    private String password;
    public String borrowedItem;
    private String phoneNumber;
    private String idNumber;
    private String name;
    private String lastName;
    static ArrayList<user> users = new ArrayList<user>();



    public static ArrayList<user> getUsers() {
        return users;
    }

    public static void setUsers(ArrayList<user> users) {
        user.users = users;
    }

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

    public String getBorrowedItem() {
        return borrowedItem;
    }

    public void setBorrowedItem(String borrowedItem) {
        this.borrowedItem = borrowedItem;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void resetItem(){

        this.users.remove(borrowedItem);

    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public void newUser(String id,String password,String borrowedItem,String phoneNumber,String idNumber,String name,String lastName){
        this.id=id;
        this.password=password;
        this.borrowedItem=borrowedItem;
        this.phoneNumber=phoneNumber;
        this.idNumber=idNumber;
        this.name=name;
        this.lastName=lastName;

    }
    @Override
        public String toString(){
            return ("Username: "+this.id+
                    "   Password: "+this.password+
                    "   Borrowed item: "+this.borrowedItem+
                    "   Phone number: "+this.phoneNumber+
                    "   Id number: "+this.idNumber+
                    "   Name: "+this.name+
                    "   Last name: "+this.lastName);

        }

}
