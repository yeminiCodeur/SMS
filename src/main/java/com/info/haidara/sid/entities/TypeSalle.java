package com.info.haidara.sid.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class TypeSalle {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
	private String NomType;

	@OneToMany(mappedBy="typesale")
	private Collection<Salle> salles;
	
	
}
