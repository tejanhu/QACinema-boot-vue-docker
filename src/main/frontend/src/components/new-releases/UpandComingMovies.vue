<template>
    <div>

      <h1>New Releases</h1>

      <div class="row">
        <div class="col-md-4" v-for="thumb in thumbs">
          <div class="thumb">
            <img v-bind:src="thumb.url" />
          </div>
        </div>
      </div>

    </div>
</template>

<script>
    export default {
      name: 'soon',
      data: function () {
        return {
          thumbs: [
            {
              publidId: 'afdZAIcAQscziqVtsEoh2PwsYTW',
              url: 'https://image.tmdb.org/t/p/w500/afdZAIcAQscziqVtsEoh2PwsYTW.jpg'
            },
            {
              publidId: 'sFC1ElvoKGdHJIWRpNB3xWJ9lJA',
              url: 'https://image.tmdb.org/t/p/w500/sFC1ElvoKGdHJIWRpNB3xWJ9lJA.jpg'
            },
            {
              publidId: '8fDtXi6gVw8WUMWGT9XFz7YwkuE',
              url: 'https://image.tmdb.org/t/p/w500/8fDtXi6gVw8WUMWGT9XFz7YwkuE.jp'
            },
            {
              publidId: '5LYSsOPzuP13201qSzMjNxi8FxN',
              url: 'https://image.tmdb.org/t/p/w500/5LYSsOPzuP13201qSzMjNxi8FxN.jpg'
            },
            {
              publidId: 'x1txcDXkcM65gl7w20PwYSxAYah',
              url: 'https://image.tmdb.org/t/p/w500/x1txcDXkcM65gl7w20PwYSxAYah.jpg'
            },
            {
              publidId: '80R9mbC0cJhasCSUgy1OSpcaTDI',
              url: 'https://image.tmdb.org/t/p/w500/80R9mbC0cJhasCSUgy1OSpcaTDI.jpg'
            }
          ]
        }
      }
    }
</script>

<style scoped>

</style>
