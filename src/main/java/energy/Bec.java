package energy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bec {

    private Energy energy;

    //Dependency Injection
    public Bec(@Qualifier("newEnergy") Energy energy) {
        this.energy = energy;
    }

    public void getEnergyLevelFromBec() {
        System.out.println("Energy: " + energy.getEnergyLevel());
        if(energy.getEnergyLevel() >= 5) {
            System.out.println("We have enough energy!");
        } else {
            System.out.println("We don't have enough energy!");
        }
    }

}
