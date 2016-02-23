import java.awt.event.KeyEvent;

public class Leikur
{
    static public int Killcount = 24;
    static public int Stig = 0;
    static public int level = 1;
    static KeyEvent e;
    static tank tank;
    static Bullet Skot;
    static Alien rod1;
    static Alien2 rod2;
    static Alien3 rod3;
    static Alien4 rod4;
    static Virki1 wall1;
    static Virki2 wall2;
    static Virki3 wall3;
    
    public static void initialize()
    {
        tank = new tank();
        Skot = new Bullet();
        rod1 = new Alien();
        rod2 = new Alien2();
        rod3 = new Alien3();
        rod4 = new Alien4();
        wall1 = new Virki1();
        wall2 = new Virki2();
        wall3 = new Virki3();
        StdAudio.play("newgame.mid");

    }
    
    
    
    public static void Play()
    {
        StdDraw.setCanvasSize(800,600);
        StdDraw.setScale(0,800);
        while (true&&Killcount>0)
        {
            StdDraw.clear();
            screens.Welcome();
            StdDraw.setPenColor();
            StdDraw.picture(400,300,"nightsky2.jpg");
            tank.Draw();
            rod1.Draw();
            rod2.Draw();
            rod3.Draw();
            rod4.Draw();
            wall1.Draw();
            wall2.Draw();
            wall3.Draw();
            Skot.Draw();
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.text(10,790,"Stig: " + Stig*10);
            StdDraw.text(10,20,"Level: " + level);
            screens.Death();
            screens.Victory();
            if(Stig*10!=2400&&Killcount==0)
            {
                int temp = tank.lives;
                Killcount = 24;
                initialize();
                tank.lives = temp;
                level++;
            }
            if (StdDraw.isKeyPressed(e.VK_Q)==true)
            {
                System.exit(0);
            }
            StdDraw.show(5);
                

        }

    }
    
    public static void death()
    {
        if (tank.alive==false)
        {
            

        }
    }
    
    public static void main(String [] args)
    {
        Play();
        if (tank.alive==false)
        {
            StdDraw.clear();
            death();
        }
        
    }
        
}

