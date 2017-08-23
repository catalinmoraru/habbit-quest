package com.redhat.developers.msa.quest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class QuestDaoImplRepository {

	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Autowired
	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}
	

	public List<Quest> getAllQuests() {
		
		Map<String, Object> params = new HashMap<String, Object>();
		
		String sql = "SELECT * FROM quests";
		
        List<Quest> result = namedParameterJdbcTemplate.query(sql, params, new QuestMapper());
        
        return result;
        
	}

	private static final class QuestMapper implements RowMapper<Quest> {

		public Quest mapRow(ResultSet rs, int rowNum) throws SQLException {
			Quest quest = new Quest();
			quest.setId(rs.getInt("id"));
			quest.setName(rs.getString("name"));
			quest.setDescription(rs.getString("description"));
			return quest;
		}
	}

}