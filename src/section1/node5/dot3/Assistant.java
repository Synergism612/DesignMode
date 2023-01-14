package section1.node5.dot3;

public class Assistant {
    void checkKey(Car car,Key key){
        car.unlock(key);
        if (car.lock==null){
            System.out.println("This is a Buggy, it was not Locked");
            return;
        }
        if (car.lock){
            System.out.println("Alert! Wrong key, Wrong car or car lock is broken!");
        }else {
            System.out.println("OK! This is a matching key");
        }
    }
}
