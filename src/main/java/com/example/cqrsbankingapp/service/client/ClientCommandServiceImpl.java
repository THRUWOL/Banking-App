package com.example.cqrsbankingapp.service.client;

import com.example.cqrsbankingapp.domain.model.Client;
import com.example.cqrsbankingapp.events.AccountCreateEvent;
import com.example.cqrsbankingapp.events.ClientCreateEvent;
import com.example.cqrsbankingapp.service.event.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientCommandServiceImpl implements ClientCommandService {

    private EventService eventService;

    @Override
    public void create(Client object) {
        ClientCreateEvent event = new ClientCreateEvent(object);
        eventService.create(event);
    }
}
