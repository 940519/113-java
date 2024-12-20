public class Ebook extends Book {
    private String downloadUrl;

    public Ebook(String title, String author, String downloadUrl) {
        super(title, author);
        this.downloadUrl = downloadUrl;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    @Override
    public String toString() {
        return super.toString() + ", 下載連結: " + downloadUrl;
    }
}
