package org.ruboto.example.quick_start;

public class QuickStartActivity extends org.ruboto.RubotoActivity {
	public void onCreate(android.os.Bundle arg0) {
    try {
      setSplash(Class.forName("org.ruboto.example.quick_start.R$layout").getField("splash").getInt(null));
    } catch (Exception e) {}

    setScriptName("quick_start_activity.rb");
    super.onCreate(arg0);
  }
}
