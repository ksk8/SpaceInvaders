public class Alien
{
    public static double x1,x2,x3,x4,x5,x6,vx,ex1,ex2,ex3,ey1,ey2,ey3;
    public int y, width;
    public String pic;
    public boolean alive1=true, alive2=true,alive3=true,alive4=true,alive5=true,alive6=true,fire1 = false, fire2 = false, fire3 = false;
    public Alien()
    {
        x1 = 65;
        x2 = 120;
        x3 = 175;
        x4 = 230;
        x5 = 285;
        x6 = 340;
        
        y = 500;
        width = 25;
        
        vx = 0.5;
        for (int i = 0; i<Leikur.level;i++)
            vx += 0.1;
        
        pic = "invader1.png";
    }
    
    public void Draw()
    {
        if(screens.run==true)
        {
            double r = (int)(Math.random()*1000/Leikur.level);
            // geimvera 1
            if(alive1)
            {
                Rectangle a1 = new Rectangle(x1,y,17,17);
                if (Math.abs(a1.x + vx) >= 750 - width)
                {
                    vx = -vx;
                    y = y - 20;
                }
                if(Math.abs(a1.x+vx) <= 50 - width)
                {
                    vx= -vx;
                    y = y - 20;
                }
                x1 = a1.x + vx;
                StdDraw.picture(a1.x,a1.y,pic);
                
                if(a1.intersects(Bullet.skot))
                {
                    alive1 = false;
                    Bullet.shot = false;
                    Bullet.readyToFire = true;
                    Bullet.skot = new Rectangle(0,0,0,0);
                    StdAudio.play("death.mid");
                    Leikur.Killcount--;
                    Leikur.Stig++;
                }
            }
            
            // geimvera 2
            if(alive2)
            {
                Rectangle a2 = new Rectangle(x2,y,17,17);
                if (Math.abs(a2.x + vx) >= 750 - width)
                {
                    vx = -vx;
                    y = y - 20;
                }
                if(Math.abs(a2.x+vx) <= 50 - width)
                {
                    vx= -vx;
                    y = y - 20;
                }
                x2 = a2.x + vx;
                StdDraw.picture(a2.x,a2.y,pic);
                
                if(r==5&&fire1==false)
                {
                    fire1 = true;
                    ex1 = a2.x;
                    ey1 = y;
                    StdAudio.play("gskot.mid");
                }
                
                if (fire1==true)
                {
                    Rectangle b1 = new Rectangle(ex1,ey1,20,20);
                    StdDraw.picture(ex1,ey1,"laser.png");
                    ey1 = ey1 - 2;
                    if(ey1<0)
                    {
                        fire1=false;
                        b1 = new Rectangle(0,0,0,0);
                    }
                    else if (b1.intersects(tank.t1))
                    {
                        tank.lives--;
                        b1 = new Rectangle(0,0,0,0);
                        fire1 = false;
                        StdAudio.play("tankexpo.mid");
                    }
                    else if (b1.intersects(Virki1.t1))
                    {
                        Virki1.alienHit--;
                        b1 = new Rectangle(0,0,0,0);
                        fire1 = false;
                    }
                    else if (b1.intersects(Virki2.t1))
                    {
                        Virki2.alienHit--;
                        b1 = new Rectangle(0,0,0,0);
                        fire1 = false;
                    }
                    else if (b1.intersects(Virki3.t1))
                    {
                        Virki3.alienHit--;
                        b1 = new Rectangle(0,0,0,0);
                        fire1 = false;
                    }
                }
                
                
                
                if(a2.intersects(Bullet.skot))
                {
                    alive2 = false;
                    Bullet.shot = false;
                    Bullet.readyToFire = true;
                    Bullet.skot = new Rectangle(0,0,0,0);
                    StdAudio.play("death.mid");
                    Leikur.Killcount--;
                    Leikur.Stig++;
                }
            }
            
            // geimvera 3
            if(alive3)
            {
                Rectangle a3 = new Rectangle(x3,y,17,17);
                if (Math.abs(a3.x + vx) >= 750 - width)
                {
                    vx = -vx;
                    y = y - 20;
                }
                if(Math.abs(a3.x+vx) <= 50 - width)
                {
                    vx= -vx;
                    y = y - 20;
                }
                x3 = a3.x + vx;
                StdDraw.picture(a3.x,a3.y,pic);
                
                if(a3.intersects(Bullet.skot))
                {
                    alive3 = false;
                    Bullet.shot = false;
                    Bullet.readyToFire = true;
                    Bullet.skot = new Rectangle(0,0,0,0);
                    StdAudio.play("death.mid");
                    Leikur.Killcount--;
                    Leikur.Stig++;
                }
            }
            
            // geimvera 4
            if(alive4)
            {
                Rectangle a4 = new Rectangle(x4,y,17,17);
                if (Math.abs(a4.x + vx) >= 750 - width)
                {
                    vx = -vx;
                    y = y - 20;
                }
                if(Math.abs(a4.x+vx) <= 50 - width)
                {
                    vx= -vx;
                    y = y - 20;
                }
                
                x4 = a4.x + vx;
                StdDraw.picture(a4.x,a4.y,pic);
                
                if(r==43&&fire2==false)
                {
                    fire2 = true;
                    ex2 = a4.x;
                    ey2 = y;
                    StdAudio.play("gskot.mid");
                }
                
                if (fire2==true)
                {
                    Rectangle b2 = new Rectangle(ex2,ey2,20,20);
                    StdDraw.picture(ex2,ey2,"laser.png");
                    ey2 = ey2- 2;
                    if(ey2<0)
                    {
                        fire2=false;
                        b2 = new Rectangle(0,0,0,0);
                    }
                    else if (b2.intersects(tank.t1))
                    {
                        tank.lives--;
                        b2 = new Rectangle(0,0,0,0);
                        fire2 = false;
                        StdAudio.play("tankexpo.mid");
                    }
                    else if (b2.intersects(Virki1.t1))
                    {
                        Virki1.alienHit--;
                        b2 = new Rectangle(0,0,0,0);
                        fire2 = false;
                    }
                    else if (b2.intersects(Virki2.t1))
                    {
                        Virki2.alienHit--;
                        b2 = new Rectangle(0,0,0,0);
                        fire2 = false;
                    }
                    else if (b2.intersects(Virki3.t1))
                    {
                        Virki3.alienHit--;
                        b2 = new Rectangle(0,0,0,0);
                        fire2 = false;
                    }
                }
                
                
                
                if(a4.intersects(Bullet.skot))
                {
                    alive4 = false;
                    Bullet.shot = false;
                    Bullet.readyToFire = true;
                    Bullet.skot = new Rectangle(0,0,0,0);
                    StdAudio.play("death.mid");
                    Leikur.Killcount--;
                    Leikur.Stig++;
                }
            }
            
            // geimvera 5
            if(alive5)
            {
                Rectangle a5 = new Rectangle(x5,y,17,17);
                if (Math.abs(a5.x + vx) >= 750 - width)
                {
                    vx = -vx;
                    y = y - 20;
                }
                if(Math.abs(a5.x+vx) <= 50 - width)
                {
                    vx= -vx;
                    y = y - 20;
                }
                
                x5 = a5.x + vx;
                StdDraw.picture(a5.x,a5.y,pic);
                
                if(a5.intersects(Bullet.skot))
                {
                    alive5 = false;
                    Bullet.shot = false;
                    Bullet.readyToFire = true;
                    Bullet.skot = new Rectangle(0,0,0,0);
                    StdAudio.play("death.mid");
                    Leikur.Killcount--;
                    Leikur.Stig++;
                }
            }
            
            // geimvera 6
            if(alive6)
            {
                Rectangle a6 = new Rectangle(x6,y,17,17);
                if (Math.abs(a6.x + vx) >= 750 - width)
                {
                    vx = -vx;
                    y = y - 20;
                }
                if(Math.abs(a6.x+vx) <= 50 - width)
                {
                    vx= -vx;
                    y = y - 20;
                }
                
                x6 = a6.x + vx;
                StdDraw.picture(a6.x,a6.y,pic);
                
                if(r==14&&fire3==false)
                {
                    fire3 = true;
                    ex3 = a6.x;
                    ey3 = y;
                    StdAudio.play("gskot.mid");
                }
                
                if (fire3==true)
                {
                    Rectangle b3 = new Rectangle(ex3,ey3,20,20);
                    StdDraw.picture(ex3,ey3,"laser.png");
                    ey3 = ey3 - 2;
                    if(ey3<0)
                    {
                        fire3=false;
                        b3 = new Rectangle(0,0,0,0);
                    }
                    else if (b3.intersects(tank.t1))
                    {
                        tank.lives--;
                        b3 = new Rectangle(0,0,0,0);
                        fire3 = false;
                        StdAudio.play("tankexpo.mid");
                    }
                    else if (b3.intersects(Virki1.t1))
                    {
                        Virki1.alienHit--;
                        b3 = new Rectangle(0,0,0,0);
                        fire3 = false;
                    }
                    else if (b3.intersects(Virki2.t1))
                    {
                        Virki2.alienHit--;
                        b3 = new Rectangle(0,0,0,0);
                        fire3 = false;
                    }
                    else if (b3.intersects(Virki3.t1))
                    {
                        Virki3.alienHit--;
                        b3 = new Rectangle(0,0,0,0);
                        fire3 = false;
                    }
                }
                
                if(a6.intersects(Bullet.skot))
                {
                    alive6 = false;
                    Bullet.shot = false;
                    Bullet.readyToFire = true;
                    Bullet.skot = new Rectangle(0,0,0,0);
                    StdAudio.play("death.mid");
                    Leikur.Killcount--;
                    Leikur.Stig++;
                }
            }
            
            if(y<200)
            {
                tank.alive=false;
            }
            
        }
    }
    
}