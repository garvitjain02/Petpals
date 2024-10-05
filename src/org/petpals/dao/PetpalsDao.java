package org.petpals.dao;

import org.petpals.util.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.petpals.entity.*;
import org.petpals.util.*;

public class PetpalsDao implements PetpalsDaoInf {

	static Connection con;
	private static void getCon()
	{
		if(con == null)
			con = DBConnUtil.getConnection(DBPropertyUtil.getConnString("db.properties"));
	}
	
	@Override
	public void displayPets() {
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from pets");
	        System.out.println("Pet ID  ||  Name  ||  Age  ||  Breed  ||  Type");
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3) + "  " + rs.getString(4) + "  " + rs.getString(5));
	        }
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	void displayEvents () {
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from adoption_events");
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4));
	        }
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	int donationRecording (String name, String type, int amount) {
		Statement stmt = null;
		int r;
		try {
			stmt = con.createStatement();
			r = stmt.executeUpdate("insert into donations(donor_name, donation_type, donation_amount) values (" + name + ", " + type + ", " + amount); 
			System.out.println(r + " rows are inserted....");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return r;
	}
	
	@Override
	int registerForEvent (String name, String type, int id) {
		Statement stmt2 = null;
		int r;
		try {
			stmt2 = con.createStatement();
			int r = stmt2.executeUpdate("insert into participants(participant_name, participant_type, eventId) values (" + name + ", " + type + ", " + event); 
			System.out.println(r + " rows are inserted....");
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return r;
	}
}
