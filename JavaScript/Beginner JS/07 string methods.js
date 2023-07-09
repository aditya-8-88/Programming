// trim() 
// toUpperCase()
// toLowerCase()
// slice()

let firstName = " harshit ";

console.log(firstName.length);
firstName = firstName.trim(); // "harshit"
console.log(firstName)
console.log(firstName.length);
firstName = firstName.toUpperCase();
console.log(firstName);
firstName = firstName.toLowerCase();

// start index 
// end index

let newString = firstName.slice(1); 
console.log(newString); // slice is just like substring in java