public class FlyLikeRocket implements FlyBehavior{

    public FlyLikeRocket() {
    }

    @Override
    public void fly() {
        System.out.println("Estoy volando en un cohete");
    }

    @Override
    public String toString() {
        return "FlyLikeRocket{}";
    }
}
