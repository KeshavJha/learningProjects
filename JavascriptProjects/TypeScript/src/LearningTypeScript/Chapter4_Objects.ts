// Object Literal -- One type of creating objects
// Object has Key: Value properties given
const objectLiteral = {
    nameVar: "nameValue",
    valueVar: 53
}
objectLiteral.nameVar = "updatedValue" // Values of object literal can be updated using dot operator
objectLiteral.valueVar = 100

console.log ( objectLiteral)

objectLiteral = { nameVar : "updateAgain", valueVar: 200} // ERROR : Cann't assign a new value to object literal 

// Structural Typing -- Second type of creating objects
type ObjectType1 = {
    nameVar: string;
    valueVar: number;
    booleanVar: boolean
}

let objectV1: ObjectType1 = {nameVar: "hello", valueVar: 10, booleanVar: true}
objectV1 =  {nameVar: "world", valueVar: 20, booleanVar: false} // OK : the variable can be assigned a new object value, as it is not a literal
const objectV2 = {nameVar: "world", valueVar: 20, booleanVar: false, miscVar: "This is allowed"}
objectV1 = objectV2 // OK : TypeScript is structually Typed , so object literal that has all fields of ObjectType1 is allowed to be assigned, even if it has extra fields
// Note 1 : Both variable and literal objects are allowed. As long as we pass their object reference. 
// Variable objects with extra field are not allowed to be assigned DIRECTLY
let objectV3 = {nameVar: "world", valueVar: 20, booleanVar: false, miscVar: "This is allowed"}
objectV1 = objectV3
objectV1 = {nameVar: "world", valueVar: 20, booleanVar: false, miscVar: "This is allowed"}
objectV1.miscVar // Note 2 : objectv1.miscVar cann't be used