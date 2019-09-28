<template>
  <div id="marksEntryPart"> {{msg}}
  </div>
</template>

<script>
  export default {
    name : 'pointsRoundUpFilter',// Name has to be in single quotes, Subsequent properties have to be sepearated by comma, not semicolomn or just new line 
    props : {
        msg : String
    }
  }
</script>

<style scoped>
</style>