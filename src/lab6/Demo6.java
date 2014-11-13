/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab6;

import lab5.*;
import common.Song;
import java.util.TreeSet;

/**
 *
 * @author sendres1
 */
public class Demo6 {
    public static void main(String[] args) {
        
        Song s1 = new Song("First", 1, "Fast", "none", "none");
        Song s2 = new Song("Second", 1, "Fast", "none", "none");
        Song s3 = new Song("Third", 1, "Fast", "none", "none");
        Song s4 = new Song("Fourth", 1, "Fast", "none", "none");
        
         //(String name, int notes, String tempo, String words, String instrumentals)
          List<Song> list = new List<Song>();
       //   Set treeSet1 = new HashSet();
          
       //   note use collections.sort
          
        list.
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
