package com.prismhr.gitsand

object Hi{

  /**
   * Fancy hello, world program.
   */
  def main(args:Array[String]){


    val recip:Array[String] = {
      if(args.size < 1 || "".equals(args(0).trim())){
        Array[String]("World")
      }else{
        args
      }
    }

    recip.foreach( (name) => { println( "Hello, " + name + ".") }  );
  }
}
