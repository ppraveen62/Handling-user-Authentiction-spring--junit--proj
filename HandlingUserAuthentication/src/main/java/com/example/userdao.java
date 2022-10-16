package com.example;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class userdao {
	private HibernateTemplate temp;

	public void setTemp(HibernateTemplate temp) {
		this.temp = temp;
	}
	
	//insert
	public int insert(user u) {
		return (Integer) temp.save(u);
		
	}
	
	//retrive
	public List<user> getalluser(){
		String sql="from user";
		return (List<user>) temp.find(sql);
		
	}
	
	//delete
	public int delete(user u) {
		temp.delete(u);
		return 1;
			
		}
	//update
	public int update(user u) {
		temp.update(u);
		return 1;
			
		}

}

