abstract class Animal {
    abstract void walk();
    Animal() {
        System.out.println("Animal is Created");
    }
    public void eat(){
        System.out.println("Animal is Eating");

        }


}
class Horse extends Animal {
    Horse() {
        System.out.println("Horse is Created");
    }
    public void walk() {
        System.out.println("Horse is walking on Four Legs");
    }
}
class Chicken extends Animal {
    public void walk() {
        System.out.println("Chicken is walking on Two Legs");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Horse h= new Horse();
        h.walk();
        h.eat();
        Chicken c = new Chicken();
        c.walk();
        c.eat();
    }
}
