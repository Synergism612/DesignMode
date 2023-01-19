package section2.node2.dot2;

public class Main {
    public static void main(String[] args) {
        //汽车工厂示例
        VehicleFactory carFactory = new CarFactory();
        carFactory.orderVehicle("large","blue").println();
        //卡车工厂示例
        VehicleFactory vehicleFactory = new TruckFactory();
        vehicleFactory.orderVehicle("small","yellow").println();
        //匿名具体工厂示例
        VehicleFactory bikeFactory = new VehicleFactory() {
            @Override
            protected Vehicle create(String size) {
                if (size.equals("small")){
                    return new SmallBike();
                }else if(size.equals("large")){
                    return new LargeBike();
                }
                return null;
            }
        };
        bikeFactory.orderVehicle("large","black").println();
    }
}
