public class GasolineCar extends AFuelCar{
    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int prLitre){
        super(registrationNumber,make,model,numberOfDoors,prLitre);
    }
    @Override
    public String getFuelType() {
        return "null";
    }

    @Override
    public int getRegistrationFee() {
        if(prLitre>=20 && prLitre<50){
            return 330;
        }
        else if(prLitre>=15 && prLitre <20){
            return 1050;
        }
        else if(prLitre>=10 && prLitre <15){
            return 2340;
        }
        else if(prLitre>=5 && prLitre <10){
            return 5500;
        }
        else if(prLitre<5){
            return 10470;
        }
        return 330;
    }
    @Override
    public String toString(){
        return  "|| GASOLINE || License plate: "+registrationNumber+
                " | Make: "+make+" | Model: "+model+" | Km/Litre: "+prLitre+
                " | Amount of doors: "+numberOfDoors+" |";
    }
}
