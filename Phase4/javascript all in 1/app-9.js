var arr = new Array();
var arr = [];
var arr = [22,33,44];
console.log(arr);
var arr = [
  1,
  false,
  {
    name: 'jak',
    address: 'xyz',
  },
  function (name) {
    var greeting = 'hello ';
    console.log(greeting + name);
  },
  'hello',
];

console.log(arr);
arr[3](arr[2].name);