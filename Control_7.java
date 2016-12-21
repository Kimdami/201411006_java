package com.sd.ch5;

public class Control_7{

    public void makeTri(){
        String s = "*";
        StringBuffer sbuf = new StringBuffer();
        
        for(int i = 0; i<5; i++){
            for(int j = 5; j>=i; j--){
                sbuf.append(" ");
                
            }
            for(int k = 0; k< i;k++){
                sbuf.append(s);
                sbuf.append(s);
            }
            System.out.println(sbuf);
            sbuf.delete(0,sbuf.length());
        }

        
        
    }

    public static void main(String[] args){
        Control_7 c7 = new Control_7();

        c71.makeTri();
    }
}