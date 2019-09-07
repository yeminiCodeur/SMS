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
@DiscriminatorValue("fc")
@Getter
@Setter
public class FourmationContinue  extends Formation{
  private String nom; 
}