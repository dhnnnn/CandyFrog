import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private boolean gameOver = false;   // supaya sound game over 1x
    private GreenfootSound bgSound;     // sound dalam game

    public MyWorld()
    {    
        super(300, 500, 1); 
        
        // --- 🟢 TAMBAHAN PENTING (RESET AWAL) 🟢 ---
        // Ini wajib ada di MyWorld supaya pas main ulang, skor & nyawa bersih.
        Counter.target = 0;   // Reset Skor jadi 0
        Counter2.value = 8;   // Reset HP jadi (Penuh)
        // -------------------------------------------
        
        bgSound = new GreenfootSound("Background.wav"); // 🔊 SOUND DALAM GAME
        bgSound.setVolume(60);
        bgSound.playLoop(); // main terus selama game
        prepare();
    }

    private void prepare()
    {
        // --- BAGIAN INI TIDAK SAYA UBAH ---
        kodok kodok = new kodok();
        addObject(kodok,148,434);

        candy1 candy1 = new candy1();
        addObject(candy1,259,69);
        candy2 candy2 = new candy2();
        addObject(candy2,12,139);
        candy3 candy3 = new candy3();
        addObject(candy3,157,43);
        candy4 candy4 = new candy4();
        addObject(candy4,285,203);
        candy5 candy5 = new candy5();
        addObject(candy5,112,227);

        no1 no1 = new no1();
        addObject(no1,189,129);
        no2 no2 = new no2();
        addObject(no2,40,15);
        no3 no3 = new no3();
        addObject(no3,7,249);

        Counter counter = new Counter("");
        addObject(counter,55,478);
        Counter2 counter2 = new Counter2("HP : ");
        addObject(counter2,246,478);
    }

    public void act()
    {
        // ❌ 1. CEK GAME OVER (TETAP)
        if (Counter2.value <= 0 && !gameOver) {
            gameOver = true;
            bgSound.stop(); 
            Greenfoot.playSound("Gameover.wav"); 
            Greenfoot.setWorld(new Endpage());
        }
        
        // ⭐ 2. CEK NAIK LEVEL (TETAP) ⭐
        // Jika skor >= 250, pindah ke layar Levelcomplete
        if (!gameOver && Counter.getValue() >= 250) { 
            
            bgSound.stop(); // Matikan lagu level 1
            Greenfoot.playSound("WinLevel.wav"); // Nyalakan kalau ada suara menang
            
            // Pindah ke layar transisi
            Greenfoot.setWorld(new Levelcomplete());
        }
        
        // ✅ 3. SPAWN OTOMATIS (TETAP)
        if (!gameOver) {
            spawnCandy(); // Permen tetap sering
            spawnMusuh(); // Musuh diatur supaya jarang
        }
    }
    
    // --- METHOD CANDY (TIDAK DIUBAH) ---
    public void spawnCandy()
    {
        // 2% (1 dari 60) - Lumayan sering
        if (Greenfoot.getRandomNumber(100) < 1) { 
            
            int dadu = Greenfoot.getRandomNumber(100);
            
            if (dadu < 30) addObject(new candy1(), Greenfoot.getRandomNumber(300), 0);
            else if (dadu < 60) addObject(new candy2(), Greenfoot.getRandomNumber(300), 0);
            else if (dadu < 80) addObject(new candy3(), Greenfoot.getRandomNumber(300), 0);
            else if (dadu < 95) addObject(new candy4(), Greenfoot.getRandomNumber(300), 0);
            else addObject(new candy5(), Greenfoot.getRandomNumber(300), 0);
        }
    }

    // --- METHOD MUSUH (TIDAK DIUBAH) ---
    public void spawnMusuh()
    {
        // 1 banding 100
        if (Greenfoot.getRandomNumber(150) < 1) { 
            
            int acak = Greenfoot.getRandomNumber(3); 
            
            if (acak == 0) {
                addObject(new no1(), Greenfoot.getRandomNumber(300), 0);
            }
            else if (acak == 1) {
                addObject(new no2(), Greenfoot.getRandomNumber(300), 0);
            }
            else {
                addObject(new no3(), Greenfoot.getRandomNumber(300), 0);
            }
        }
    }
}
    