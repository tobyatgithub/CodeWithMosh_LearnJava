package com.toby;

public class TextBox extends UIControl{
  private String text = "";

  public TextBox() {
    super(true);
//    this.isEnabled; // the private field is not inherited
    System.out.println("TextBox");
  }

  public void setText(String text){
    this.text = text;
  }

  public void clear() {text = "";}
}
