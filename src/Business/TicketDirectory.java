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
 * @author Manasa
 */
public class TicketDirectory {
    private List<Ticket> ticketDirectory;
    
    public TicketDirectory(){
        ticketDirectory = new ArrayList<Ticket>();
    }

    public List<Ticket> getTicketDirectory() {
        return ticketDirectory;
    }

    public void setTicketDirectory(List<Ticket> ticketDirectory) {
        this.ticketDirectory = ticketDirectory;
    }
    
    public Ticket addTicket()
    {
        Ticket t =new Ticket();
        ticketDirectory.add(t);
        return t;
    }
    
       public void deleteTicket(Ticket t)
    {
        
        ticketDirectory.remove(t);
        
    }
}
