//prototype

var person = {
    firstname: 'default',
    lastname: 'default',
    getFullname: function () {
      return this.firstname + ' ' + this.lastname;
    },
  };
  
  var jk = {
    firstname: 'Javed',
    lastname: 'khan',
  };

  

//   jk.__proto__ = person;
// console.log(jk.getFullname());