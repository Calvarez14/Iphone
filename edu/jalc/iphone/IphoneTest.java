package edu.jalc.iphone;

import edu.jalc.color.IphoneColor;
import edu.jalc.logo.IphoneLogo;
import edu.jalc.size.ScreenSize;

public class IphoneTest{

  public void testGetIphoneColor(){
    System.out.println("Testing IphoneColor: :getIphoneColor");
    IphoneColor iphoneColor = new IphoneColor("Black");
    assert(iphoneColor.getIphoneColor().equals("Black"));
  }

  public void testGetIphoneLogo(){
    System.out.println("Testing IphoneLogo: :getWidth, getHeight");
    IphoneLogo iphoneLogo = new IphoneLogo(1.2, 2.2);
    assert(iphoneLogo.getWidth() == 1.2);
    assert(iphoneLogo.getHeight() == 2.2);
  }

  public void testGetScreenSize(){
    System.out.println("Testing ScreenSize: :getWidth, getHeight");
    ScreenSize screenSize = new ScreenSize(5.5, 7.5);
    assert(screenSize.getWidth() == 5.5);
    assert(screenSize.getHeight() == 7.5);

  }

  public static void main(String... args){
    IphoneTest iphoneTest = new IphoneTest();
    iphoneTest.testGetIphoneColor();
    iphoneTest.testGetIphoneLogo();
    iphoneTest.testGetScreenSize();
    System.out.println("Test Completed");
  }
}
