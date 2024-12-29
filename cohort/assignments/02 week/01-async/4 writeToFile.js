const fs = require('fs');

function writeToFile(data) {
    fs.writeFile('resource/sample.txt', data, 'utf8', (err) => {
        if (err) {
            console.error('Error writing to file:', req);
            return;
        }
        console.log('File written successfully');
    });
}

writeToFile("hello world");