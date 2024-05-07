package com.example.cqrsbankingapp.domain.agregate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

/**
 * Класс, представляющий агрегат в системе.
 * Этот класс содержит информацию об агрегате, включая идентификатор.
 * Может использоваться для представления сущностей в доменной модели.
 */
@Getter
@Setter
@AllArgsConstructor
public abstract class Aggregate {

    /**
     * Уникальный идентификатор агрегата.
     */
    private UUID id;
}
