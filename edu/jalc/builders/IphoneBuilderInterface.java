package edu.jalc.builders;

import edu.jalc.iphone.Iphone;

public interface IphoneBuilderInterface{

  public String provideIphoneColor();

  public String provideIphoneScreenSize();

  public Iphone build();

}
