/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.User.Agent;
import Business.User.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manasa
 */
public class AgentDirectory {
    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
  
    private List<Agent> agents;
    
    public AgentDirectory() {
        agents = new ArrayList<>();
        
    }

    public List<Agent> getAgents() {
        return agents;
    }

    public void setAgents(List<Agent> agents) {
        this.agents = agents;
    }
    
   public void addAgent(Agent a){
        agents.add(a);
   }

  
    public Agent searchAgent(String passwordNo) {
        Agent res = null;
        for (Agent a : agents) {
            if (a.getPassword().equals(passwordNo)) {
                res= a;
            }
        }
        
        return res;
    }

}
    
   
