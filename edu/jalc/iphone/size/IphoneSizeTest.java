package edu.jalc.iphone.size;

public class IphoneSizeTest{

  public void testSetScreenSize(){
    System.out.println("Testing IphoneSize: :setScreenSize");
    IphoneSize iphoneSize = new IphoneSize(7.5);
    iphoneSize.setScreenSize(5.5);
    assert(iphoneSize.getScreenSize() == 5.5);
  }

  public void testGetScreenSize(){
    System.out.println("Testing IphoneSize: :getScreenSize");
    IphoneSize iphoneSize = new IphoneSize(7.5);
    assert(iphoneSize.getScreenSize() == 7.5);
  }


  public static void main(String... args){
    IphoneSizeTest iphoneSizeTest = new IphoneSizeTest();
    iphoneSizeTest.testSetScreenSize();
    iphoneSizeTest.testGetScreenSize();
    System.out.println("IphoneSize Test Passed");
  }
}
