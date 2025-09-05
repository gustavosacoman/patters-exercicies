package Models;

public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, String author, java.time.Year publicationYear, int issueNumber) {
        super(title, author, publicationYear);
        this.issueNumber = issueNumber;
    }

    public String flipPages() {
        if(isBorrowed) {
            return "This magazine is currently borrowed. Please return it to flip through the pages.";
        }

        return "Flipping pages of the magazine: " + super.title + ", Issue: " + this.issueNumber;
    }
    
    @Override
    public String toString() {
        return "Magazine{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                ", issueNumber=" + issueNumber +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
}
