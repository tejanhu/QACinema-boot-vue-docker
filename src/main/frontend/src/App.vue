<template>
  <div id="app">
  <h1>Spring Boot + Vue.js + Docker Example</h1>
    <!--<hello></hello>-->
    <about></about>
  </div>
</template>

<script>
// import Hello from './components/Hello'
import About from './components/About'

export default {
  name: 'app',
  components: {
    About
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
