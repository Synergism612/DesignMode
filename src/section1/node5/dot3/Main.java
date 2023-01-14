package section1.node5.dot3;

public class Main {
    public static void main(String[] args) {
        Assistant assistant = new Assistant();
        Car car = new Car("jeep", "Synergism");
        Car buggy = new Buggy("jeep", "Synergism");
        Key key = new Key("Synergism");
        Key badKey = new Key("synergism");
        assistant.checkKey(car, key);
        assistant.checkKey(car, badKey);
        assistant.checkKey(buggy, badKey);
    }
}
