package good;

public abstract class Manual extends Vehicle {
    public Manual(String name, double speed) {
        super(name, speed);
    }

    public abstract void startMoving();
}
