interface Animals {
    void walks();
     int eyes = 2;
}
interface Herbivores {
    void eats();

}
class Elephant implements Animals, Herbivores {
        public void walks() {
            System.out.println("Elephant walks on Four Legs");
        }

    public void eats() {
        System.out.println("Elephant eats Plant based food");
    }
}
public class Interface {
    public static void main(String[] args) {
    Elephant e= new Elephant();
    e.walks();
    e.eats();
    }
}
