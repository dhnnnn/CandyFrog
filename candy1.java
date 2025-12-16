import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class candy1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class candy1 extends candy
{
    // Method 'cetakbaru' SAYA HAPUS.
    // Alasannya: Agar tidak bentrok dengan World yang mengatur level.

    void maju(){
        setLocation(getX(), getY()+2); // Tidak diubah
    }

    void dimakan(){
        Greenfoot.playSound("Candy.wav");
        Counter.add(2); // Poin tetap +2 (Sesuai request)
        
        // SAYA HAPUS baris 'cetakbaru();' di sini.
        // Biar permennya hilang dan menunggu World memunculkan permen acak baru.
        
        getWorld().removeObject(this);
    }

    public void act() 
    {
        super.act(); // Tidak diubah
    }    
}
