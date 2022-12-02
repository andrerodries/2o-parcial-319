def fibonacci(count):
   listA = [0, 1, 1]

   any(map(lambda _:listA.append(sum(listA[-3:])),
         range(3, count)))

   return listA[:count]
n = input("Ingrese n")
cant = int(n)
print(fibonacci(cant))