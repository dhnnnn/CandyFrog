import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kodok here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kodok extends Actor
{
    // Variabel ini gunanya menyimpan posisi X dengan angka koma (desimal)
    private double exactX = 0; 
    
    public void act() 
    {
        // --- LOGIC KECEPATAN 1.5 ---
        
        // Langkah 1: Jika exactX masih 0 (baru mulai), isi dengan posisi kodok sekarang
        if (exactX == 0) {
            exactX = getX();
        }

        if(Greenfoot.isKeyDown("right")){
            exactX = exactX + 1.5;          // Tambah 1.5 (Maju)
            setLocation((int)exactX, getY()); // Pindahkan ke lokasi baru (dibulatkan)
        }
        else if(Greenfoot.isKeyDown("left")){
            exactX = exactX - 1.5;          // Kurang 1.5 (Mundur)
            setLocation((int)exactX, getY()); // Pindahkan ke lokasi baru (dibulatkan)
        }
        
        // ---------------------------
        
        // --- LOGIC TABRAKAN & GAME OVER (TETAP SAMA) ---
        if(isTouching(no.class)){
            Counter2.add(-1); 
            removeTouching(no.class);
            // Tambahkan sound jika mau, tapi defaultnya sudah aman
        }
        
        if(Counter2.value==0){
            Greenfoot.delay(1);
            Greenfoot.setWorld(new Endpage());
            getWorld().removeObject(this); 
        }
    }    
}