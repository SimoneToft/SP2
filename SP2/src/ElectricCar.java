public class ElectricCar extends ACar{
    protected int batteryCapacity;
    protected int maxRange;
    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange){
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity=batteryCapacity;
        this.maxRange=maxRange;
    }
    public int getBatteryCapacityKWh() {
        return batteryCapacity;
    }

    public int getMaxRangeKm() {
        return maxRange;
    }

    public int getWhPrKm() {
        return (getBatteryCapacityKWh()*1000/getMaxRangeKm());
    }

    @Override
    public int getRegistrationFee() {
        int PrLitre = Math.round(100 / (getWhPrKm() / (float) 91.25));

        if (PrLitre >= 20 && PrLitre < 50)
        {
            return 330;
        }
        else if (PrLitre >= 15 && PrLitre < 20)
        {
            return 1050;
        }
        else if (PrLitre >= 10 && PrLitre < 15)
        {
            return 2340;
        }
        else if (PrLitre >= 5 && PrLitre < 10)
        {
            return 5500;
        }
        else if (PrLitre < 5)
        {
            return 10470;
        }
        return 330;
    }
    @Override
    public String toString(){
        return  "|| ELECTRIC || License plate: "+registrationNumber+
                " | Make: "+make+" | Model: "+model+" | Wh/Km: "+getWhPrKm()+
                " | Amount of doors: "+numberOfDoors+" | Battery capacity: "+batteryCapacity+" |";
    }
}
