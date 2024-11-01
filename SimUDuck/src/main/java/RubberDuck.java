public class RubberDuck extends Duck{

    public RubberDuck() {
        fb = new FlyNoWay();
        sb = new SoundSquick();
    }

    @Override
    public void display() {
        System.out.println("Hola soy un pato de hule");
    }

    @Override
    public String toString() {
        return "RubberDuck{}";
    }
}
