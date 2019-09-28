<template>
    <div>
    <h1> here goes the hello again from </h1>
    <h2>{{from}}</h2>
    <h1>to </h1>
    <h2> {{to}} </h2>
    <button v-on:click="increaseHelloSaidCount">Say One more hello.</button>
    <span>{{hellosSaidMessage}}</span>
    </div>
</template>

<script>
export default {
    name : 'HelloAgain',
    props : {
        from : String,
        to : String,
        by : Number
    },
    data : function(){
        return {
            helloSaidCount : 0,
            helloSaidMessagePrefix : "Hello said : ",
            helloSaidMessageSuffix : " times"
        }
    },
    computed : {
        hellosSaidMessage : function() {
            if(this.helloSaidCount === 0){
                return ""
            } else if(this.helloSaidCount === 1){
                return this.helloSaidMessagePrefix + "Once"
            } else if(this.helloSaidCount === 2){
                return this.helloSaidMessagePrefix + "Twice"
            } else if(this.helloSaidCount > 2){
                return this.helloSaidMessagePrefix + this.helloSaidCount + this.helloSaidMessageSuffix
            }

        }
    },
    methods : { 
        increaseHelloSaidCount() {
            this.helloSaidCount += this.by;
            console.log(this.helloSaidCount)
        }
    }
}
</script>



<style scoped>
h1 {
    color : red
}
h2 {
    color : blue
}

</style>
