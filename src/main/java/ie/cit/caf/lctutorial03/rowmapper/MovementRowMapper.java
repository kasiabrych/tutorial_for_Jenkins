package ie.cit.caf.lctutorial03.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import ie.cit.caf.lctutorial03.domain.Movement;

import org.springframework.jdbc.core.RowMapper;

public class MovementRowMapper implements RowMapper<Movement> {

	@Override
	public Movement mapRow(ResultSet rs, int index) throws SQLException {
		Movement movement = new Movement();
		
		movement.setId(rs.getInt("id"));
		movement.setName(rs.getString("name"));
		
		return movement;
	}
	
}
