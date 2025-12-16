import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A Counter2 class that allows you to display a numerical value on screen.
 */
public class Counter2 extends Actor
{
    private static final Color transparent = new Color(0,0,0,0);
    private GreenfootImage background;
    
    // PUBLIC STATIC agar bisa dibaca MyWorld (Game Over Logic)
    public static int value;
    
    // UBAH 1: private -> public static
    // Supaya sinkron dengan value
    public static int target;
    
    private String prefix;
    
    public Counter2()
    {
        this(new String());
    }

    /**
     * Create a new counter.
     */
    public Counter2(String prefix)
    {
        background = getImage(); 
        
        // UBAH 2: Hapus 'value = 5'. Ganti dengan ini:
        // Kita samakan target dengan value yang sudah diset di MyWorld.
        // (Supaya HP tidak kereset jadi 5 terus, tapi ikut aturan MyWorld)
        target = value;
        
        this.prefix = prefix;
        updateImage();
    }
    
    /**
     * Animate the display to count up (or down) to the current target value.
     */
    public void act() 
    {
        if (value < target) {
            value++;
            updateImage();
        }
        else if (value > target) {
            value--;
            updateImage();
        }
    }

    /**
     * Add a new score to the current counter value.
     */
    public static void add(int score)
    {
        target += score;
    }

    /**
     * Return the current counter value.
     */
    // UBAH 3: Tambah 'static' agar tidak error saat dipanggil
    public static int getValue()
    {
        return target;
    }

    /**
     * Set a new counter value.  This will not animate the counter.
     */
    public void setValue(int newValue)
    {
        target = newValue;
        value = newValue;
        updateImage();
    }
    
    /**
     * Sets a text prefix that should be displayed before
     * the counter value (e.g. "Score: ").
     */
    public void setPrefix(String prefix)
    {
        this.prefix = prefix;
        updateImage();
    }

    /**
     * Update the image on screen to show the current value.
     */
    private void updateImage()
    {
        GreenfootImage image = new GreenfootImage(background);
        GreenfootImage text = new GreenfootImage(prefix + value, 22, Color.BLACK, transparent);
        
        if (text.getWidth() > image.getWidth() - 20)
        {
            image.scale(text.getWidth() + 20, image.getHeight());
        }
        
        image.drawImage(text, (image.getWidth()-text.getWidth())/2, 
                        (image.getHeight()-text.getHeight())/2);
        setImage(image);
    }
}