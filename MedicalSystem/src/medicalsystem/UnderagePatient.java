package medicalsystem;
import medicalsystem.Patient;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nanashi
 */
public class UnderagePatient extends Patient
{
    public String legalGaurdian;
    private Object patientObject;

   
     UnderagePatient(String firstName, String lastName, int patientID, String dateOfBirth, String legalGauridan)
    {
        super(firstName, lastName, patientID, dateOfBirth);
        this.legalGaurdian = legalGauridan;
    }
    
    public UnderagePatient(Patient personObject)
    {
        super( personObject );
        
        if(personObject != null)
        {
            this.legalGaurdian = legalGaurdian;
        }
    }
    
    public String getLegalGaurdian()
    {
        return legalGaurdian;
    }

    public void setLegalGuardian(String legalGaurdian)
    {

    }

    public void setLegalGaurdian(String legalGaurdian)
    {
        this.legalGaurdian = legalGaurdian;
    }

    public void setDateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }
    public String getDateOfBirth()
    {
        return dateOfBirth;
    }

    @Override
    public String toString()
    {
        String output = super.toString()  + "Legal Gauridain: " + legalGaurdian ;
        return output;
    }

 
   
    
}
