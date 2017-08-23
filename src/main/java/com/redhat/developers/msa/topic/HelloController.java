package com.redhat.developers.msa.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by catalin.moraru on 26.01.2017.
 */

@RestController
public class HelloController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/hello")
    public String sayHi(){

        Topic topic1 = new Topic("1","topic1","description1");
        Topic topic2 = new Topic("2","topic2","description2");
        Topic topic3 = new Topic("3","topic3","description3");
        topicService.addTopic(topic1);
        topicService.addTopic(topic2);
        topicService.addTopic(topic2);

        return "Hi";
    }
}
