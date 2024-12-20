public class PhysicaBook extends Book {
    private String shelfLocation;

    public PhysicaBook(String title, String author, String shelfLocation) {
        super(title, author);
        this.shelfLocation = shelfLocation;
    }

    public String getShelfLocation() {
        return shelfLocation;
    }

    @Override
    public String toString() {
        return super.toString() + ", 書架位置: " + shelfLocation;
    }
}
