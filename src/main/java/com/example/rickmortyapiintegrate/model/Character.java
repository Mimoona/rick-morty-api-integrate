package com.example.rickmortyapiintegrate.model;

public record Character(String id , String name, String status, String species, String type, String gender, CharacterLocation location) {
}
