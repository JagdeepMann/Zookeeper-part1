public class Gorilla extends Mammal {

    public Gorilla(){
        super();
    }
    // public Gorilla(int energyLevel){
    //     super(energyLevel);
    // }
    
    public void throwSomething(){
        System.out.println("Gorilla tossed an object");
        energyLevel-=5;
    }

    public void eatBananas(){
        System.out.println("Gorilla ate a banana");
        energyLevel+=10;
    }

    public void climb(){
        System.out.println("Gorilla climbed a tree");
        energyLevel-=10;
    }
}
