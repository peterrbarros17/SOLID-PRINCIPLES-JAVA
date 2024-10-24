class Bird{
    public void move(){
        System.out.println("Bird is moving");
    }
}
// replace a base class with a derived class without breaking functionality
class Penguin extends Bird{
    @Override
    public void move(){
        // we replaced "fly" with a behavior common to all birds(move)
        System.out.println("Penguin is swimming");
    }
}

public class LSP {
    public static void main(String[] args) {
        new Penguin().move();
    }
}
