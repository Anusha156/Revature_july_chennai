package com.linkedin.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.linkedin.entity.LinkedinUser;

public class LinkedinDAO implements LinkedinDAOInterface {
	
	private static LinkedinUser luser[];
	static {
		luser=new LinkedinUser[10];
	}

	public int createProfileDAO(LinkedinUser lu) {
		int i=0;
		try {
		//step1 load driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//step2 create database connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/revaturechennai","root","root");
		
		//step3 create dynamic query
		PreparedStatement ps=con.prepareStatement("insert into LinkedinUser values(?,?,?)");
		//? is known as place holder for the value
		//how to replace place holder like ? with value
		ps.setString(1, lu.getName());
		ps.setString(2, lu.getPassword());
		ps.setString(3, lu.getMail());
		
		/*step4 execute query
		  *for insert,delete and update we will use executeUpdate().
		  *executeUpdate() method return type will be int,it will number of rows affected by query.
		  *for select query we will use executeQuery() method
		  *executeeQuery() method return type will be ResultSet  */
		i = ps.executeUpdate();
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return i;
	}
	public LinkedinUser viewProfileDAO(LinkedinUser lu) {
		LinkedinUser l2 = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/revaturechennai","root","root");
			PreparedStatement ps=con.prepareStatement("select * from LinkedinUser where email=?");
			ps.setString(1, lu.getMail());
			
			
			ResultSet res=ps.executeQuery();
			if(res.next()) {
				String n=res.getString(1);
				String p=res.getString(2);
				String u=res.getString(3);
				
				l2=new LinkedinUser();
				l2.setName(n);
				l2.setMail(p);
				l2.setPassword(u);
				
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();	
		}
		return l2;
		
	}

}





/*for(int i=0;i<luser.length;i++) {
if(luser[i]==null) {
	
}
}


int i[]=new int[4]; //array type variable,it will allocate memory for var
i[0]=12;
i[1]=22;
i[2]=23;
i[3]=14;
int j[]= {1,2,3};

//LinkedinUser luser[]=new LinkedinUser[10];
*/

