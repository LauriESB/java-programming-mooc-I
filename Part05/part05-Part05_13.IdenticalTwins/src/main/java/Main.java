
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program

        // In the exercise base you can find the Person class that is linked with an SimpleDate object. 
        // Add to the class Person the method public boolean equals (Object compared), 
        // which can be used to compare the similarity of people. 
        // The comparison should take into account the equality of all the variables of a person (birthday included).
        
        SimpleDate date = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(23, 7, 2017);

        Person leo = new Person("Leo", date, 62, 9);
        Person lily = new Person("Lily", date2, 65, 8);

        if (leo.equals(lily)) {
            System.out.println("Is this quite correct?");
        }

        Person leoWithDifferentWeight = leo;

        if (leo.equals(leoWithDifferentWeight)) {
            System.out.println("Is this quite correct?");
        }
    }
}
