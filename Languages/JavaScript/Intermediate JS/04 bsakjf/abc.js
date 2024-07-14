document.addEventListener("DOMContentLoaded", function() {
    const form = document.querySelector("section#contact form");
    const submitButton = form.querySelector("button[type='submit']");
  
    form.addEventListener("submit", function(event) {
      event.preventDefault();
  
      const formData = new FormData(form);
      const name = formData.get("name");
      const email = formData.get("email");
      const message = formData.get("message");
  
      if (!name || !email || !message) {
        alert("Please fill out all fields!");
        return;
      }
  
      submitButton.innerHTML = "Sending...";
      submitButton.disabled = true;
  
      fetch("https://your-api-endpoint.com/send-message", {
        method: "POST",
        headers: {
          "Content-Type": "application/json"
        },
        body: JSON.stringify({ name, email, message })
      })
        .then(response => {
          if (!response.ok) {
            throw new Error("Network Error");
          }
          return response.json();
        })
        .then(data => {
          submitButton.innerHTML = "Sent!";
          form.reset();
        })
        .catch(error => {
          submitButton.innerHTML = "Try Again";
          submitButton.disabled = false;
          console.error(error);
        });
    });
  });
  