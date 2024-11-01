public class MallardDuck extends Duck{

    public MallardDuck() {
        fb = new FlyWithWings();
        sb = new SoundQuack();
    }

    @Override
    public void display() {
        System.out.println("Hola soy un pato silvestre");
    }

    @Override
    public String toString() {
        return "MallardDuck{}";
    }
}
