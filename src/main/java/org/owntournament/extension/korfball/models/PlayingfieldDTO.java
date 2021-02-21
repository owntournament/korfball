package org.owntournament.extension.korfball.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.owntournament.core.interfaces.models.IBasePlayingfieldDTO;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "playingfield")
public class PlayingfieldDTO extends BaseDTO implements IBasePlayingfieldDTO {
	private String name;
}
