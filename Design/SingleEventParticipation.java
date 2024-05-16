public class SingleEventParticipation extends EventRegistration{
    private int participateNo;
    SingleEventParticipation(String name,String nameOfEvent, int participateNo){
        super(name,nameOfEvent);
        this.participateNo=participateNo;
    }

    public int getParticipateNo() {
        return participateNo;
    }

    public void setParticipateNo(int participateNo) {
        this.participateNo = participateNo;
    }
    @Override
    void registerEvent(){
        String e=getNameOfEvent();
        if(e == "ShakeALeg"){
            setRegistrationFee(100);
        } else if (e=="Sing&Win") {
            setRegistrationFee(150);
        } else if (e=="PlayAway") {
            setRegistrationFee(130);
        }else{
            System.out.println("Please choose a valid event");
            return;
        }
        System.out.println("Thank you "+getName()+" for your participation.Your registration fee is: "+getRegistrationFee());
        System.out.println("Participate number: "+getParticipateNo());
    }
}
