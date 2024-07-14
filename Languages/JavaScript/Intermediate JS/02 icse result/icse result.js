// const s={
//     Englit :    25  ,
//     Englang:    35  ,
//     Hindi:      73  ,
//     Computer:   72  ,
//     Maths   :   24  ,
//     Physics :   44  ,
//    Chemistry:   10  ,
//     Biology :   22  ,
//     History :   45  ,
//    Geography:   27 };

const s={
    Englit :    28  ,
    Englang:    50  ,
    Hindi:      71  ,
    Computer:   70  ,
    Maths   :   33  ,
    Physics :   54  ,
   Chemistry:   21  ,
    Biology :   33  ,
    History :   46  ,
   Geography:   33 };

let sum=0;
for(let key in s)
    sum+=s[key];
console.log("Local percentage :",(sum*100)/820,"%");


let comMark=s.Computer;
s.Computer=(s.Computer+100)/2;
sum=0;
for(let key in s)
    sum+=s[key];
console.log("original percentage :",(sum+(20*9))/10,"%");


console.log(":::: ICSE RESULT ::::");
s.Computer= comMark;
const ss = {
    English : (s.Englit+s.Englang)/2 + 20,
    Hindi   : s.Hindi + 20 ,
    Computer: (s.Computer + 100)/2,
    Maths   : s.Maths + 20 ,
    Science : (s.Chemistry+ s.Physics + s.Biology)/3 + 20,
    sst     : (s.History +s.Geography)/2 + 20    };
let min= Math.min(ss.Hindi, ss.Computer, ss.Maths, ss.Science, ss.sst)
sum=0;
for(let key in ss)
    sum+=ss[key];

console.log(ss);
console.log("ICSE Percentage : ",(sum-min)/5,"%");

// console.log(45*6/5);