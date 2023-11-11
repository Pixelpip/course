const express = require('express')
const app = express()
const port = 4000

app.use( function(req, res, next) {
    console.log("middleware working");
    next();
});

app.set("view engine","ejs");

app.get('/', (req, res) => {
  res.render('index',{helo:'jhon'})
})

app.get('/profile/:username', (req, res) => {
    res.send(`Hello ${req.params.username}!`)
  })

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})
