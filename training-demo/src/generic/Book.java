package generic;

public class Book <T>{

    private T id;

    public Book() {
    }

    public Book(T id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                '}';
    }
}
