package com.ikhokha.techcheck;

public class  ShorterComments extends CommentAnalysis {
	  public ShorterComments( String key) {
        super(key);	
  }
   
	  boolean results(String line){
		  return line.length()<15;
	  }
  
  }