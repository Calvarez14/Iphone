package edu.jalc.iphone.phone;

import edu.jalc.iphone.logo.IphoneLogo;
import edu.jalc.iphone.size.IphoneSize;

public class PhoneTest{

  public void testSetBrand(){
    System.out.println("Testing Phone: :setBrand");
    Phone phone = new Phone("Iphone");
    phone.setBrand("Iphone");
    assert(phone.getBrand().equals("Iphone"));
  }

  public void testGetBrand(){
    System.out.println("Testing Phone: :getBrand");
    Phone phone = new Phone("Iphone");
    assert(phone.getBrand().equals("Iphone"));
  }

  public void testSetWidth(){
    System.out.println("Testing IphoneLogo setWidth");
    IphoneLogo iphoneLogo = new IphoneLogo(10.0);
    iphoneLogo.setWidth(2.2);
    assert(iphoneLogo.getWidth() == 2.2);
  }

  public void testGetWidth(){
    System.out.println("Testing IphoneLogo: :getWidth");
    IphoneLogo iphoneLogo = new IphoneLogo(10.0);
    assert(iphoneLogo.getWidth() == 10.0);
  }

  public void testSetScreenSize(){
    System.out.println("Testing IphoneSize setScreenSize");
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
    PhoneTest phoneTest = new PhoneTest();
    phoneTest.testSetBrand();
    phoneTest.testSetWidth();
    phoneTest.testSetScreenSize();
    phoneTest.testGetBrand();
    phoneTest.testGetWidth();
    phoneTest.testSetScreenSize();
    System.out.println("Test Completed");
  }
}
