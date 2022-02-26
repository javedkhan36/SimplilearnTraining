// object.create

var person = {
    firstname: 'Default',
    lastname: 'Default',
    greet: function () {
      return 'hello ' + this.firstname;
    },
  };
  
  var jk = Object.create(person);
  console.log(jk.greet());
  jk.firstname = 'Ali';
  console.log(jk.greet());