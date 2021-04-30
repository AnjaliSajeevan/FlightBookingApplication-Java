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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class MasterSeatDirectory {
    private List<SeatDirectory> masterSeatDirectory;
    
    public MasterSeatDirectory(){
        masterSeatDirectory = new ArrayList<SeatDirectory>();
    }

    public List<SeatDirectory> getSeatDirectory() {
        return masterSeatDirectory;
    }

    public void setSeatDirectory(List<SeatDirectory> seatDirectory) {
        this.masterSeatDirectory = masterSeatDirectory;
    }
    
    public SeatDirectory addSeatDirectory(SeatDirectory sd){
        masterSeatDirectory.add(sd);
        return sd;
    }
}
