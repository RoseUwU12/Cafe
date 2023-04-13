<script>
    import CountButton from "../PremadeComponents/CountButton.svelte";
export let play = false;
export let settings = false; 

    const start = () => { 
        play = true; 
    }

    const SettingsOpen = () => { 
        settings = true;
    }

</script>
<div class = "MainMenuButtons"> 
    <button class = "startButton" on:click = {start()}>Play</button>
    <div class = "right">
    <button class = "Settings" on:click ={SettingsOpen()}>Settings</button>
    </div>
    <div class = "left">

    </div>
</div>

<style lang= "scss"> 
.MainMenuButtons { 
height: 70 px;
width: 50 px;
background-color: palevioletred;
}
.startButton { 

}
.Settings { 
    
}
</style>





