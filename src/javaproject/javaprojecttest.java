package javaproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

 class StudentService {
	 private String idStudent = "1AH17CS065";

	    private int idType = 2017;

	   private String name = "SHIREESHA";

	    private String lastName = "BG";

	    private String phoneno = "9945478590";

		private String address;

		private Date birthDate;

	    public void Student( String idStudent, int idType, String name, String lastName, int nationality )
	    {
	        this.idStudent = "1AH17CS0665";
	        this.idType = 2017;
	        this.name = "SHIREESHA";
	        this.lastName = "BG";
	        this.phoneno = "9945478590";
	    }

	    public void setAddress( String address )
	    {
	        this.address = "chikkaballapura";
	    }

	   
	    
	    public String getIdStudent()
	    {
	        return idStudent;
	    }

	    public int getIdType()
	    {
	        return idType;
	    }

	    public String getName()
	    {
	        return name;
	    }

	    public String getLastName()
	    {
	        return lastName;
	    }

	    public int getNationality(int nationality)
	    {
	        return nationality;
	    }

	    public String getAddress()
	    {
	        return address;
	    }
	    
	
	}

