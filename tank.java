import java.awt.event.KeyEvent;

public class tank
{
    static int x1,y1, lives;
    private static int width1,width2,height1,height2;
    static Rectangle t1, t2;
    static boolean alive=true;
    
    KeyEvent e;
    
    
    public tank()
    {
        
        x1 = 400;
        y1 = 25;
            
        t1 = new Rectangle(x1,y1,80,80);
        lives = 3;
    }
    
    public void Draw()
    {
        if(screens.run==true)
        {
            if(alive==true&&lives>0)
            {
                StdDraw.setPenColor(StdDraw.RED);
                StdDraw.text(760,790,"lives:");
                StdDraw.setPenColor();
                if(lives==3)
                {
                    StdDraw.picture(750,760,"lives.gif");
                    StdDraw.picture(770,760,"lives.gif");
                    StdDraw.picture(790,760,"lives.gif");
                }
                if(lives==2)
                {
                    StdDraw.picture(750,760,"lives.gif");
                    StdDraw.picture(770,760,"lives.gif");
                }
                if(lives==1)
                {
                    StdDraw.picture(750,760,"lives.gif");
                }
                StdDraw.picture(t1.x,t1.y,"spaceship.gif");
                if (StdDraw.isKeyPressed(e.VK_LEFT)==true)
                {
                    if (t1.x == 90)
                    {
                        t1.x = 90;
                    }
                    else
                    {
                        t1.x = t1.x - 2;
                    }
                }
                if (StdDraw.isKeyPressed(e.VK_RIGHT)==true)
                {
                    if (t1.x == 710)
                    {
                        x1 = 710;
                    }
                    else
                    {
                        t1.x = t1.x + 2;
                    }
                }
            }
            else
            {
                alive = false;
            }
            
            
        }
  
    }
}

