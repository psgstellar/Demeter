<template>
  <div id="app">
  <h1>EZEN</h1>
    <nav id ="menu">
    <ul>
      <li><a href="App.vue">Home</a></li>
      <li><a href="About.vue">About</a></li>
      <li><a href="Service.vue">Service</a></li>
       <li><a href="Contact.vue">Contact</a></li>
        <li><a href="Login.vue">login</a></li>
    </ul>
  </nav>
 </div>
</template>
<script>

export default {
  name: 'App',
  components:{
   
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: left;
  color: #2c3e50;
  margin-top: 10px;
}
h1 {
 display: flex;
  justify-content: space-between;
  float:left;
  margin-top:0px;
}
#menu{
  display: inline;
  vertical-align: middle;
  float:right;
  padding-bottom:200px;
}
ul {
  list-style: none;
  margin: 0;
  padding: 0;
  display: flex;
}
a {
  display: block;
  text-align: center;
  margin: .25rem;
  padding: .5rem 1rem;
  text-decoration: none;
  font-weight: bold;
  color: white;
  background: teal;
}
a:hover {
  background: yellowgreen;
}
</style>
