/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.User.Airliner;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Anjali
 */
public class FlightSchedule {
    private List<Flight> flightList;
    
    public FlightSchedule() {
        flightList = new ArrayList<>();
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(List<Flight> flightList) {
        this.flightList = flightList;
    }


    public Flight addFlight()
    {
        Flight f =new Flight();
        flightList.add(f);
        return f;
    }
    
       public void deleteFlight(Flight a)
    {
        flightList.remove(a);
        
    }
       
       public Flight searchFrom(String from){
           
        for(Flight flight: flightList){
            if(flight.getOrigin().equals(from))
                    {
                return flight;
            }
        }
        return null;
            }
       
       public Flight searchFlightNumber(String flightNumber){
        for(Flight flight: flightList){
            if(flight.getFlightName().equals(flightNumber))
                    {
                return flight;
            }
        }
        return null;
            }
       public Flight searchDestination(String destination){
        for(Flight flight: flightList){
            if(flight.getDestination().equals(destination))
                    {
                return flight;
            }
        }
        return null;
            }
       
       
       public Flight searchDate(Date date){
        for(Flight flight: flightList){
            if(flight.getFlightDate().equals(date))
                    {
                return flight;
            }
        }
        return null;
            }
       
        public Flight searchTime(String time){
        for(Flight flight: flightList){
            if(flight.getPreferedTime().equals(time))
                    {
                return flight;
            }
        }
        return null;
            }
       
       
       
       
       
       
}

