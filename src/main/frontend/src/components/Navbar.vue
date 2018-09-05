<template>
  <b-navbar toggleable="md" type="light" variant="info">

    <b-navbar-toggle target="nav_collapse"></b-navbar-toggle>

    <b-navbar-brand href="#">QA Cinema</b-navbar-brand>

    <b-collapse is-nav id="nav_collapse">

      <b-navbar-nav>
        <b-button variant="outline-light" href="#">Home</b-button>
        <b-dropdown variant="outline-light" text="Listings">
          <b-dropdown-item href="#">Currently On</b-dropdown-item>
          <b-dropdown-item href="#">New releases</b-dropdown-item>
        </b-dropdown>

        <b-button variant="outline-light" href="#">Bookings</b-button>
        <b-dropdown variant="outline-light" href="#" text="Info">
          <b-dropdown-item href="#">Opening Hours</b-dropdown-item>
          <b-dropdown-item href="#">Film Classification</b-dropdown-item>
          <b-dropdown-item href="#">Our Screens</b-dropdown-item>
          <b-dropdown-item href="#">Getting Here</b-dropdown-item>
        </b-dropdown>
        <b-button variant="outline-light" href="#">Places To Go</b-button>
      </b-navbar-nav>

      <!-- Right aligned nav items -->
      <b-navbar-nav class="ml-auto">

        <b-nav-form>
          <b-form-input class="mr-sm-2" type="text" placeholder="Search"/>
          <b-button size="" class="my-2 my-sm-0" type="submit">Search</b-button>
        </b-nav-form>
        <b-button variant="outline-danger" href="#">SCRUM</b-button>
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
