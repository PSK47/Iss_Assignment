function validateForm() {
    var email = document.getElementById("email").value;
    var name = document.getElementsByName("fname")[0].value;
    var regNumber = document.getElementsByName("fname")[1].value;
    var whatsappNumber = document.getElementsByName("fname")[2].value;

    var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    // Validate Email
    if (!emailRegex.test(email)) {
        displayValidationMessage("Email is invalid.");
        return false;
    }

    // Validate Name, Registration Number, and Whatsapp Number
    if (name.trim() === "" || regNumber.trim() === "" || whatsappNumber.trim() === "") {
        displayValidationMessage("All fields are required.");
        return false;
    }

    // Validate Whatsapp Number (Assuming it should be exactly 10 digits)
    if (whatsappNumber.length !== 10 || !/^\d+$/.test(whatsappNumber)) {
        displayValidationMessage("Whatsapp Number should be 10 digits.");
        return false;
    }

    // Additional validations can be added for other fields

    // Clear previous validation messages
    clearValidationMessages();

    return true;
}

function displayValidationMessage(message) {
    var validationMessages = document.getElementById("validationMessages");
    validationMessages.innerHTML = "<p style='color: red;'>" + message + "</p>";
}

function clearValidationMessages() {
    var validationMessages = document.getElementById("validationMessages");
    validationMessages.innerHTML = "";
}
