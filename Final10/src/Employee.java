/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ceciliaknaub
 */
public class Employee {
    private String fName;
    private String lName;
    private int age;
    private String companyName;
    private String departmentName;
    
    Employee(){
        
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }
    public String getDepartmentName(){
        return departmentName;
    }
    public void setdepartmentName(String departmentName){
        this.departmentName = departmentName;
    }

    

    
    
}
