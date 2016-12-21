package com.prismhr.gitsand

object Hi {
  def main(args:Array[String]):Unit = {
    args.map(a => {
      "Hola, " + a
    }).foreach(println);
  }
}
