/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manasa
 */
public class SeatDirectory {
    
    private List<Seat> seatDirectory;
    private String columnName;
    public SeatDirectory(String columnName){
        seatDirectory = new ArrayList<Seat>();
        this.columnName = columnName;
    }

    public String getColumnName() {
        return columnName;
    }

    public List<Seat> getSeatDirectory() {
        return seatDirectory;
    }

    public void setSeatDirectory(List<Seat> seatDirectory) {
        this.seatDirectory = seatDirectory;
    }
    
    
        public void generateSeats(String flightID, int capacity, String column){

         for(int i=1; i<=capacity; i++){
 
            seatDirectory.add(new Seat(flightID,column+i)); 
            }
     }
    
    public int SeatAvail (String flightId){
        int availSeats = 0;
        for(Seat s: seatDirectory){
            if((s.getFlightID().equalsIgnoreCase(flightId))){
                if(s.getCustID().equals("")){
                    availSeats+=1;
                
            }
            }
        }
        return availSeats;
    }
    
    public boolean isSeatAvail (String seatId, String flightId){
        boolean res = false;
        for(Seat s: seatDirectory){
            
            if((s.getFlightID().equalsIgnoreCase(flightId)) && (s.getSeatID().equalsIgnoreCase(seatId))){
                if(s.getCustID().equals("")){
                    res = true;
                
            }
            }
        }
        return res;
    }
    
    public boolean SeatPresent (String seatId,String flightId){
        boolean res = false;
        for(Seat s: seatDirectory){
            
            if((s.getFlightID().equalsIgnoreCase(flightId)) && (s.getSeatID().equalsIgnoreCase(seatId))){
                {
                    res = true;
                
            }
            }
        }
        return res;
    }
    public void assignSeats(String flightId, String seatId, String custId){
             for(Seat s: seatDirectory){
            if((s.getFlightID().equalsIgnoreCase(flightId)) && ((s.getSeatID().equalsIgnoreCase(seatId)))){
                s.setCustID(custId);
                
            }
            }
        }
    
    public void freeSeat(String flightId,String seatId){
         for(Seat s: seatDirectory){
              if((s.getFlightID().equalsIgnoreCase(flightId)) && ((s.getSeatID().equalsIgnoreCase(seatId)))){
                   s.setCustID("");
              }
         }
    }

    
}
