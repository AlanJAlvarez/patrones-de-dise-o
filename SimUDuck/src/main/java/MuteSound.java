public class MuteSound implements SoundBehavior{

    public MuteSound() {
    }

    @Override
    public void makeSound() {
        System.out.println("El pato no hace sonido");
    }

    @Override
    public String toString() {
        return "SoundNoWay{}";
    }
}
