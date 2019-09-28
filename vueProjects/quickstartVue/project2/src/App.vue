<template>
  <div id="app">
    <img alt="Vue logo" src="./assets/logo.png">
    <HelloWorld msg="Welcome to Your Vue.js App"/>
    <span> Say hello times : </span>
    <button v-on:click="increaseHelloStepsIsOne">By One</button>
    <button v-on:click="increaseHelloStepsIsFive">By Five</button>
    <button v-on:click="increaseHelloStepsIsTen">By Ten</button>
    <HelloAgain from="Keshav Mukund Jha" to="Mala Mishra" v-bind:by="currentHelloSteps"></HelloAgain>
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'
import HelloAgain from './components/HelloAgain.vue'

export default {
  name: 'app',
  components: {
    HelloWorld, HelloAgain
  },
  data : function() {
    return {
      increaseHelloSteps : 1
    }
  },
  methods : {
    increaseHelloStepsIsOne() {
      this.increaseHelloSteps = 1;
    },
    increaseHelloStepsIsFive() {
      this.increaseHelloSteps = 5;
    },
    increaseHelloStepsIsTen() {
      this.increaseHelloSteps = 10;
    }
  },
  computed : {
    currentHelloSteps : function() {
    console.log("current : " + this.increaseHelloSteps);
    return this.increaseHelloSteps
  }
}
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
