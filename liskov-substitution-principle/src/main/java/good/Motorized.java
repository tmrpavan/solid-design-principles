package good;

public abstract class Motorized extends Vehicle{
    public Motorized(String name, double speed) {
        super(name, speed);
    }

    public abstract void startEngine();
}
