interface TypescriptInterface {
    printHello:(naam: string) => string
};

interface ExtendingInterface extends TypescriptInterface {
    computeLength: (str: string) => number
}

class ImplementingClass implements ExtendingInterface {
    printHello(name: string)  {
        return `Hello ${name}`
    }

    computeLength (str: string) {
        return str.length
    }
}

let impl: ImplementingClass = new ImplementingClass();
console.log(impl.computeLength(impl.printHello("Keshav Jha")))
console.log(impl.computeLength(impl.printHello("Sikha Jha")))
