let num = 5,c = 10;
console.log(num);
while(c>0){
    let pow=Math.pow(num,2);
    for(let i=1;i<=pow;i*=10){
        if(pow%i==num){
            console.log(pow);
            num= pow;
            break;
        }
    }
    c--;
}