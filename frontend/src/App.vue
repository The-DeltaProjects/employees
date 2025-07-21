<template>
  <header class="c
  
  
  ">
    <img class="image" src="/afe9126b-d48d-4b0a-8d7d-72c2e65e26e8.png" alt="logo">

    <div class="btns">
      <button class="btn1">Home</button>
      <button class="btn2">LogIn</button>
      <button class="33">help</button>
    </div>
  </header>
  <div class="form">
    <h2 class="text-xl font-bold mb-4">Employee Table</h2>
    <br>


    <label for="fName">First Name : </label>
    <input type="text" id="fName" placeholder=""><br>

    <label class="snl" for="sName">Second Name : </label>
    <input class="sn" type="text" id="sName" placeholder=""><br>

    <label for="email">Email : </label>
    <input type="email" id="email" placeholder=""><br>

    <label for="position">Position :</label>
    <input type="text" id="position" placeholder=""><br>
    <br>
    <div class="myButtons">
      <button class="add">Add</button>
      <button class="show">show All</button>
    </div>
    <br>
    <br>
    <br>
  </div>
  <br>
  <br>


  <div clss="table">

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
            {{ employee[col.toLowerCase().replace(' ', '')] }}
          </td>
        </tr>
      </tbody>
    </table>
  </div>

</template>

<script>
export default {
  data() {
    return {
      columns: ['ID', 'First Name', 'Last Name', 'Email', 'Position'],
      employees: [
        {
          id: 1,
          firstname: "Alice",
          lastname: "Johnson",
          email: "alice@example.com",
          position: "Developer"
        },
        {
          id: 2,
          firstname: "Bob",
          lastname: "Smith",
          email: "bob@example.com",
          position: "Designer"
        },
        {
          id: 3,
          firstname: "Charlie",
          lastname: "Brown",
          email: "charlie@example.com",
          position: "Product Manager"
        }
      ]
    }
  }
}
</script>

<style>
html,
body,
#app {
  height: 100%;
  margin: 0;
  padding: 0;
}

.btns {
  margin-left: 900px;
}

header {
  width: 1905px;
  height: 150px;
  background-color: rgb(136, 154, 187);
}

.text-xl {
  text-align: center;
}

.form {
  text-align: left;
  justify-items: center;
  border: 2px solid white;
  border-radius: 50px;
  margin-top: 250px;
  margin-right: 700px;
}

.image {
  margin-top: 5px;
  margin-left: 40px;
  width: 100px;
  height: 100px;
}

input[type=text],
[type=email] {
  border-radius: 30px;
  width: 400px;
  height: 30px;
}

.myButtons {
  justify-content: center;
  text-align: center;
}

.sn {
  text-align: center;

}



.add {
  width: 100px;
  height: 40px;
  border-radius: 50px;
  margin-right: 10px;


}

.show {
  width: 100px;
  height: 40px;
  border-radius: 50px;
}
</style>
