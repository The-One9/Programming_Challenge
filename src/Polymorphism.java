class Books{
    String title;
    String author;
    int year;

    public void printDetails(String title){
        System.out.println(title);
    }
    public void printDetails( int year){
        System.out.println(year);
    }
    public void printDetails(String title, String author){
        System.out.println(title + " by " + author);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Books bk= new Books();
        bk.title = "The Great Gatsby";
        bk.author = "F. Scott Fitzgerald";
        bk.year= 1925;
        bk.printDetails(bk.title, bk.author);
    }
}
