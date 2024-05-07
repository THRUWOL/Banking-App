package com.example.cqrsbankingapp.service.transaction;

import com.example.cqrsbankingapp.domain.model.Transaction;
import com.example.cqrsbankingapp.events.AccountCreateEvent;
import com.example.cqrsbankingapp.events.TransactionCreateEvent;
import com.example.cqrsbankingapp.service.event.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionCommandServiceImpl implements TransactionCommandService {

    private EventService eventService;

    @Override
    public void create(Transaction object) {
        TransactionCreateEvent event = new TransactionCreateEvent(object);
        eventService.create(event);
    }
}
