package storage;

public class Main2 {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());

        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println("Вес appleBox1: " + appleBox1.getWeight());
        System.out.println("Вес appleBox2: " + appleBox2.getWeight());
        System.out.println("Вес orangeBox: " + orangeBox.getWeight());

        System.out.println("appleBox1 и appleBox2 равны по весу? " + appleBox1.compare(appleBox2));
        System.out.println("appleBox1 и orangeBox равны по весу? " + appleBox1.compare(orangeBox));

        appleBox1.transfer(appleBox2);

        System.out.println("Вес appleBox1: " + appleBox1.getWeight());
        System.out.println("Вес appleBox2: " + appleBox2.getWeight());
    }
}
