package com.up.pokedex.models;


import java.io.Serializable;
import java.util.ArrayList;

public class Pokemon implements Serializable {

    public Pokemon(int id, String nome, String image) {
        this.id = id;
        this.name = nome;
        this.image = image;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ArrayList<String> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<String> types) {
        this.types = types;
    }

    public ArrayList<String> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<String> abilities) {
        this.abilities = abilities;
    }

    public ArrayList<String> getMoves() {
        return moves;
    }

    public void setMoves(ArrayList<String> moves) {
        this.moves = moves;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    private int id;
    private String name;
    private String image;
    private ArrayList<String> types;
    private ArrayList<String> abilities;
    private ArrayList<String> moves;
}
