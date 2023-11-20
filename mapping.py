m,n=map(int,input().split())
lst=[0 for k in range(n)]
for i in range(m):
    lst[i]=input()
min=32
end1,end2=8,8
while end1<=n:
    start1=end1-8
    while end2<=m:
        cnt=0
        start2=end2-8
        for i in range(8):
            cnt+=lst[start2+i][start1:end1].count('B')
        print(cnt)
        result=abs(32-cnt)
        if result<min:
            min=result
        end2+=1
    end1+=1
    end2=8
print(min)
