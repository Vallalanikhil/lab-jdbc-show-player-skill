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
		
	List<Skill> select_skills_list = new ArrayList<Skill>();
		String select_skills="select ID, NAMES from select_skills order by NAMES ASC";
		
	 Connection cn=null;
		   try {
			cn=ConnectionManager.getConnection();

			
			PreparedStatement ps = cn.prepareStatement(select_skills);
			ResultSet resultSet = ps.executeQuery();
		while(resultSet.next()) {
			long id = resultSet.getLong("ID");
			String names = resultSet.getString("NAMES");
			Skill skill = new Skill(id, names);
			select_skills_list.add(skill);
		}
		   } catch (Exception e) {
			
			e.printStackTrace();
		}
		  
		   return select_skills_list;
		   
	   }

	
}