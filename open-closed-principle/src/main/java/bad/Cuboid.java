package bad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Cuboid extends Shape{
    private long length;
    private long width;
    private long height;
}
