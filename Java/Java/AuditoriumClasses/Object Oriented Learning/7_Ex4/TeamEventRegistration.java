public class TeamEventRegistration extends EventRegistration {
    public int noOfParticipants;
    public int teamNo;
    TeamEventRegistration(String name, String nameOfEvent, int noOfParticipants, int teamNo){
        super(name, nameOfEvent);
        this.noOfParticipants = noOfParticipants;
        this.teamNo = teamNo;
    }
    public int getNoOfParticipants() {
        return noOfParticipants;
    }
    public void setNoOfParticipants(int noOfParticipants) {
        this.noOfParticipants = noOfParticipants;
    }
    public int getTeamNo() {
        return teamNo;
    }
    public void setTeamNo(int teamNo) {
        this.teamNo = teamNo;
    }
    public void registerEvent(){
        if(this.nameOfEvent.equals("ShakeALeg")){
            this.registrationFee = 50;
        } else if (this.nameOfEvent.equals("Sing&Win")){
            this.registrationFee = 60;
        } else if (this.nameOfEvent.equals("PlayAway")){
            this.registrationFee = 80;
        } else if (this.nameOfEvent.equals("Actathon")){
            this.registrationFee = 100;
        } else {
            this.registrationFee = 0;
        }
        System.out.println("Thank You "+this.name+" for your participation.Your registration fee is: "+this.registrationFee+"\nYou are team no: "+this.teamNo);
    }
}
