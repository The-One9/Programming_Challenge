public class car {
    int noWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelName;
    String company;

    public car(int noWheels, int noOfDoors, int maxSpeed, String name, String modelName, String company) {
        this.noWheels = noWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelName = modelName;
        this.company = company;
    }

    @Override
    public String toString() {
        return "car{" +
                "noWheels=" + noWheels +
                ", noOfDoors=" + noOfDoors +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", modelName='" + modelName + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public static void main(String[] args) {
        car Swift=new car(4,4,180,"Desire","LXi","Suzuki");
        System.out.println(Swift);
    }
}
