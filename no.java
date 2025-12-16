import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class no here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class no extends Actor
{
    // HAPUS: abstract void cetakbaru(); <- Biar tidak error/dobel spawn
    abstract void maju();
    
    void dimakan(){
        Greenfoot.playSound("Counter.wav"); // 🔊 SOUND KENA HIT
        
        // HAPUS: cetakbaru(); <- Karena World yang akan spawn musuh baru
        
        // Hapus diri sendiri setelah kena hit
        if(getWorld() != null){
            getWorld().removeObject(this);
        }
    }
    
    public void act() 
    {
        maju();
        
        // 1. UBAH LOGIKA MENTOK BAWAH
        if(getY() >= 499){
            // JANGAN 'setLocation' (pindah ke atas).
            // TAPI 'removeObject' (hapus).
            // Nanti 'MyWorld' yang akan melahirkan musuh baru secara acak.
            getWorld().removeObject(this);
            return; // Stop agar tidak error
        }
        
        // 2. CEK TABRAKAN DENGAN KODOK
        // (Pastikan object masih ada di dunia sebelum cek)
        if(getWorld() != null && isTouching(kodok.class)){
            Counter2.add(-1); // Kurangi Nyawa
            dimakan();        // Mainkan sound & Hapus musuh
        }
        
        // 3. LOGIKA GAME OVER
        if(getWorld() != null && Counter2.value == 0){
            getWorld().removeObject(this);
        }
    }    
}