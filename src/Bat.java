public class Bat extends Mammal{
    public Bat() {
        setEnergyLevel(300);
    }

    public void fly(){
        System.out.println("flying");
        setEnergyLevel(getEnergyLevel()-50);
        displayEnergy();
    }

    public void eatHumans(){
        System.out.println("eating human");
        setEnergyLevel(getEnergyLevel()+25);
        displayEnergy();
    }

    public void attackTown(){
        System.out.println("town burning");
        setEnergyLevel(getEnergyLevel()-100);
        displayEnergy();
    }
}
