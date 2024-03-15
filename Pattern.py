def pattern():
    n = 5
    for i in range(1,n+1):
        if(i%2!=0):
            for j in range(1,i+1):
                print(j,end=" ")
        else:
            for j in range(1,i+1):
                x = str(64+j)
                
                print(str(64+j),end=" ")
        print()
pattern()