package good;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Headmaster {
    private Faculty faculty;

    public void addFaculty(){
        faculty.add();
    }
}
