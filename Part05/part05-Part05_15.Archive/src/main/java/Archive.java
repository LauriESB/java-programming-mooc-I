/**
 *
 * @author ichla
 */
public class Archive {
    private String identifier;
    private String name;  
    
    public Archive(String identifier, String name) {
        this.identifier = identifier;        
        this.name = name;
    }
    public String toString() {
        return identifier + ": " + name;
    }
    public boolean equals(Object compared) {
        if(this == compared) {
            return true;
        }
        
        if(!(compared instanceof Archive)) {
            return false;
        }
        
        Archive check = (Archive) compared;
        
        if(this.identifier.equals(check.identifier)) {
         return true;
        } 
        return false;
    }
}
