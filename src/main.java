import java.util.ArrayList;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean x = true;
        while (x) {
            System.out.println("Welcome to Library Management System\n" +
                    "Following Functionalities are available:\n" +
                    "1- Login\n" +
                    "2- Exit\n" +
                    "3- Administrative Functions\n");
            int answer = input.nextInt();


            switch (answer) {
                case 1:
                    boolean y = true;
                    while (y) {
                        System.out.println("Welcome to login page.\n" + "Please enter your username:");
                        String inputUsername = input.next();
                        System.out.println("Enter your password:");
                        String inputPassword = input.next();


                        for (int i = 0; i < user.users.size(); i++) {
                            if (user.users.get(i).getId().equals(inputUsername) && user.users.get(i).getPassword().equals(inputPassword)) {
                                System.out.println("You have successfully logged in.\n" +
                                        "Welcome to library system\n"+
                                        "Enter an option number from menu \n "+
                                        "1-Querying for an item \n" +
                                        "2-Return to main menu \n");


                                boolean v=true;
                                while (v){
                                    int usersChoice = input.nextInt();
                                    switch (usersChoice) {
                                        case 1:
                                            boolean k = true;
                                            while (k) {
                                                System.out.println("Press 1 for querying for an item\n" +
                                                        "Press 2 for return to previous menu");
                                                int usersAnswer = input.nextInt();
                                                switch (usersAnswer) {
                                                    case 1:
                                                        System.out.println("Please enter tha name of the item you are looking for:");
                                                        String userSecondChoice = input.next();

                                                        for (int h = 0; h < item.items.size(); h++) {


                                                            if (item.items.get(h).getItemName().equals(userSecondChoice)) {

                                                                if (item.items.get(h).availability == true) {

                                                                    System.out.println(userSecondChoice + " is available");

                                                                } else if (item.items.get(h).availability == false) {
                                                                    System.out.println(userSecondChoice + " is currently borrowed to someone else");

                                                                }

                                                            } else if (item.items.get(h).equals(userSecondChoice) == false) {
                                                                System.out.println("the item is not exist in our library");

                                                            }


                                                        }
                                                        break;
                                                    case 2:
                                                        k = false;
                                                        break;

                                                }

                                            }


                                        case 2:
                                            v = false;
                                            y = false;
                                            break;
                                    }
                                }

                            }
                            else{
                                System.out.println("Somethings wrong, please try again.");
                                y =false;
                                break;
                            }



                        }
                        System.out.println("Somethings wrong, please try again.");
                        y= false;

                    }
                    break;


                case 2:
                    System.exit(0);
                    break;
                case 3:
                    String userAdmin = "admin";
                    String passAdmin = "123456";

                    System.out.printf("Enter your USERNAME: %n");
                    String u = input.next();
                    System.out.println("Enter your PASSWORD:");
                    String p = input.next();

                    boolean z = true;
                    while (z) {


                        if (p.equals(passAdmin) && u.equals(userAdmin)) {

                            admin a = new admin();
                            a.displayMenu();

                        } else {
                            System.out.println("Somethings wrong. Please try again.");
                            z = false;
                            break;
                        }

                        int adminChoice = input.nextInt();


                        switch (adminChoice) {



                            case 1:
                                admin b = new admin();
                                b.addItem();
                                break;
                            case 2:
                                System.out.printf("%s%n","Please enter the isbn of the item: ");
                                int isbn = input.nextInt();
                                String sth = input.nextLine();//this line is somehow skipped during the program.
                                System.out.printf("Please enter the name of the item you want to add: %n");
                                String itemName = input.nextLine();
                                System.out.printf("Please enter genre: %n");
                                String genre = input.nextLine();
                                System.out.printf("Please enter author: %n");
                                String author = input.nextLine();
                                System.out.printf("Please enter the type of the item: %n");
                                String typeOfTheItem = input.nextLine();

                                item it = new item();
                                it.setItemName(itemName);
                                it.setIsbn(isbn);
                                it.setGenre(genre);
                                it.setAuthor(author);
                                it.setAvailability(true);
                                it.setType(typeOfTheItem);
                                item.items.add(it);
                                break;

                            case 3:
                                System.out.println("Please enter the name of the item you want to delete:");
                                String sth4 = input.nextLine();
                                String adminsThirdChoice = input.nextLine();

                                for(int i=0;i<item.items.size();i++){
                                    if(item.items.get(i).getItemName().equals(adminsThirdChoice)){
                                        item.items.remove(i);
                                    }
                                }
                                break;

                            case 4:
                                System.out.println("Please enter tha name of the item you are looking for:");
                                String sth2 = input.nextLine();//this line is somehow skipped during the program.
                                String adminsFourthChoice = input.nextLine();


                                for (int i=0; i<item.items.size();i++) {
                                    if (item.items.get(i).getItemName().equals(adminsFourthChoice)) {
                                        if (item.items.get(i).availability == true){
                                            System.out.println(adminsFourthChoice + " is available.");
                                            break;}
                                        else if (item.items.get(i).availability == false){
                                            System.out.println(adminsFourthChoice + " is not available at the moment.");
                                            break;}

                                    } else if (item.items.get(i).getItemName().equals(adminsFourthChoice) == false) {
                                        System.out.println("the item is not exist in our library");
                                        break;
                                    }


                                }
                                break;


                            case 5:

                                for (int i = 0; i < user.users.size(); i++) {
                                    System.out.println(user.users.get(i));
                                }

                                System.out.println("Total number of users: "+user.users.size());

                                break;

                            case 6:
                                System.out.println("Please define username:");
                                String adminsFifthChoice = input.next();
                                System.out.println("Please define password:");
                                String adminsSixthChoice = input.next();
                                System.out.println("Please define name: ");
                                String sth3 = input.nextLine();
                                String name = input.nextLine();
                                System.out.println("Please define last name: ");
                                String lastName = input.nextLine();
                                System.out.println("Please define id number: ");
                                String adminsTenthChoice = input.nextLine();
                                System.out.println("Please define phone number: ");
                                String adminsELeventhChoice = input.nextLine();

                                user uz = new user();
                                uz.setId(adminsFifthChoice);
                                uz.setPassword(adminsSixthChoice);
                                uz.setName(name);
                                uz.setLastName(lastName);
                                uz.setIdNumber(adminsTenthChoice);
                                uz.setPhoneNumber(adminsELeventhChoice);
                                user.users.add(uz);
                                break;

                            case 7:
                                System.out.println("Please enter the username of the user you want to delete");
                                String adminsSeventhChoice = input.next();
                                for (int i = 0; i < user.users.size(); i++) {
                                    if (user.users.get(i).getId().equals(adminsSeventhChoice)) {
                                        user.users.remove(i);
                                        break;
                                    }
                                }
                                break;

                            case 8:
                                System.out.println("Please enter the username of the user you are looking for: ");
                                String adminsEightChoice = input.next();
                                for (int i = 0; i < user.users.size(); i++) {
                                    if (user.users.get(i).getId().equals(adminsEightChoice)) {
                                        System.out.println("user info: " + user.users.get(i));
                                        break;
                                    }
                                }
                                break;

                            case 9:
                                System.out.println("Please enter the name of item that you want to return: ");
                                String returningItem = input.next();
                                System.out.println("Please enter the username who wants to return this item: ");
                                String itemReturner = input.next();
                                for (int i = 0; i < item.items.size(); i++) {
                                    if (item.items.get(i).getItemName().equals(returningItem)) {
                                        item.items.get(i).setAvailability(true);
                                    }
                                }
                                for(int t=0; t< user.users.size();t++){
                                    if(user.users.get(t).getId().equals(itemReturner)){
                                        user.users.get(t).setBorrowedItem("null");
                                    }
                                }


                                break;

                            case 10:
                                System.out.println("User can only borrow one item ");
                                System.out.println("Please enter the name of item that you want to take: ");
                                String takingItem = input.next();
                                System.out.println("Please enter the username who wants to borrow this item: ");
                                String itemBorrower = input.next();
                                for (int i = 0; i < item.items.size(); i++) {
                                    if (item.items.get(i).getItemName().equals(takingItem)) {
                                        item.items.get(i).setAvailability(false);

                                        break;
                                    }

                                }
                                for(int t=0; t< user.users.size();t++){
                                    if(user.users.get(t).getId().equals(itemBorrower)){
                                        user.users.get(t).setBorrowedItem(takingItem);
                                    }
                                }
                                break;

                            case 11:
                                z = false;
                                break;
                        }


                    }

            }

        }
    }
}
