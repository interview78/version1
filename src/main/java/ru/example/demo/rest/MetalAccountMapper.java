package ru.example.demo.rest;

import ru.example.demo.db.MetalAccountEnt;

/**
 * Маппер
 */
public class MetalAccountMapper {

    public MetalAccount mapFrom(MetalAccountEnt input) {
        var metal = Metal.valueOf(input.getMetal());
        return MetalAccount.builder()
                .id(input.getId())
                .metal(metal)
                .mass(input.getMass())
                .currentPrice(345.4)
                .createdDate(input.getCreatedDate())
                .currentPrice(input.getMass() * input.getCourse())
                .build();
    }
}
