package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String aText="hello";
        String bText="hello";
        String cText=String.join("l","He","lo");
        String dText="hello";
        String eText="hello";
   List<String> hellos= Arrays.asList(aText,bText,cText,dText,eText);
   hellos.forEach(s-> System.out.println(s+"::"+s.hashCode()));
        Set<String> myset= new HashSet<>(hellos);
        System.out.println(";;;"+myset);
        for(String sett: myset)
        {
            for(int i=0;i<hellos.size();i++){
                if(sett==hellos.get(i)){
                    System.out.println(i);
                }

            }
        }

    }}