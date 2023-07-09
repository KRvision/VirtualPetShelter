package virtual_pet;
public class VirtualPet {
    
    private String name;

    private int hunger;

    private int thirst;
    
    private int waste;

    

    public VirtualPet(String name) {
        this.name = name;
        this.hunger = 50;
        this.thirst = 50;
        this.waste = 50;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getHunger() {
        return this.hunger;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getThirst() {
        return this.thirst;
    }

    public void setWaste(int waste) {
        this.waste = waste;
    }

    public int getWaste() {
        return this.waste;
    }


    public void feed() {
        setHunger(getHunger() - 5);
        setThirst(getThirst() + 3); 
        setWaste(getWaste() + 5);
    }

    public void water() {
        setHunger(getHunger() + 2);
        setThirst(getThirst()- 10);
        setWaste(getWaste() + 5);
    }

    public void waste() {
        setHunger(getHunger() + 5);
        setThirst(getThirst() + 3); 
        setWaste(getWaste() - 5);
    }


    public void tick() {
        setHunger(getHunger() + 2);
        setThirst(getThirst() + 2); 
        setWaste(getWaste() + 2);

    }

}
