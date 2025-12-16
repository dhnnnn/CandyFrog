import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class no1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class no1 extends no
{
    // Method 'cetakbaru' SAYA HAPUS.
    // Karena MyWorld yang sekarang bertugas memunculkan musuh.

    void maju(){
        setLocation(getX(), getY()+2); // Kecepatan turun (tetap)
    }

    public void act() 
    {
        super.act(); 
        // super.act() ini otomatis menjalankan:
        // 1. Gerak maju
        // 2. Cek tabrakan dengan kodok
        // 3. Bunyi Sound "Counter.wav" jika kena
    }     
}