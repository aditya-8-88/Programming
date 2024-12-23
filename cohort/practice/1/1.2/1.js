// JS is interpreted line by line
console.log('hello'); // hello
// console.log(a); // ReferenceError: a is not defined


// it is dynamic language
let a = 5;
console.log(a); // 5
a = 'hello';
console.log(a); // hello


//  var vs let
// var is function scoped, let is block scoped
{
    let a = 2;
    console.log(a); // 0
}

console.log(a); // hello

// have object to be const or let or both
let obj = {
    name: 'John'
}
obj.name = 'Jane'
console.log(obj); // { name: 'Jane' }

// let j=0;
// for(let i=0;i<1000000000000000000;i++) {
//     j++;
//     // do something
// }

// why do we use callback functions in js?
// setInterval