/ Global variables 

document.addEventListener("DOMContentLoaded", () =>{
  
    // get the HTML button 
    const btn = document.querySelector("calcu-earnings-btn");
    console.log(" get caluate bnt ", btn);


   // wire up the event listner 
    btn.addEventListener("click", (evt) => {

        console.log("Clicked "); 
        
        evt.defaultPrevented();
        const rndCol = `rgb(${random(255)} ${random(255)} ${random(255)})`;
        document.body.style.backgroundColor = rndCol;
      });
})