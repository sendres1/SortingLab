package common;

import java.util.Objects;

public class Song {
    private String name;
    private  int notes;
    private String tempo;
    private String words;
    private String instrumentals;

    public Song(String name, int notes, String tempo, String words, String instrumentals) {
        this.name = name;
        this.notes = notes;
        this.tempo = tempo;
        this.words = words;
        this.instrumentals = instrumentals;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Song other = (Song) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Song{" + "name=" + name + ", notes=" + notes + ", tempo=" + tempo + ", words=" + words + ", instrumentals=" + instrumentals + '}';
    }
    
   
    
}
