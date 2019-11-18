package cg.twoDimensionalSpace;

import java.util.LinkedList;
import java.util.List;

class Position
{
	int row;
	int column;
	char value;
	public Position(int row, int column, char value) {
		this.row = row;
		this.column = column;
		this.value = value;
	}
	
	
}

public class TwoDimensionalSpace {
	int rowCount;
	int columnCount;
	String wall;
	
	char[][] area;

	public TwoDimensionalSpace(int rowCount, int columnCount, String wall) {
		this.rowCount = rowCount;
		this.columnCount = columnCount;
		this.wall = wall;
		area = new char[rowCount][columnCount];
	}
	
	public void addRow(int row, String rowValues)
	{
		area[row] = rowValues.toCharArray();
	}
	
	public List<Position> getAdjacent(Position p)
	{
		List<Position> adjacent = new LinkedList<>();
		int row = p.row;
		int column = p.column-1;
				
		if(row>=0 && row < rowCount && column >=0 && column < columnCount)
		{
			if(!wall.contains(""+area[row][column] ))
			{
				Position n = new Position(row, column, area[row][column]);
				adjacent.add(n);
			}
		}

		column = p.column+1;
		
		if(row>=0 && row < rowCount && column >=0 && column < columnCount)
		{
			if(!wall.contains(""+area[row][column] ))
			{
				Position n = new Position(row, column, area[row][column]);
				adjacent.add(n);
			}
		}
		
		column = p.column;
		row = p.row -1;
		
		if(row>=0 && row < rowCount && column >=0 && column < columnCount)
		{
			if(!wall.contains(""+area[row][column] ))
			{
				Position n = new Position(row, column, area[row][column]);
				adjacent.add(n);
			}
		}

		column = p.column;
		row = p.row +1;
		
		if(row>=0 && row < rowCount && column >=0 && column < columnCount)
		{
			if(!wall.contains(""+area[row][column] ))
			{
				Position n = new Position(row, column, area[row][column]);
				adjacent.add(n);
			}
		}
		
		return adjacent;
	}
}
