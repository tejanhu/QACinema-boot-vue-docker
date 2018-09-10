<template>
  <div class="hello">
    <section id="contact">
      <div class="container">
        <h3 class="text-center text-uppercase">contact qa cinema</h3>

        <div className = "row">
          <div className = "col-md-8">
            <div className = "well well-sm">
              <form>
                <div className = "row">
                  <div className = "col-md-6">
                    <div className="form-group">
                      <label>
                        Email Address</label>
                      <input type="email" className="form-control" id="email" placeholder="Enter email" required="required"/>
                    </div>

                    <div className="form-group">
                      <label for="subject">
                        Subject</label>
                      <select id="subject" name="subject" className="form-control" required="required">
                        <option value="na" selected="">Choose One:</option>
                        <option value="service">General Customer Service</option>
                        <option value="suggestions">Suggestions</option>
                        <option value="product">Product Support</option>
                      </select>
                    </div>
                  </div>

                  <div className="col-md-6">
                    <div className="form-group">
                      <label>
                        Message</label>
                      <textarea name="message" id="message" className="form-control" rows="9" cols="25" required="required"
                                placeholder="Message"></textarea>
                    </div>
                  </div>
                  <div className="col-md-12">
                    <button type="submit" className="btn btn-primary pull-right" id="btnContactUs">
                      Send Message</button>
                  </div>
                </div>
              </form>
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col-sm-12 col-md-6 col-lg-3 my-5">
            <div class="card border-0">
              <div class="card-body text-center">
                <i class="fa fa-phone fa-5x mb-3" aria-hidden="true"></i>
                <h4 class="text-uppercase mb-5">call us</h4>
                <p>+4401613932271,+4401273022670</p>
              </div>
            </div>
          </div>
          <div class="col-sm-12 col-md-6 col-lg-3 my-5">
            <div class="card border-0">
              <div class="card-body text-center">
                <i class="fa fa-map-marker fa-5x mb-3" aria-hidden="true"></i>
                <h4 class="text-uppercase mb-5">office loaction</h4>
                <address>Anchorage 1, Anchorage Quay, Salford Quays, Manchester M50 3YJ </address>
              </div>
            </div>
          </div>
          <div class="col-sm-12 col-md-6 col-lg-3 my-5">
            <div class="card border-0">
              <div class="card-body text-center">
                <i class="fa fa-map-marker fa-5x mb-3" aria-hidden="true"></i>
                <h4 class="text-uppercase mb-5">office loaction</h4>
                <address>City View, Stroudley Road, Brighton BN1 4GS </address>
              </div>
            </div>
          </div>
          <div class="col-sm-12 col-md-6 col-lg-3 my-5">
            <div class="card border-0">
              <div class="card-body text-center">
                <i class="fa fa-globe fa-5x mb-3" aria-hidden="true"></i>
                <h4 class="text-uppercase mb-5">email</h4>
                <p>consulting@qa.com</p>
              </div>
            </div>
          </div>


          <div class="col-sm-12 col-md-6 col-lg-3 my-5">
            <div class="card border-0">
              <div class="card-body text-center">
                <i class="fa fa-facebook-f fa-5x mb-3" aria-hidden="true"></i>
                <h4 class="text-uppercase mb-5">facebook</h4>
              </div>
            </div>
          </div>

          <div class="col-sm-12 col-md-6 col-lg-3 my-5">
            <div class="card border-0">
              <div class="card-body text-center">
                <i class="fa fa-twitter fa-5x mb-3" aria-hidden="true"></i>
                <h4 class="text-uppercase mb-5">twitter</h4>
              </div>
            </div>
          </div>

          <div class="col-sm-12 col-md-6 col-lg-3 my-5">
            <div class="card border-0">
              <div class="card-body text-center">
                <i class="fa fa-instagram fa-5x mb-3" aria-hidden="true"></i>
                <h4 class="text-uppercase mb-5">instagram</h4>
              </div>
            </div>
          </div>

        </div>
      </div>
    </section>
  </div>
</template>

<script>
  export default {
    name: 'contact'
  }
</script>

<style scoped>

</style>
