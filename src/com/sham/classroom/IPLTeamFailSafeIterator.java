package com.sham.classroom;

import java.util.ArrayList;
import java.util.Iterator;

record Player(Integer id, String name, Double price) {
}

class IPLTeam {

	private String teamName;
	private ArrayList<Player> list;

	public IPLTeam(String teamName) {
		this.teamName = teamName;
		list = new ArrayList<>();
	}

	public void addPlayer(Player player) {
		list.add(player);
	}

	public void removePlayer() {
		Iterator<Player> iterator = list.iterator();

		while (iterator.hasNext()) {
			Player player = iterator.next();

			if (player.price() > 5000) {
				iterator.remove();
			}
		}
	}

	public void displayPlayer() {
		System.out.println("plyers of "+teamName+" team");
		
		list.forEach(System.out::println);
	}
}

public class IPLTeamFailSafeIterator {
	public static void main(String[] args) {

		IPLTeam addPlayer = new IPLTeam("SRH");
		addPlayer.addPlayer(new Player(1, "Pet Cummise", 6000D));
		addPlayer.addPlayer(new Player(2, "Abhishek", 4500D));
		addPlayer.addPlayer(new Player(3, "Head", 3500D));
		

		System.out.println("Before removing the players");
		addPlayer.displayPlayer();
		addPlayer.removePlayer();
		System.out.println("After removing the players");
		addPlayer.displayPlayer();

	}
}
