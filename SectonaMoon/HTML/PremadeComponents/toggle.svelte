<script> 
let toggle = false; 

const toggleSwitch = () => { 
    if (toggle = false) {
        toggle = true;
    }
    else { 
        toggle = false; 
    }
}

</script>

<div class = toggle> 
    <button name = UwU on:click= {toggleSwitch}> Button</button>
</div>

<style lang= "scss">
.toggle { 
    background-color: violet;
}


</style> 

