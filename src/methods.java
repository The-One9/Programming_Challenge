public class methods {
    public static void pattern(){
        int row=0;
        while (row<20){
            System.out.print("*");
            int column=0;
            while (column<row){
                System.out.print(" *");
                column++;
            }
            System.out.println();
            row++;
        }
    }



    public static void main(String[] args) {
        //pattern();

    }
}
