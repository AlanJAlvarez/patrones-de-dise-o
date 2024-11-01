public class DecoyDuck extends Duck{

    public DecoyDuck() {
        fb = new FlyNoWay();
        sb = new MuteSound();
    }

    @Override
    public void display() {
        System.out.println("Hola soy un pato señuelo");
    }

    @Override
    public String toString() {
        return "DecoyDuck{}";
    }
}
