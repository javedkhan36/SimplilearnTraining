// functional programming

var arr1 = [1, 2, 3];
console.log(arr1);

var arr2 = [];
for (var i = 0; i < arr1.length; i++) {
  arr2.push(arr1[i] * 2);
}
console.log(arr2);

function mapForEach(arr, fn) {
  var newArr = [];
  for (var i = 0; i < arr.length; i++) {
    newArr.push(fn(arr[i]));
  }
//   return newArr;
  console.log(newArr);
}

mapForEach([5, 6, 7], function (item) {
  return item * 3;
});

mapForEach([2, 6, 8], function (item) {
  return item < 5;
});
mapForEach([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], function (item) {
  return item % 2 === 0;
});
