/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab4;

import common.Song;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import lab3.*;

/**
 *
 * @author sendres1
 */
public class Demo4 {
    public static void main(String[] args) {
        
        Song s1 = new Song("First", 1, "Fast", "none", "none");
        Song s2 = new Song("Second", 1, "Fast", "none", "none");
        Song s3 = new Song("Third", 1, "Fast", "none", "none");
        Song s4 = new Song("Fourth", 1, "Fast", "none", "none");
        
         //(String name, int notes, String tempo, String words, String instrumentals)
          TreeSet<Song> treeSet1 = new TreeSet<Song>();
       //   Set treeSet1 = new HashSet();
          
       //   note use collections.sort
          
        treeSet1.add(s1);
        treeSet1.add(s2);
        treeSet1.add(s3);
        treeSet1.add(s4);
        
        // same as below
//        treeSet1.stream().forEach((song) -> {
//            System.out.println(song);
//        });
      
        for(Object song : treeSet1) {
            System.out.println(song);
        }
        
        System.out.println("song is :  " + s1.toString());
        
    }
    
}
