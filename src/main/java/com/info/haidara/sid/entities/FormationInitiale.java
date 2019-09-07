package com.info.haidara.sid.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@DiscriminatorValue("fi")
@Getter
@Setter
public class FormationInitiale  extends Formation{
    private String code;
    private boolean etat;
}
