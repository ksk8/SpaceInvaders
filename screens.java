import java.awt.event.KeyEvent;

public class screens
{
    static KeyEvent e;
    public static boolean run = false, Welcome = true;
    public static void Death()
    {
        if (tank.alive==false)
        {
            StdDraw.setPenColor(StdDraw.GRAY);
            StdDraw.filledRectangle(400,400,400,200);
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.text(400,400,"you died, your score is: " + Leikur.Stig*10);
            StdDraw.text(400,330,"Press Q to quit");
            StdDraw.text(400,290,"Press R to Restart");
            
            if (StdDraw.isKeyPressed(e.VK_R)==true)
            {
                Leikur.Stig=0;
                Leikur.Killcount = 24;
                Leikur.level = 1;
                Leikur.initialize();
                tank.alive=true;
                
            }
            if (StdDraw.isKeyPressed(e.VK_Q)==true)
            {
                System.exit(0);
            }
        }
    }
    
    public static void Victory()
    {
        if (Leikur.Stig*10==2400)
        {
            StdDraw.setPenColor(StdDraw.GRAY);
            StdDraw.filledRectangle(400,400,400,200);
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.text(400,400,"You stopped the invation ! you earned: " + Leikur.Stig*10 + " Points");
            StdDraw.text(400,330,"Press Q to quit");
            StdDraw.text(400,290,"Press R to Restart");
        }
    }

    public static void Welcome()
    {
        while(Welcome==true)
        {
            StdDraw.picture(400,400,"welcomescreen.png");
            StdAudio.play("spaceinvaders2.wav");
            if (StdDraw.isKeyPressed(e.VK_P)==true)
            {
                StdDraw.clear();
                run=true;
                Welcome = false;
                Leikur.initialize();
            }
            if (StdDraw.isKeyPressed(e.VK_Q)==true)
            {
                System.exit(0);
            }
        }
    }
}