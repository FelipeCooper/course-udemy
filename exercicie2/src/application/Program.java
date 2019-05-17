package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Comment c1 = new Comment ("Have a nnice trip");
		Comment c2 = new Comment ("Nice man");		
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),"Traveling to New Zeland","I-m going to visit this wonderfull country",12);
		p1.addComment(c1);
		p1.addComment(c2);
		System.out.print(p1);
	}

}
