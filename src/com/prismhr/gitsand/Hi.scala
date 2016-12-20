package com.prismhr.gitsand

object Hi{
  /**
   * Fancy hello, world program.
   */
  def main(args:Array[String]){
    val recip:String = {
      if(args.size < 1 || "".equals(args(0).trim())){
        "World"
      }else{
        args(0)
      }
    }
    println("Hello, " + recip)
  }
}
