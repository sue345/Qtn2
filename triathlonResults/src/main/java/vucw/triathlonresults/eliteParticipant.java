/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vucw.triathlonresults;

/**
 *
 * @author CORE i7
 */
public class eliteParticipant {
    
}
class eliteParticipant extends Participant {
    private String sponsorName;

    public String getSponsorName() { 
        return sponsorName; 
    }

    public void setSponsorName(String sponsorName) { 
        this.sponsorName = sponsorName; 
    }

    public void displayDetails() { 
        System.out.println("Name:" + getName() + ", ID: " + getId() + ", Total Time: " + getTotalTime() + " minutes, Sponsor: " + sponsorName); 
    }
}
public int getTotalTime() {
    return swimmingTime + cyclingTime + runningTime;
}