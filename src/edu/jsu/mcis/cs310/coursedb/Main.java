package edu.jsu.mcis.cs310.coursedb;
import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.Jsoner;
import edu.jsu.mcis.cs310.coursedb.dao.*;
public class Main {
    
    private static final String USERNAME = "nobody@jsu.edu";
    public static final int TERMID_FA24 = 1;
    
    
    public static void main(String[] args) {
        
        // Create DAO Objects
        
        DAOFactory daoFactory = new DAOFactory("coursedb");
        
        RegistrationDAO registrationDao = daoFactory.getRegistrationDAO();
        SectionDAO sectionDao = daoFactory.getSectionDAO();
        
        int studentid = daoFactory.getStudentDAO().find(USERNAME);
        System.err.println(studentid);
        
        boolean x;
        int termid=1;
        //x=registrationDao.create(studentid,TERMID_FA24,10007);
        System.err.println(registrationDao.list(studentid, TERMID_FA24));
        
        // Test Connection
        
        if ( !daoFactory.isClosed() ) {
            
            System.out.println("Connected Successfully!");
            
        }
        
    }
    
}