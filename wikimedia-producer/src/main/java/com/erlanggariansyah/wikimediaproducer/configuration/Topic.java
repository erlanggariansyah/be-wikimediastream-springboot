package com.erlanggariansyah.wikimediaproducer.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class Topic {
    @Bean
    public NewTopic wikimediaRecentChange() {
        return TopicBuilder.name("wikimedia_recentchange").build();
    }
}
