function formatTime(date) {
    let hours = date.getHours();
    let minutes = date.getMinutes();
    let seconds = date.getSeconds();

    // Format HH:MM:SS
    let time24 = `${String(hours).padStart(2, '0')}:${String(minutes).padStart(2, '0')}:${String(seconds).padStart(2, '0')}`;

    // Format HH:MM:SS AM/PM
    let ampm = hours >= 12 ? 'PM' : 'AM';
    hours = hours % 12;
    hours = hours ? hours : 12; // the hour '0' should be '12'
    let time12 = `${String(hours).padStart(2, '0')}:${String(minutes).padStart(2, '0')}:${String(seconds).padStart(2, '0')} ${ampm}`;

    return { time24, time12 };
}

function displayClock() {
    setInterval(() => {
        let currentTime = new Date();
        let time = formatTime(currentTime);
        console.log(`24-hour format: ${time.time24}`);
        console.log(`12-hour format: ${time.time12}`);
    }, 1000);
}

displayClock();