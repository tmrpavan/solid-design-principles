## Open Closed Principle
A software artifact should Closed to modification and Open to implementation. That means it should be easy to add new 
code instead of changing the existing core.

## Example
We are going to build an application which calculates the volume of the shapes.

### Implementation
![bad.png](/open-closed-principle/src/main/resources/bad.png)
    
    public class VolumeCalculator {
        public long calculate(Shape shape){
            if(shape instanceof Cuboid){
            //Calculate volume for Cuboid
            }
            if (shape instanceof Cone){
            //Calculate volume for Cone
            }
            return 0;
        }
    }

This implementation violates the Open Closed Principle. The above implementation is not closed to modification because 
If I want to add a new shape then I need to modify the calculate(Shape) function. 

To fix this issue we need to rewrite the code that can calculate the volume of each shape in their respective sub class 
of Shape.

![good.png](/open-closed-principle/src/main/resources/good.png)

This implementation allows the calculateVolume() function to be called based on the object type of the Shape. 
And we can easily add new shapes by adding subclasses to the shape class and implementing the volume calculation of the 
respective subclasses.



