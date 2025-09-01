console.log("Script loaded");

let currentTheme = getTheme();
let currentButtonColor = getButtonColor();
console.log(currentTheme);
//initial -->
// document.querySelector("html").classList.add("bg-light");
// document.querySelector("#theme_change_button").classList.add("btn-dark");
// document.querySelector("body").classList.add("bg-light");

changeTheme(currentTheme, currentButtonColor);


//Todo
function changeTheme() {
    //set to web page
    document.querySelector("html").classList.add(currentTheme);
    document.querySelector("body").classList.add(currentTheme);

    //set the listener to change theme button
    const changeThemeButton = document.querySelector("#theme_change_button");
    changeThemeButton.addEventListener("click", (event) =>{

        console.log("Theme button clicked");


        const oldTheme = currentTheme;
        const oldColor = currentButtonColor;

        if(currentTheme === "bg-dark") {
            currentTheme = "bg-light";
            currentButtonColor = "btn-dark";
            changeThemeButton.classList.remove(oldColor);
            changeThemeButton.classList.add(currentButtonColor);
            //changeThemeButton.textContent = "<i class=\"fa-regular fa-moon\"></i> Dark";
        }
        else {
            currentTheme = "bg-dark";
            currentButtonColor = "btn-light";
            changeThemeButton.classList.remove(oldColor);
            changeThemeButton.classList.add(currentButtonColor);
            //changeThemeButton.textContent = "Light";
        }

        //update local storage
        setTheme(currentTheme);
        document.querySelector("html").classList.remove(oldTheme);
        document.querySelector("body").classList.remove(oldTheme);
        document.querySelector("html").classList.add(currentTheme);
        document.querySelector("body").classList.add(currentTheme);
    });
}

//Set theme to localstorage
function setTheme(theme){
    localStorage.setItem("theme", theme);
}

//set button color
function setButtonColor(buttonColor){
    localStorage.setItem("buttonColor", currentButtonColor);
}

//get theme from localstorage
function getTheme() {
    let theme = localStorage.getItem("theme");
    return theme ? theme : "bg-light";
}

//get button color
function getButtonColor(){
    let buttonColor = localStorage.getItem("buttonColor");
    return buttonColor ? buttonColor : "btn-light";
}