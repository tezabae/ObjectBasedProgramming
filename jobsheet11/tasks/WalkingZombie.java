package jobsheet11.tasks;

public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        if (level == 1) {
            health += (int) (0.10 * health); // 10%
        } else if (level == 2) {
            health += (int) (0.30 * health); // 30%
        } else if (level == 3) {
            health += (int) (0.40 * health); // 40%
        }
    }

    @Override
    public void destroyed() {
        health -= (int) (0.02 * health); // berkurang 2%
    }

    @Override
    public String getZombieInfo() {
        String info = "Walking Zombie Data =\n";
        info += super.getZombieInfo() + "\n";
        return info;
    }
}