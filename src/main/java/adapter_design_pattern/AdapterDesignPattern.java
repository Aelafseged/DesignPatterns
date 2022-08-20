package adapter_design_pattern;

public class AdapterDesignPattern {
    public static void main(String[] args) {
        //create the adapter
        TravelAgencyBrochuer travelAgencyBroucher = new AgencyAdapter(new TravelService());

        Client client = new Client(travelAgencyBroucher);
        client.makeACall();
        client.getARide();
    }
}

//first we have two worlds with one side gives service
//and the other side get served
interface TravelAgencyBrochuer {
    String getPhone();

    String getUber();
}

//client expects this served
class Client {
    TravelAgencyBrochuer travelAgencyBrochuer;

    public Client(TravelAgencyBrochuer travelAgencyBrochuer) {
        this.travelAgencyBrochuer = travelAgencyBrochuer;
    }

    public void makeACall() {
        String phone = travelAgencyBrochuer.getPhone();
        //uses the phone to make a call, or text or anything
        System.out.println(phone);
    }

    public void getARide() {
        String uber = travelAgencyBrochuer.getUber();
        System.out.println(uber);
    }
}

class AgencyAdapter implements TravelAgencyBrochuer {
    TravelService travelService;

    public AgencyAdapter(TravelService travelService) {
        this.travelService = travelService;
    }

    @Override
    public String getPhone() {
        return "+351 " + travelService.getLocalPhone();
    }

    @Override
    public String getUber() {
        return "the ride is " + travelService.getRide();
    }
}

class TravelService {
    public int getLocalPhone() {
        return 123_111_121;
    }

    public String getRide() {
        return "Local taxi";
    }
}
