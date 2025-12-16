import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    private boolean gameOver = false;
    private GreenfootSound bgSound;

    public Level2()
    {    
        super(300, 500, 1); 
        
        // --- 🟢 PENGATURAN SKOR & NYAWA LEVEL 2 🟢 ---
        
        // 1. SKOR: Kita JANGAN reset skor (supaya lanjut dari 100)
        // (Tidak ada baris Counter.target = 0 disini)
        
        // 2. NYAWA: Kita isi ulang supaya pemain punya kesempatan
        Counter2.value = 8; 
        
        // ---------------------------------------------

        bgSound = new GreenfootSound("Background.wav"); 
        bgSound.setVolume(60); // Sedikit lebih kencang biar tegang
        bgSound.playLoop();
        
        prepare();
    }

    private void prepare()
    {
        // Posisi awal sama persis seperti MyWorld
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
        // ❌ 1. CEK GAME OVER
        if (Counter2.value <= 0 && !gameOver) {
            gameOver = true;
            bgSound.stop(); 
            Greenfoot.playSound("Gameover.wav"); 
            Greenfoot.setWorld(new Endpage());
        }
        
        // ⭐ 2. CEK MENANG (Target Lebih Tinggi)
        // Kalau Level 1 targetnya 150, Level 2 targetnya 550
        if (!gameOver && Counter.getValue() >= 550) { 
            
            bgSound.stop();
            //Greenfoot.playSound("WinLevel.wav"); 
            
            // Pindah ke transisi lanjut ke level 3 game nya kalau ada ke Endpage
            Greenfoot.setWorld(new Endpage()); 
        }
        
        // ✅ 3. SPAWN LEBIH SULIT
        if (!gameOver) {
            spawnCandy(); 
            spawnMusuh(); 
        }
    }
    
    public void spawnCandy()
    {
        // LEVEL 2: Permen agak jarang sedikit (50)
        if (Greenfoot.getRandomNumber(50) < 1) { 
            
            int dadu = Greenfoot.getRandomNumber(100);
            
            if (dadu < 30) addObject(new candy1(), Greenfoot.getRandomNumber(300), 0);
            else if (dadu < 60) addObject(new candy2(), Greenfoot.getRandomNumber(300), 0);
            else if (dadu < 80) addObject(new candy3(), Greenfoot.getRandomNumber(300), 0);
            else if (dadu < 95) addObject(new candy4(), Greenfoot.getRandomNumber(300), 0);
            else addObject(new candy5(), Greenfoot.getRandomNumber(300), 0);
        }
    }

    public void spawnMusuh()
    {
        // 🔥 LEVEL 2: MUSUH LEBIH SERING MUNCUL 🔥
        // Di MyWorld angkanya 100. Disini kita ganti 70 (Makin kecil makin sering)
        if (Greenfoot.getRandomNumber(70) < 1) { 
            
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