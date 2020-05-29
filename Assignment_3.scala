object Assignment_3{

    //problem 1 functions

    def GCD(a:Int, b:Int):Int={
        b match{
            case 0 => a
            case b if b>a => GCD(b, a)
            case _ => GCD(b, a%b)
        }
    }

    def prime(p:Int, n:Int=2):Boolean={
        if(p<2){
            return false
        }

        n match{
            case x if x==p => true
            case x if GCD(p,x)>1 => false
            case x => prime(p, x+1)
        }
    }

    //problem 2 function
    def primeseq(n:Int):Any={
        if (n>2){
            primeseq(n-1)
        }
        if (prime(n)){
            println(n)
        }
    }

    //problem 3 function
    def addition(n:Int):Int={
        n match{
            case 1 => 1
            case _ => n + addition(n-1)
        }
    }

    //problem 4 functions
    def isEven(n:Int):Boolean={
        n match{
            case 0 => true
            case _ => isOdd(n-1)
        }
    }

    def isOdd(n:Int):Boolean={
        !(isEven(n))
    }

    //problem 5 function
    def evenAddition(n:Int):Int={
        n match{
            case 0 => 0
            case n if isEven(n) => n + evenAddition(n-1)
            case n if n>0 => evenAddition(n-1)
        }
    }

    //problem 6 functions
    def fibonacci(n:Int):Int={
        n match{
            case 0 => 0
            case 1 => 1
            case _ => fibonacci(n-1) + fibonacci(n-2)
        }
    }

    def fibonacciseq(n:Int):Any={
        if (n>0){
            fibonacciseq(n-1)
        }

        println(fibonacci(n))
    }

    def main(args: Array[String]):Unit={
        //println(GCD(5,2));
        println("Q1 ->\n")
        println(prime(5))
        println(prime(8))

        println("\nQ2 ->\n")
        primeseq(10)

        println("\nQ3 ->\n")
        println(addition(5))

        println("\nQ4 ->\n")
        println(isEven(6))
        println(isOdd(3))
        println(isEven(5))
        println(isOdd(8))

        println("\nQ5 ->\n")
        println(evenAddition(7))

        println("\nQ6 ->\n")
        fibonacciseq(10)
    }
}