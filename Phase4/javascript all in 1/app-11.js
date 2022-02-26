// function overloading

function greet(firstname, lastname) {
    console.log('Welcome ' + firstname + ' ' + lastname);
  }
  
  function greet(firstname, lastname, language) {
    if (language === 'en') {
      console.log('Welcome ' + firstname + ' ' + lastname);
      return;
    } else if (language === 'es') {
      console.log('Hola ' + firstname + ' ' + lastname);
      return;
    }
    console.log('Welcome....');
  }
  
  greet('javed', 'khan');
  greet('javed', 'khan', 'en');
  greet('javed', 'khan', 'es');
  
  function greetEnglish(firstname, lastname) {
    greet(firstname, lastname, 'en');
  }
  
  function greetSpanish(firstname, lastname) {
    greet(firstname, lastname, 'es');
  }
  
  greetEnglish('utkarsh', 'singh');
  greetSpanish('javed', 'khan');
  
   // automatic semi colon insertion
  function getPerson() {
    return {
      name: 'JK',
    };
  }
  
  console.log(getPerson());