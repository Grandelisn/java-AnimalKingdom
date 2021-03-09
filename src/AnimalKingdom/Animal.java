package AnimalKingdom;

abstract class Animal {
    protected int maxId;
    protected int id;
    protected int energy;
    protected String name;
    protected int year;
    public Animal(String name, int year){
        maxId++;
        energy = 1;
        id = maxId;
        this.name = name;
        this.year = year;
    }
    public void consumeFood(int amount){
        energy += amount;
        System.out.println(name + " consumed " + amount + " food. Energy is now " + energy);

    }
    abstract String getMove();
    abstract String getBreathe();
    abstract String getReproduce();
    abstract int getYear();
    abstract String getName();
}
