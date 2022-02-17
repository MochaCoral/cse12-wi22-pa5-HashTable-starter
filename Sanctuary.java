/**
 * TODO: Complete the solution for Sanctuary
 */
import java.util.HashMap;
import java.util.Set;

public class Sanctuary {
    
    HashMap<String, Integer> sanctuary;
    int maxAnimals;
    int maxSpecies;

    public Sanctuary(int maxAnimals, int maxSpecies) throws IllegalArgumentException {
        if(maxAnimals < 0 || maxSpecies < 0) {
            throw new IllegalArgumentException();
        }
        this.sanctuary = new HashMap<String, Integer>();
        this.maxSpecies = maxSpecies;
        this.maxAnimals = maxAnimals;

    }

    public int getNum(String species) {
        if(this.sanctuary.containsKey(species)) {
            this.sanctuary.get(species);
        }   
        return 0;
    }
    
    public int getTotalAnimals() {
        int sum = 0;
        this.sanctuary.forEach((species, number) -> {
            sum += number;
        });
        return sum;
    }
    
    public int getTotalSpecies() {
        return this.sanctuary.size();
    }

    public int rescue(String species, int num) {
        ;
    }

    public void release(String species, int num) {

    }
}
