n1 = int(input())
n2 = int(input())
fact = 1
i = 2
while(True):
    if(n1%i==0 and n2%i==0):
        n1=n1/i
        n2=n2/i
        fact=fact*i
        i=i+1
        continue
    if(n1%i==0 and n2%i!=0):
        n1=n1/i
        fact = fact*i
        i = i+1
        continue
    if(n1%i!=0 and n2%i==0):
        n2=n2/i
        fact = fact*i
        i = i+1
        continue
    if(n1==1 and n2==1):
        break

