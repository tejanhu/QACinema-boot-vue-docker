<template>
  <b-navbar id="navbar" toggleable="md" type="light" variant="info">
    <b-navbar-toggle target="nav_collapse"></b-navbar-toggle>
    <b-navbar-brand>QA Cinema</b-navbar-brand>
    <b-collapse is-nav id="nav_collapse">
      <b-navbar-nav>
        <b-button variant="outline-light" size="lg"><router-link to="/" exact-active-class="a">Home</router-link></b-button>
        <b-dropdown variant="outline-light" size="lg" text="Listings">
          <b-dropdown-item><router-link to="/movie/on">Currently On</router-link></b-dropdown-item>
          <b-dropdown-item><router-link to="/movie/soon">New releases</router-link></b-dropdown-item>
        </b-dropdown>

        <b-button variant="outline-light" size="lg"><router-link to="/book">Bookings</router-link></b-button>
        <b-dropdown variant="outline-light" size="lg" href="#" text="Info">
          <b-dropdown-item><router-link to="/info/about">About</router-link></b-dropdown-item>
          <b-dropdown-item><router-link to="/info/contact">Contact</router-link></b-dropdown-item>
          <b-dropdown-item><router-link to="/info/hours">Opening Hours</router-link></b-dropdown-item>
          <b-dropdown-item><router-link to="/info/bbfc">Film Classification</router-link></b-dropdown-item>
          <b-dropdown-item><router-link to="/info/gethere">Getting Here</router-link></b-dropdown-item>
        </b-dropdown>
        <b-button variant="outline-light" size="lg" href="#">Places To Go</b-button>
      </b-navbar-nav>

      <!-- Right aligned nav items -->
      <b-navbar-nav class="ml-auto">

        <b-nav-form size="lg" >
          <b-form-input class="mr-sm-2" type="text" placeholder="Search"/>
          <b-button size="" class="my-2 my-sm-0" type="submit">Search</b-button>
        </b-nav-form>
        <b-button variant="outline-danger" size="lg" href="#">SCRUM</b-button>
      </b-navbar-nav>

    </b-collapse>
  </b-navbar>
</template>

<script>
  export default {
    name: 'navbar',
    data () {
      return {

      }
    }

  }
</script>

<style>
  a{
    color: #000000;
  }
</style>
