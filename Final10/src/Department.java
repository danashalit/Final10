/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rasidha
 */
public class Department {
    private String companyName;
    private String departmentName;
    
    Department()
    {
        this.companyName = "apple";
        this.departmentName = "tech";
        
    }
    
    Department(String companyName, String departmentName){
        this.companyName = companyName;
        this.departmentName = departmentName;
    }
    
    public void setcompanyName(String companyName){
        this.companyName = companyName;
    }
    
    public void setdepartmentName(String departmentName){
        this.departmentName = departmentName;
    }
    
    
}
