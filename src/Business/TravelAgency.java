/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Anjali
 */
public class TravelAgency {
    private AirlinerDirectory airlinerDirectory;
    private TravelOffice traveloffice;
    private FlightSchedule flightDirectory;
    
    public TravelAgency()
    {
        airlinerDirectory = new AirlinerDirectory();
        traveloffice = new TravelOffice();
        flightDirectory = new FlightSchedule();
    }

    public FlightSchedule getFlightDirectory() {
        return flightDirectory;
    }

    public void setFlightDirectory(FlightSchedule flightDirectory) {
        this.flightDirectory = flightDirectory;
    }

    public AirlinerDirectory getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public void setAirlinerDirectory(AirlinerDirectory airlinerDirectory) {
        this.airlinerDirectory = airlinerDirectory;
    }

    public TravelOffice getTraveloffice() {
        return traveloffice;
    }

    public void setTraveloffice(TravelOffice traveloffice) {
        this.traveloffice = traveloffice;
    }

 
}
