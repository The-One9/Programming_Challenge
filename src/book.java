public class book {
    static int totalNoOfBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;
    static {
        totalNoOfBooks=0;
    }
    {
        totalNoOfBooks++;   //object inti
    }
      book(String isbn,String title,String author){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
      }
      book(String isbn){
        this(isbn,"Unknown","Unknown");
      }
      static int getTotalNoOfBooks(){
        return totalNoOfBooks;
      }
      void borrowedBook(){
        if (isBorrowed){
            System.out.println("Book is already Borrowed");
        }else {
            this.isBorrowed=true;
            System.out.println("Enjoy the book");
        }
      }
      void returnBook(){
        if(isBorrowed){
            this.isBorrowed=false;
            System.out.println("Hope You Enjoy The Book,Please leave The Review");
        }else {
            System.out.println("Book is already in the Library");
        }
      }

    public static void main(String[] args) {
        book math=new book("1","Math","R.D.Sharma");
        book english=new book("2","Comic","Stiphen");
        System.out.println(book.getTotalNoOfBooks());
        math.borrowedBook();
        english.borrowedBook();
        math.borrowedBook();
        math.returnBook();
        english.returnBook();
        english.returnBook();
    }
}
