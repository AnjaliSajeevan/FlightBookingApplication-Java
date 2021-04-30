/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.User.Airliner;
import java.util.ArrayList;

/**
 *
 * @author sayu
 */
public class AirlinerDirectory {
    private ArrayList<Airliner> airliners;
   
    
    public AirlinerDirectory() {
        airliners = new ArrayList<>();
       
    }
    
    
     public ArrayList<Airliner> getAirliners() {
        return airliners;
    }
     
    public void setAirliners(ArrayList<Airliner> airliners) {
        this.airliners = airliners;
    }
    
    
     public Airliner addAirline()
    {
        Airliner a = new Airliner();
        airliners.add(a);
        return a;
    }
   
       public void deleteAirline(Airliner a)
    {
        airliners.remove(a);
    }
}
