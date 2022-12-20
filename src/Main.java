
public class Main {
    public static void main(String[] args) {


        Fighter Mcgregor = new Fighter("Mcgregor",5,100,62,21);
        Fighter Ali = new Fighter("Ali M.", 8,100,78,32);
        Ring Match = new Ring(Mcgregor,Ali,80,60);
        Match.run();
    }
}