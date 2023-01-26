package state;

public class RunState extends State {
    public RunState(Player player) {
        super(player);
    }

    @Override
    public void standUp() {
        player.setSpeed(0);
        player.talk("뛰다가 갑자기 서면 무릎 연골이 나가요...");
        player.setState(new StandUpState(player));
    }

    @Override
    public void sitDown() {
        player.setSpeed(0);
        player.talk("뛰다가 앉으면 넘어질 수 있어요...");
        player.setState(new SitDownState(player));
    }

    @Override
    public void walk() {
        player.talk("속도를 줄일게요~");
        player.setSpeed(8);
        player.setState(new WalkState(player));
    }

    @Override
    public void run() {
        player.talk("더 빨리 뛰라는 건가?");
        player.setSpeed(player.getSpeed() + 10);
    }

    @Override
    public String getDescription() {
        return "뛰는 중";
    }
}
