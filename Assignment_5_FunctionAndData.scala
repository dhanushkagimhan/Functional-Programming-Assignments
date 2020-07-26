object Assignment_5_FunctionAndData {

    class Rational(n:Int, d:Int){
        
        require(d>0, "deniminator must be greator than 0")

        def numer = n/gcd(math.abs(n), d)
        def denom = d/gcd(math.abs(n), d)

        def this(n:Int)=this(n,1)

        private def gcd(a:Int, b:Int):Int= if(b==0) a else gcd(b,a%b)

        override def toString = numer+"/"+denom

        def neg=new Rational(-this.numer, this.denom)

        def -(r:Rational)=new Rational(this.numer*r.denom-r.numer*this.denom, this.denom*r.denom)
    }

    class Account(id:String, n:Int, b:Double){
        val nic:String = id
        val acnumber:Int = n
        var balance:Double = b

        override def toString = "[" + nic + ":" + acnumber + ":" + balance + "]"

        def withdraw(a:Double) = this.balance = this.balance - a

        def deposit(a:Double) = this.balance = this.balance + a 

        def transfer(a:Account, b:Double) = {
            this.balance = this.balance - b
            a.balance = a.balance + b
        }
    }

    val overdraft=(b:List[Account])=> b.filter(x => x.balance<0)

    val balance=(b:List[Account]) => b.reduce((x,y) => new Account("", 0, x.balance+y.balance)).balance

    val interest=(b:List[Account]) => 
    b.map(x => new Account(x.nic, x.acnumber, if(x.balance<0) x.balance*1.1 else x.balance*1.05))

    def main(args: Array[String]):Unit={
        val r1 = new Rational(8,20)
        val rz1 = r1.neg
        println(rz1)
        println("\n")

        val x = new Rational(3, 4)
        val y = new Rational(5, 8)
        val z = new Rational(2, 7)

        val rz2 = x-y-z
        println(rz2)
        println("\n")

        //--------------------------

        val a1 = new Account("673829132v", 100100 , 1000)
        println(a1)
        println("\n")

        a1.deposit(500)
        println(a1)
        println("\n")

        a1.withdraw(250)
        println(a1)
        println("\n")

        val a2 = new Account("453216843v", 400400 , 2000)

        a1.transfer(a2, 350)

        println(a1)
        println("\n")
        println(a2)
        println("\n")

        //----------------------------------------------

        val a3 = new Account("342156784v", 300300, -1200)
        val a4 = new Account("564298573v", 200200, -2300)


        var bank:List[Account] = List()

        bank = a1 :: bank
        bank = a2 :: bank
        bank = a3 :: bank
        bank = a4 :: bank

        println(bank)
        println("\n")

        var od = overdraft(bank)
        println(od)
        println("\n")

        //--- Sum of all account balances

        var bs = balance(bank)
        println(bs)
        println("\n")

        // --- Apply interest

        var ib = interest(bank)
        println(ib)

    }
}