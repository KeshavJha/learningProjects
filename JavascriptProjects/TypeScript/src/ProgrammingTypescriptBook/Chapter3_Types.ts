
// Declaring booleans
const c = true
console.log(typeof c)
let boolTrueValue: boolean = true  // this type is not supported on this system it seems
// console.log(typeof c === typeof boolTrueValue)


// Declaring arrays 
let a = [1,"next", true]; // This is conflicting with a declared in index.ts , Both this and index.ts are not modules
// So variables declared in these files conflict, as both are globally scoped
let b = [1,2,3]
console.log(typeof a)

console.log(typeof b)

// Following line results in an error in compile
// let c: string[] = [1,2]

// let d: Array<string> = ["hello", "world"]



/// Excercises Chapter 3
// 1a. number
let a1 = 1042
console.log(typeof a1) 
// 1b. string
let b1 = 'apples and oranges'
console.log(typeof b1) 
// 1c. string
const c1 = 'pineapples'
console.log(typeof c1) 
// 1d. boolean[]
let d1 = [true, true, false]
console.log(typeof d1)
// 1e. object
let e1 = {type: 'ficus'}
console.log(typeof e1)
// 1f. any[]
let f1 = [1,false]
console.log(typeof f1)
// 1g. const number[]
const g1=[3]
console.log(typeof g1)
// 1h. null
let h1 = null
console.log(typeof h1)
/*

// 2a a2 is of type 3
let a2: 3 = '3'
// 2b j is number[] so a '5' that is a string can't be pushed onto it
let b2 = [1,2,3]
b2.push(4)
b2.push('5')
b2.push(100n)

// 2c  c2 is of type never , and number can't be assigned to it
let c2: never = 4

// 2d d2 is of type unknown , and number can't be assigned to it
let d2: unknown = 4
let d2_1 = d2 * 2

*/