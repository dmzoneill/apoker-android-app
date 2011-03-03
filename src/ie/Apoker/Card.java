package ie.Apoker;

import android.graphics.drawable.Drawable;
import android.util.Log;

public class Card
{
	private Drawable card;

	public Card( String file )
	{
		try
		{
			int imageResource = Begin.getAppContext().getResources().getIdentifier( "drawable/" + file , null , Begin.getAppContext().getPackageName() );			
			this.card = Begin.getAppContext().getResources().getDrawable( imageResource );
		}
		catch( Exception p )
		{
			Log.e( "Card" , "exception" , p );
		}
	}

	public Drawable getCard()
	{
		return this.card;
	}		
	
}
