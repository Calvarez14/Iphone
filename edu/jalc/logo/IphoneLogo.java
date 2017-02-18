package edu.jalc.logo;

public class IphoneLogo{
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

}
