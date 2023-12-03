const a=parseInt("5");
var n1=0, n2=1, next;
console.log("Fibonacci series:");
for(let i=0;i<=a;i++){
    console.log(n1);
    next=n1+n2;
    n1=n2;
    n2=next;
}