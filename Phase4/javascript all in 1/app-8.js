// console.log(this);

// // inside a function, 'this' points to window object
function x() {
    this.newvariable = 'hello';
    console.log(this);
  }
  
  x();
  console.log(newvariable);
  
//   // inside a function that is a method in an object, 'this' points to the object
  var c = {
    name: 'My C object',
    log: function () {
      console.log(this);
    },
  };
  c.log();
  