<script>
    import CountButton from "../PremadeComponents/CountButton.svelte";
export let play = false;
export let settings = false; 

    const start = () => { 

    }

    const SettingsOpen = () => { 

    }

</script>
<div class = "MainMenuButtons"> 
    <button class = "startButton" on:click = {start()}>Play</button>
    <button class = "Settings" on:click ={SettingsOpen()}>Settings</button>
</div>

<style lang= "scss"> 
.MainMenuButtons { 

}
.startButton { 

}
.Settings { 
    
}
</style>





