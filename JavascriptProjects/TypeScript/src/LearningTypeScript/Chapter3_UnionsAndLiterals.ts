let varUninion_1 = Math.random() > 0.5 ? undefined : "Mark Goldberg";
console.log(varUninion_1?.toLowerCase())
//console.log(varUninion_1.)
console.log(typeof varUninion_1) // type is narrowed to udefined
console.log("varUninion_1 :", varUninion_1)
varUninion_1 = "Hello Word" // Type is narrowed to string now
console.log(typeof varUninion_1)
console.log("varUninion_1 updated:", varUninion_1)
let var2: number | string = 23
console.log(typeof var2)
// var2.toUpperCase() // var2's type is narrowed to number , so string functions are not available
var2 = "hello"
console.log(typeof var2) // now var2 is string
var2 = true // can't assign bool to number | string

// Variables without initial value
let uninitVar:string
// console.log(uninitVar?.length) // ERROR: value is undefined , so this statement is not valid

let uninintUndefined: string | undefined
console.log(uninintUndefined?.length) // OK


// Literal types 
const constVar = "var1value" // OK : check the type of the variable -- it is "var1Value"
console.log("\n\n :: type of constVar : ", typeof constVar)
constVar = "updateValue" // ERROR: can't update value of a constant

// mixing literal types in unions 
let mixedLiteral: number | "value1" | "value2"
mixedLiteral = "value1"
mixedLiteral = "value2"
mixedLiteral = 90
mixedLiteral = "value3" // ERROR: not allowed , only "value1 and value2" string values are allowed

// Declaring types
type booleanNumber = boolean | number
type boolNumberString = booleanNumber | string
let variable2 : boolNumberString = "hello";
variable2.toUpperCase();
variable2 = 23
variable2.toUpperCase(); // a number now