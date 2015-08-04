package leacock.spacegarbage;

import java.util.Random;

public class World {

    static final int WORLD_WIDTH = 10;
    static final int WORLD_HEIGHT = 13;
    static final int SCORE_INCREMENT = 10;
    static final float TICK_INITIAL = 0.5f;
    static final float TICK_DECREMENT = 0.05f;

    public Ship ship;
    public Garbage garbage;
    public boolean gameOver = false;
    public int score = 0;

    boolean fields[][] = new boolean[WORLD_WIDTH][WORLD_HEIGHT];
    Random random = new Random();
    float tickTime = 0;
    float tick = TICK_INITIAL;

    public World() {
        ship = new Ship();
        placeStain();
    }

    private void placeStain() {

        for (int x = 0; x < WORLD_WIDTH; x++) {
            for (int y = 0; y < WORLD_HEIGHT; y++) {
                fields[x][y] = false;
            }
        }
        int stainX = random.nextInt(WORLD_WIDTH);
        int stainY = random.nextInt(WORLD_HEIGHT);
        while (true) {
            if (fields[stainX][stainY] == false)
                break;
            stainX += 1;
            if (stainX >= WORLD_WIDTH) {
                stainX = 0;
                stainY += 1;
                if (stainY >= WORLD_HEIGHT) {
                    stainY = 0;
                }
            }
        }
        garbage = new Garbage(stainX, stainY, random.nextInt(3));
    }

    public void update(float deltaTime) {

        if (gameOver)
            return;
        tickTime += deltaTime;
        while (tickTime > tick) {
            tickTime -= tick;
            ship.advance();
            if (ship.checkBitten()) {
                gameOver = true;
                return;
            }

            ShipPart head = ship.parts.get(0);
            if (head.x == garbage.x && head.y == garbage.y) {
                score += SCORE_INCREMENT;
                ship.eat();
                if (ship.parts.size() == WORLD_WIDTH * WORLD_HEIGHT) {
                    gameOver = true;
                    return;
                } else {
                    placeStain();
                }
                if (score % 100 == 0 && tick - TICK_DECREMENT > 0) {
                    tick -= TICK_DECREMENT;
                }
            }
        }
    }
}
