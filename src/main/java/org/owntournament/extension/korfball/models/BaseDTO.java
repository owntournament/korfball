package org.owntournament.extension.korfball.models;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.owntournament.core.interfaces.models.IBaseDTO;

import javax.persistence.*;
import java.time.Instant;

@Data
@MappedSuperclass
public class BaseDTO implements IBaseDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	@Version
	Long version;
	
	@CreationTimestamp
	private Instant createdAt;
	
	@UpdateTimestamp
	private Instant updatedAt;
	
}
