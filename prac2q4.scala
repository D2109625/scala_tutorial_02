object que04{
   def attendance(ticketprice :Int):Int= {
       120 +(15 - ticketprice)/5*20;
   }

   def revenue(ticketprice :Int):Int = {
       ticketprice * attendance(ticketprice);
   } 

   def cost(ticketprice:Int):Int = {
        500 + attendance(ticketprice) * 3;
   }
   

   def profit(ticketprice :Int):Int = {
       revenue(ticketprice) - cost(ticketprice);
   }



    def main(args: Array[String])= {
        println("Profit for ticket price Rs.5 :" + profit(5));
        println("Profit for ticket price Rs.10 :" + profit(10));
        println("Profit for ticket price Rs.15 :" + profit(15));
        println("Profit for ticket price Rs.20 :" + profit(20));
        println("Profit for ticket price Rs.25 :" + profit(25));
        println("Profit for ticket price Rs.30 :" + profit(30));
        println("Profit for ticket price Rs.35 :" + profit(35));
        println("Profit for ticket price Rs.40 :" + profit(40));
    }
}
