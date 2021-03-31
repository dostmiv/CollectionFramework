/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionframework_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Merts
 */
public class CollectionFramework_Set {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new LinkedHashSet<String>();
        Set<String> set3 = new TreeSet<String>();
        
        set1.add("Java");
        set1.add("Kotlin");
        set1.add("ReactNative");
        set1.add("Nodejs");
        set1.add("C#");
        set1.add("Flutter");
        
        
        set2.add("Java");
        set2.add("Kotlin");
        set2.add("ReactNative");
        set2.add("Nodejs");
        set2.add("C#");
        set2.add("Flutter");
        
        set3.add("Java");
        set3.add("Kotlin");
        set3.add("ReactNative");
        set3.add("Nodejs");
        set3.add("C#");
        set3.add("Flutter");
        //her ucude, ayni tanimli birden fazla element oldugu durumda yalnizca 1 tane depo eder bu elementten.
        System.out.println("*****HASHSET**************");//karisik siraladi 
        for ( String s1 : set1){
            System.out.println(s1);
        }
        System.out.println("*****LINKEDHASHSET**************");//sirasi ile siraladi
        for ( String s2 : set2){
            System.out.println(s2);
        }
        System.out.println("*****TREEHASHSET**************");//alfabetik siraladi
        for ( String s3 : set3){
            System.out.println(s3);
        }
        
        System.out.println(set1.contains("Java"));//referans verilen deger setin icinde bulunursa True donduren method.
        System.out.println(set1.contains("PHP"));
        System.out.println(set1.isEmpty());//bos ise true cikar, eleman varsa false sonucunu veren method
        set1.remove("Java");//remover method
        for ( String s1 : set1){
            System.out.println(s1);
        }
        
        //kesisim ve fark kumelerinin bulunmasi ::::::
        Set<String> set4 = new HashSet<String>();
        set4.add("Java");
        set4.add("Mert");
        set4.add("ReactNative");
        set4.add("Nodejs");
        set4.add("Merto");
        set4.add("Flutter");
        Set<String> fark = new HashSet<>(set2);
        System.out.println(fark.removeAll(set4));//ortaklari siler
        for (String e : fark){
            System.out.println(e);
        }
        //retainAll = ortak olanlari saklar gerisini siler.,, kesisim. 
        
        set1.retainAll(fark);
        for (String e : set1){
            System.out.println(e);
        }
    }
    
}
