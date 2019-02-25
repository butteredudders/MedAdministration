/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical_system;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author rosey
 */
public class Visit 
{
    private Doctor attendingPhysician;
    private Patient patient;
    private ArrayList <Diagnosis> listOfDiagnoses;
    private ArrayList <Procedure> listOfProcedures;
    private String visitDate; 

    public Visit (Doctor attendingPhysician, Patient patient, ArrayList <Diagnosis> listOfDiagnoses, ArrayList <Procedure> listOfProcedures, String visitDate)
    {
        this.attendingPhysician = attendingPhysician;
        this.patient = patient;
        this.listOfDiagnoses = listOfDiagnoses;
        this.listOfProcedures = listOfProcedures;
        this.visitDate = visitDate;
    }

    public Visit (Visit copy)
    {
        this.attendingPhysician = copy.attendingPhysician;
        this.patient = copy.patient;
        this.listOfDiagnoses = copy.listOfDiagnoses;
        this.listOfProcedures = copy.listOfProcedures;
        this.visitDate = copy.visitDate;
    }
    
    public void addDiagnosis(Diagnosis diag)
    {
        Diagnosis d = new Diagnosis(diag);
        listOfDiagnoses.add(d);
    }
    
    public void addProcedure(Procedure proc)
    {
        Procedure p = new Procedure(proc);
        listOfProcedures.add(p);
    }

    public Doctor getAttendingPhysician() 
    {
        return attendingPhysician;
    }

    public void setAttendingPhysician(Doctor attendingPhysician) 
    {
        this.attendingPhysician = attendingPhysician;
    }

    public Patient getPatient() 
    {
        return patient;
    }

    public void setPatient(Patient patient) 
    {
        this.patient = patient;
    }

    public ArrayList <Diagnosis> getListOfDiagnoses() 
    {
        return listOfDiagnoses;
    }

    public void setListOfDiagnoses(ArrayList <Diagnosis> listOfDiagnoses) 
    {
        this.listOfDiagnoses = listOfDiagnoses;
    }

    public ArrayList <Procedure> getListOfProcedures() 
    {
        return listOfProcedures;
    }

    public void setListOfProcedures(ArrayList <Procedure> listOfProcedures) 
    {
        this.listOfProcedures = listOfProcedures;
    }

    public String getVisitDate() 
    {
        return visitDate;
    }

    public void setVisitDate(String visitDate) 
    {
        this.visitDate = visitDate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.attendingPhysician);
        hash = 29 * hash + Objects.hashCode(this.patient);
        hash = 29 * hash + Objects.hashCode(this.listOfDiagnoses);
        hash = 29 * hash + Objects.hashCode(this.listOfProcedures);
        hash = 29 * hash + Objects.hashCode(this.visitDate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Visit other = (Visit) obj;
        if (!Objects.equals(this.visitDate, other.visitDate)) {
            return false;
        }
        if (!Objects.equals(this.attendingPhysician, other.attendingPhysician)) {
            return false;
        }
        if (!Objects.equals(this.patient, other.patient)) {
            return false;
        }
        if (!Objects.equals(this.listOfDiagnoses, other.listOfDiagnoses)) {
            return false;
        }
        if (!Objects.equals(this.listOfProcedures, other.listOfProcedures)) {
            return false;
        }
        return true;
    }
    
    
    
}


