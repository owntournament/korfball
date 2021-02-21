package org.owntournament.extension.korfball.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.owntournament.core.interfaces.models.IBaseGameDTO;
import org.owntournament.core.interfaces.models.IBasePouleDTO;
import org.owntournament.core.interfaces.models.IBaseTeamDTO;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "game")
public class GameDTO extends BaseDTO implements IBaseGameDTO {
	@ManyToOne(fetch = FetchType.EAGER)
	private PouleDTO poule;
	private int gamenumber;
	@ManyToOne(fetch = FetchType.EAGER)
	private TeamDTO hometeam;
	@ManyToOne(fetch = FetchType.EAGER)
	private TeamDTO awayteam;
	private int homegoals;
	private int awaygoals;
	
	@Override
	public void setPoule(IBasePouleDTO poule) {
		this.poule = (PouleDTO) poule;
	}
	
	@Override
	public void setHometeam(IBaseTeamDTO hometeam) {
		this.hometeam = (TeamDTO) hometeam;
	}
	
	@Override
	public void setAwayteam(IBaseTeamDTO awayteam) {
		this.awayteam = (TeamDTO) awayteam;
	}
}
