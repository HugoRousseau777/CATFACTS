package com.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
@Table(name = "CATBREEDS")
public class CatBreed {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name="BREEDS")
    private String breed;

    @Column(name="COUNTRIES")
    private String country;
    @Column(name="ORIGINS")
    private String origin;
    @Column(name="COATS")
    private String coat;
    @Column(name="PATTERNS")
    private String pattern;

    public Integer getId(){
        return this.id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getCountry(){
        return this.country;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public String getOrigin(){
        return this.origin;
    }

    public void setOrigin(String origin){
        this.origin = origin;
    }
    public String getCoat(){
        return this.coat;
    }

    public void setCoat(String coat){
        this.coat = coat;
    }
    public String getPattern(){
        return this.pattern;
    }

    public void setPattern(String pattern){
        this.pattern = pattern;
    }
}

