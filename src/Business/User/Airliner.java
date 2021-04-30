/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import Business.AirplaneDirectory;
import Business.FlightSchedule;

/**
 *
 * @author sayu
 */
public class Airliner {
     private String country;
    private String airlineName;
    private AirplaneDirectory airplaneDirectory;
    private FlightSchedule flightSchedule;

    public FlightSchedule getFlightSchedule() {
        return flightSchedule;
    }

    public void setFlightSchedule(FlightSchedule flightSchedule) {
        this.flightSchedule = flightSchedule;
    }
    
    public Airliner()
    {
    airplaneDirectory = new AirplaneDirectory();
    flightSchedule = new FlightSchedule();
    }

    public AirplaneDirectory getAirplaneDirectory() {
        return airplaneDirectory;
    }

    public void setAirplaneDirectory(AirplaneDirectory airplaneDirectory) {
        this.airplaneDirectory = airplaneDirectory;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }
    
    @Override
    public String toString()
    {
        return airlineName;
    }
    
}

