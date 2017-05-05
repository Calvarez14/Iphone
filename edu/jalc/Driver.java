package edu.jalc;

import java.util.*;
import java.util.ArrayList;
import edu.jalc.iphone.Iphone;
import edu.jalc.logo.IphoneLogo;
import edu.jalc.interfaces.Coverable;

public class Driver{

  public static void main(String... args)throws Exception{

    ArrayList<Coverable> CoverableItems = new ArrayList<>();
    CoverableItems.add(new IphoneLogo(2.0,2.0));
    CoverableItems.add(new Iphone(null, null, null));

    Iterator iterator = CoverableItems.iterator();
    while(iterator.hasNext()){
      ((Coverable)iterator.next()).cover();
    }
  }
}
