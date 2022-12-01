public class Book extends Product {
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private String author;

    public Book(int id, int price, String name, String author) {
        super(id, price, name);
        this.author = author;
    }

    @Override
    public boolean matches(String search) {
        if (super.matches(search)) {
            return true;
        }
        if (getAuthor().contains(search)) {
            return true;
        } else {
            return false;
        }
    }
}

