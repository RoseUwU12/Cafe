<script> 
export let counter = 0; 

const Count = () => { 
    counter++;
}
</script>

 <div class=button>
    <button on:click = {Count}>Button</button>
 </div>


<style lang= "scss">
.button { 
 background-color: palevioletred;
 text-align: center;
}
</style>
