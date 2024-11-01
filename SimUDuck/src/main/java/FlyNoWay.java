public class FlyNoWay implements FlyBehavior{
    public FlyNoWay() {
    }

    @Override
    public void fly() {
        System.out.println("El pato no puede volar");
    }

    @Override
    public String toString() {
        return "FlyNoWay{}";
    }
}
