public class Dice {
    int roll(){
        double roll=Math.random()*6;
        return (int)Math.ceil(roll);
    }
    public static void main(String[] args) {
        Dice dc=new Dice();
//        for(int i=0;i<10;i++){
//        System.out.println(dc.roll());
//    }
        System.out.println(dc.roll());
    }
}
