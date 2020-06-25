package com.jspider.jdk8.lamdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
class Employee{
    String name;
    int age;
    public Employee(String name,int age) {
       this.name=name;this.age=age;       
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}
public class FunctionDemo {
    public static void main(String args[]){
        
        List<Employee> employeeList= Arrays.asList(new Employee("vikash 4", 45), new Employee("vikash", 25),
                new Employee("vikash 1", 65), new Employee("vikash 2", 15), new Employee("vikash 3", 29));        
        
      //use of apply() method
        Function<Employee, String> funcEmpToString= (Employee e)-> {return e.getName();}; 
        
        List<String> empNameList=convertEmpListToNamesList(employeeList, funcEmpToString);
        empNameList.forEach(System.out::println);
        
      //use of andThen() method
        Function<String,String> initialFunction= (String s)->s.substring(0,3);
        List<String> empNameListInitials=convertEmpListToNamesList(employeeList, funcEmpToString.andThen(initialFunction));
        empNameListInitials.forEach(str->{System.out.print(" "+str);});
        
        //use of compose() method
        Function<Employee, Employee> funcEmpFirstName= (Employee e)-> {int index= e.getName().indexOf("h");
                            String firstName=e.getName().substring(0,index);
                            e.setName(firstName);
                            return e;};
                            
        List<String> empFirstNameList= convertEmpListToNamesList(employeeList,funcEmpToString.compose(funcEmpFirstName));
        empFirstNameList.forEach(str->{System.out.print("------"+str);});
        
        //use of identity() method
        List<Employee> empNameListidentity=applyIdentityToEmpList(employeeList, Function.identity());
        empNameListidentity.forEach(System.out::println);
     }
     private static List<Employee> applyIdentityToEmpList(List<Employee> employeeList, Function<Employee, Employee> funcEmpToEmp) {
         List<Employee> empNameList=new ArrayList<Employee>(); 
            for(Employee emp:employeeList){
                empNameList.add(funcEmpToEmp.apply(emp));
              }
              return empNameList;
             }
     
    public static List<String> convertEmpListToNamesList(List<Employee> employeeList, Function<Employee, String> funcEmpToString){
       List<String> empNameList=new ArrayList<String>(); 
       for(Employee emp:employeeList){
         empNameList.add(funcEmpToString.apply(emp));
       }
       return empNameList;
      }}
