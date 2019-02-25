/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsystem;

import java.util.Objects;

/**
 *
 * @author Nanashi
 */
public class Doctor extends Person
{
    private int doctorID;
    private String medSchool;
    private int yearsOfExpirence;

    public Doctor(String firstName,  String lastName, int doctorID, String medSchool, int yearsOfExpirence)
    {
        super(firstName, lastName);
                
        this.doctorID = doctorID;
        this.medSchool = medSchool;
        this.yearsOfExpirence = yearsOfExpirence;
    }


  public Doctor(Doctor personObject)
    {
        super( personObject );
        
        if(personObject != null)
        {
            this.doctorID = doctorID;
            this.medSchool = medSchool;
            this.yearsOfExpirence = yearsOfExpirence;

        }
    }

    public int getDoctorID()
    {
        return doctorID;
    }

    public void setDoctorID(int doctorID)
    {
        this.doctorID = doctorID;
    }

    public String getMedSchool()
    {
        return medSchool;
    }

    public void setMedSchool(String medSchool)
    {
        this.medSchool = medSchool;
    }

    public int getYearsOfExpirence()
    {
        return yearsOfExpirence;
    }

    public void setYearsOfExpirence(int yearsOfExpirence)
    {
        this.yearsOfExpirence = yearsOfExpirence;
    }
    
    public void setYearsOfExperience(int yearsOfExpirence)
    {
        this.yearsOfExpirence = yearsOfExpirence;
    }

    @Override
    public String toString()
    {
        String output = super.toString() + "\nDoctor ID: " + doctorID + "   Med School: " + medSchool + "   Years Of Experience: " + yearsOfExpirence;
        return output;
    }

    
    
    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 19 * hash + this.doctorID;
        hash = 19 * hash + Objects.hashCode(this.medSchool);
        hash = 19 * hash + this.yearsOfExpirence;
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
        final Doctor other = (Doctor) obj;
        if (this.yearsOfExpirence != other.yearsOfExpirence)
        {
            return false;
        }
        if (!Objects.equals(this.medSchool, other.medSchool))
        {
            return false;
        }
        return true;
    }



  
    
    
    
    
}
