package Composition2_Comments;

import Composition2_Comments.entities.Comment;
import Composition2_Comments.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Scanner;

public class Program_Comments {
    static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice Trip!");
        Comment c2 = new Comment("Wow that's awesome!");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!"
                , 12);

        p1.Addcomments(c1);
        p1.Addcomments(c2);

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");
        Post p2 = new Post(
                sdf.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5);
        p2.Addcomments(c3);
        p2.Addcomments(c4);

        System.out.println(p1);
        System.out.println(p2);
    }
}
