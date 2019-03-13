package org.interview.hackerrank;

import java.util.Comparator;

public class ComparatorChecker implements Comparator<Player>{

	public int compare(Player p1, Player p2) {
		if(p1.score == p2.score){
			return p1.name.compareTo(p2.name);
        }else{
        	Integer score1 = new Integer(p1.score);
			Integer score2 = new Integer(p2.score);
            return score2.compareTo(score1);
        }
	}

}
