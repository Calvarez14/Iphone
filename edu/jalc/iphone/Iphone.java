package edu.jalc.iphone;

import edu.jalc.color.IphoneColor;
import edu.jalc.logo.IphoneLogo;
import edu.jalc.size.ScreenSize;
import edu.jalc.interfaces.Chargeable;
import edu.jalc.interfaces.Powerable;
import edu.jalc.interfaces.Coverable;

public class Iphone implements Chargeable, Powerable, Coverable{

  private final IphoneColor iphoneColor;
  private final IphoneLogo iphoneLogo;
  private final ScreenSize screenSize;

  private Iphone(){
    this.iphoneColor = null;
    this.iphoneLogo = null;
    this.screenSize = null;
  }

  public Iphone(IphoneColor iphoneColor, IphoneLogo iphoneLogo, ScreenSize screenSize){
    this.iphoneColor = iphoneColor;
    this.iphoneLogo = iphoneLogo;
    this.screenSize = screenSize;
  }

  public IphoneColor getIphoneColor(){
    return iphoneColor;
  }

  public IphoneLogo getIphoneLogo(){
    return iphoneLogo;
  }

  public ScreenSize getScreenSize(){
    return screenSize;
  }

  public void charge(){
    System.out.println("The Iphone is charging.");
  }

  public void power(){
    System.out.println("The Iphone is being turn on or off.");
  }

  public void cover(){
    System.out.println("The Iphone now has a cover");
  }

}
