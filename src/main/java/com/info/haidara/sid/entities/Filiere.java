package com.info.haidara.sid.entities;

import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Filiere {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nomFilere;
	@ManyToOne
	private Departement dept;

	@OneToMany(mappedBy = "filiere")
	private Collection<Formation> formations;

	@ManyToOne
	private ResponsableFiliere responsablefiliere;
	
	
	@OneToMany(mappedBy="filiere") 
	private Collection<Semestre> semestres;

	@ManyToOne
	TypeFiliere typefiliere;

	
	
}
