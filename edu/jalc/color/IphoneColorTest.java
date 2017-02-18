package edu.jalc.color;

public class IphoneColorTest{

  public void testIphoneColor(){
    System.out.println("Testing IphoneColor: :getIphoneColor");
    IphoneColor iphoneColor = new IphoneColor("Black");
    assert(iphoneColor.getIphoneColor().equals("Black"));
  }

  public static void main(String... args){
    IphoneColorTest iphoneColorTest = new IphoneColorTest();
    iphoneColorTest.testIphoneColor();
    System.out.println("IphoneColor Test Passed");
  }
}
