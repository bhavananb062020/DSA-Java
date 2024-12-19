arr = [0,9,5,3,6,7,2,1,8]
target = 9
pairs = set()
for i in arr:
    diff = target - i
    for j in range(i, len(arr)-1):
        
        if diff in arr:
            pairs = [i, diff]
            print(pairs)
    