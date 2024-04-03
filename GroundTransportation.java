public class GroundTransportation extends Transport{
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
        return getFees()*getPrice();
    }
    public String getTransportType(){
        return "Transport Terrestre";
    }
    @Override
    public String toStrng(){
        return super.toString() + "   Preço Final:"+getPriceWithFees()+"\n" +
                "      Matricula:"+licensePlate+ "\n";
    }

}