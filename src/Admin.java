public class Admin {

    public void displayMenu() {
        System.out.println("""
                Enter an option number from menu\s

                1-Display item list and the total number of item
                2-Add an item\s
                3-Delete an item\s
                4-Querying for an item\s
                5-Display user list and total number user
                6-Register a user\s
                7-Delete a user\s
                8-Search for user\s
                9-Take back an item from user\s
                10-Give an item to user\s
                11-Log out
                """);
    }

    public void addItem() {
        for (int i = 0; i < Item.Items.size(); i++) {
            System.out.println(Item.Items.get(i));
        }
        System.out.println("Total number of items: " + Item.Items.size());
    }

}
