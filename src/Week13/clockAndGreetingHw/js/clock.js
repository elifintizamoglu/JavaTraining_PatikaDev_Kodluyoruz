let userName = prompt('Adınızı yazınız.')
let myName = document.querySelector('#myName')
myName.innerHTML = userName

function displayTime(){
    const weekday = ["Pazar", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi"]
    let now = new Date()
    let day = weekday[now.getDay()]
    let hour = now.getHours()
    let min = now.getMinutes()
    let sec = now.getSeconds()
    let currentTime = hour + ":" + min + ":" + sec;
    document.getElementById("myClock").innerHTML = currentTime + " " + day;
}

setInterval(displayTime,1000);