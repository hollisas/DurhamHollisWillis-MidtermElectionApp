package com.csci360.electionapp.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;

import com.csci360.electionapp.model.Voter;
import com.csci360.electionapp.model.database;
import com.csci360.electionapp.view.*;

/**
 * 
 * Controller class for Registration
 * button of application
 *
 */
public class registrationController {
	// Voter object that will be created
	private Voter v;
	//database db;
	
	// ??? what goes here.
	public registrationController() {
	}
	
	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param birthdayMth
	 * @param birthdayDay
	 * @param birthdayYear
	 * @param ssn
	 * @param password
	 * @return the controller
	 * 
	 */
	public static VoterController createVoter(String firstName, String lastName, String birthdayMth,String birthdayDay, String birthdayYear, String ssn, String password) {
		// Creates a new voter object
		Voter v = new Voter(firstName, lastName, birthdayMth, birthdayDay, birthdayYear, ssn, password);
		
		// Creates a new voter view object
		VoterView view = new VoterView();
		
		// Creates a new voter controller object with access to the
		// voter object itself and a way to view the voter data.
		VoterController controller = new VoterController(v, view);
		return controller;
	}
	
	public static String add(VoterController v, database db) throws SQLException {
		String Result = "";
		//add voter v
		if(v.getVoterStatus() == false) {
			if(v.getVoterProfile().checkEligibility() == true) {
				Connection conn = db.getConnection();
				db.addToVoters(v, conn);
				//v.updateRegStatus();
				//add to database
				//System.out.println("The voter has been added to the database");
				Result = "The voter has been added to the database";
				return Result;
			}
			else {
				Result = "The voter is not eligible to register.";
				return Result;
				//System.out.println("The voter is not eligible to register");
			}
		}
		else {
			Result = "The voter has already registered.";
			return Result;
			//System.out.println("The voter has already registered");
		}
		
	}
	
}
