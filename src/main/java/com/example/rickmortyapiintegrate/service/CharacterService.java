package com.example.rickmortyapiintegrate.service;
import com.example.rickmortyapiintegrate.model.ApiResults;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;


@Service
public class CharacterService {

    private final RestClient restClient;

    public CharacterService(RestClient.Builder restClientBuilder) {
        this.restClient = restClientBuilder
                .baseUrl("https://rickandmortyapi.com/api/character")
                .build();
    }

    public Character getCharacterById(){
        return  restClient.get()
                .uri("/1")
                .retrieve()
                .body(Character.class);

    }

}
