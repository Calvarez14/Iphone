package edu.jalc.iphone;

import edu.jalc.color.IphoneColor;
import edu.jalc.logo.IphoneLogo;
import edu.jalc.size.ScreenSize;

public class Iphone{

  private IphoneColor iphoneColor;
  private IphoneLogo iphoneLogo;
  private ScreenSize screenSize;

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

}
