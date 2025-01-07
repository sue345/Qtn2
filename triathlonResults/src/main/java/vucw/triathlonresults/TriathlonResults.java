/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vucw.triathlonresults;

/**
 *
 * @author CORE i7
 */
public class TriathlonResults {

        class Participant {
    private String name;
    private int id;
    private int swimmingTime;
    private int cyclingTime;
    private int runningTime;

    public String getName() { 
        return name; 
    }

    public void setName(String name) { 
        this.name = name; 
    }

    public int getId() { 
        return id; 
    }

    public void setId(int id) { 
        this.id = id; 
    }

    public int getSwimmingTime() { 
        return swimmingTime; 
    }

    public void setSwimmingTime(int swimmingTime) { 
        if (swimmingTime < 0) { 
            throw new IllegalArgumentException("Swimming time cannot be negative."); 
        } 
        this.swimmingTime = swimmingTime; 
    }

    public int getCyclingTime() { 
        return cyclingTime; 
    }

    public void setCyclingTime(int cyclingTime) { 
        if (cyclingTime < 0) { 
            throw new IllegalArgumentException("Cycling time cannot be negative."); 
        } 
        this.cyclingTime = cyclingTime; 
    }

    public int getRunningTime() { 
        return runningTime; 
    }

    public void setRunningTime(int runningTime) { 
        if (runningTime < 0) { 
            throw new IllegalArgumentException("Running time cannot be negative."); 
        } 
        this.runningTime = runningTime;
        
    }
        }
}

   public class TriathlonResults {
    public static void main(String[] args) {
        List<Participant> participants = new ArrayList<>();

        
        Participant alice = new Participant();
        alice.setName("Alice");
        alice.setId(1);
        alice.setSwimmingTime(25);
        alice.setCyclingTime(40);
        alice.setRunningTime(20);
        participants.add(alice);

        Participant bob = new Participant();
        bob.setName("Bob");
        bob.setId(2);
        bob.setSwimmingTime(20);
        bob.setCyclingTime(35);
        bob.setRunningTime(25);
        participants.add(bob);

        Participant charlie = new Participant();
        charlie.setName("Charlie");
        charlie.setId(3);
        charlie.setSwimmingTime(30);
        charlie.setCyclingTime(50);
        charlie.setRunningTime(30);
        participants.add(charlie);

        EliteParticipant diana = new EliteParticipant();
        diana.setName("Diana");
        diana.setId(4);
        diana.setSwimmingTime(28);
        diana.setCyclingTime(42);
        diana.setRunningTime(18);
        diana.setSponsorName("Acme Sports");
        participants.add(diana);

     
        Collections.sort(participants, Comparator.comparingInt(Participant::getTotalTime));

       
        Participant fastest = participants.get(0);
        Participant secondFastest = participants.get(1);

       
        System.out.println("Triathlon Results:");
        for (Participant participant : participants) {
            participant.displayDetails();
        }

        System.out.println("\nFastest Participant: " + fastest.getName() + " with a total time of " + fastest.getTotalTime() + " minutes");
        System.out.println("Second Fastest Participant: " + secondFastest.getName() + " with a total time of " + secondFastest.getTotalTime() + " minutes");
    }
}

