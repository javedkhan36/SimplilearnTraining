var objectliteral = {
    carname: 'honda',
    isreasonableCar: true,
};
console.log(objectliteral);

// convert javascript object literal to JSON
console.log(JSON.stringify(objectliteral));

var jsonstring = '{"carname":"honda","isreasonable":true,"mileg": 15}';
// PARSE - will convert json to javascript object
var javascriptobject = JSON.parse(jsonstring);
console.log(javascriptobject);
