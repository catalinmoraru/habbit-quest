package com.redhat.developers.msa.quest;

import com.redhat.developers.msa.topic.Topic;
import com.redhat.developers.msa.topic.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by catalin.moraru on 26.01.2017.
 */

@Service
public class QuestService {

     @Autowired
     private QuestDaoImplRepository topicRepository;

    public List<Quest> getAllQuests(){
        List<Quest> topics = new ArrayList<>();
         return topicRepository.getAllQuests();
        // return topics;
        // return null;
    }

    public void addQuest(Quest topic) {
        // topicRepository.save(topic);

    }

    public Quest getQuest(String id){

        // return topicRepository.findOne(id);
        return null;
    }

    public void updateQuest(String id, Quest quest) {
        // questRepository.save(quest);
    }

    public void delete(String id) {
        // questRepository.delete(id);
    }
}
