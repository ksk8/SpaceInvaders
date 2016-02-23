import java.awt.event.KeyEvent;

public class Bullet
{
    private static int h,b;
    KeyEvent e;
    static Rectangle skot;
    static boolean shot = false;
    static boolean readyToFire = true;
    
    
    public Bullet()
    {
        h = 19;
        b = 10;
        skot = new Rectangle(0,0,0,0);
    }
    
    public void Draw()
    {
        if(screens.run==true)
        {
            if(StdDraw.isKeyPressed(e.VK_SPACE)==true)
            {
                if (readyToFire == true && tank.alive==true)
                {
                    StdAudio.play("skot.mid");
                    double bx = tank.t1.x;
                    double by = tank.t1.y + 40;
                    
                    skot = new Rectangle(bx,by,b,h);
                    shot = true;
                    readyToFire = false;
                }
                
            }
            if (shot==true)
            {
                StdDraw.picture(skot.x,skot.y,"shot.gif");
                skot.y = skot.y + 4;
                if (skot.y > 800)
                {
                    shot = false;
                    readyToFire = true;
                    skot = new Rectangle(0,0,0,0);
                }
            }
        }
    }
    
}