package com.stackrmobile.materialiconview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

/**
 * 使用するプロジェクトのassets以下に Material-Design-Iconic-Font.ttf を置いてください
 */
public class MaterialIconView extends TextView {
  private static final String TAG = "MaterialIconView";
  private static Typeface sTypeface;

  public MaterialIconView(Context context) {
    super(context);
    init();
  }

  public MaterialIconView(Context context, AttributeSet attrs) {
    super(context, attrs);
    init();
  }

  public MaterialIconView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    init();
  }

  private void init() {
    loadFont(getContext());
    setTypeface(sTypeface);
  }

  private static void loadFont(Context context) {
    if (sTypeface == null) {
      try {
        sTypeface = Typeface.createFromAsset(context.getAssets(), "Material-Design-Iconic-Font.ttf");
      } catch (Exception e) {
        Log.e(TAG, "Failed to load font: " + e.getMessage());
        sTypeface = Typeface.DEFAULT;
      }
    }
  }

}
