require('es6-promise').polyfill()

import Vue from 'vue'
import App from './App'
import VueRouter from 'vue-router'
import BootstrapVue from 'bootstrap-vue'

import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
import 'font-awesome/css/font-awesome.min.css'

import Home from './components/homepage/Home'
import Classification from './components/classification/Classification'

Vue.use(VueRouter)
Vue.use(BootstrapVue)

const routes = [{
  path: '/',
  component: Home
}, {
  path: 'classification',
  component: Classification
}]

const router = new VueRouter({
  mode: 'history',
  routes
})

/* eslint-disable no-new */
new Vue({
  el: '#app',
  template: '<App/>',
  components: { App },
  bgc: {
    backgroundColor: '#24a2b7'
  },
  render: h => h(App),
  router
}).$mount('#app')
