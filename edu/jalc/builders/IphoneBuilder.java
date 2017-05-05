package edu.jalc.builders;

import edu.jalc.iphone.Iphone;

public class IphoneBuilder implements IphoneBuilderInterface{

  private Iphone iphone;

  public IphoneBuilder(){
    this.iphone = new Iphone(null, null, null);
  }

  public String provideIphoneColor(){
    return "Black Matte";
  }

  public String provideIphoneScreenSize(){
    return "Iphone Screen Size 5'5";
  }

  public Iphone build(){
    return this.iphone;
  }
}
