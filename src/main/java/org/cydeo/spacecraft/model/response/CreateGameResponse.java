package org.cydeo.spacecraft.model.response;

import lombok.Data;

@Data
public class CreateGameResponse {
    private String responseMessage;
    private Long gameId;
}