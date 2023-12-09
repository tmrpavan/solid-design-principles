package bad;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Headmaster {
    private  Assistant assistant;
    private Teacher teacher;

    public  void addAssistant(){
        assistant.addAssistant();
    }

    public void addTeacher(){
        teacher.addTeacher();
    }
}
