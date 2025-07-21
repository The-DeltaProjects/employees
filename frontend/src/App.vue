<template>
  <header class="c">
    <img class="image" src="/afe9126b-d48d-4b0a-8d7d-72c2e65e26e8.png" alt="logo" />

    <div class="btns">
      <button class="home">Home</button>
      <button class="login">Log In</button>
      <button class="help">help</button>
    </div>
  </header>
  <br />
  <div class="wrapper">
    <div class="bg-image">

    </div>

    <transition name="fade">
      <div class="form" v-if="!showTable">

        <div class="formContent">


          <h2 class="text-xl font-bold mb-4">Employee Table</h2>
          <br />

          <label for="fName">First Name : </label><br />
          <input type="text" id="fName" placeholder="" /><br />

          <label class="snl" for="sName">Second Name : </label><br />
          <input class="sn" type="text" id="sName" placeholder="" /><br />

          <label for="email">Email : </label><br />
          <input type="email" id="email" placeholder="" /><br />

          <label for="position">Position :</label><br />
          <input type="text" id="position" placeholder="" /><br />
          <br />
          <div class="myButtons">
            <button class="add">Add</button>
            <button class="show" @click="toggleView">show All</button>
          </div>
        </div>

      </div>
    </transition>

    <br />
    <br />

    <transition name="fade">
      <div class="table" v-show="showTable">
        <table border="1" cellpadding="8">
          <thead>
            <tr>
              <th v-for="(col, index) in columns" :key="index">
                {{ col }}
              </th>
            </tr>
          </thead>
          <tbody>
            <tr v-for="(employee, index) in employees" :key="index">
              <td v-for="(col, i) in columns" :key="i">
                {{ employee[col.toLowerCase().replace(" ", "")] }}
              </td>
            </tr>
          </tbody>
        </table>
      </div>
    </transition>
  </div>


</template>

<script>
export default {
  data() {
    return {
      showTable: false,
      columns: ["ID", "First Name", "Last Name", "Email", "Position"],
      employees: [
        {
          id: 1,
          firstname: "Alice",
          lastname: "Johnson",
          email: "alice@example.com",
          position: "Developer",
        },
        {
          id: 2,
          firstname: "Bob",
          lastname: "Smith",
          email: "bob@example.com",
          position: "Designer",
        },
        {
          id: 3,
          firstname: "Charlie",
          lastname: "Brown",
          email: "charlie@example.com",
          position: "Product Manager",
        },
      ],
    };
  },
  methods: {
    toggleView() {
      this.showTable = true;
    }
  }

};


</script>

<style>
html,
body,
#app {
  height: 100%;
  margin: 0;
  padding: 0;
}

.wrapper {
  position: relative;
  width: 100%;
  height: 100vh;
  overflow: hidden;
}

.bg-image {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background-image: url('/background.jpg');
  background-size: cover;
  background-position: center;
  z-index: 0;
}

.btns {
  margin-left: 1100px;
  margin-top: -70px;
}

header {
  width: 1508px;
  height: 150px;
  background-color: rgb(136, 154, 187);
}

.text-xl {
  text-align: center;
  margin-right: 140px;
}

label {
  justify-content: left;
}

.table {
  position: relative;
  margin-left: 550px;
  margin-top: -350px;
  background-color: white;
  width: 430px
}

.form {
  position: relative;
  margin-left: 420px;
  border: 1px solid;
  border-radius: 70px;
  margin-top: 60px;
  width: 700px;
  height: 450px;
  z-index: 1;
  background-color: rgba(132, 126, 126, 0.607);
  color: white;
}

.formContent {
  margin-left: 150px;
  margin-top: 50px;
}

.image {
  margin-top: 18px;
  margin-left: 20px;
  width: 100px;
  height: 100px;
}

input[type="text"],
[type="email"] {
  border-radius: 30px;
  width: 400px;
  height: 30px;
}

.myButtons {
  justify-content: center;
  text-align: center;
  margin-right: 140px;
}

.add:hover {
  cursor: pointer;
  color: black;
  background-color: rgb(188, 184, 184);
  transition: ease 0.7s;
}

.show:hover {
  cursor: pointer;
  color: black;
  background-color: rgb(184, 180, 180);
  transition: ease 0.7s;
}

.home {
  width: 100px;
  height: 40px;
  border-radius: 50px;
}

.login {
  width: 100px;
  height: 40px;
  border-radius: 50px;
  margin-left: 10px;
}

.help {
  width: 100px;
  height: 40px;
  border-radius: 50px;
  margin-left: 10px;
}

.home:hover {
  cursor: pointer;
  color: white;
  background-color: rgba(154, 151, 151, 0.692);
  transition: ease 0.7s;
}

.login:hover {
  cursor: pointer;
  color: white;
  background-color: rgba(154, 151, 151, 0.692);
  transition: ease 0.7s;
}

.help:hover {
  cursor: pointer;
  color: white;
  background-color: rgba(154, 151, 151, 0.692);
  transition: ease 0.7s;
}

.sn {
  text-align: center;
}

.add {
  width: 100px;
  height: 40px;
  color: white;
  border-radius: 50px;
  margin-right: 10px;
  background-color: rgb(136, 154, 187);
}

.show {
  width: 100px;
  color: white;
  height: 40px;
  border-radius: 50px;
  background-color: rgb(136, 154, 187);
}

.fade-enter-active,
.fade-leave-active {
  transition: opacity 0.5s ease;
}

.fade-enter-from,
.fade-leave-to {
  opacity: 0;
}

.fade-enter-to,
.fade-leave-from {
  opacity: 1;
}
</style>
