package com.ben.test

object Test {
  def main(args: Array[String]) {
    //args.foreach(arg => println(arg));
    //args.foreach((arg : String) => println(arg));
    //args.foreach(println);
    /*
     * for(arg <- args)
         println(arg)
     */
    //val big = new java.math.BigInteger("12345");
    val greetString = new Array[String](3);
    /*greetString(0) = "Hello";
    greetString(1) = ",";
    greetString(2) = "World!\n";
    for (i <- 0 to 2)
      print(greetString(i))*/
    /*greetString.update(0, "Hello");
    greetString.update(1, ",");
    greetString.update(2, "World!\n");
    for( i <- 0.to(2))
      print(greetString.apply(i))
      
    val numNames = Array("zero","one","three");*/
    //val oneTwoThree = 1 :: 2 :: 3 :: Nil;
    //println(oneTwoThree);
    //val pair = (99, "Luftballons")
    //println(pair._1)
    //println(pair._2)
    //import scala.collection.mutable.Set
    //var jetSet = Set("Boeing", "Airbus");
    //jetSet += "Lear";
    //jetSet.+=("Shrek")
    //println(jetSet.contains("Cessna"));
    //println(jetSet);

    import scala.collection.mutable.Map
    val treasureMap = Map[Int, String]();
    treasureMap += (1 -> "Go to island")
    treasureMap += (2 -> "Find big X on ground")
    treasureMap += (3 -> "Dig")
    println(treasureMap(2))
  }
}