package fr.lernejo.chat;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ChatMessageRepository {
    List<String> tenMessagesList = new ArrayList<>();

    void addChatMessage(String message){
        if(this.tenMessagesList.size() == 10) {
            this.tenMessagesList.remove(0);
        }
        this.tenMessagesList.add(message);
    }

    List<String> getLastTenMessages(){
        return this.tenMessagesList;
    }
}
