import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NextLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NextLevel extends Actor
{
    // Deklarasi sound untuk efek klik
    GreenfootSound klik = new GreenfootSound("Klik.wav"); 
    // CATATAN: Pastikan kamu sudah punya file "Klik.wav" di folder images

    public void act()    
    {
        // Bagian 1: Efek saat tombol BARU MULAI DITEKAN (mousePressed)
        if(Greenfoot.mousePressed(this)){
            klik.play(); // Mainkan sound saat tombol ditekan
            
            // Efek mengecil (scale down) saat ditekan
            getImage().scale(
                (int)Math.round(getImage().getWidth()*0.9), // Mengecilkan lebar 10%
                (int)Math.round(getImage().getHeight()*0.9) // Mengecilkan tinggi 10%
            );
        }

        // Bagian 2: Aksi saat tombol SELESAI DIKLIK (mouseClicked)
        if(Greenfoot.mouseClicked(this)){
            // Tombol ini tidak perlu kembali ke Homepage, tapi langsung ke Level 2
            Greenfoot.delay(3); 
            Greenfoot.setWorld(new Level2());
        }
    }    
}