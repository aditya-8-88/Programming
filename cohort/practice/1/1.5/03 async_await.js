abc = () => new Promise(resolve => setTimeout(resolve, 1000));

// abc().then(() => console.log("hello 1"));

async function main() {
    console.log("hello 2");
    let value = await abc();
    console.log("hello 3");
}

main();
console.log("hello 4");