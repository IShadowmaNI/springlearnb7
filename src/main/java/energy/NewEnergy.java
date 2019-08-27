package energy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NewEnergy implements Energy {

    @Value("${newEnergyLocalValue.value}") // cand punem valuea inaintea variabilei, nu mai avem nevoie de constructor
    private int localEnergy;

    private int constructorEnergy;

    public NewEnergy(@Value("${newEnergyConstructorValue.value}") int constructorEnergy) {
        this.constructorEnergy = constructorEnergy;
    }
    public int getEnergyLevel() {
        if (localEnergy > constructorEnergy) {
            return localEnergy;
        }
        return constructorEnergy;
    }

    public void setLocalEnergy(int localEnergy) {
        this.localEnergy = localEnergy;
    }

    public void setConstructorEnergy(int constructorEnergy) {
        this.constructorEnergy = constructorEnergy;
    }
}
