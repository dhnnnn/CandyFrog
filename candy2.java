import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class candy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class candy2 extends candy
{
    // Method 'cetakbaru' DIHAPUS agar tidak bentrok dengan sistem Level di World.

    void maju(){
        setLocation(getX(), getY()+2); // Kecepatan tetap (tidak diubah)
    }

    // Bagian ini TETAP ADA untuk poin dan suara
    void dimakan(){
        Greenfoot.playSound("Candy.wav");
        Counter.add(4); // Poin +4 (Sesuai kodemu)
        
        // SAYA HAPUS baris 'cetakbaru();' di sini.
        // Agar permen hilang dan menunggu giliran spawn dari World.
        
        getWorld().removeObject(this);
    }
    
    public void act() 
    {
        super.act(); // Tidak diubah
    }   
}
