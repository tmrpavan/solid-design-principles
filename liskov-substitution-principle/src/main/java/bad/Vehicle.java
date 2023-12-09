package bad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Vehicle {
    private String name;
    private double speed;

    public abstract void startEngin();
}
