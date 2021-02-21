package org.owntournament.extension.korfball.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.owntournament.core.interfaces.models.IBaseCategoryDTO;
import org.owntournament.core.interfaces.models.IBasePouleDTO;
import org.owntournament.core.interfaces.models.IBasePoulestandingDTO;

import javax.persistence.*;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "poule")
public class PouleDTO extends BaseDTO implements IBasePouleDTO {
	private String poulename;
	@ManyToOne(fetch = FetchType.EAGER)
	private CategoryDTO category;
	@ManyToMany //(fetch = FetchType.EAGER)
	private List<PoulestandingDTO> poulestanding;
	
	@Override
	public void setCategory(IBaseCategoryDTO category) {
		this.category = (CategoryDTO) category;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void setPoulestanding(List<? extends IBasePoulestandingDTO> poulestanding) {
		this.poulestanding = (List<PoulestandingDTO>) poulestanding;
	}
}
