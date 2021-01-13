package com.toby;

public class TextBox {
    //give variable a default value to avoid null pointer exception
    public String text = ""; // Field

    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        text = "";
    }
}
