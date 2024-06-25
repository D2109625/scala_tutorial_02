object que02{
    def normalworkinghour(normalhours:Int):Int = {
        normalhours*250;
    }


    def oTworkinghour(oThours:Int):Int = {
        oThours*85;
    }    

    def  income(normalhours:Int,oThours:Int):Int = {
         normalworkinghour(normalhours) + oTworkinghour(oThours);
    }

    def tax(totalincome:Int):Int = {
        (totalincome *12)/100;
    } 

    def takehomesalary(normalhours:Int,oThours:Int) ={
        var totalincome = income(normalhours:Int,oThours:Int);
        totalincome - tax (totalincome);
    }

    def main(args: Array[String])= {
        println(takehomesalary(40,30));
    }
}        