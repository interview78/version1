package ru.example.demo.rest;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Металлический аккаунт пользователя
 */
@Data
@Builder
public class MetalAccount {

    /**
     * Идентификатор аккаунта
     */
    private int id;

    /**
     * Тип металла
     */
    private Metal metal;

    /**
     * Масса металла в килограммах
     */
    private Double mass;

    /**
     * Стоимость по текущему курсу
     */
    private Double currentPrice;

    /**
     * Дата и время создания аккаунта
     */
    private LocalDateTime createdDate;
}
