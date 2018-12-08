package com.gouri.sample.closures

object closures {

  //Example !

  var factor = 90

  def init() = {
    factor = 100
  }

  def clo(x: Int, y: Int): Int = {
    x + y * factor
  }


  //example 2
  /*
  Our outer function — pam — does three things:
  Define a local variable, name
  Define a function, displayName
  Call displayName
*/
  def gouri() = {
    var name = "Gouri"

    def displayName() = {
      println(name)
    }

    displayName()
  }

  /*
  Closures can do more than just read their outer functions’
  local variables — they can overwrite them, too. Observe below:
  */

  def ClosureExample2() = {
    var name = "Gouri"

    def displayName() = {
      println(name)
    }

    def setName(newName: String) = {
      name = "Munu"
    }

    displayName()
    setName("Munu")
    displayName()
  }

  /*
  Function factories
  One powerful use of closures is to use the outer function as a factory for creating functions that are somehow related.
  */

  def FunctionFactories() = {
    def f1(param: String) = {
      (param2: String) => {
        param + param2
      }
    }

    var sales = f1("SalesMan")
    var manager = f1("Manager")

    println(sales("Top"))
    println(manager("Assistant to the Regional"))
    print(manager("Regional"))
  }

}


