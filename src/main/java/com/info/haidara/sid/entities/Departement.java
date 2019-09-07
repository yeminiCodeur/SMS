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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Departement {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
	private String nomDept;
	@OneToMany(mappedBy="dept")
	private Collection<Filiere> fileres;
	@OneToMany(mappedBy="departement")
	private Collection<Personnel> personnels;
}
