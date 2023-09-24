let liveToastBtn = document.querySelector("#liveToastBtn")
let itemListDOM = document.querySelector("#list")
let listItemDOM = document.querySelectorAll('li')
let taskDOM = document.querySelector("#task")
let toastError = document.querySelector(`.toast.error`)
let toastOkay = document.querySelector(`.toast.success`)

function newElement(){
    let liDOM = document.createElement('li')
    if(taskDOM.value !=='' && taskDOM.value !== ' '){
        liDOM.innerHTML = taskDOM.value
        itemListDOM.appendChild(liDOM)
        taskDOM.value = ''

        let span = document.createElement('span')
        span.innerHTML="X"
        liDOM.appendChild(span)
        //$(toastOkay).toast(`show`);
        span.addEventListener('click', function deleteElement(event) {
            event.target.parentElement.remove()
        });
        $(toastOkay).toast(`show`)
    }
    else {
        $(toastError).toast(`show`)
    }
}

listItemDOM.forEach(li => {
    let span = document.createElement('span');
    span.textContent = "X";
    li.appendChild(span);

    span.addEventListener('click', function deleteElement(event) {
        event.target.parentElement.remove()
    });
});

itemListDOM.addEventListener('click', function(i){
    if(i.target.tagName === "LI"){
        i.target.classList.toggle('textStyle')
    }
})
