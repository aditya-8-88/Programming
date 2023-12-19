def maximumSwap(n):
    arr=[]
    for _ in range(n):
        _=int(input())
        arr.append(_)
    
    for i in arr:
        *digit,=[int(d) for d in str(i)]
        max_digit=max(digit)
        max_index=digit.index(max_digit)
        min_digit=min(digit)
        min_index=digit.index(min_digit)
        digit[max_index]=min_digit
        digit[min_index]=max_digit
        for j in digit:
           print(j,end="") 
        print()

n=int(input())
maximumSwap(n)
        