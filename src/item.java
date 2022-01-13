import java.util.ArrayList;

public class item {


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private int isbn;
    private String Author;
    private String Genre;
    public boolean availability = true;
    private String type;
    private String itemName;

    static ArrayList<item> items = new ArrayList<item>();


    public void createItem (String name, int isbn, boolean availability,String Author,String Genre,String type){
        this.itemName =name;
        this.isbn = isbn;
        this.availability = availability;
        this.Author = Author;
        this.Genre=Genre;
        this.type=type;
    }
    @Override
        public String toString(){
            return("Item name: "+this.itemName+
                "   isbn: "+this.isbn+
                "   Availability: "+this.availability+
                "   Author: "+this.Author+
                "   Genre: "+this.Genre+
                "   Type: "+this.type);

    }


}
