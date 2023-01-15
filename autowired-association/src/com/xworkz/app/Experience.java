package com.xworkz.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Experience {
	
		@Autowired
		private Skill skill;
		
		public Experience() {
			System.out.println("Creating object for experience");
		}
		
		public void toCheckSkill() {
			System.out.println(this.skill.hashCode());
		}
}
