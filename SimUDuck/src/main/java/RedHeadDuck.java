public class RedHeadDuck extends Duck{

    public RedHeadDuck() {
        fb = new FlyWithWings();
        sb = new SoundQuack();
    }

    @Override
    public void display() {
        System.out.println("Hola soy un pato cabeza roja");
    }

    @Override
    public String toString() {
        return "RedHeadDuck{}";
    }
}
