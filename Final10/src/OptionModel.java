/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DeeShalz
 */
public class OptionModel { 
    private String salaryRequest;
    private int hours;
    private String experienceLevel;
    
    OptionModel(){
        
    }

    public String getSalaryRequest() {
        return salaryRequest;
    }

    public void setSalaryRequest(String salaryRequest) {
        this.salaryRequest = salaryRequest;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }   

    public String getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(String experienceLevel) {
        this.experienceLevel = experienceLevel;
    }
    
}
