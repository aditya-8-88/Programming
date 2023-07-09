// function returning function 

function myFunc(){
    function hello(){
        return "hello world"
    }
    return hello;
}

const ans = myFunc();
console.log(ans());

// meri kiniyan giri below 

// function myFunc(){
//     function myFunc2(){
//         function myFunc3(){
//             return "hello world";
//         }
//         return myFunc3;  
//     }
//     return myFunc2;
// }

// console.log(myFunc);
// const ans = myFunc();
// console.log(ans);
// console.log(ans());
// const ans2 = ans();
// // console.log(ans2);
// console.log(ans2());