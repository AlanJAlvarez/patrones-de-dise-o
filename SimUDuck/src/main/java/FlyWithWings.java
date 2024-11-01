public class FlyWithWings implements FlyBehavior{

    public FlyWithWings() {
    }

    @Override
    public void fly() {
        System.out.println("El pato esta volando");
    }

    @Override
    public String toString() {
        return "FlyWithWings{}";
    }
}
