package com.erlanggariansyah.wikimediaconsumer.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "recentchanges")
public class Wikimedia {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data", columnDefinition = "TEXT")
    private String data;
}
