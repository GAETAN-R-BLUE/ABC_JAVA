
public class bookAttributes {
    public static void main(String[] args) {
    }
    public double price;
    public String Title;
    public String Author;


    public bookAttributes(String author, String title, double price) {
        Author = author;
        Title = title;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }
}
