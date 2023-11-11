const express = require('express')
const app = express()
const port = 4000

app.use( function(req, res, next) {
    console.log("middleware working");
    next();
});

app.get('/', (req, res) => {
  res.send('Hello World!')
})

app.get('/profile/:username', (req, res) => {
    res.send('Hello ${username}!')
  })

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})
