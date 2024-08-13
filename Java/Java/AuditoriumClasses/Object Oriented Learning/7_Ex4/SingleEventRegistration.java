public class SingleEventRegistration extends EventRegistration{
    public int participantNo;

    SingleEventRegistration(String name, String nameOfEvent, int participantNo){
        super(name, nameOfEvent);
        this.participantNo = participantNo;
    }

    public int getParticipantNo(){
        return this.participantNo;
    }
    public void setParticipantNo(int participantNo){
        this.participantNo = participantNo;
    }
    public void registerEvent(){
        if(this.nameOfEvent.equals("ShakeALeg")){
            this.registrationFee = 100;
        } else if (this.nameOfEvent.equals("Sing&Win")){
            this.registrationFee = 150;
        } else if (this.nameOfEvent.equals("PlayAway")){
            this.registrationFee = 130;
        } else {
            this.registrationFee = 0;
        }
        System.out.println("Thank You "+this.name+" for your participation.Your registration fee is: "+this.registrationFee+"\nYou are participant no: "+this.participantNo);
    }
}
