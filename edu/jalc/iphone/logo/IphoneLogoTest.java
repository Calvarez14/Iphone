package edu.jalc.iphone.logo;

public class IphoneLogoTest{

  public void testSetWidth(){
    System.out.println("Testing IphoneLogo: :setWidth");
    IphoneLogo iphoneLogo = new IphoneLogo(10.0);
    iphoneLogo.setWidth(2.2);
    assert(iphoneLogo.getWidth() == 2.2);
  }

  public void testGetWidth(){
    System.out.println("Testing IphoneLogo: :getWidth");
    IphoneLogo iphoneLogo = new IphoneLogo(10.0);
    assert(iphoneLogo.getWidth() == 10.0);
  }

  public static void main(String... args){
    IphoneLogoTest iphoneLogoTest = new IphoneLogoTest();
    iphoneLogoTest.testSetWidth();
    iphoneLogoTest.testGetWidth();
    System.out.println("IphoneLogo Test Passed");
  }
}
