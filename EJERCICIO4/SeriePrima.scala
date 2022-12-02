import java.util.Scanner
object primos{
    def esPrimo(a:Int):Boolean ={
        var cont= 0
        var i=1
        while (i<=a)
        {
            if (a % i == 0) cont= cont+1
            i= i+1
        }
        if(a ==1)  true
        else if(cont==2) true
        else false
    }

    def main(srgs:Array[String]):Unit = {
        val scanner = new java.util.Scanner(System.in)
        var n=scanner.nextInt()
        var x = 0
        var con = 1
        while(con <= n ){
            x=x+1
            if(esPrimo(x)){
                print(" " +x)
                con = con +1
            }
        }
    }
}