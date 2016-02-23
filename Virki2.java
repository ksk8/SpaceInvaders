public class Virki2
{
    static double x1,y1;
    private static int width1,width2,height1,height2;
    static Rectangle t1, t2;
    static public int counter,alienHit;
    
    
    public Virki2()
    
    {
        //virki nr 1
        x1 = 400;
        y1 = 200;
        width1 = 57;
        height1 = 14;
        //fader
        
        counter = 2;
        alienHit = 3;
        t1 = new Rectangle(x1,y1,width1,height1);
        
    }
    
    
    public void Draw()
    {
        if(screens.run==true)
        {
            
            if(counter == 2)
            {
                StdDraw.picture(t1.x,t1.y,"wall2.gif");
                
                if(t1.intersects(Bullet.skot)||alienHit==2)
                {
                    counter--;
                    if(t1.intersects(Bullet.skot))
                    {
                        Bullet.skot = new Rectangle(0,0,0,0);
                        Bullet.shot = false;
                        Bullet.readyToFire = true;
                    }
                    StdAudio.play("tnt1.mid");
                    
                    
                }
            }
            if (counter==1)
            {
                StdDraw.picture(t1.x,t1.y,"wall222.gif");
                
                if(t1.intersects(Bullet.skot)||alienHit==1)
                {
                    if(t1.intersects(Bullet.skot))
                    {
                        Bullet.skot = new Rectangle(0,0,0,0);
                        Bullet.shot = false;
                        Bullet.readyToFire = true;
                    }
                    counter--;
                    StdAudio.play("tnt1.mid");
                    
                }
            }
            if (counter==0)
            {
                StdDraw.picture(t1.x,t1.y,"wall22.gif");
                
                if(t1.intersects(Bullet.skot)||alienHit==0)
                {
                    if(t1.intersects(Bullet.skot))
                    {
                        Bullet.skot = new Rectangle(0,0,0,0);
                        Bullet.shot = false;
                        Bullet.readyToFire = true;
                    }                    t1 = new Rectangle(1000,1000,0,0);
                    StdAudio.play("tnt1.mid");
                    alienHit--;
                    
                }
            }
            
  
        }
                
    }
    
    
}