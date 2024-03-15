def count(name):
    count = 0
    for i in name:
        if i in "aeiouAEIOU":
            count+=1
    return count
name = input()
print(count(name))

