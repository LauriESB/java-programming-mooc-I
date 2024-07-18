
import java.util.ArrayList;

/**
 *
 * @author ichla
 */
public class Points {

    private ArrayList<Integer> points;
    private ArrayList<Integer> passingGrades;
    private ArrayList<Integer> grades;
    private double sum, avg, sumPas, avgPas, passPercent;

    public Points() {
        this.points = new ArrayList<>();
        this.passingGrades = new ArrayList<>();
        this.grades = new ArrayList<>();
        this.sum = 0;
        this.sumPas = 0;   
    }

    public void addPoints(int point) {
        int grade = 0;
         
        if (point >= 0 && point <= 100) {
            points.add(point);
            if (point >= 50) {
                passingGrades.add(point);
            }
            
            if (point < 50) {
                grade = 0;
            } else if (point < 60) {
                grade = 1;
            } else if (point < 70) {
                grade = 2;
            } else if (point < 80) {
                grade = 3;
            } else if (point < 90) {
                grade = 4;
            } else if (point >= 90) {
                grade = 5;
            }
            grades.add(grade);    
        } 
    }

    public double calcPointsAverage() {
        if (points.size() > 0) {
            for (int percorre : points) {
                sum += percorre;
            }
            avg = sum / points.size();
        }
        return avg;
    }

    public double calcPassingAverage() {
        if (passingGrades.size() > 0) {
            for (int percorre : passingGrades) {
                sumPas += percorre;
            }

            avgPas = sumPas / passingGrades.size();
        }
        return avgPas;
    }

    public double calcPassPercentage() {
        passPercent = 1.0 * 100 * passingGrades.size() / points.size();
        return passPercent;
    }

    public void calcGradeDistribution() {
        int grade = 5;
        while(grade >= 0) {
            int stars = 0;
            for(int percorre : grades) {
                if(percorre == grade) {
                    stars++;
                }
            }
            System.out.print(grade + ":");
            while(stars > 0) {
                System.out.print("*");
                stars--;
            }
            System.out.println("");
            grade--;
        }
    }

    public String toString() {
        if (passingGrades.size() > 0) {
            return "Point average (all): " + calcPointsAverage() + "\nPoint average (passing): " + calcPassingAverage() + "\n"
                    + "Pass percentage: " + calcPassPercentage() + "\n" + "Grade distribution:";
        }
        return "Point average (all): " + calcPointsAverage() + "\nPoint average (passing): -" + "\n"
                + "Pass percentage: " + calcPassPercentage() + "\n" + "Grade distribution:";
    }
}
