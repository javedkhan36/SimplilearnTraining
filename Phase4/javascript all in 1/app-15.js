// call, apply, bind

// bind
var person = {
    firstname: 'javed',
    lastname: 'khan',
    getFullName: function () {
      var fullname = this.firstname + ' ' + this.lastname;
      return fullname;
    },
  };
  
  var logName = function (lang1, lang2) {
    console.log('Laguages used ... ' + lang1 + ' ' + lang2);
    console.log('logged: ' + this.getFullName());
  };
  
  logName();
  var anotherLogFunction = logName.bind(person);
  anotherLogFunction();
  
  // call and apply
  logName.call(person, 'hindi', 'tamil');
  
  //apply
  logName.apply(person, ['urdu', 'english']);
  
  // function borrowing
  var person2 = {
    firstname: 'nwaz',
    lastname: 'khan',
  };
  console.log(person.getFullName.call(person2));
  
  // function currying
  function multiply(a, b) {
    console.log(a * b);
  }
  // multiply(4, 3);
  var multiplybytwo = multiply.bind(this, 4);
  multiplybytwo(3);
  
  var multiplybyNine = multiply.bind(this, 6);
  multiplybyNine(3);
  