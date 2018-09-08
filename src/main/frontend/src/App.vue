<template>
  <div id="app" v-bind:style="bgc">
    <navbar></navbar>
    <UpandComingMovies></UpandComingMovies>
  </div>
</template>

<script>
import Navbar from './components/Navbar'
import UpandComingMovies from './components/new-releases/UpandComingMovies'

export default {
  name: 'app',
  components: {
    Navbar, UpandComingMovies
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
