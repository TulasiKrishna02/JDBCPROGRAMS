package com.nani.www;

import java.util.function.Consumer;
class Movie
{
String movie;
Movie(String movie)
{
	
this.movie=movie;
}

}

class Test13
{
public static void main(String args[])
{
Consumer<Movie> c1=m->System.out.println(m.movie+"Realeased");
Consumer<Movie> c2=m->System.out.println(m.movie+"realesed but it is big flop");
Consumer<Movie> c3=m->System.out.println(m.movie+"Storing information in database");

Movie m=new Movie("Spider");

c2.accept(m);



}



}
