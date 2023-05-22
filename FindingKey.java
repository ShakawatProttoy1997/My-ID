/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citizeninfo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class FindingKey {
    public static void main(String[] args) {
        File dir = new File("H:/java/Date");
        dir.mkdir();  
    try{
    BufferedWriter writer = new BufferedWriter(new FileWriter(dir.getAbsolutePath()+"/Saturday.txt"));
    BufferedWriter writer1 = new BufferedWriter(new FileWriter(dir.getAbsolutePath()+"/Sunday.txt"));
    BufferedWriter writer2 = new BufferedWriter(new FileWriter(dir.getAbsolutePath()+"/Monday.txt"));
    BufferedWriter writer3 = new BufferedWriter(new FileWriter(dir.getAbsolutePath()+"/Tuesday.txt"));
    BufferedWriter writer4 = new BufferedWriter(new FileWriter(dir.getAbsolutePath()+"/Wednesday.txt"));
    BufferedWriter writer5 = new BufferedWriter(new FileWriter(dir.getAbsolutePath()+"/Thursday.txt"));
    BufferedWriter writer6 = new BufferedWriter(new FileWriter(dir.getAbsolutePath()+"/Friday.txt"));
    
    writer.write("key1");
    writer1.write("key2");
    writer.close();
    writer1.close();
    writer2.close();
    writer3.close();
    writer4.close();
    writer5.close();
    writer6.close();
    
    BufferedReader reader = new BufferedReader(new FileReader(dir.getAbsolutePath()+"/Saturday.txt"));
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    if(s1.equals("Saturday")){
    System.out.println(reader.readLine());
    }
    else System.out.println("wrong..");
    reader.close();
    
}
    catch(IOException e){
        e.printStackTrace();
}
   
    }
    
}

