public class SoundSquick implements SoundBehavior{

    public SoundSquick() {
    }

    @Override
    public void makeSound() {
        System.out.println("El pato hace Squick");
    }

    @Override
    public String toString() {
        return "SoundSquick{}";
    }
}
