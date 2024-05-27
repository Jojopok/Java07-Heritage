public class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public String doStuff() {
        return "je suis " + this.getBrand() + " et je fais vroum vroum !";
    }

}
