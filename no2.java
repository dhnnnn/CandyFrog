import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class no2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class no2 extends no
{
    // Method 'cetakbaru' SAYA HAPUS.
    // Agar tidak bentrok dengan MyWorld.

    void maju(){
        setLocation(getX(), getY()+2); // Kecepatan tetap sama (2)
    }

    public void act() 
    {
        super.act(); 
        // super.act() otomatis menjalankan:
        // 1. Gerak jatuh
        // 2. Cek tabrakan (Nyawa berkurang)
        // 3. Sound effect (Counter.wav)
        // 4. Hapus object jika mentok bawah
    }    
}
