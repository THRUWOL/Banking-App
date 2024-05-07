package com.example.cqrsbankingapp.service.card;

import com.example.cqrsbankingapp.domain.model.Account;
import com.example.cqrsbankingapp.domain.model.Card;
import com.example.cqrsbankingapp.service.account.AccountCommandService;
import com.example.cqrsbankingapp.service.account.AccountQueryService;
import com.example.cqrsbankingapp.service.account.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {

    private CardQueryService queryService;
    private CardCommandService commandService;


    @Override
    public void create(Card object) {
        commandService.create(object);
    }

    @Override
    public Card getById(UUID id) {
        return queryService.getById(id);
    }
}
