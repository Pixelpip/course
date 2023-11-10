const fs=require("fs")
fs.writeFile("message.txt","heil",(err)=>{
    if(err) throw err;
    console.log("the file jas been saved");
});