var express = require('express');
var router = express.Router();

const options = [];

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index', { title: 'decide together' });
});

router.get('/poll', function(req, res, next) {
  res.render('poll', { title: "Decide together", options: options });
});

router.post("/poll", function (req, res) {
  options.push({
    option: req.body.option,
    user: req.body.user,
    vote: 0
  });
  res.redirect("/poll", { options: options });
});

router.get('/vote', (req, res) =>{
  res.render('vote', { title: 'vote options' });
});


router.post('/vote', (req, res) =>{
  console.log(req);
  res.render('results')
});

module.exports = router;
