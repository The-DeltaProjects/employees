<template>
  <div>
    <h2 class="text-xl font-bold mb-4">Employee Table</h2>
    <br>
    
    <label for="fName">Firt Name :  </label>
    <input type="text" id="fName" placeholder=""><br>

    <label for="sName">Second Name :  </label>
    <input type="text" id="sName" placeholder=""><br>

    <label for="email">Email :  </label>
    <input type="email" id="email" placeholder=""><br>
    
    <label for="position">Position :</label>
    <input type="text" id="position" placeholder=""><br>
    <br><br><br>












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

  <button class = "myButton">Button</button>

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
.myButton{
  margin-top: 15px;
  width: 100px;
  height: 60px;
  border-radius: 50px;
}

input[type=text],[type=email]{
  border-radius: 30px;
  width: 400px;
  height: 30px;

}
</style>

