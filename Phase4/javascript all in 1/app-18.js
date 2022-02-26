// Function constructors

function cot(firstname, lastname) {
    // console.log(this);
    this.firstname = firstname;
    this.lastname = lastname;
  }
  
  var jk = new cot('Ajay', 'dubey');
//   console.log(jk);
  
  cot.prototype.getFullName = function () {
    return this.firstname + ' ' + this.lastname;
  };
  
  console.log(jk.getFullName());