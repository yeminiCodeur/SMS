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
public class TypeFiliere {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
     private long id;
	 private String nomtype;
	 private String slug;
	@OneToMany(mappedBy="typefiliere")
	private Collection<Filiere> filieres;
	
}
