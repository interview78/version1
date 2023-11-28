package ru.example.demo.db;

import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * Заглушка на репозиторий
 */
@Repository
public class MetalAccountDb {

    public Optional<MetalAccountEnt> findById(int id) {
        return Optional.of(
                MetalAccountEnt.builder()
                        .id(id)
                        .metal("GOLD")
                        .mass(5.2)
                        .clientId(6)
                        .createdDate(LocalDateTime.now())
                        .build()
        );
    }
}
