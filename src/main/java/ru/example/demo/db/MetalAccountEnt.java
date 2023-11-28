package ru.example.demo.db;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class MetalAccountEnt {

    /**
     * Идентификатор аккаунта
     */
    private int id;

    /**
     * Владелец счёта
     */
    private int clientId;

    /**
     * Тип металла
     */
    private String metal;

    /**
     * Количество металла на счету в килограммах
     */
    private Double mass;

    /**
     * Курс металла
     */
    private Double course;

    /**
     * Дата и время создания аккаунта
     */
    private LocalDateTime createdDate;
}
