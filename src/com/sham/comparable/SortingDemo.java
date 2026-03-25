package com.sham.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Player implements Comparable<Player> {
	String name;
    int score;
    
    public Player(String name, int score) {
    	this.name=name;
    	this.score=score;
    }
    
    public int compareTo(Player p) {
    	return Integer.compare(p.score, this.score);
    }

	@Override
	public String toString() {
		return "Player [name=" + name + ", score=" + score + "]";
	}
}


class NameSorter implements Comparator<Player>{
	
	public int compare(Player p1, Player p2) {
		return p1.name.compareTo(p2.name);
	}
}

public class SortingDemo {

	public static void main(String[] args) {
		
		List<Player> players = new ArrayList<>();
        players.add(new Player("Charlie", 85));
        players.add(new Player("Alice", 95));
        players.add(new Player("Bob", 70));

        System.out.println("Original: " + players);

//        Collections.sort(players);
//        System.out.println("Sorted: "+players);
        
        Collections.sort(players, new NameSorter());
        System.out.println(players);
        
	}

}
