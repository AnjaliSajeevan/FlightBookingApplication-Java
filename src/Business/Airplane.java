/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Anjali
 */
public class Airplane  {
    private String airplaneName;
    private int seatingCapacity;
    private String engine;
    private String length;
    private String height;
    private String wingspan;
    private String cabinWidth;
      
    
    public String getAirplaneName() {
        return airplaneName;
    }

    public void setAirplaneName(String airplaneName) {
        this.airplaneName = airplaneName;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWingspan() {
        return wingspan;
    }

    public void setWingspan(String wingspan) {
        this.wingspan = wingspan;
    }

    public String getCabinWidth() {
        return cabinWidth;
    }

    public void setCabinWidth(String cabinWidth) {
        this.cabinWidth = cabinWidth;
    }
    

  @Override  
    public String toString()
    {
        return airplaneName;
    }
}
