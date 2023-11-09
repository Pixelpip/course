var num=document.querySelectorAll(".durm").length;
for (var i=0;i<num;i++){
    document.querySelectorAll(".drum")[i].addEventListener("click",
    function (){

        var bih=this.innerHTML;
        switch(bih){
            case "w":
                var audio=new Audio("sound/ton-1.mp3");
                audio.play();
                break;
            case "a":
                var audio=new Audio("sound/ton-2.mp3");
                audio.play();
                break;
            case ""
        }
   
   
})

}
