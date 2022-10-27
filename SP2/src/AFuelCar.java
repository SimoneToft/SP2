public abstract class AFuelCar extends ACar {
    protected int prLitre;
    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors,int prLitre){
        super(registrationNumber,make,model,numberOfDoors);
        this.prLitre=prLitre;
    }
    public abstract String getFuelType();

    public int kmPrLitre(){
        return prLitre;
    }
}
