# Given an array of integers and a number k, where 1 <= k <= length of the array, compute the maximum values of each subarray of length k.
# 
# For example, given array = [10, 5, 2, 7, 8, 7] and k = 3, we should get: [10, 7, 8, 8], since:
# 
# 10 = max(10, 5, 2)
# 7 = max(5, 2, 7)
# 8 = max(2, 7, 8)
# 8 = max(7, 8, 7)
# Do this in O(n) time and O(k) space. You can modify the input array in-place and you do not need to store the results. You can simply print them out as you compute them.
import math

list=[10,5, 2, 7, 8, 7]
k=3
i=0
j=0
ans=[]
maxi=0
s=[]
for h in range(k):
    ans.append(list[h])
    j=j+1

k=0
s.insert(k,max(ans))
sum=0
k=k+1

while(j < len(list)):
    v=ans[0]
    ans.remove(v)
    ans.append(list[j])
    sum=max(ans)

    s.insert(k,sum)
    k=k+1
    j=j+1
    i=i+1


print(s)
