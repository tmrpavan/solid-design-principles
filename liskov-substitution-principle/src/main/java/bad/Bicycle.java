package bad;

public class Bicycle extends Vehicle{
    public Bicycle(String name, double speed) {
        super(name, speed);
    }

    @Override
    public void startEngin() {
        //Bicycle dose not have engin
    }
}
