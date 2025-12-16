import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class candy5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class candy5 extends candy
{
    // Method 'cetakbaru' SAYA HAPUS.

    void maju(){
        setLocation(getX(), getY()+4); // Tidak diubah
    }

    // Poin +10 dan Sound
    void dimakan(){
        Greenfoot.playSound("Candy.wav");
        Counter.add(10); // Poin tetap +10 (Sesuai kodemu)
        
        // SAYA HAPUS baris 'cetakbaru();' di sini.
        // Agar permen hilang dan menunggu giliran spawn dari World.
        
        getWorld().removeObject(this);
    }
    
    public void act() 
    {
        super.act(); // Tidak diubah
    }    
}
