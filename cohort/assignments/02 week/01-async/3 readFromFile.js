const fs = require('fs');

function readFileAndPerformExpensiveOperation() {
    console.log('Starting file read operation');

    // Read file asynchronously
    fs.readFile('resource/sample.txt', 'utf8', (err, data) => {
        if (err) {
            console.error('Error reading file:', err);
            return;
        }
        console.log('File contents:', data);
    });

    // Perform an expensive operation
    console.log('Starting expensive operation');
    let sum = 0;
    for (let i = 0; i < 1e9; i++) {
        sum += i;
    }
    console.log('Expensive operation completed, sum:', sum);
}

readFileAndPerformExpensiveOperation();