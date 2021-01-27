package com.toby;

import org.w3c.dom.Text;

public class Main {

  public static void main(String[] args) {
    var textbox = new TextBox();
//    System.out.println(textbox.isEnabled());
    textbox.setText("Hello World");
    System.out.println(textbox.toString());
    System.out.println(textbox);
  }
}
