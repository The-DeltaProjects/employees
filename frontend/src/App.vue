<template>
  <div>
    <h2>Employee Table</h2>
    <table border="1">
      <tr>
        <th>Name</th>
        <th>Position</th>
      </tr>
      <tr v-for="(employee, index) in employees" :key="index">
        <td>{{ employee.name }}</td>
        <td>{{ employee.position }}</td>
      </tr>
    </table>
  </div>
</template>

<script>
export default {
  data() {
    return {
      employees: [
        { name: "Alice", position: "Developer" },
        { name: "Bob", position: "Designer" },
      ]
    };
  }
}
</script>

