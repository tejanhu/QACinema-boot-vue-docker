<template>
  <div>
    <b-carousel id="carousel1"
                style="text-shadow: 1px 1px 2px #333;"
                controls
                indicators
                background="#ababab"
                :interval="4000"
                img-width="1024"
                img-height="480"
                v-model="slide"
                @sliding-start="onSlideStart"
                @sliding-end="onSlideEnd"
    >
      <!--SLIDE 1 -->
      <b-carousel-slide caption= "Title"
                        text="Genre | Rating | Director"
                        :img-src="img1">
        <h1>NEW</h1>
      </b-carousel-slide>
      <!--SLIDE 2 -->
      <b-carousel-slide caption= "Title"
                        text="Genre | Rating | Director"
                        :img-src="img2">
        <h1>NEW</h1>
      </b-carousel-slide>
      <!--SLIDE 3 -->
      <b-carousel-slide caption= "Title"
                        text="Genre | Rating | Director"
                        :img-src="img3">
      </b-carousel-slide>
      <!--SLIDE 4 -->
      <b-carousel-slide caption= "Title"
                        text="Genre | Rating | Director"
                        :img-src="img4">
        <h1>COMING SOON</h1>
      </b-carousel-slide>

    </b-carousel>
  </div>
</template>

<script>
  export default {
    name: 'carousel',
    data () {
      return {
        slide: 0,
        sliding: null,
        img1: 'https://picsum.photos/1024/480/?image=52',
        img2: 'https://picsum.photos/1024/480/?image=54',
        img3: 'https://picsum.photos/1024/480/?image=58',
        img4: 'https://picsum.photos/1024/480/?image=55'
      }
    },
    methods: {
      onSlideStart (slide) {
        this.sliding = true
      },
      onSlideEnd (slide) {
        this.sliding = false
      }
    }
  }
</script>
