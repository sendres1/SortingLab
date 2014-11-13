/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

import common.Song;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author sendres1
 */
public class Demo1 {
    public static void main(String[] args) {
        
        Song s1 = new Song("First", 1, "Fast", "none", "none");
        Song s2 = new Song("Second", 1, "Fast", "none", "none");
        Song s3 = new Song("Third", 1, "Fast", "none", "none");
        Song s4 = new Song("Fourth", 1, "Fast", "none", "none");
        
         //(String name, int notes, String tempo, String words, String instrumentals)
        
          Set set = new HashSet();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        
        // same as below
//        set.stream().forEach((song) -> {
//            System.out.println(song);
//        });
      
        for(Object song : set) {
            System.out.println(song);
        }
        
        
    }
    
}
