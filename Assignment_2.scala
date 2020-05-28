object Assignment_2{
    
    // Problem 1 functions
    def normalHour(h:Int):Int = h*150;

    def otHour(h:Int):Int = h*75;

    def wage(nh:Int, oh:Int):Int = normalHour(nh) + otHour(oh);

    def tax(nh:Int, oh:Int):Double = wage(nh, oh) * 0.1;

    def takeHomeSalary(nh:Int, oh:Int):Double = wage(nh, oh) - tax(nh, oh);

    // Problem 2 functions
    def attendance(p:Int):Int = 120 + ((15-p)/5)*20;

    def revenue(p:Int):Int = attendance(p) * p;

    def cost(p:Int):Int = 500 + attendance(p) * 3;

    def profit(p:Int):Int = revenue(p) - cost(p);

    def main(args: Array[String]):Unit={
        printf("1) Eployee take home Salary : %.2f\n", takeHomeSalary(40, 20));
        printf("2) Profit for ticket price 5, 10, 15, 20, 25, 30, 35, 40\n-> %d, %d, %d, %d, %d, %d, %d, %d\n", 
        profit(5), profit(10), profit(15), profit(20), profit(25), profit(30), profit(35), profit(40));
        printf(">>> Therefor best ticket price is Rs. 25");
    }
    
}