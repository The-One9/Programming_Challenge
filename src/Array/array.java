package Array;

public class array {
    public static void main(String[] args) {
      /*  int [] arr=new int[5];
       arr[0]=34;
        arr[1]=3;
        arr[2]=4;
        arr[3]=8;
        arr[4]=9;
     */

        int[] myarray={34,3,4,8,9};

        System.out.println(myarray[4]);
        System.out.println(myarray.length);

        //Array Traversal
        int i=0;
        while (i<myarray.length){
            System.out.println(myarray[i]);
            i++;
        }



    }
}
