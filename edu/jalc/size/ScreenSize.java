package edu.jalc.size;

import edu.jalc.interfaces.Breakable;
import edu.jalc.interfaces.Fixable;

public class ScreenSize implements Breakable, Fixable{
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

  public void breaks(){
    System.out.println("The Iphone screen is broken.");
  }

  public void fix(){
    System.out.println("The Iphone screen is fix.");
  }
}
