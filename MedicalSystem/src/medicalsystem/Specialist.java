/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsystem;

import java.util.ArrayList;

/**
 *
 * @author Nanashi
 */
public class Specialist extends Doctor
{
    private String specialty;
    
    ArrayList<String> trainingProgram = new ArrayList<String>();

    public Specialist(String firstName, String lastName, int doctorID, String medSchool, int yearsOfExpirence, String specialty, ArrayList<String> trainingProgram)
    {
        super(firstName, lastName, doctorID, medSchool, yearsOfExpirence);
        
        this.specialty = specialty;
        
    }

    public Specialist(String specialty, String firstName, String lastName, int doctorID, String medSchool, int yearsOfExpirence)
    {
        super(firstName, lastName, doctorID, medSchool, yearsOfExpirence);
        this.specialty = specialty;
    }

 
 
    public Specialist(Specialist doctorObject)
    {
        super( doctorObject);

        if( doctorObject != null)
        {
            this.specialty = specialty;
        }
    }

   


    
    public String getSpecialty()
    {
        return specialty;
    }

    public void setSpecialty(String specialty)
    {
        this.specialty = specialty;
    }

    @Override
    public String toString()
    {
        String output = super.toString() +  "\nSpecialty: " + specialty;
        return output;
    }
    
    
    
    
    
}
