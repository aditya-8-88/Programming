console.log("hello 1");

setTimeout(function(){
    console.log("hello 2");
}, 2000);

setTimeout(function(){
    console.log("hello 3");
}, 1000);

console.log("hello 4");
// let a=0;
for(let i = 0; i < 1000000000; i++) {
    // do nothing
    // a+=1;
}

console.log("hello 5");