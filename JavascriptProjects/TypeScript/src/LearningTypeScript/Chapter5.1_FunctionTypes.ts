function workOnFunction ( getSongAt: (index: number) => string|boolean|number) {
    for (var i =0 ; i < 10 ; i++ ) {
        console.log ( `${getSongAt(i)} was of type ${typeof getSongAt(i)}`)
    }
}

function getSongAtSomePosition (var1 : number) {
    if(var1%3 ==0) return true
    else if ( var1 % 2 == 0) return `String typed${var1}`
    else return var1
}

function getSongAtSomePosition2 (var2 : number) {
    if(var2%3 ==0) return false
    else if ( var2 % 2 == 0) return `Things changed ${var2}`
    else return var2.toPrecision(5)
}

workOnFunction(getSongAtSomePosition)
console.log("\n\n")
workOnFunction(getSongAtSomePosition2)
