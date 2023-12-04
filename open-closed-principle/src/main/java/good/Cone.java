package good;

import good.Shape;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Cone extends Shape {
    private long radius;
    private long height;

    @Override
    public long calculate() {
        return 0;
    }
}
