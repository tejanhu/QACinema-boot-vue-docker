<template>
  <div id="app">
    <navbar></navbar>
    <navbarFooter></navbarFooter>
  </div>
</template>

<script>
import Navbar from './components/Navbar'
import NavbarFooter from './components/NavbarFooter'

export default {
  name: 'app',
  components: {
    Navbar, NavbarFooter
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
