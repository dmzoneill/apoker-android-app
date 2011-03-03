package ie.Apoker;

import android.app.Activity;
import android.content.Context;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class Begin extends Activity
{

	private static Context context;

	@Override
	public void onCreate( Bundle savedInstanceState )
	{
		super.onCreate( savedInstanceState );
		
		Begin.context = getApplicationContext();

		this.requestWindowFeature( Window.FEATURE_NO_TITLE );
		this.getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN );

		setContentView( R.layout.main );
		
		Deck d = new Deck();
		
		ImageView flop1 = ( ImageView ) this.findViewById( R.id.flop1 );
		ImageView flop2 = ( ImageView ) this.findViewById( R.id.flop2 );
		ImageView flop3 = ( ImageView ) this.findViewById( R.id.flop3 );
		ImageView run = ( ImageView ) this.findViewById( R.id.run );
		ImageView river = ( ImageView ) this.findViewById( R.id.river );
		
		flop1.setImageDrawable( d.getRandom().getCard() );
		flop2.setImageDrawable( d.getRandom().getCard() );
		flop3.setImageDrawable( d.getRandom().getCard() );
		run.setImageDrawable( d.getRandom().getCard() );
		river.setImageDrawable( d.getRandom().getCard() );
	}


	public static Context getAppContext()
	{
		return Begin.context;
	}
}
