// IIFEs
// Immediately Invocable Function Expressions

function greet(name) {
    console.log('Hello ' + name);
  }
  greet('JAK');
  
  var greetfunction = function (name) {
    console.log('Hello ' + name);
  };
  greetfunction('AJ');
  
  var greeting = (function (name) {
    console.log('Hello ' + name);
  })('sameer');
  
  function x(name) {
    var greeting = 'Inside IIFE: Hello ';
    console.log(greeting + name);
  }
  
  (function (name) {
    var greeting = 'Inside IIFE: Hello ';
    console.log(greeting + name);
  })('javed');
  