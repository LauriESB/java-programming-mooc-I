
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        
        // Part01. Complete the code of the method weight on the class HealthStation
        HealthStation hs = new HealthStation();
        Person person01 = new Person("Lauri", 21, 162, 50);
        Person person02 = new Person("Felipe", 25, 170, 50);
        
        System.out.println("The total number of weighings is: " + hs.weighings());
        System.out.println("\nName: " + person01.getName() + " | Weight: " + hs.weigh(person01) + " kilos");
        System.out.println("Name: " + person02.getName() + " | Weight: " + hs.weigh(person02) + " kilos");
        
        // Part02. Write a method called public void feed(Person person) for the health station. 
        //         It should increase the weight of the parameter person by one.
        hs.feed(person01);
        hs.feed(person02);
        hs.feed(person02);
        hs.feed(person02);
        System.out.println("");
        System.out.println(person01.getName() + " ate so now their weight is: " + hs.weigh(person01) + " kilos");
        System.out.println(person02.getName() + " ate so now their weight is: " + hs.weigh(person02) + " kilos");
    
        // Part03. Create a new method called public int weighings() for the health station. 
        //         It should tell how many weighings the health station has performed.
        System.out.println("\nThe total number of weighings is: " + hs.weighings());
    }
}
