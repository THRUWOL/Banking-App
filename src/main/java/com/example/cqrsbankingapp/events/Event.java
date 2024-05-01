package com.example.cqrsbankingapp.events;

import com.example.cqrsbankingapp.domain.agregate.Aggregate;

public interface Event {

    void apply(Aggregate aggregate);
}
