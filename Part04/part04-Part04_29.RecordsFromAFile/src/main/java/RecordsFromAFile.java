
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {
    
    // In this exercise, we'll be working with files stored in 
    // CSV-format that contain names and ages separated by commas.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
        
        try(Scanner readFile = new Scanner(Paths.get(file))) {
            while(true) {
                String line = readFile.nextLine();
                
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                
                
                String print = name + ", age: " + age;
                if(age == 1) {
                    System.out.println(print + " year");
                }else {
                    System.out.println(print + " years");
                }
            }
        }catch(Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        
    }
}
