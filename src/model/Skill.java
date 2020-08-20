package model;

public class Skill{
	long skillid;
	 String skillName;
	 
	 public Skill(Long skillid, String skillName) {
		
		this.skillid = skillid;
		this.skillName = skillName;
	}
	 
	 public Long getSkillid() {
		return skillid;
	}
	public void setSkillid(Long skillid) {
		this.skillid = skillid;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	
}