// objects and function
var emp = new Object();
emp['firstname'] = 'javed';
emp['lastname'] = 'KHAN';
console.log(emp);
console.log(['firstname']);
var modlastname = 'lastname';
console.log(emp[modlastname]);

emp.address = new Object();
emp.address.street = '4/hill road';
emp.address.city = 'mumbai';
emp.address.state = 'maharashtra';

console.log(emp.address.state);