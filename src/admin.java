public class admin {

    public void displayMenu(){
        System.out.println("Enter an option number from menu \n" +
                "\n"+
                "1-Display item list and the total number of item\n" +
                "2-Add an item \n" +
                "3-Delete an item \n" +
                "4-Querying for an item \n" +
                "5-Display user list and total number user\n" +
                "6-Register a user \n" +
                "7-Delete a user \n" +
                "8-Search for user \n" +
                "9-Take back an item from user \n" +
                "10-Give an item to user \n" +
                "11-Log out\n");
    }
    public void addItem(){
        for (int i = 0; i < item.items.size(); i++) {
            System.out.println(item.items.get(i));
        }
        System.out.println("Total number of items: "+item.items.size());
    }

}
