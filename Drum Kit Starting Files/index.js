for (var i=1;i<8;i++){
    document.querySelectorAll(".drum")[i].addEventListener("click",
    function (){
    var audio=new Audio("sounds/tom-1.mp3");
    audio.play();
    console.log(this);
   
})

}
