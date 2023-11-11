const express = require('express')
const app = express()
const port = 4000

app.use( function(req, res, next) {
    

});

app.get('/', (req, res) => {
  res.send('Hello World!')
})

app.get('/profile', (req, res) => {
    res.send('Hello Profile!')
  })

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})
