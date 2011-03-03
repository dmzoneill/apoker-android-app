package ie.Apoker;

import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
	private ArrayList< Card > deck;

	public Deck()
	{
		this.deck = new ArrayList< Card >();

		char face = 'a';

		for ( int y = 0; y < 4; y++ )
		{
			if ( y == 0 )
				face = 's';
			if ( y == 1 )
				face = 'c';
			if ( y == 2 )
				face = 'h';
			if ( y == 3 )
				face = 'd';

			for ( int x = 1; x < 14; x++ )
			{
				if ( x < 11 )
				{
					this.deck.add( new Card( "c" + String.valueOf( x ) + String.valueOf( face ) ) );
				}
				if ( x == 11 )
				{
					this.deck.add( new Card( "cj" + String.valueOf( face ) + "2" ) );
				}
				if ( x == 12 )
				{
					this.deck.add( new Card( "cq" + String.valueOf( face ) + "2" ) );
				}
				if ( x == 13 )
				{
					this.deck.add( new Card( "ck" + String.valueOf( face ) + "2" ) );
				}
			}
		}
		
		Collections.shuffle( this.deck );
		Collections.shuffle( this.deck );
		Collections.shuffle( this.deck );
	}
	
	
	public Card getRandom()
	{
		return this.deck.remove( 0 );
	}
	
}