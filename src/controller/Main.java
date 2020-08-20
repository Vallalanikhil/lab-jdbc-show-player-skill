package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import dao.SkillDAO;
import model.Skill;

public class Main {
	

	public static void main(String[] args) throws Exception {
		System.out.println("list of skills :");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
         System.out.println("Enter skill id :");
         long skillid=Long.parseLong(br.readLine());
         
         System.out.println("Enter skill Name :");
         String skillName=br.readLine();
        		 
		SkillDAO skilldao=new SkillDAO();
				List<Skill> skills_list = skilldao.listAllSkillDAO();
				
				System.out.println(skills_list);
				
			
			}
	}
