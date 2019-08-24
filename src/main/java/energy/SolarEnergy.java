package energy;

import energy.Energy;

public class SolarEnergy implements Energy {

    private int energyLevel;

    public SolarEnergy(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }
}
