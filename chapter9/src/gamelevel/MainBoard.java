package gamelevel;
public class MainBoard {
  public static void main(String[] args){
    Player player=new Player();
    player.play(1);
    System.out.println(player.getLevel());

    AdvancedLevel aLevel=new AdvancedLevel();
    player.upgradeLevel(aLevel);
    player.play(2);
    System.out.println(player.getLevel());

    SuperLevel sLevel=new SuperLevel();
    player.upgradeLevel(sLevel);
    player.play(3);
    System.out.println(player.getLevel());
  }
}