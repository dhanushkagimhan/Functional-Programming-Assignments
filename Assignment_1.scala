object Assignment_1{
    def convert_to_fahrenheit(c:Double):Double={
        var f = c * 1.8 + 32;
        return f;
    }

    def sphere_volume(r:Double):Double={
        var v = (4.0/3.0) * (22.0/7.0) * (r*r*r);
        return v;
    }

    def total_cost(co:Int):Double={
        var tc = 24.95 * (40.0/100.0) * co;

        if(co <= 50){
            tc += 3;
        }else{
            tc += 3 + ((co-50) * 0.75);
        }
        return tc;
    }

    def main(args: Array[String]):Unit={
        println("1) 35C to Fahrenheit : " + convert_to_fahrenheit(35));
        println("2) r=5 sphere volume : " + sphere_volume(5));
        println("3) copy = 60, Total wholesale cost : Rs." + total_cost(60));
    }
    
}
