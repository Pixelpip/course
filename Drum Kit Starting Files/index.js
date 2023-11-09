var n=document.querySelectorAll(".drum").length;
for (var i=0;i<n;i++){
    document.querySelectorAll(".drum")[i].addEventListener("click",
    function (){

        var bih=this.innerHTML;
        switch(bih){
            case "w":
                var t1=new Audio("sounds/tom-1.mp3");
                t1.play();
                break;
            case "a":
                var t2=new Audio("sounds/tom-2.mp3");
                t2.play();
                break;
            case "s":
                var t3=new Audio("sounds/tom-3.mp3");
                t3.play();
                break;
            case "d":
                var t4=new Audio("sounds/tom-4.mp3");
                t4.play();
                break;
            case "j":
                var kick=new Audio("sounds/kick-bass.mp3");
                kick.play();
                break;
            case "k":
                var snare=new Audio("sounds/snare.mp3");
                snare.play();
                break;
         
            case "l":
                var bass=new Audio("sounds/crash.mp3");
                bass.play();
                break;
            default:
                console.log(bih);
        }
   
   
})

}
