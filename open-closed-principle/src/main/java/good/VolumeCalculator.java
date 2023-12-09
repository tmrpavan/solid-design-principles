package good;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class VolumeCalculator {
    private Shape shape;

    public long calculateVolume(){
        return shape.calculate();
    }
}
