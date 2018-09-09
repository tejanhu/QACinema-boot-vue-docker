<template>

  <div id="app" v-bind:style="bgc">
    <!--<hello></hello>-->
    <navbar></navbar>
    <router-view></router-view>
    <navbarFooter></navbarFooter>
  </div>
</template>

<script>
// import Hello from './components/Hello'
import Navbar from './components/Navbar'
// import NavbarFooter from './components/NavbarFooter'

export default {
  name: 'app',
  components: {
    Navbar
  }
}
</script>

<style>
html {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 5px;
  margin-bottom: 10px;
  background-color: #24a2b7;
}
</style>
