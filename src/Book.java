class Book {
    private String bookID;
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor
    public Book(String bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    // Getters
    public String getBookID() { return bookID; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return isAvailable; }

    // Borrow and return book
    public void borrowBook() { isAvailable = false; }
    public void returnBook() { isAvailable = true; }
}
