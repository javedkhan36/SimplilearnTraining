var a=4;
var b;

b=a;
a=8;
console.log('a = '+a);
console.log('b = '+b);

var c = { greeting: 'hey'};
var d;
d=c;
c.greeting = 'latest';
console.log(c);
console.log(d);