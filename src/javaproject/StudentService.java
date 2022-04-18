package javaproject;

public interface StudentService {
    
	void add( Student student );
	
	void delete( Student student );
	
	list<Student> all();
	 
	Student findById( String id );
	
}	
	
	
	

