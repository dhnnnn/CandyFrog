import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class no3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class no3 extends no
{
    // Method 'cetakbaru' SAYA HAPUS.
    // Tugas spawn sudah dipindah ke MyWorld.

    void maju(){
        setLocation(getX(), getY()+3); // Kecepatan tetap 3 (Jangan diubah)
    }

    public void act() 
    {
        super.act(); 
        // super.act() otomatis menjalankan:
        // 1. Gerak jatuh (ngebut)
        // 2. Cek tabrakan dengan kodok
        // 3. Sound effect (Counter.wav)
        // 4. Hapus jika mentok bawah
    }     
}
