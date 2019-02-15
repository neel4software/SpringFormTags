package com.tb.model;  
  
public class User {  
   private String name;  
   private String gender;  
   private String city;  
   private String interest[];  
  
   public String getName() {  
      return name;  
   }  
  
   public void setName(String name) {  
      this.name = name;  
   }  
  
   public String getGender() {  
      return gender;  
   }  
  
   public void setGender(String gender) {  
      this.gender = gender;  
   }  
  
   public String getCity() {  
      return city;  
   }  
  
   public void setCity(String city) {  
      this.city = city;  
   }  
  
   public String[] getInterest() {  
      return interest;  
   }  
  
   public void setInterest(String[] interest) {  
      this.interest = interest;  
   }  
}  