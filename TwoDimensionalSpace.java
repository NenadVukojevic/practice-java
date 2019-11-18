package cg.twoDimensionalSpace;

import java.util.LinkedList;
import java.util.List;

class Position
{
	int row;
	int column;
	char value;
	String wall;
	public Position(int row, int column, char value, String wall) {
		this.row = row;
		this.column = column;
		this.value = value;
		this.wall = wall;
	}
	
	
}

public class TwoDimensionalSpace {
	int rowCount;
	int columnCount;
	
	char[][] area;

	public TwoDimensionalSpace(int rowCount, int columnCount) {
		this.rowCount = rowCount;
		this.columnCount = columnCount;
		area = new char[rowCount][columnCount];
	}
	
	public void addRow(int row, String rowValues)
	{
		area[row] = rowValues.toCharArray();
	}
	
	public List<Position> getAdjacent(Position p)
	{
		List<Position> adjacent = new LinkedList<>();
		
		return adjacent;
	}
}
