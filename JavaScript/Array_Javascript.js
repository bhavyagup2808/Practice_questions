// -------------------methods to declare array--------------------------
// using literals
let arr=["Bhavya", "Suneha" ,"Muskan",{name:"bhavya"}];

let arr1=[];
//using constructor
let numbers = new Array(10); //->elements are undefined nd array length is 10
let colors = new Array("Red", "Green", "Blue");
//using Array.of method
let numbers1 = Array.of(1, 2, 3, 4);
//using Array.from methods to make an array from set and string

//let arr3= Array.from()

// ----------------------Methods of Array-----------------------------------------

// arr.push(1,2,3,4); ->[ 'Bhavya', 'Suneha', 'Muskan', { name: 'bhavya' }, 1, 2, 3, 4 ]
// arr.push([1,2,3,4]); ->[ 'Bhavya', 'Suneha', 'Muskan', { name: 'bhavya' }, [ 1, 2, 3, 4 ] ]
// arr.pop(); -> [ 'Bhavya', 'Suneha', 'Muskan' ]->delete the last element only
// let s=arr.toString(); ->Bhavya,Suneha,Muskan,[object Object]=>because object return object datatype
// arr1=arr1.concat(arr); => concat two or more array to the array
// arr.unshift() => add the elements to the start
// arr.shift() => remove from the start
// arr.slice(startIdx,endIdx)
// arr.splice(startIdx, delcount ,newElement) =>change the array 
console.log(arr1); 