s = "leetcode"
dic = {}

for i in s:
    if i not in dic:
        dic[i]=1
    else:
        dic[i]+=1
for j in dic.values():
    if(j==1):
        print([list(dic.values()).index(j)])
print(dic)        