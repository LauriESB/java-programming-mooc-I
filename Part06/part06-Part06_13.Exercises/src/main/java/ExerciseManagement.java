
import java.util.ArrayList;

public class ExerciseManagement {

    private ArrayList<Exercise> exercises;
    
    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }
    
    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for(Exercise exercise : exercises) {
            list.add(exercise.getName());
        }
        return list;
    }

    public void add(String item) {
        this.exercises.add(new Exercise(item));
    }

    public void markAsCompleted(String item) {
        for(Exercise exercise : exercises) {
            if(exercise.getName().equals(item)) {
                exercise.setCompleted(true);
            }
        }
    }
    
    public boolean isCompleted(String item) {
        for(Exercise exercise : exercises) {
            if(exercise.getName().equals(item)) {
                exercise.isCompleted();
            }
        }
        
        return false;
    }
}
