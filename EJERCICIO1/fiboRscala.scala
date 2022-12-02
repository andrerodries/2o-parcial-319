import java.util.Scanner;
object Fibonacci extends App{
    def fibo(n:Int):Int={
        if(n==1){
            0
        }else{
            if(n==2){
                1
            }else{
                if(n==3){
                    1
                }else{
                    fibo(n-1)+fibo(n-2)+fibo(n-3)
                }
            }
        }
    }
    print(fibo(1)+" ")
    print(fibo(2)+" ")
    print(fibo(3)+" ")
    print(fibo(4)+" ")
    print(fibo(5)+" ")
    print(fibo(6)+" ")
    print(fibo(7)+" ")
    print(fibo(8)+" ")
}