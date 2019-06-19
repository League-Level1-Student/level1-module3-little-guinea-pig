package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
public static void main(String[] args) {
	World world = new World();
	world.show();
	Location location_one = new Location(4,4);	
	Bug bug = new Bug();
	world.add(location_one,bug);
	int rand_one = new Random().nextInt(10);
	int rand_two = new Random().nextInt(10);
	Location location_two = new Location(rand_one,rand_two);
	Bug bug_two = new Bug();
	world.add(location_two, bug_two);
	bug_two.setColor(Color.blue);
	bug_two.turn();
	Flower flower = new Flower();
	Location location_three = new Location(rand_one, rand_two  - 1);
	Location location_four = new Location(rand_one, rand_two + 1);
	world.add(location_three, flower);
	world.add(location_four, flower);
	for(int a = 0; a < 10; a++) {
		for(int b = 0; b<10; b++) {
			Location new_location = new Location(a,b);
			world.add(new_location, flower);
		}
	}
} 
}
