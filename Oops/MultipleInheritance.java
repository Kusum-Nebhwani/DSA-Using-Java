package Oops;

public class MultipleInheritance {
    public static void main(String[] args) {

        Bear b = new Bear();
        b.eatGrass();
        b.eatMeat();

    }
}
interface Herbivores{
    void eatGrass();
}
interface Carnivores{
    void eatMeat();
}

class Bear implements Herbivores,Carnivores{
    @Override
    public void eatGrass() {
        System.out.println("bear eats grass");
    }

    @Override
    public void eatMeat() {
        System.out.println("bear eats meat also");
    }
}

