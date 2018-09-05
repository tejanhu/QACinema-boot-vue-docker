<template>
  <div id="app">
    <!--<hello></hello>-->
    <!--<about></about>-->

    <navbar></navbar>
    <contact></contact>

  </div>
</template>

<script>
// import Hello from './components/Hello'
import Navbar from './components/Navbar'
import Contact from './components/Contact'
// import About from './components/About'

export default {
  name: 'app',
  components: {
    Navbar, Contact
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
