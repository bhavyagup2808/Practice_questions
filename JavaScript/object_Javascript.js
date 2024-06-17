//------------------------------Methos to declare objects--------------------------------------
const mysym=Symbol("key1")
const myobj={
    name:"Bhavya",
    age:22,
    "full name": "Bhavya Gupta",
    [mysym]:"mykey1",
    email:"guptabhavya2808@gmail.com",
    location:"Jaipur",
}

// console.log(myobj.name);
// console.log(myobj["name"]);
// console.log(myobj["full name"]) 
// console.log(myobj[mysym])
myobj.country="India"
//console.log(myobj)
//Object.freeze(myobj)
const obj1={1:"a",2:"b"}
const obj2={3:"c",4:"d"}
//const obj3=Object.assign({},obj1,obj2)
//console.log(obj3)

const obj3={...obj1,...obj2}

// console.log(Object.keys(myobj)) => [ 'name', 'age', 'full name', 'email', 'location', 'country' ]
// console.log(Object.values(myobj)) =>['Bhavya',22,'Bhavya Gupta','guptabhavya2808@gmail.com','Jaipur','India']\
//console.log(Object.entries(myobj))
// [
//     [ 'name', 'Bhavya' ],
//     [ 'age', 22 ],
//     [ 'full name', 'Bhavya Gupta' ],
//     [ 'email', 'guptabhavya2808@gmail.com' ],
//     [ 'location', 'Jaipur' ],
//     [ 'country', 'India' ]
//   ]

//console.log(myobj.hasOwnProperty('location'))=>true

const course={
    coursename:"Javascript",
    price:"1000Rs",
    courseInstructor:"hitesh",
}

//-------------------destructure of objects-----------------------

const {courseInstructor:Instructor} =course
console.log(Instructor)

