// public class pro {
    
// }


class EventRegistration {
    protected String name;
    protected String eventName;
    protected double registrationFee;

    public EventRegistration(String name, String eventName) {
        this.name = name;
        this.eventName = eventName;
    }

    public void registerEvent() {
        System.out.println("Thank You " + name + " for your participation. Your registration fee is: " + registrationFee);
    }
}

class SingleEventRegistration extends EventRegistration {
    private int participantNumber;

    public SingleEventRegistration(String name, String eventName, int participantNumber) {
        super(name, eventName);
        this.participantNumber = participantNumber;
    }

    @Override
    public void registerEvent() {
        if (eventName.equals("Singing") || eventName.equals("Dancing") || eventName.equals("Painting")) {
            registrationFee = 50.0;
            System.out.println("You are participant no: " + participantNumber);
            super.registerEvent();
        } else {
            System.out.println("Please choose a valid event");
        }
    }
}

class TeamEventRegistration extends EventRegistration {
    private int teamNumber;
    private int noOfParticipants;

    public TeamEventRegistration(String name, String eventName, int teamNumber, int noOfParticipants) {
        super(name, eventName);
        this.teamNumber = teamNumber;
        this.noOfParticipants = noOfParticipants;
    }

    @Override
    public void registerEvent() {
        double baseFee = 50.0;
        registrationFee = baseFee * noOfParticipants;
        System.out.println("You are team no: " + teamNumber);
        super.registerEvent();
    }
}

public class ShowYourTalentRegistration {
    public static void main(String[] args) {
        // Creating an instance of SingleEventRegistration
        SingleEventRegistration participant1 = new SingleEventRegistration("Jenny", "Singing", 1);
        participant1.registerEvent();

        // Creating an instance of TeamEventRegistration
        TeamEventRegistration team1 = new TeamEventRegistration("Aura", "Dancing", 1, 5);
        team1.registerEvent();

        // Creating another instance of SingleEventRegistration
        SingleEventRegistration participant2 = new SingleEventRegistration("Hudson", "Cooking", 2);
        participant2.registerEvent();
    }
}
