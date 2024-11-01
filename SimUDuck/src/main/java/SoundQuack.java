public class SoundQuack implements SoundBehavior {

    public SoundQuack() {
    }

    @Override
    public void makeSound() {
        System.out.println("El pato hace quack");
    }

    @Override
    public String toString() {
        return "SoundQuack{}";
    }
}
