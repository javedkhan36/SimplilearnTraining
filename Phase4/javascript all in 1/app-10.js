function greet(firstname, lastname, language = 'en', ...otherarguments) {
    console.log(arguments);
    if (arguments.length == 0) {
      console.log('missing parameters');
      return;
    }
    console.log('firstname: ' + firstname);
    console.log('lastname: ' + lastname);
    console.log('language: ' + language);
    console.log(otherarguments);
    console.log('--------------------------');
  }
  
  greet();
  greet('sultan');
  greet('sultan', 'khan');
  greet('sultan', 'khan', 'en');
  greet('sultan', 'khan', 'hindi', 1, 99, true, 'x', 1.23, 'hello');
  