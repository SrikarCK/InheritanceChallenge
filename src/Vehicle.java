public class Vehicle {
    private String name;
    private String size;

    private int currentvelocity;
    private int currentDriection;

    public Vehicle(String name, String size){
        this.name = name;
        this.size = size;

        this.currentvelocity = 0;
        this.currentDriection = 0;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentvelocity() {
        return currentvelocity;
    }

    public int getCurrentDriection() {
        return currentDriection;
    }
    //Method for Steering
    public void steer(int direction){
        this.currentDriection += direction;
        System.out.println("Vehicle.steer(): Steering at "+currentDriection+" degrees.");
    }
    public void move(int velocity, int direction){
        currentvelocity = velocity;
        currentDriection = direction;
        System.out.println("Vehicle.move(): Moving at "+currentvelocity+" in direction "+currentDriection);
    }

    public void stop(){
        this.currentvelocity = 0;
    }
}
