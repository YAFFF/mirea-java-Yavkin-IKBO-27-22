package practicalWork1;

public class Dog {
    private String master;
    private String breed;
    private int age;
    private int weight;
    public Dog(String master, String breed, int age, int weight){
        this.master = master;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public String getMaster() {
        return master;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int humanAge(){
        return age * 7;
    }
    public int supposedNumberOfOffspring(){
        return switch ((int) weight / 10){
            case (0) -> 0;
            case (1) -> 1;
            case (2) -> 2;
            case (3) -> 3;
            default -> 4;
        };
    }
    public String toString(){
        return "DOG. Age: " + age + "; Breed: " + breed + "; Weight: " + weight + "; Master: " + master + ".";
    }
}
