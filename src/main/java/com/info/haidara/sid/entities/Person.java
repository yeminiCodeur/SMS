package com.info.haidara.sid.entities;

import java.util.Collection;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPEPERSONNEL", discriminatorType=DiscriminatorType.STRING, length=3)
public abstract class Person {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
	@ManyToOne
	private Departement departement;
	private String code;
	private String nom;
	private String prenom;
	private String photo;	
	private String email ;
	private String telephone;
}
