var car = {};
// console.log(car);

var person = {firstname :'javed', lastname :'khan'}
// console.log(person);

var jk = {
    firstname:  'ali',
    lastname: 'khan',
    address: {
        street: 'hill road',
        city: 'mumbai',
        state: 'maharashtra',
    },
};

function demo(person){
    console.log(person);
    console.log('hello'+  " "+person.firstname);
}
demo(jk);

demo({
    firstname: "Raza",
    lastname: "siddiqui",

});
demo('x');