/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Manasa
 */
public class MasterTicketCatalog {
       private ArrayList<Ticket> ticketList;
    
    public MasterTicketCatalog(){
        ticketList = new ArrayList<Ticket>();
    }

    public ArrayList<Ticket> getTicketCatalog() {
        return ticketList;
    }

    public void setTicketCatalog(ArrayList<Ticket> ticketList) {
        this.ticketList = ticketList;
    }
    public Ticket addOrder(Ticket td){
        ticketList.add(td);
        return td;
    }
    public void deleteTicket(Ticket td){
        ticketList.remove(td);
    }


}
