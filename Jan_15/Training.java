import java.util.*;
public class Training{
    public static void main(String[] args){
        List<Trainee> trainee = new ArrayList<>();
        trainee.add(new TechnicalTrainee("T01", "Amit", "Technical", 12));

        trainee.add(new SoftSkillTrainee("T02", "Neha", "Soft Skill", 15));
        trainee.add(new TechnicalTrainee("T03", "Rohit", "Technical", 9));
        trainee.add(new SoftSkillTrainee("T04", "Sneha", "Soft Skill", 20));
        Trainee top = null;
        double highest = 0;
        System.out.println("Trainee Details:");
        for(Trainee t : trainee){
            t.displayDetails();
            double score = t.calculateProgressScore();

            System.out.println("Progress Score: " + score);
            System.out.println();

            if(score > highest){
                highest = score;
                top = t;
            }
        }
        System.out.println("Top Performer:");

        System.out.println(top.name + " with a score of " + highest);
    }
}
abstract class Trainee{
    String id;
    String name;
    String trainingType;

    Trainee(String id, String name, String trainingType){
        this.id = id;
        this.name = name;
        this.trainingType = trainingType;
    }
    abstract double calculateProgressScore();
    void displayDetails(){
        System.out.println(id + " - " + name + " - " + trainingType);
    }
}
class TechnicalTrainee extends Trainee{
    int modulesCompleted;
    TechnicalTrainee(String id, String name, String trainingType, int modulesCompleted){
        super(id, name, trainingType);
        this.modulesCompleted = modulesCompleted;
    }
    @Override
    double calculateProgressScore(){
        return modulesCompleted * 10;
    }
}
class SoftSkillTrainee extends Trainee {
    int sessionsAttended;
    SoftSkillTrainee(String id, String name, String trainingType, int sessionsAttended){
        super(id, name, trainingType);
        this.sessionsAttended = sessionsAttended;
    }

    @Override
    double calculateProgressScore(){
        return sessionsAttended*8;
    }
}