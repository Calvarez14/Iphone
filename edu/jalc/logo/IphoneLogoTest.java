package edu.jalc.logo;

public class IphoneLogoTest{

  public void testGetWidth(){
    System.out.println("Testing IphoneLogo: :getWidth");
    IphoneLogo iphoneLogo = new IphoneLogo(1.2, 2.2);
    assert(iphoneLogo.getWidth() == 1.2);
  }

  public void testGetHeight(){
    System.out.println("Testing IphoneLogo: :getHeight");
    IphoneLogo iphoneLogo = new IphoneLogo(1.2, 2.2);
    assert(iphoneLogo.getHeight() == 2.2);
  }

  public static void main(String... args){
    IphoneLogoTest iphoneLogoTest = new IphoneLogoTest();
    iphoneLogoTest.testGetWidth();
    iphoneLogoTest.testGetHeight();
    System.out.println("IphoneLogo Test Passed");
  }
}
