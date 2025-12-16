import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class candy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;

public abstract class candy extends Actor
{
    // HAPUS: abstract void cetakbaru(); <- Biar tidak error di anak-anaknya nanti
    abstract void maju();
    
    // Method dasar dimakan
    void dimakan(){
        Greenfoot.playSound("Candy.wav"); // 🔊 Sound tetap ada
        
        // CATATAN: Poin dihapus di sini, biar 'candy1' yang nambah poin sendiri.
        // HAPUS: cetakbaru(); <- Biar tidak spawn dobel.
        
        // Hapus diri sendiri
        if (getWorld() != null) {
            getWorld().removeObject(this);
        }
    }
    
    public void act() 
    {
        maju();
        
        // UBAH: Kalau mentok bawah
        if(getY() >= 499){
            // JANGAN 'setLocation' (pindah ke atas).
            // TAPI 'removeObject' (hapus).
            // Supaya World bisa ganti dengan Candy jenis lain (Random/Rarity).
            getWorld().removeObject(this);
            return; // Stop di sini biar tidak error "Actor not in World"
        }
        
        // Cek tabrakan dengan Kodok (Pastikan object masih ada)
        if(getWorld() != null && isTouching(kodok.class)){
            // Nanti method ini otomatis ketimpa sama method 'dimakan' milik candy1
            dimakan();
        }
        
        // Logika Game Over (Tetap, tidak diubah)
        if(getWorld() != null && Counter2.value == 0){
            getWorld().removeObject(this);
        }
    }    
}