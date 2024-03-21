package com.erlanggariansyah.wikimediaproducer;

import com.erlanggariansyah.wikimediaproducer.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WikimediaProducerApplication implements CommandLineRunner {
    @Autowired
    private Producer producer;

    public static void main(String[] args) {
        SpringApplication.run(WikimediaProducerApplication.class);
    }

    @Override
    public void run(String... args) throws Exception {
        producer.send();
    }
}
