package com.tb.controller;  
  
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tb.model.User;  
  
@Controller public  
class HomeController {  
   private ArrayList<String> cityNames;  
   private ArrayList<String> interests;  
   private HashMap<String, ArrayList<String>> model;  
  
   @RequestMapping("/getSpringForm")  
   public ModelAndView hello(@ModelAttribute User user, BindingResult result) {  
      ArrayList<String> cityNames = new ArrayList<String>();  
      cityNames.add("Delhi");  
      cityNames.add("Gurgaon");  
      cityNames.add("Ghaziabad");  
      cityNames.add("Noida");  
      cityNames.add("New Delhi");  
      ArrayList<String> interests = new ArrayList<String>();  
      interests.add("Man");  
      interests.add("Women");  
      interests.add("Both");  
      HashMap<String, ArrayList<String>> model = new HashMap<String, ArrayList<String>>();  
      model.put("cityNames", cityNames);  
      model.put("interests", interests);  
      return new ModelAndView("springform", "model", model);  
   }  
  
   @RequestMapping("/showDetails")  
   public ModelAndView showDetails(@ModelAttribute("user") User user, BindingResult result) {  
      System.out.println("Name : " + user.getName());  
      System.out.println("Gender : " + user.getGender());  
      System.out.println("City : " + user.getCity());  
      System.out.println("Interest : " + user.getInterest().length);  
      return new ModelAndView("details", "user", user);  
   }  
  
   public ArrayList<String> getCityNames() {  
      return cityNames;  
   }  
  
   public void setCityNames(ArrayList<String> cityNames) {  
      this.cityNames = cityNames;  
   }  
  
   public ArrayList<String> getInterests() {  
      return interests;  
   }  
  
   public void setInterests(ArrayList<String> interests) {  
      this.interests = interests;  
   }  
  
   public HashMap<String, ArrayList<String>> getModel() {  
      return model;  
   }  
  
   public void setModel(HashMap<String, ArrayList<String>> model) {  
      this.model = model;  
   }  
}  