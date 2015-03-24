package ie.cit.caf.lctutorial03.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import ie.cit.caf.lctutorial03.domain.Artist;

import org.springframework.jdbc.core.RowMapper;

public class ArtistRowMapper implements RowMapper<Artist> {

	@Override
	public Artist mapRow(ResultSet rs, int index) throws SQLException {
		Artist artist = new Artist();
		
		artist.setId(rs.getInt("id"));
		artist.setName(rs.getString("fullName"));
		artist.setGender(rs.getString("gender"));
		
		return artist;
	}

}

