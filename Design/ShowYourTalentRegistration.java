public class ShowYourTalentRegistration {
    public static void main(String[] args){
        SingleEventParticipation p1 =new SingleEventParticipation("Jenny","Sing&Win",1);
        p1.registerEvent();
        TeamEventRegistration t1 = new TeamEventRegistration("Aura","ShakeALeg",5,1);
        t1.registerEvent();
        SingleEventParticipation p2 =new SingleEventParticipation("Hudson","PlayAway",2);
        p2.registerEvent();
    }
}
