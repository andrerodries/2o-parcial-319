from functools import reduce
  
fib = lambda n: reduce(lambda x, _: x+[x[-1]+x[-2]+x[-3]],
                                 range(n-3), [0, 1, 1])
n = input("ingrese n")
cant = int(n)  
print(fib(cant))