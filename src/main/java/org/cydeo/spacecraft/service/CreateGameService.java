package org.cydeo.spacecraft.service;

import com.cydeo.spacecraft.dto.CreateGameDTO;

public interface CreateGameService {
    Long createGame(CreateGameDTO createGameDTO);
}
