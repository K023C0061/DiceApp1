public class Game {
    Player p;
    Dice d;

    Game() {
        p = new Player();
        d = new Dice();
        System.out.println(d.me);
    }

    g.start(){
        p.turn(d);
        System.out.println(d.me);
    }

    void start(){
        p.turn(d);
    }
    void judge(){

    }
}
