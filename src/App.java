import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    Welcome to Library Management System
                    Following Functionalities are available:
                    1- Login
                    2- Exit
                    3- Administrative Functions
                    """);
            int answer = input.nextInt();


            switch (answer) {
                case 1 -> {
                    boolean y = true;
                    while (y) {
                        System.out.println("Welcome to login page.\n" + "Please enter your username:");
                        String inputUsername = input.next();
                        System.out.println("Enter your password:");
                        String inputPassword = input.next();


                        for (int i = 0; i < User.Users.size(); i++) {
                            if (User.Users.get(i).getId().equals(inputUsername) && User.Users.get(i).getPassword().equals(inputPassword)) {
                                System.out.println("""
                                        You have successfully logged in.
                                        Welcome to library system
                                        Enter an option number from menu\s
                                         1-Querying for an item\s
                                        2-Return to main menu\s
                                        """);


                                boolean v = true;
                                while (v) {
                                    int usersChoice = input.nextInt();
                                    switch (usersChoice) {
                                        case 1:
                                            boolean k = true;
                                            while (k) {
                                                System.out.println("Press 1 for querying for an item\n" +
                                                        "Press 2 for return to previous menu");
                                                int usersAnswer = input.nextInt();
                                                switch (usersAnswer) {
                                                    case 1 -> {
                                                        System.out.println("Please enter tha name of the item you are looking for:");
                                                        String userSecondChoice = input.next();
                                                        for (int h = 0; h < Item.Items.size(); h++) {


                                                            if (Item.Items.get(h).getItemName().equals(userSecondChoice)) {

                                                                if (Item.Items.get(h).availability) {

                                                                    System.out.println(userSecondChoice + " is available");

                                                                } else if (!Item.Items.get(h).availability) {
                                                                    System.out.println(userSecondChoice + " is currently borrowed to someone else");

                                                                }

                                                            } else if (!Item.Items.get(h).getItemName().equals(userSecondChoice)) {
                                                                System.out.println("the item is not exist in our library");

                                                            }


                                                        }
                                                    }
                                                    case 2 -> k = false;
                                                }

                                            }


                                        case 2:
                                            v = false;
                                            break;
                                    }
                                }

                            } else {
                                System.out.println("Somethings wrong, please try again.");
                                break;
                            }


                        }
                        System.out.println("Somethings wrong, please try again.");
                        y = false;

                    }
                }
                case 2 -> System.exit(0);
                case 3 -> {
                    String userAdmin = "admin";
                    String passAdmin = "123456";
                    System.out.printf("Enter your USERNAME: %n");
                    String u = input.next();
                    System.out.println("Enter your PASSWORD:");
                    String p = input.next();
                    boolean z = true;
                    while (z) {


                        if (p.equals(passAdmin) && u.equals(userAdmin)) {

                            Admin a = new Admin();
                            a.displayMenu();

                        } else {
                            System.out.println("Somethings wrong. Please try again.");
                            break;
                        }

                        int adminChoice = input.nextInt();


                        switch (adminChoice) {
                            case 1 -> {
                                Admin b = new Admin();
                                b.addItem();
                            }
                            case 2 -> {
                                System.out.printf("%s%n", "Please enter the isbn of the item: ");
                                int isbn = input.nextInt();
                                input.nextLine();//this line is somehow skipped during the program.
                                System.out.printf("Please enter the name of the item you want to add: %n");
                                String itemName = input.nextLine();
                                System.out.printf("Please enter genre: %n");
                                String genre = input.nextLine();
                                System.out.printf("Please enter author: %n");
                                String author = input.nextLine();
                                System.out.printf("Please enter the type of the item: %n");
                                String typeOfTheItem = input.nextLine();
                                Item it = new Item();
                                it.setItemName(itemName);
                                it.setIsbn(isbn);
                                it.setGenre(genre);
                                it.setAuthor(author);
                                it.setAvailability(true);
                                it.setType(typeOfTheItem);
                                Item.Items.add(it);
                            }
                            case 3 -> {
                                System.out.println("Please enter the name of the item you want to delete:");
                                input.nextLine();
                                String adminsThirdChoice = input.nextLine();
                                for (int i = 0; i < Item.Items.size(); i++) {
                                    if (Item.Items.get(i).getItemName().equals(adminsThirdChoice)) {
                                        Item.Items.remove(i);
                                    }
                                }
                            }
                            case 4 -> {
                                System.out.println("Please enter tha name of the item you are looking for:");
                                input.nextLine();//this line is somehow skipped during the program.
                                String adminsFourthChoice = input.nextLine();
                                for (int i = 0; i < Item.Items.size(); i++) {
                                    if (Item.Items.get(i).getItemName().equals(adminsFourthChoice)) {
                                        if (Item.Items.get(i).availability) {
                                            System.out.println(adminsFourthChoice + " is available.");
                                            break;
                                        } else if (!Item.Items.get(i).availability) {
                                            System.out.println(adminsFourthChoice + " is not available at the moment.");
                                            break;
                                        }

                                    } else if (!Item.Items.get(i).getItemName().equals(adminsFourthChoice)) {
                                        System.out.println("the item is not exist in our library");
                                        break;
                                    }


                                }
                            }
                            case 5 -> {
                                for (int i = 0; i < User.Users.size(); i++) {
                                    System.out.println(User.Users.get(i));
                                }
                                System.out.println("Total number of users: " + User.Users.size());
                            }
                            case 6 -> {
                                System.out.println("Please define username:");
                                String adminsFifthChoice = input.next();
                                System.out.println("Please define password:");
                                String adminsSixthChoice = input.next();
                                System.out.println("Please define name: ");
                                input.nextLine();
                                String name = input.nextLine();
                                System.out.println("Please define last name: ");
                                String lastName = input.nextLine();
                                System.out.println("Please define id number: ");
                                String adminsTenthChoice = input.nextLine();
                                System.out.println("Please define phone number: ");
                                String adminsEleventhChoice = input.nextLine();
                                User uz = new User();
                                uz.setId(adminsFifthChoice);
                                uz.setPassword(adminsSixthChoice);
                                uz.setName(name);
                                uz.setLastName(lastName);
                                uz.setIdNumber(adminsTenthChoice);
                                uz.setPhoneNumber(adminsEleventhChoice);
                                User.Users.add(uz);
                            }
                            case 7 -> {
                                System.out.println("Please enter the username of the user you want to delete");
                                String adminsSeventhChoice = input.next();
                                for (int i = 0; i < User.Users.size(); i++) {
                                    if (User.Users.get(i).getId().equals(adminsSeventhChoice)) {
                                        User.Users.remove(i);
                                        break;
                                    }
                                }
                            }
                            case 8 -> {
                                System.out.println("Please enter the username of the user you are looking for: ");
                                String adminsEightChoice = input.next();
                                for (int i = 0; i < User.Users.size(); i++) {
                                    if (User.Users.get(i).getId().equals(adminsEightChoice)) {
                                        System.out.println("user info: " + User.Users.get(i));
                                        break;
                                    }
                                }
                            }
                            case 9 -> {
                                System.out.println("Please enter the name of item that you want to return: ");
                                String returningItem = input.next();
                                System.out.println("Please enter the username who wants to return this item: ");
                                String itemReturner = input.next();
                                for (int i = 0; i < Item.Items.size(); i++) {
                                    if (Item.Items.get(i).getItemName().equals(returningItem)) {
                                        Item.Items.get(i).setAvailability(true);
                                    }
                                }
                                for (int t = 0; t < User.Users.size(); t++) {
                                    if (User.Users.get(t).getId().equals(itemReturner)) {
                                        User.Users.get(t).setBorrowedItem("null");
                                    }
                                }
                            }
                            case 10 -> {
                                System.out.println("User can only borrow one item ");
                                System.out.println("Please enter the name of item that you want to take: ");
                                String takingItem = input.next();
                                System.out.println("Please enter the username who wants to borrow this item: ");
                                String itemBorrower = input.next();
                                for (int i = 0; i < Item.Items.size(); i++) {
                                    if (Item.Items.get(i).getItemName().equals(takingItem)) {
                                        Item.Items.get(i).setAvailability(false);

                                        break;
                                    }

                                }
                                for (int t = 0; t < User.Users.size(); t++) {
                                    if (User.Users.get(t).getId().equals(itemBorrower)) {
                                        User.Users.get(t).setBorrowedItem(takingItem);
                                    }
                                }
                            }
                            case 11 -> z = false;
                        }


                    }
                }
            }

        }
    }
}
