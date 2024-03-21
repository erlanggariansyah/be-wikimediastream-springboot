package com.erlanggariansyah.wikimediaproducer.service;

import com.launchdarkly.eventsource.EventHandler;
import com.launchdarkly.eventsource.EventSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.net.URI;

@Service
@Slf4j
public class Producer {
    private KafkaTemplate<String, String> template;

    public Producer(KafkaTemplate<String, String> template) {
        this.template = template;
    }

    public void send() {
        EventHandler eventHandler = new Event(template, "wikimedia_recentchange");
        String eventUrl = "https://stream.wikimedia.org/v2/stream/recentchange";

        EventSource.Builder builder = new EventSource.Builder(eventHandler, URI.create(eventUrl));
        EventSource eventSource = builder.build();
        eventSource.start();
    }
}
