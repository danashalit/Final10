/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rasidha
 */
public class CDModel {
    private String fName;
    private String lName;
    private String companyName;
    private String departmentName;
    private int age;
    Employee e = new Employee();
    
    
    CDModel() {
        
    }
    public String getCompanyName(){
        return e.getCompanyName();
    }
    public void setCompanyName(String companyName){
        this.companyName = companyName;
        e.setCompanyName(companyName);
    }
    public String getDepartmentName(){
        return e.getDepartmentName();
    }
    public void setDepartmentName(String departmentName){
        this.departmentName = departmentName;
        e.setdepartmentName(departmentName);
    }
    
    public String getfName() {
        return e.getfName();
    }

    public void setfName(String fName) {
        this.fName = fName;
        e.setfName(fName);
    }

    public String getlName() {
        return e.getlName();
    }

    public void setlName(String lName) {
        this.lName = lName;
        e.setlName(lName);
    }

    public int getAge() {
        return e.getAge();
    }
    
    public void setAge(int age) {
        this.age = age;
        e.setAge(age);
    }
}
