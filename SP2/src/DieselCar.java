public class DieselCar extends AFuelCar{

    private final boolean particleFilter;
    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors,int prLitre, boolean particleFilter){
        super(registrationNumber,make,model,numberOfDoors,prLitre);
        this.particleFilter=particleFilter;
    }
    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public int getRegistrationFee() {
        int registrationFee=0;
        if(prLitre>=20 && prLitre<50){
            registrationFee+=460;
        }
        else if(prLitre>=15 && prLitre <20){
            registrationFee+=2440;
        }
        else if(prLitre>=10 && prLitre <15){
            registrationFee+=4190;
        }
        else if(prLitre>=5 && prLitre <10){
            registrationFee+=8270;
        }
        else if(prLitre<5){
            registrationFee+=25730;
        }
        if(!hasParticleFilter()){
            registrationFee+=1000;
        }
        return registrationFee;
    }
    public boolean hasParticleFilter(){
        return particleFilter;
    }
    @Override
    public String toString(){
        return  "|| DIESEL || License plate: "+registrationNumber+
                " | Make: "+make+" | Model: "+model+" | Km/Litre: "+prLitre+
                " | Amount of doors: "+numberOfDoors+" | Has particle filter: "+particleFilter+" |";
    }
}
