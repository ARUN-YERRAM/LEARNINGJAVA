// EventRegistration class
class EventRegistration {
    protected String name;
    protected String eventName;
    protected double registrationFee;

    // Constructor
    public EventRegistration(String name, String eventName) {
        this.name = name;
        this.eventName = eventName;
    }

    // Method to display registration fee based on event
    public void registerEvent() {
        System.out.println("Please choose a valid event");
    }
}

// SingleEventRegistration class inheriting from EventRegistration
class SingleEventRegistration extends EventRegistration {
    private int participantNumber;

    // Constructor
    public SingleEventRegistration(String name, String eventName, int participantNumber) {
        super(name, eventName);
        this.participantNumber = participantNumber;
    }

    // Override method to calculate registration fee for single event
    @Override
    public void registerEvent() {
        if (eventName.equals("Singing") || eventName.equals("Dancing") || eventName.equals("Drawing")) {
            registrationFee = 50.0; // Base fee for single events
            System.out.println("Thank You " + name + " for your participation. Your registration fee is: " + registrationFee);
            System.out.println("You are participant no: " + participantNumber);
        } else {
            super.registerEvent(); // Call superclass method for invalid event
        }
    }
}

// TeamEventRegistration class inheriting from EventRegistration
class TeamEventRegistration extends EventRegistration {
    private int teamNumber;
    private int noOfParticipants;

    // Constructor
    public TeamEventRegistration(String name, String eventName, int teamNumber, int noOfParticipants) {
        super(name, eventName);
        this.teamNumber = teamNumber;
        this.noOfParticipants = noOfParticipants;
    }

    // Override method to calculate registration fee for team event
    @Override
    public void registerEvent() {
        // Base fee for team events
        double baseFee = 100.0;
        registrationFee = baseFee * noOfParticipants;
        System.out.println("Thank You " + name + " for your participation. Your registration fee is: " + registrationFee);
        System.out.println("You are participant no: " + teamNumber);
    }
}

// ShowYourTalentRegistration class
public class Registration {
    public static void main(String[] args) {
        // Create instances of SingleEventRegistration and TeamEventRegistration
        SingleEventRegistration participant1 = new SingleEventRegistration("Jenny", "Singing", 1);
        TeamEventRegistration team1 = new TeamEventRegistration("Aura", "Dancing", 1, 5);
        SingleEventRegistration participant2 = new SingleEventRegistration("Hudson", "Football", 2);

        // Invoke registerEvent method for each instance
        participant1.registerEvent();
        team1.registerEvent();
        participant2.registerEvent();
    }
}
