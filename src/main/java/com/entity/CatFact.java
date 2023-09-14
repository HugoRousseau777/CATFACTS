package com.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
@Table(name = "CATFACTS")
public class CatFact {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name="FACTS")
    private String fact;

    @Column(name="LENGTHS")
    private Integer length;

    public Integer getId(){
        return this.id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getFact(){
        return this.fact;
    }

    public void setFact(String fact){
        this.fact = fact;
    }

    public Integer getLength(){
        return this.length;
    }

    public void setLength(Integer length){
        this.length = length;
    }
}
