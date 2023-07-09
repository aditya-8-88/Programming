// lexical scope 

// In nested functions, at the time of calling if any function doesn't have the required item then searches the requirement in it's lexical(neighbour) environment
// in ex- below variable "myvar" is searched in myFunc2 then in myFunc, myApp then finally globally 


const myVar = "value1";

function myApp(){


    function myFunc(){
        // const myVar = "value59";
        const myFunc2 = () =>{
            console.log("inside myFunc", myVar);
        }
        myFunc2();
    }


    console.log(myVar);
    myFunc();
}

myApp();