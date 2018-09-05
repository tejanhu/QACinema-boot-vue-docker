<template>
  <div id="app">
    <!--<hello></hello>-->
    <navbar></navbar>
    <about></about>

  </div>
</template>

<script>
// import Hello from './components/Hello'
import Navbar from './components/Navbar'
import About from './components/About'

export default {
  name: 'app',
  components: {
    Navbar,
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
