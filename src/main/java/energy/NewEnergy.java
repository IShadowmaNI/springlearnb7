package energy;

public class NewEnergy implements Energy {

    private int localEnergy;
    private int constructorEnergy;

    public NewEnergy(int constructorEnergy) {
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
