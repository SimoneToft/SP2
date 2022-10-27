import java.util.ArrayList;

public class FleetOfCars {
    private final ArrayList<Car> Fleet = new ArrayList<>();

    void addCar(Car car) {
        Fleet.add(car);
    }
    public int getTotalRegistrationFeeForFleet(){
        int sum = 0;
        for(Car car : Fleet){
            sum+=car.getRegistrationFee();
        }
        return sum;
    }
    @Override
    public String toString(){
        String carInfo="";
        for(Car car : Fleet){
            carInfo+=car.toString()+"\n";
        }
        return carInfo;
    }
}
