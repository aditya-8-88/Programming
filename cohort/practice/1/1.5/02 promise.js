function abc(){
    let p = new Promise(function(resolve){
        setTimeout(resolve,2000);
    });
    return p;
}

function xyz(){
    return new Promise(function(resolve){
        setTimeout(resolve,1000);
    });
}

console.log("hello 1");

abc().then(function(){
    console.log("hello 2");
});

xyz().then(function(){
    console.log("hello 3");
});