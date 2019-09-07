package com.info.haidara.sid.entities;

import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
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
@DiscriminatorValue("res")
public class ResponsableFiliere  extends Person{
  
	@OneToMany(mappedBy="responsablefiliere")
	private Collection<Filiere> filiere;
}
