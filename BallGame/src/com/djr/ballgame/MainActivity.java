package com.djr.ballgame;

import com.unity3d.player.UnityPlayer;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public class MainActivity extends Activity {

	private UnityPlayer m_UnityPlayer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// you need to declare m_UnityPlayer as variable of type UnityPlayer obviously... 
		// also include any missing references by pressing shift+ctrl+o (or cmd+shift+o for Mac)
		 m_UnityPlayer = new UnityPlayer(this);
		 int glesMode = m_UnityPlayer.getSettings().getInt("gles_mode", 1);
		 m_UnityPlayer.init(glesMode, false);
		 FrameLayout layout = (FrameLayout) findViewById(R.id.Unity);
		 LayoutParams lp = new LayoutParams(LayoutParams.MATCH_PARENT,
		 LayoutParams.MATCH_PARENT);
		 layout.addView(m_UnityPlayer.getView(), 0, lp);
	}
}
