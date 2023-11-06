var rand1=Math.floor(Math.random()*6)+1;
var rand2=Math.floor(Math.random()*6)+1;
document.querySelector("img.img1").setAttribute("src","./images/dice"+rand1+".png");
document.querySelector("img.img2").setAttribute("src","./images/dice"+rand2+".png");
if (rand1<rand2){
    document.querySelector("h1").innerHTML="Player 2 wins";
}
else if(rand1==rand2){
    document.querySelector("h1").innerHTML="Draw";
}
else{
    document.querySelector("h1").innerHTML="Player 1 wins";
}

