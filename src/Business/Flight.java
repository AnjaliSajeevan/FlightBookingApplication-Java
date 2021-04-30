/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author Anjali,Manasa
 */
public class Flight {
    private String flightName;
    private String origin;
    private String destination;
    private Date flightDate;
    private String flightDuration;
     private String ArrivalTime;
     private String DepartureTime;
    private Date DestinationTime;
    private String ticketPrice;
    private String crewMembers;
    private String airplane;
    private String preferedTime;
    private boolean isAvail;

    public String getPreferedTime() {
        return preferedTime;
    }

    public void setPreferedTime(String preferedTime) {
        this.preferedTime = preferedTime;
    }

    public String getAirplane() {
        return airplane;
    }

    public void setAirplane(String airplane) {
        this.airplane = airplane;
    }
    

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }
    

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(String flightDuration) {
        this.flightDuration = flightDuration;
    }

    public Date getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }

    public String getArrivalTime() {
        return ArrivalTime;
    }

    public void setArrivalTime(String ArrivalTime) {
        this.ArrivalTime = ArrivalTime;
    }

    public Date getDestinationTime() {
        return DestinationTime;
    }

    public void setDestinationTime(Date DestinationTime) {
        this.DestinationTime = DestinationTime;
    }

    public String getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(String ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getCrewMembers() {
        return crewMembers;
    }

    public void setCrewMembers(String crewMembers) {
        this.crewMembers = crewMembers;
    }

    public boolean isIsAvail() {
        return isAvail;
    }

    public void setIsAvail(boolean isAvail) {
        this.isAvail = isAvail;
    }

    public String getDepartureTime() {
        return DepartureTime;
    }

    public void setDepartureTime(String DepartureTime) {
        this.DepartureTime = DepartureTime;
    }
   

  
  @Override  
    public String toString()
    {
        return flightName;
    }
    
}
