package Models;

public class DigitalMedia extends LibraryItem {
    private String format; // e.g., PDF, EPUB, MP3

    public DigitalMedia(String title, String author, java.time.Year publicationYear, String format) {
        super(title, author, publicationYear);
        this.format = format;
    }

    public String play() {
        
        return "Playing digital media: " + title + " in format: " + format;
    }

    @Override
    public String toString() {
        return "DigitalMedia{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                ", format='" + format + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
    
}
