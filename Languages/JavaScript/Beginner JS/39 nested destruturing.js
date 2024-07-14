// nested destructuring 
const users = [
    {userId: 1,firstName: 'harshit', gender: 'male'},
    {userId: 2,firstName: 'mohit', gender: 'male'},
    {userId: 3,firstName: 'nitish', gender: 'male'},
]

// const [user1, , user3] = users;
// console.log(user1)
// console.log(user3)


const [{firstName: user1firstName, userId: user1Id}, , {gender: user3gender}] = users;
console.log(user1firstName);
console.log(user1Id);
console.log(user3gender);