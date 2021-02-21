package org.owntournament.extension.korfball.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.owntournament.core.interfaces.models.IBasePoulestandingDTO;
import org.owntournament.core.interfaces.models.IBaseTeamDTO;

import javax.persistence.*;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "poulestanding")
public class PoulestandingDTO extends BaseDTO implements IBasePoulestandingDTO {
	private int position;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="team_id", referencedColumnName = "id")
	private TeamDTO team;
	private int gamesPlayed;
	private int gamesWon;
	private int gamesDrawn;
	private int gamesLost;
	private int points;
	
	@Override
	public void setTeam(IBaseTeamDTO team) {
		this.team = (TeamDTO) team;
	}
}
