package org.owntournament.extension.korfball.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "school")
public class SchoolDTO extends BaseDTO {
	private String name;
	private String contact;
}
