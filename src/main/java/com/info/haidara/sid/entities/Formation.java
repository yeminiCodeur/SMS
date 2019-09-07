package com.info.haidara.sid.entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPEFORMATION", discriminatorType=DiscriminatorType.STRING, length=4)
public abstract class Formation {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected long id;
	@ManyToOne
	protected Filiere filiere;
	@ManyToOne
	protected ResponsableFiliere responsablefiliere;
}
