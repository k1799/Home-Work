
package GammaExam;

import java.util.ArrayList;
import java.util.Scanner;


public class HospitalPatientManagementSystem {
  
    Scanner sc = new Scanner(System.in);
    Scanner se = new Scanner(System.in);
    ArrayList<Integer> id= new ArrayList<>();
    ArrayList<String> name= new ArrayList<>();
    ArrayList<Integer> age= new ArrayList<>();
    ArrayList<String> gender= new ArrayList<>();
    ArrayList<String> disease= new ArrayList<>();
    
    public static void main(String[] args) {
        
        HospitalPatientManagementSystem hpms=new HospitalPatientManagementSystem();
        hpms.menu();
    }
    
    public void menu(){
        
        boolean result = true;
        do{
            System.out.println("----HOSPITAL PATIENT MANAGEMENT SYSTEM----");
            System.out.println("1.Add Patient");
            System.out.println("2.View All Patients");
            System.out.println("3.Search Patient by Id");
            System.out.println("4.Update Patient Details");
            System.out.println("5.Delete Patient");
            System.out.println("6.Count Total Patient");
            System.out.println("7.Exit");
            
            System.out.println("Enter Your Choice");
            int choice = sc.nextInt();
            
            switch(choice){
                case 1:
                    add();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    update();
                    break;
                case 5:
                    delete();
                    break;
                case 6:
                   patientcount();
                   break;
                case 7:
                    System.out.println("Exited....");
                    result=false;
                    break;
                default:
                    System.out.println("Invalid Choice Choose 1 to 7");
            }
        }while(result);
        
    }
    
    public void add(){
        System.out.println("Enter Patient Id");
         id.add(sc.nextInt());
        
        System.out.println("Enter Patient Name");
         name.add(se.nextLine());
        
        System.out.println("Enter Patient Age");
         age.add(sc.nextInt());
        
        System.out.println("Enter Patient Gender");
         gender.add(se.nextLine());
        
        System.out.println("Enter Patient Disease");
         disease.add(se.nextLine());
    }
    
    public void display(){
        if(id.isEmpty()){
            System.out.println("No Patients Found");
        }
        for (int i = 0; i < id.size(); i++) {
        System.out.println("Patient Id = " + id);
        System.out.println("Patient Name = " + name);
        System.out.println("Patient Age = " + age);
        System.out.println("Patient Gender = " + gender);
        System.out.println("Patient Disease = " + disease);
        }
        
    }
    
    public void search(){
        System.out.println("Enter search id");
        int search = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < id.size(); i++) {
        if( id.get(i) == search){
        System.out.println("Patiend Found");
        System.out.println("Patient Id = " + id.get(i));
        System.out.println("Patient Name = " + name.get(i));
        System.out.println("Patient Age = " + age.get(i));
        System.out.println("Patient Gender = " + gender.get(i));
        System.out.println("Patient Disease = " + disease.get(i));
        found = true;
        break;
        }  
        }
        if(!found){
            System.out.println("Patiend Not Found");
        }
    }
    
    public void update(){
        System.out.println("Enter search id");
        int update = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < id.size(); i++) {
        if(id.get(i) == update){
        System.out.print("Patient Age ");
        age.set(i,sc.nextInt());
        System.out.println("Patient Disease");
        disease.set(i,se.nextLine());
        System.out.println("Patient Update Sucessfully");
        found = true;
        break;
        }  
        }
        if(!found){
            System.out.println("Patiend Not Found");
        }
    }
    
    public void delete(){
        System.out.println("Enter search id");
        int delete = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < id.size(); i++) {
           if(id.get(i) == delete){
               id.remove(i);
               age.remove(i);
               name.remove(i);
               gender.remove(i);
               disease.remove(i); 
            System.out.println("Patient Details Deleted Successfuly"); 
               found = true;
               break;
           }  
        }
       if(!found){
            System.out.println("Patiend Not Found");
        }
    }
    
    public void patientcount(){
        
        System.out.println("No Of Patients = " + id.size());
    }
}
