package org.owntournament.extension.korfball.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.owntournament.core.interfaces.models.IBaseCategoryDTO;
import org.owntournament.core.interfaces.models.IBasePlayingfieldDTO;

import javax.persistence.*;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "category")
public class CategoryDTO extends BaseDTO implements IBaseCategoryDTO {
	private String name;
	private String description;
	
	@ManyToMany //(fetch = FetchType.EAGER)
	@JoinColumn(name = "speelveld_id")
	private List<PlayingfieldDTO> playingfields;
	
	@SuppressWarnings("unchecked")
	@Override
	public void setPlayingfields(List<? extends IBasePlayingfieldDTO> playingfields) {
		this.playingfields = (List<PlayingfieldDTO>) playingfields;
	}
	
}
