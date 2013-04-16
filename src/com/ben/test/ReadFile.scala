package com.ben.test

object ReadFile {
  def main(args: Array[String]) {
	  import scala.io.Source;
	  if(args.length > 0){
	    
	    for(line <- Source.fromFile(args(0)).getLines())
	      print(line.length() + " " + line + "\n")
	  }else
	  {
	    Console.err.println("please enter a filename")
	  }
  }
}