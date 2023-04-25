package misc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Date;

public class main_misc {
    
	
	public static void main(String[] args) {
	  
	
		Binary_tree b = new Binary_tree();
		b.add(0,20);
		b.add(1,8);
		b.add(2,4);
		b.add(3,12);
		b.add(4,10);
		b.add(5,14);
		b.add(6,22);
		b.add(7,5);
		
		b.link_left(0, 1);
		b.link_right(0, 6);
		
		b.link_left(1, 2);
		b.link_right(1, 3);
		
		b.link_right(2, 7);
		
		b.link_left(3, 4);
		b.link_right(3, 5);
		
		
		
		System.out.println(b.inorder_sucessor(b.get_node(5)));
    
	}
		
		
	}
	
	
		
	
		

	
  
	
    
	
		

	

	
		
		
	

	
	
	
	
	
	
	
	
	

	


	
	

	
		
	
	


	

	
	


	
	
	

	


	
	

	
		
	
	


	

	
	

