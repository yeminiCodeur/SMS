package com.info.haidara.sid.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
public class Semestre {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
	private String  designation;
	@ManyToOne
	private Filiere filiere;
	
	@OneToMany(mappedBy="semestre")
	private Collection<Module> modules;
}
