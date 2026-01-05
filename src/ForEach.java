public class ForEach {
    public static void main(String[] args) {
        String []array= new String[]{"Rahul" ,"Mohan","Rohit","Raj","Rajesh","Ravi"};
        ForLoops(array);
        ForEachPrint(array);
    }
    public static void ForLoops(String[]array){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println("===================== ");
    }
    public static void ForEachPrint(String[]array){
        for(String name:array){
            System.out.println(name);
        }
    }
}
