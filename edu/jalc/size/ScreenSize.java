package edu.jalc.size; 

public class ScreenSize{
  private final double width;
  private final double height;

  private ScreenSize(){
    this.width = 0.0;
    this.height = 0.0;
  }

  public ScreenSize(double width, double height){
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
