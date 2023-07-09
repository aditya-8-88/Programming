// filter method ---> it's callback function's return value must be boolean 
// although return type is boolean but returns a array 

const numbers = [1,3,2,6,4,8];



const evenNumbers = numbers.filter((number)=>{
    return number % 2 === 0;
});
console.log(evenNumbers);