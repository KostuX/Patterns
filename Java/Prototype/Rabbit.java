package Java.Prototype;

public class Rabbit implements Cloneable {
    public enum Breed {
        HIMALAYAN,
        AMERICAN,
        MINI_REX,
        LIONHEAD,
        DUTCH
    }

    private int age;
    private Breed breed;

    public Rabbit() {
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public Breed getBreed() {
        return breed;
    }

    @Override
    public Rabbit clone() {
        try {
            return (Rabbit) super.clone();
        } catch (CloneNotSupportedException ex) {
            throw new AssertionError();
        }
    }
}
