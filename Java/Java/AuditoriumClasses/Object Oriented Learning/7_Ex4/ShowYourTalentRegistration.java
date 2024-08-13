public class ShowYourTalentRegistration {
  public static void main(String[] args) {
    // TO-DO :Create an instance of SingleEventRegistration with reference of
    // EventRegistration
    // as participant1, and initialize the same with values given
    EventRegistration p1 = new SingleEventRegistration("Jenny", "Sing&Win", 1);
    // TO-DO :Invoke the method registerEvent using participant1
    p1.registerEvent();

    // TO-DO :Create an instance of SingleEventRegistration with reference of
    // EventRegistration
    // as participant2, and initialize the same with values given
    EventRegistration p2 = new SingleEventRegistration("Hudson", "PlayAway", 2);
    // TO-DO :Invoke the method registerEvent using participant2
    p2.registerEvent();

    // TO-DO :Create an instance of TeamEventRegistration with reference of
    // EventRegistration
    // as team1, and initialize the same with values given
    EventRegistration p3 = new TeamEventRegistration("Auta", "ShakeALeg", 5, 1);
    // TO-DO :Invoke the method registerEvent using team1
    p3.registerEvent();
  }
}
