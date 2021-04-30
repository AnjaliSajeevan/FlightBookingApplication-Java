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
 * @author sayu
 */
public class AirplaneDirectory {
    private List<Airplane> airplaneList;
    
    public AirplaneDirectory() {
        airplaneList = new ArrayList<>();
    }

    public List<Airplane> getAirplaneList() {
        return airplaneList;
    }

    public void setAirplaneList(List<Airplane> airplaneList) {
        this.airplaneList = airplaneList;
    }
    
    public Airplane addAirplane()
    {
        Airplane f =new Airplane();
        airplaneList.add(f);
        return f;
    }
    
       public void deleteAirplane(Airplane a)
    {
        
        airplaneList.remove(a);
        
    }
}
