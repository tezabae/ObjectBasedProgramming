package jobsheet11.tasks;

public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        if (level == 1) {
            health += (int) (0.30 * health); // 30%
        } else if (level == 2) {
            health += (int) (0.40 * health); // 40%
        } else if (level == 3) {
            health += (int) (0.50 * health); // 50%
        }
    }

    @Override
    public void destroyed() {
        health -= (int) (0.01 * health); // berkurang 1%
    }

    @Override
    public String getZombieInfo() {
        String info = "Jumping Zombie Data =\n";
        info += super.getZombieInfo() + "\n";
        return info;
    }
}
