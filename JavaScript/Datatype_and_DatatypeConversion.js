

// ----------------------primitive--------------------
//call by value(given by copy)
//number=> 2 to power 53
//BigInt
//string
//boolean =>true or false
//null-type=>object
//undefined -type =>undefined
//symbol -type =>symbol

//-------------------Non primitive-------------------
//call by reference
//object
//array
//functions

//----------------------type conversion-----------------
 let score="33abc"
let valueInNumber=Number(score)
//output of typeof valueInNumber is NaN-> Not a number

//score=null -> value=0;
//score=undefined -> value=NaN

//1->true 0->false
//""->false "bcjhdcku"->true

// "1"+2->"12"
// "1"+2+2 ->"122"
//  1+2+"2"-> "32"

let str1="hello"
let str2="bhavya"
let str3=str1+" "+str2
//output => "hello bhavya"

//declaration of array(type of object)
const heros=["Bhavya","Muskan","Suneha"]

//declaration of object
let myobj={
    name:"Bhavya",
    age:22,
}

//Function
const myFunction=function()
{

}

//find the type of 
console.log(typeof heros)

