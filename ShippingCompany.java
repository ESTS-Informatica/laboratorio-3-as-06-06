import java.util.HashSet;
import java.util.ArrayList;

public class ShippingCompany extends HashSet<Transport>{
    private String name;
    private ArrayList<Transport> isService;

    public ShippingCompany(String name){
        isService = new ArrayList();
        if(name!=null){
            this.name=name;
        }else{
            this.name= "";
        }
    }

    public String getName(){
        return name;
    }
    public ArrayList<Transport> getIsService(){
        return isService;
    }

    public void setName(String name){
        if(name!=null){
            this.name=name;
        }else{
            this.name= "";
        }
    }
    public void addTransport(Transport t){
        if(!isService.contains(t)){
            isService.add(t);
        }
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Transport t : isService) {
            stringBuilder.append(t).append("\n");
        }
        return stringBuilder.toString();
    }
    private Transport getTransportation(String id){
        for(Transport t : this){
            if(t.getId().equals(id)){
                return t;
            }
        }
        return null;
    }
    public void makeTransportation(String id, String origin, String destination, double price){
        if(id != null && origin != null && destination != null && price > 0.0){
            Transport transport =getTransportation(id);
            if(transport != null && transport.isAvailable()){
                transport.setAvailable(false);
                transport.setOrigin(origin);
                transport.setDestination(destination);
                transport.setPrice(price);
                isService.add(transport);
                remove(transport);
            }
        }
    }
    public void finalizeTransportation(String id){
        Transport transport = getTransportation(id);
        if(transport != null && isService.contains(transport)){
            transport.setOrigin("");
            transport.setDestination("");
            transport.setPrice(0.0);
            transport.setAvailable(true);
            add(transport);
            isService.remove(transport);
        }
    }
}