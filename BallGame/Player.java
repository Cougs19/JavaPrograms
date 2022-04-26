
public class Player {
	private int score; //player score
	private int tem_score;
	private int life;
	private int x;
	private int hitsnum = 0;
	private int count_red = 0;
	private int count_b = 0;
	private int count_s= 0;
	public int scoreConstant = 10;
	private boolean gameover = false;
	
	public Player()
	{
		score = 0; //initialize the score  to 0
	}
	
	public void Player_maxlife(int max_life) {life = max_life;}/*Player max life*/
	public void bonusgap(int gap) {x=gap;}/*bonus */
	public int getScore() {return score;}/*get player score*/
	public int getLife() {return life;}/*return life of the player*/
	public int getSuccessHits() {return hitsnum;}/*get success hits*/
	public boolean isGameOver() {return gameover;}/*check if the game is over*/
	public void countredball() {count_red += 1;}/*count red ball*/
	public void countbball() {count_b += 1;}
	public void countsball() {count_s += 1;}
	public int getbaseball() {return count_red;}
	public int getbounceball() {return count_b;}
	public int countshrinkball() {return count_s;}
	public String getmosthitball() 
	{
		if(count_red > count_b || count_red > count_s)
		{
			return "baseball ball";
		}
		if(count_b > count_red|| count_b > count_s)
		{
			return "bounce ball";
		}
		if(count_s > count_b || count_s > count_red)
		{
			return "shrinkball ball";
		}
		else
		{
			return "All ball have equal hit number";
		}
	
	}
	
	public void addScore(int plus)
	{
		tem_score = score;
		if(tem_score % x == 0 && tem_score > 0)
		{
			life += 1;
			tem_score = 0;
		}
		hitsnum +=1;
		score += plus;
	}
	
	public void minuslife() {
		life -=1;
		if(life < 0) 
		{
			gameIsOver();
		}
	}
	
	public void gameIsOver()
	{
		gameover = true;
	}
}