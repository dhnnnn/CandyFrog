import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class candy3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class candy3 extends candy
{
    // Method 'cetakbaru' DIHAPUS agar tidak bentrok.

    void maju(){
        setLocation(getX(), getY()+3); // Tidak diubah
    }

    // Poin +6 dan Sound
    void dimakan(){
        Greenfoot.playSound("Candy.wav");
        Counter.add(6); // Poin tetap +6 (Sesuai kodemu)
        
        // SAYA HAPUS baris 'cetakbaru();' di sini.
        // Agar permen hilang dan menunggu giliran spawn dari World.
        
        getWorld().removeObject(this);
    }
    
    public void act() 
    {
        super.act(); // Tidak diubah
    }     
}
