class Shape{
    String colour;
    public void area(){
        System.out.println("Area of Shape");
    }
}
class Triangle extends Shape {
    public void area(int base, int height) {
        System.out.println("Area of  Triangle: "+ 0.5 * base * height);
    }
}
class EquilateralTriangle extends Triangle{
        public void area(int base, int height){
            System.out.println("Area of Equilateral Triangle: " + (0.5 * base * height));
        }
}
public class Inheritance {
    public static void main(String[] args) {
        Shape sp = new Shape();
        sp.colour = "Green";
        System.out.println("Colour of the shape: " + sp.colour);
        EquilateralTriangle ET = new EquilateralTriangle();
        ET.colour = "Red";
        System.out.println("Colour of the triangle: " + ET.colour);
        ET.area(10, 5);
        Triangle T = new Triangle();
        T.colour= "Blue";
        System.out.println("Colour of the triangle: " + T.colour);
        T.area(10, 5);

    }
}

