package com.redhat.developers.msa.quest;

import com.redhat.developers.msa.quest.Quest;
import com.redhat.developers.msa.quest.QuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by catalin.moraru on 26.01.2017.
 */

@RestController
public class QuestController {

    @Autowired
    private QuestService questService;

    @RequestMapping("/quests")
    public List<Quest> getAllQuests(){
        List<Quest> quests = questService.getAllQuests();
        System.out.println("quests : ");
        System.out.println(quests);
        return quests;
    }

    @RequestMapping("/quests/{id}")
    public Quest getQuest(@PathVariable String id){
        return questService.getQuest(id);
    }

    @RequestMapping(method= RequestMethod.POST, value = "/quests")
    public void addQuest(@RequestBody Quest quest){
        questService.addQuest(quest);
    }

    @RequestMapping(method= RequestMethod.PUT, value = "/quests/{id}")
    public void addQuest(@RequestBody Quest quest, @PathVariable String id){
        questService.updateQuest(id,quest);
    }

    @RequestMapping(method= RequestMethod.DELETE, value = "/quests/{id}")
    public void deleteQuest(@PathVariable String id){
        questService.delete(id);
    }


}
