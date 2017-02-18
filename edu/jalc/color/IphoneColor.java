package edu.jalc.color;

public class IphoneColor{
  private final String color;

  private IphoneColor(){
    this.color = null;
  }

  public IphoneColor(String color){
    this.color = color;
  }

  public String getIphoneColor(){
    return this.color;
  }
}
