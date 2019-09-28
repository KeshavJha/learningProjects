<template>
  <div>
    <span>Start of filterComponent</span>
    <input type="String" v-model.lazy="nameToCapitalize" />
    <span>{{ nameToCapitalize|allCapitalized }}</span>
  </div>
</template>

<script type="text/javascript">
  export default {
    name : 'filterComponent1',
    data : function () {
      return {
        nameToCapitalize : String
      }
    },
    filters : {
      allCapitalized : function (input) {
        return String.toUpperCase(input)
      }
    }
  }
</script>