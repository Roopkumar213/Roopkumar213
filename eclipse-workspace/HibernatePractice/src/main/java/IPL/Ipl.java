package IPL;

import javax.persistence.*;

@Entity
public class Ipl {
	@Id
	private int no;
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	private String TeamName;
	
	private int wins;
	
	private int losses;

		public String getTeamName() {
		return TeamName;
	}

	public void setTeamName(String teamName) {
		TeamName = teamName;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}
    @Override
    public String toString() {
        return "Ipl [No=" + no +
               ", TeamName=" + TeamName +
               ", Wins=" + wins +
               ", Losses=" + losses + "]";
    }
}


