package edu.jalc.logo;

import edu.jalc.interfaces.Changeable;
import edu.jalc.interfaces.Coverable;

public class IphoneLogo implements Changeable, Coverable{
   private final double width;
   private final double height;

   private IphoneLogo(){
      this.width = 0.0;
      this.height = 0.0;
   }

   public IphoneLogo(double width, double height){
      this.width = width;
      this.height = height;
   }

   public double getWidth(){
      return this.width;
   }

   public double getHeight(){
     return this.height;
   }

   public void change(){
     System.out.println("Changing the logo on the Iphone.");
   }

   public void cover(){
     System.out.println("Covering the logo on the Iphone.");
   }

}
