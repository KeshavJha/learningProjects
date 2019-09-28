<template>
  <div id="app">
    <pointsRoundUpFilter msg="Welcome to message1"/>
    <!-- it doesn't truly matter if you are using kebab-case or camelcase in the html filter-->
    <points-round-up-filter msg="Welcome to message2"/>
    <filter-component-1 msg="dfd"></filter-component-1>
  </div>
</template>

<script>
import pointsRoundUpFilter from './components/HelloWorld.vue'
import filterComponent1 from './components/filterComponent1.vue'

export default {
  name: 'app',
  components: {
    'points-round-up-filter': pointsRoundUpFilter,
    'pointsRoundUpFilter': pointsRoundUpFilter,
    'filter-component-1' : filterComponent1
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
