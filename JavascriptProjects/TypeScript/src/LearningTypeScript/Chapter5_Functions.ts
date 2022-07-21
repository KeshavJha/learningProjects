



// Optional parameters 
function ratingOptional ( deliveryId: string, rating : number = 5.0) {
    console.log(`${deliveryId} is assigned optional rating: ${rating}` )  /// Observe the back quotes evaluate ${}
}

ratingOptional("del1")
ratingOptional("del2", undefined) // When called with undefined or without, the "undefined" value is used
ratingOptional("del3", 3) 

// Default parameters 
function rating ( deliveryId: string, rating : number = 5.0) {
    console.log(`${deliveryId} is assigned rating: ${rating}`)
}

rating("del1")
rating("del2", undefined) // When called with undefined or without, the default value of parameter is used
rating("del3", 3.0)