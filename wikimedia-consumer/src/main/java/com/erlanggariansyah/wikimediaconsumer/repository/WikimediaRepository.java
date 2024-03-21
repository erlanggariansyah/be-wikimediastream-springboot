package com.erlanggariansyah.wikimediaconsumer.repository;

import com.erlanggariansyah.wikimediaconsumer.model.Wikimedia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaRepository extends JpaRepository<Wikimedia, Long> { }
