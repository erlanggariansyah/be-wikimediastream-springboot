package com.erlanggariansyah.wikimediaconsumer.service;

import com.erlanggariansyah.wikimediaconsumer.model.Wikimedia;
import com.erlanggariansyah.wikimediaconsumer.repository.WikimediaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Consumer {
    private WikimediaRepository wikimediaRepository;

    public Consumer(WikimediaRepository wikimediaRepository) {
        this.wikimediaRepository = wikimediaRepository;
    }

    @KafkaListener(
            topics = "wikimedia_recentchange",
            groupId = "Main"
    )
    public void receive(String message) {
        Wikimedia wikimedia = new Wikimedia();
        wikimedia.setData(message);

        wikimediaRepository.save(wikimedia);
    }
}
