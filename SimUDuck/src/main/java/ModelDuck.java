public class ModelDuck extends Duck{

    public ModelDuck() {
        fb = new FlyNoWay();
        sb = new MuteSound();
    }


    @Override
    public void display() {
        System.out.println("Soy un pato modelo");
    }

    @Override
    public String toString() {
        return "ModelDuck{}";
    }
}