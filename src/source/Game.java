package source;

public class Game {
	Player player;
	
	public void startGame(Player player) {
		//loadGame���� ȣ��?
		this.player = player;
		//���� UI �ҷ��ͼ� setting
	}
    public void endGame() {
    	//���� ���� Ȯ��
    	String ending = player.checkEndingConditions();
    	//Ending �Լ� ȣ��
    };
    public void seasonChange() {
    	//TimeManager���� ȣ��?
    	//UI ����
    	//�̺�Ʈ ó��
    	//���� ���� -> ���б� ����
    };
}
