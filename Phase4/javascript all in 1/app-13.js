// closures

function greet(saysomething) {
    return function (name) {
      console.log(saysomething + ' ' + name);
    };
  }
  
  var sayHi = greet('How are you..');
  
  sayHi('JK');
  
  // function sayHi(name) {
  //   console.log(saySomething + ' ' + name);
  // }