package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
	
	public List<Skill> listAllSkillDAO () throws Exception {
		
	List<Skill> skills_list = new ArrayList<Skill>();
		String Skills="select ID, NAMES from SKILLS order by NAMES ASC";
		
	 Connection cn=null;
		   try {
			cn=ConnectionManager.getConnection();

			
			PreparedStatement ps = cn.prepareStatement(Skills);
			ResultSet resultSet = ps.executeQuery();
		while(resultSet.next()) {
			Long id = resultSet.getLong("ID");
			String names = resultSet.getString("NAMES");
			Skill skill = new Skill(id, names);
			skills_list.add(skill);
		}
		   } catch (Exception e) {
			
			e.printStackTrace();
		}
		  
		   return skills_list;
		   
	   }

	
}