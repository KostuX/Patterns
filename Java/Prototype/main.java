package Java.Prototype;

public class main {

    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit();

        rabbit1.setAge(8);
        Rabbit rabbit2 = rabbit1.clone();
        System.out.println("First rabbit age: " + rabbit1.getAge());
        System.out.println("Secondary rabbit age: " + rabbit2.getAge());
    }

}
