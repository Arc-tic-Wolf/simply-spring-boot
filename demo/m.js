const express = require('express');
const axios = require('axios');
const app = express();
const port = 9000;

app.get('/retrieve', (req, res) => {
    console.log("Called");
    // axios.get("http://localhost:8080/api/clients").then((result)=>console.log(result.data))
    res.send("Hello World");
    
});

app.get('/',(req,res)=>{
  res.send("Hi there");
});

app.listen(port, () => {
  console.log(`Listening on port ${port}`);
})