const user1 = {
    firstName : " harshit " ,
    age : 8 ,
    about : function ( hobby , favMusician ) {
        console.log ( this.firstName , this.age , hobby , favMusician)
    }
}

const user2 = {
    firstName : " mohit " ,
    age : 9 
}

user1.about.call ( user2 , " guitar " , " moazrt " ) ;




// const user1 = {
//     firstName : "harshit",
//     age: 8,
//     about: function(){
//         console.log(this.firstName, this.age);
//     }   
// }

// // don't do this mistake 

// // user1.about();
// const myFunc = user1.about.bind(user1);
// myFunc(); 





// // arrow functions 

// const user1 = {
//     firstName : "harshit",
//     age: 8,
//     about: () => {
//         console.log(this.firstName, this.age);
//     }   
// }

// user1.about(user1); 