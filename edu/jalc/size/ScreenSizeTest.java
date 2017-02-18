package edu.jalc.size;

public class ScreenSizeTest{

  public void testGetWidth(){
    System.out.println("Testing ScreenSize: :getWidth");
    ScreenSize screenSize = new ScreenSize(5.5, 7.5);
    assert(screenSize.getWidth() == 5.5);
  }

  public void testGetHeight(){
    System.out.println("Testing ScreenSize: :getHeight");
    ScreenSize screenSize = new ScreenSize(5.5, 7.5);
    assert(screenSize.getHeight() == 7.5);
  }


  public static void main(String... args){
    ScreenSizeTest screenSizeTest = new ScreenSizeTest();
    screenSizeTest.testGetWidth();
    screenSizeTest.testGetHeight();
    System.out.println("IphoneSize Test Passed");
  }
}
