package medicalsystem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import medicalsystem.Person;

import java.util.Objects;
/**
 *
 * @author Nanashi
 */
public class Patient extends Person
{
    private int patientID;
    public String dateOfBirth;
  

    public Patient(String firstName, String lastName, int patientID, String dateOfBirth)
    {
        super(firstName, lastName);
        
        this.patientID = patientID;
        this.dateOfBirth = dateOfBirth;
    }
 
   public Patient(Patient personObject)
    {
        super( personObject);
        
        if(personObject != null)
        {
            patientID = personObject.patientID;
            dateOfBirth = personObject.dateOfBirth;
        }
    }
 
    public int getPatientID()
    {
        return patientID;
    }
    
    public String getDateOfBirth()
    {
        return dateOfBirth;
    }
    
    public void setPatientID(int patientID)
    {
        this.patientID = patientID;
    }
     
    
    public void setDateOFBirth()
    {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString()
    {
        String output = super.toString() + "dateOfBirth: " + dateOfBirth + "PatientID: " + patientID; 
        
        return output;
    }

    
    
    @Override
    public int hashCode()
    {
        int hash = 3;
        hash = 59 * hash + this.patientID;
        hash = 59 * hash + Objects.hashCode(this.dateOfBirth);
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Patient other = (Patient) obj;
        if (this.patientID != other.patientID)
        {
            return false;
        }
        if (!Objects.equals(this.dateOfBirth, other.dateOfBirth))
        {
            return false;
        }
        return true;
    }

 

 
    
    
    
            
}
