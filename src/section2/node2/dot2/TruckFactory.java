package section2.node2.dot2;

public class TruckFactory extends VehicleFactory{
    @Override
    protected Vehicle create(String size) {
        if (size.equals("small")){
            return new SmallTruck();
        }else if(size.equals("large")){
            return new LargeTruck();
        }
        return null;
    }
}
