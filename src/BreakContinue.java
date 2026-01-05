public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("Before Loop");
        for (int i=1;i<1000;i++){
            if(i==56){
                break;
            }
            System.out.println(i);
        }
    for(int i=1;i<10;i++){
        if(i==5){
            continue;
        }
        System.out.println(i);
    }
    }

}
