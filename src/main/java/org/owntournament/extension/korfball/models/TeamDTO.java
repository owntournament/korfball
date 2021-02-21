package org.owntournament.extension.korfball.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.owntournament.core.interfaces.models.IBaseCategoryDTO;
import org.owntournament.core.interfaces.models.IBaseTeamDTO;

import javax.persistence.*;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "team")
public class TeamDTO extends BaseDTO implements IBaseTeamDTO {
	private String name;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "categorie_id")
	private CategoryDTO category;
	@ManyToOne
	@JoinColumn(name = "school_id")
	private SchoolDTO school;
	private String contact;
	
	@Override
	public void setCategory(IBaseCategoryDTO category) {
		this.category = (CategoryDTO) category;
	}
}
