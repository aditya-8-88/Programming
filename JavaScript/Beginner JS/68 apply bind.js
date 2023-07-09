function about(hobby, favMusician){
    console.log(this.firstName, this.age, hobby, favMusician);
}
const user1 = {
    firstName : "harshit",
    age: 8,   
}
const user2 = {
    firstName : "mohit",
    age: 9,

}

// apply and call are same  
about.apply(user1, ["guitar", "bach"]);
// bind creates a function which indead can be stored in a variable which later can be call as a function
const func = about.bind(user2, "guitar", "bach");
func();

