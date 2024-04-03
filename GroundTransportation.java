public class GroundTransportation extends Transport{
    protected int numberOfPackages;
    private String licensePlate;


    public GroundTransportation(String licensePlate)
    {
        super();
        setFees(3.0);

    if(licensePlate!= null){
        this.licensePlate= licensePlate;
    } else {
        this.licensePlate= " ";
    }
    }

    public String getLicensePlate(){
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate){
        if(licensePlate!= null){
            this.licensePlate= licensePlate;
        }
    }

    public double getPriceWithFees(){
        return getPrice()+getFees();
    }
    public String getTransportType(){
        return "Transporte Terrestre";
    }

    @Override
    public String toString() {
        return super.toString() +
                "      Matricula: " + licensePlate + "\n";
    }
}