package section1.node5.dot3;

public class Buggy extends Car{

    public Buggy(String name, String masterName) {
        super(name, masterName);
    }

    @Override
    void lock() {
        //this is a buggy so it can not be locked;
    }

    @Override
    void unlock(Key key) {
        //this is a buggy so it can not be locked;
    }
}
