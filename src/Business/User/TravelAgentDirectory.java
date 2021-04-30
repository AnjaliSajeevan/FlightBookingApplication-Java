/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;
import Business.AbstractClasses.User;
import Business.User.TravelAgent;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anjali
 */
public class TravelAgentDirectory {
       private List<User> travelAgentList;
    
    public TravelAgentDirectory(){
        travelAgentList = new ArrayList<>();
    }

    public List<User> getTravelAgentList() {
        return travelAgentList;
    }

    public void setTravelAgentList(List<User> travelAgentList) {
        this.travelAgentList = travelAgentList;
    }

   
    public TravelAgent addTravelAgent(String newPassword, String newCustomerId) {
        TravelAgent travel = new TravelAgent(newPassword,newCustomerId);
        travelAgentList.add(travel);
        return travel;
    }  
}
