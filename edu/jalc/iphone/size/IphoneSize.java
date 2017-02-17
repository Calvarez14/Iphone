package edu.jalc.iphone.size;

public class IphoneSize{
  private double screenSize;

  private IphoneSize(){
    this.screenSize = 0.0;
  }

  public IphoneSize(double screenSize){
    this.screenSize = screenSize;
  }

  public void setScreenSize(double screenSize){
    this.screenSize = screenSize;
  }

  public double getScreenSize(){
    return this.screenSize;
  }
}
