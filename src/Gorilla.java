public class Gorilla extends Mammal{
    public Gorilla() {
        setEnergyLevel(100);
    }

    public void throwSomething(){
        System.out.println("throw");
        setEnergyLevel(getEnergyLevel()-5);
        displayEnergy();
    }

    public void eatBananas(){
        System.out.println("gorilla happy");
        setEnergyLevel(getEnergyLevel()+10);
        displayEnergy();
    }

    public void climb(){
        System.out.println("climbed");
        setEnergyLevel(getEnergyLevel()-10);
        displayEnergy();
    }
}
