package objectserialization;

import java.util.ArrayList;
import java.util.List;

public class SerializationApp {
    
    public static void main(String[] args) {
        List<Participant> participants = new ArrayList<Participant>();
        participants.add(new Participant("Daffara", "Zhuliani", 19));
        participants.add(new Participant("Lalisa", "Manoban", 25));
        participants.add(new Participant("Jennie", "Ruby", 26));
        participants.add(new Participant("Ciyo", "Saputro", 5));
        participants.add(new Participant("Poki", "James", 5));
    
        System.out.println("Participants: " + participants);
        
        
        //running Serializationdemo.java
        SerializationDemo demo = new SerializationDemo();
        demo.serialize(participants, "participantData.ser");
        System.out.println("serialization is done");
    
        //running Deserialization
        System.out.println("Deserialize object...");
        List<Participant> newList = demo.deserialize("ParticipantData.ser");
        System.out.println("New List: " + newList);
    }
}
