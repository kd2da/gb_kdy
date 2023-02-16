package omok;

public class Panjung {
	
	private String pan[][];
	private int rowInt;
	private int colInt;
	
	
	public Panjung() {
		super();
	}
	
	public String[][] getPan() {
		return pan;
	}


	public void setPan(String[][] pan) {
		this.pan = pan;
	}


	public int getRowInt() {
		return rowInt;
	}


	public void setRowInt(int rowInt) {
		this.rowInt = rowInt;
	}


	public int getColInt() {
		return colInt;
	}


	public void setColInt(int colInt) {
		this.colInt = colInt;
	}


	public int leftCheck() {
		// 열 이동
		int cnt = 0;
		int col = colInt-1;
		while(true) {
			if(col < 1) break;
			if(pan[rowInt][col] == null) {
				break;
			} else if (pan[rowInt][col].equals(pan[rowInt][colInt])) {
				col--;
				cnt++;
			} else {
				break;
			}
		}
		return cnt;
	}
	// 1 <= col <= 15 , 0 <= row <= 14
	public int rightCheck() {
		int cnt = 0;
		int col = colInt+1;
		while(true) {
			if(col >= pan[0].length) break;
			if(pan[rowInt][col] == null) {
				break;
			} else if (pan[rowInt][col].equals(pan[rowInt][colInt])) {
				col++;
				cnt++;
			} else {
				break;
			}
		}
		return cnt;
	}
	
	public int upCheck() {
		int cnt = 0;
		int row = rowInt-1;
		while(true) {
			if(row < 0) break;
			if(pan[row][colInt] == null) {
				break;
			} else if (pan[row][colInt].equals(pan[rowInt][colInt])) {
				row--;
				cnt++;
			} else {
				break;
			}
		}
		return cnt;
	}
	public int downCheck() {
		int cnt = 0;
		int row = rowInt+1;
		while(true) {
			if(row >= pan.length - 1) break;
			if(pan[row][colInt] == null) {
				break;
			} else if (pan[row][colInt].equals(pan[rowInt][colInt])) {
				row++;
				cnt++;
			} else {
				break;
			}
		}
		return cnt;
	}
	
	public int lUpCheck() {
		int cnt = 0;
		int row = rowInt-1;
		int col = colInt-1;
		while(true) {
			if(row < 0 || col < 1) break;
			if(pan[row][col] == null) {
				break;
			} else if (pan[row][col].equals(pan[rowInt][colInt])) {
				row--;
				col--;
				cnt++;
			} else {
				break;
			}
		}
		return cnt;
	}
	public int rDownCheck() {
		int cnt = 0;
		int row = rowInt+1;
		int col = colInt+1;
		while(true) {
			if(row >= pan.length - 1 || col >= pan[0].length) break;
			if(pan[row][col] == null) {
				break;
			} else if (pan[row][col].equals(pan[rowInt][colInt])) {
				row++;
				col++;
				cnt++;
			} else {
				break;
			}
		}
		return cnt;
	}
	
	public int rUpCheck() {
		int cnt = 0;
		int row = rowInt-1;
		int col = colInt+1;
		while(true) {
			if(row < 0 || col >= pan[0].length) break;
			if(pan[row][col] == null) {
				break;
			} else if (pan[row][col].equals(pan[rowInt][colInt])) {
				row--;
				col++;
				cnt++;
			} else {
				break;
			}
		}
		return cnt;
	}
	public int lDownCheck() {
		int cnt = 0;
		int row = rowInt+1;
		int col = colInt-1;
		while(true) {
			if(row >= pan.length - 1 || col < 1) break;
			if(pan[row][col] == null) {
				break;
			} else if (pan[row][col].equals(pan[rowInt][colInt])) {
				row++;
				col--;
				cnt++;
			} else {
				break;
			}
		}
		return cnt;
	}
	
	public boolean allCheck() {
		
		if(this.leftCheck() + this.rightCheck() == 4) {
			return true;
		} else if(this.upCheck() + this .downCheck() == 4) {
			return true;
		} else if(this.lDownCheck() + this.rUpCheck() == 4) {
			return true;
		} else if(this.rDownCheck() + this.lUpCheck() == 4) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	
}
