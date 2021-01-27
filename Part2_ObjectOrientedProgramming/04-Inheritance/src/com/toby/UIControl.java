package com.toby;

public class UIControl {
  private boolean isEnabled=true;

//  public UIControl(boolean isEnabled) {
//    this.isEnabled = isEnabled;
//    System.out.println("UIControl");
//  }

  public void render(){
    // leave empty bcz it will depends on what
    // object we got passed in.
    // Polymorphism! We leave it empty here
    // and over ride it in other classes
  }
  public void enable(){
    isEnabled = true;
  }

  public void disable(){
    isEnabled = false;
  }

  public boolean isEnabled(){
    return isEnabled;
  }

}
