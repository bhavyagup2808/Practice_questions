//String are immutable in javascript
const name="Bhavya"
const repoCount=50

console.log(`Hello my name is ${name} and my repo count is ${repoCount}`);

//another way of declaring string 
const gameName = new String('Bhavya');

// ----------------------Methods of string-------------------------
//name.length
//name.toUpperCase()
//name.charAt(index)
//name.indexOf('h') =>1
//name.substring(startIdx,endIdx) => startIdx < endIdx
//name.slice(startIdx,endIdx) => can handle negative index
//name.trim()=>remove the whitespace
//name.replace(searchvalue,replacevalue)
//name.includes("ha")
//name.split(" ")
//name.substr(startIdx,length)



//-------------------------type of String------------------------------
const strPrim = "foo"; // A literal is a string primitive
const strPrim2 = String(1); // Coerced into the string primitive "1"
const strObj = new String(strPrim); // String with new returns a string wrapper object.

console.log(typeof strPrim); // "string"
console.log(typeof strPrim2); // "string"
console.log(typeof strObj); // "object"