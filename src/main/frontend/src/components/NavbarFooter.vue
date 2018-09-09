<template>
  <div>
    <section id="footer" class="bg-info footer">
      <div class="container">
        <div class="row text-center text-xs-center text-sm-left text-md-left">
          <div class="col-xs-12 col-sm-4 col-md-4">
            <h5>About</h5>
            <ul class="list-unstyled quick-links">
              <li><a><i class="fa fa-angle-double-right"></i><router-link to="/info/about">About Us</router-link></a></li>
              <li><a><i class="fa fa-angle-double-right"></i><router-link to="/info/about">Opening Hours</router-link></a></li>
              <li><a><i class="fa fa-angle-double-right"></i><router-link to="/info/contact">Contact Us</router-link></a></li>
              <li><a><i class="fa fa-angle-double-right"></i>Getting here</a></li>
              <li><a><i class="fa fa-angle-double-right"></i>Places to go</a></li>
            </ul>
          </div>
          <div class="col-xs-12 col-sm-4 col-md-4">
            <h5>Movies</h5>
            <ul class="list-unstyled quick-links">
              <li><a><i class="fa fa-angle-double-right"></i>Current</a></li>
              <li><a><i class="fa fa-angle-double-right"></i>Future</a></li>
              <li><a><i class="fa fa-angle-double-right" ></i>Classifications</a></li>
            </ul>
          </div>
          <div class="col-xs-12 col-sm-4 col-md-4">
            <h5>Book</h5>
            <ul class="list-unstyled quick-links">
              <li><a><i class="fa fa-angle-double-right"></i>Seating plan</a></li>
              <li><a><i class="fa fa-angle-double-right"></i>Book tickets</a></li>
            </ul>
          </div>
        </div>
        <div class="row">
          <div class="col-xs-12 col-sm-12 col-md-12 mt-2 mt-sm-5">
            <ul class="list-unstyled list-inline social text-center">
              <li class="list-inline-item"><a>Follow Us:
              </a></li>
              <li class="list-inline-item"><a><i class="fa fa-facebook-f fa-2x mb-3" aria-hidden="true"></i>
              </a></li>
              <li class="list-inline-item"><a><i class="fa fa-twitter fa-2x mb-3"></i></a></li>
              <li class="list-inline-item"><a><i class="fa fa-instagram fa-2x mb-3"></i></a></li>
            </ul>
          </div>
        </div>
        <div className="row">
          <div className="col-xs-12 col-sm-12 col-md-12 mt-2 mt-sm-2 text-center text-white">
            <p className="h6">© 2018 Copyright All right Reversed.</p>
          </div>
        </div>
      </div>
    </section>
  </div>
</template>

<script>
    export default {
      name: 'navbarFooter'
    }
</script>

<style>
  .footer{
    color: #000000;
  }
</style>
