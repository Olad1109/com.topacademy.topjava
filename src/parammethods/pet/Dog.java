package parammethods.pet;

public class Dog extends Pet {
    private String breed;
    // default constructor
    public Dog() {
        breed = "";
    }
    //    // accessor and mutator
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    // method for lifespan
    public String getLifespan() {
        if (this.getWeight() > 16)
            return "примерно 5 лет";
        else
            return "примерно 7 лет";
    }
}
