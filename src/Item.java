import java.util.ArrayList;

public class Item {


    public static ArrayList<Item> Items = new ArrayList<>();
    public boolean availability = true;
    private int isbn;
    private String Author;
    private String Genre;
    private String type;
    private String itemName;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return ("Item name: " + this.itemName +
                "   isbn: " + this.isbn +
                "   Availability: " + this.availability +
                "   Author: " + this.Author +
                "   Genre: " + this.Genre +
                "   Type: " + this.type);

    }


}
