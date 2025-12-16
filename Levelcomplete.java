import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Levelcomplete here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Levelcomplete extends World
{
    public Levelcomplete()
    {    
        // 1. Buat ukuran layar 300x500
        super(300, 500, 1); 
        
        // Pastikan background yang sudah diedit (dengan tulisan LEVEL 1 SELESAI!) 
        // sudah di-Set Image pada Class Levelcomplete secara manual.
        
        // 2. Panggil fungsi prepare untuk memunculkan tombol
        prepare();
    }
    
    /**
     * Metode prepare() digunakan untuk menempatkan aktor ke dunia pada posisi awal.
     */
    private void prepare()
    {
        // 1. Buat tombol NextLevel
        NextLevel tombolNext = new NextLevel();
        
        // 2. Tambahkan tombol ke layar.
        // X=150 (tengah), Y=250 (tepat di tengah-tengah layar)
        addObject(tombolNext, 150, 285); // 🟢 DIUBAH DI SINI: Dari 400 menjadi 250 🟢
    }
    
    // (Opsional: Bagian act() tetap dipertahankan)
    public void act()
    {
        // Tetap biarkan fungsi ENTER berjalan sebagai cadangan
        if (Greenfoot.isKeyDown("enter")) {
            Greenfoot.setWorld(new Level2());
        }
    }
}