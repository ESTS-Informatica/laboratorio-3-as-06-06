public class Van extends GroundTransportation {

    /**
     * Construtor para objetos da classe Lorry
     */
    public Van(int numberOfPackages,String licensePlate){
        super(licensePlate);
        if(numberOfPackages>=0){
            this.numberOfPackages = numberOfPackages;
        } else {
            this.numberOfPackages = 0;
        }
    }
    public int getNumberOfPackages(){
        return numberOfPackages;

    }
    public void setNumberOfPackages(int newNumber){
        if(newNumber>=0){
            this.numberOfPackages = newNumber;
        } else {
            this.numberOfPackages = 0;
        }
    }

    @Override
    public String toString(){
        return super.toString()+ "Numero de pacotes :" + numberOfPackages;
    }
}