
package citizeninfo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

 
   class admin implements CitizenInfo {
         File file = new File("F:/Jol");
         public static void writefile(String s, File file) {
           
          
           try{
        FileWriter f = new  FileWriter("F:/Jol/Jol.txt",true);
        f.write(s);
        
        f.close();
    }
     catch(Exception e){
                System.out.println(e);
    }     
           
       }
       public static void main(String[] args) {
          CitizenInfo c = new admin();
            FileWriter file;
             try {
                 file = new FileWriter("F:/Jol/Jol.txt");
                 file.flush();
                 c.government();
                c.photo();
                c.CitizenInfo();
                c.CitizenInfo1();
                c.IDnBloodGroupnBmi();
                c.background();
                c.ContactInfo();
                c.issue();
             } catch (IOException ex) {
                 Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
             }
            File f = new File("F:/Jol/Jol.txt");
          
//             try {
//                 Scanner scan = new Scanner(f);
//                 while(scan.hasNext()){
//                     String s1 = scan.nextLine();
//                     System.out.println(s1);
//                 }
//             } catch (FileNotFoundException ex) {
//                 Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
//             }
       }
          
    @Override
     public void government(){
            String govt =  "                People's Republic of Bangladesh                  ";
            
     try{
        
       File file = new File("F:/Jol/Jol.txt");
       writefile(govt,file);
       
    }
     catch(Exception e){
                System.out.println(e);
    }
            
        }
    @Override
    public void photo(){
        
    String image = "";
            try{
        File file = new File("F:/Jol/Jol.txt");
        
        writefile(image,file);
        
    }
     catch(Exception e){
            System.out.println(e);   
    }
    }
    @Override
    public void CitizenInfo()
    {   
       String name= "Jol";
       String father= "Goran";
       String mother = "Hiya";
       
    try{
        File file = new File("F:/Jol/Jol.txt");
        writefile("\r\nname: ",file);
        writefile(name,file);
        writefile("\r\nFather: ",file);
        writefile(father,file);
        writefile("\r\nMother: ",file);
        writefile(mother,file);
      
    }
     catch(Exception e){
         System.out.println(e);       
    }
    }
    @Override
    public void CitizenInfo1(){
              String Birthdate = "01-01-1990"; 
              String BirthPlace = "Puran Dhaka, Dhaka";
              String ParmanentPlace ="Puran Dhaka, Dhaka";
              String PresentPlace = "Uttara, Dhaka";
    try{
        File file = new File("F:/Jol/Jol.txt");
        writefile("\r\n Date of Birth:",file);
        writefile(Birthdate,file);
        writefile("\r\nPlace of Birth: ",file);
        writefile(BirthPlace,file);
        writefile("\r\nParmanent Address: ",file);
        writefile(ParmanentPlace,file);
        writefile("\r\nPresent Address: ",file);
        writefile(PresentPlace,file);
        
    }
     catch(Exception e){
         System.out.println(e);       
    }
    }
    @Override
    public void IDnBloodGroupnBmi(){
       String ID = "1999****71";
       String bloodGroup = "A-";
       double weight = 52;
       double height = 5.8;
       double BMI = (weight/(height*height));
       String bmi = String.valueOf(BMI);
       
      try{
        File file = new File("F:/Jol/Jol.txt");
        
        writefile("\r\n Voter ID/ Birth ID: ",file);
        writefile(ID,file);
        writefile("\r\nblood group: ",file);
        writefile(bloodGroup,file);
        writefile("\r\n BMI:",file);
        writefile(bmi,file);
                
       
    }
     catch(Exception e){
         System.out.println(e);       
    }
    }
    @Override
    public void background(){
      String academicStatus ="BA in English";
      String bankAccount = "124******111";
     try{
        File file = new File("F:/Jol/Jol.txt");
        
        writefile("\r\nQualification: ",file);
        writefile(academicStatus,file);
        writefile("\r\nBank Account No(If any): ",file);
        writefile(bankAccount,file);
    }
     catch(Exception e){
         System.out.println(e);       
    }  
    }
    @Override
    public void workLoyalty(){
      String skill = "Film Making";
      String portfolioLink = "http\\*****.com";
      String Research = "Representation of eccentric Ideas ";
      String achievement = "null";
     try{
        File file = new File("F:/Jol/Jol.txt");
        
        writefile("\r\nskill/Attribute: ",file);
        writefile(skill,file);
        writefile("\r\nPortfolio Link: ",file);
        writefile(portfolioLink,file);
        writefile("\r\nResearch Area: ",file);
        writefile(Research,file);
        writefile("\r\nAchievement(If any): ",file);
        writefile(achievement,file);
       
    }
     catch(Exception e){
         System.out.println(e);       
    }  
    }
    @Override
    public void ContactInfo(){
       String mail = "***@gmail.com";
       String Phone = "01617445759";
       try{
        File f = new File("F:/Jol/Jol.txt");
        
        writefile("\r\nE-mail: ",f);
        writefile(mail,f);
        writefile("\r\nContact No: ",f);
        writefile(Phone,file); 
    }
     catch(Exception e){
         System.out.println(e);       
    }  
    }
    @Override
    public void issue(){
       String whatIwant= "\r\nWhat I Want: job";
       
       try{
        File f = new File("F:/Jol/Jol.txt");
        
        
        writefile(whatIwant,f);
    }
     catch(Exception e){
         System.out.println(e);       
    } 
      
    }
     
    
    void update(String request){
      if(request!=null){  
        System.out.println("Please wait....");
      }
    }
        void fileread() {
        String initialTime = null;  
        File file = new File("F:/Jol/Jol.txt");
            String pass = "369";
            Scanner sc = new Scanner(System.in);
            Scanner scan;
             try {
            scan = new Scanner(file);
            System.out.println("Please Enter your secret number:");
            String password = sc.next();
            if(password.equalsIgnoreCase(pass)){ 
            while(scan.hasNext()){
            String s1 = scan.nextLine();
            System.out.println(s1);
        }
            }
            else System.out.println("something error, please try again..");
            
             } catch (FileNotFoundException ex) {
                 Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
             }
             
    }
    
}
