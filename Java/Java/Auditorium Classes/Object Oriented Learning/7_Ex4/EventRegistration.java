abstract public class EventRegistration{
    public String name;
    public String nameOfEvent;
    public double registrationFee;

    EventRegistration(String name, String nameOfEvent){
        this.name = name;
        this.nameOfEvent = nameOfEvent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfEvent() {
        return nameOfEvent;
    }

    public void setNameOfEvent(String nameOfEvent) {
        this.nameOfEvent = nameOfEvent;
    }

    public double getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(double registrationFee) {
        this.registrationFee = registrationFee;
    }

    abstract public void registerEvent();
    // {
    //     if(this.nameOfEvent.equals("ShakeALeg")){
    //         this.registrationFee = 100;
    //     } else if (this.nameOfEvent.equals("Sing&Win")){
    //         this.registrationFee = 150;
    //     } else if (this.nameOfEvent.equals("Actathon")){
    //         this.registrationFee = 70;
    //     } else if (this.nameOfEvent.equals("PlayAway")){
    //         this.registrationFee = 130;
    //     } else {
    //         this.registrationFee = 0;
    //     }
    // }
}