package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class firstareadialogue extends Activity implements B4AActivity{
	public static firstareadialogue mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = true;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.firstareadialogue");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (firstareadialogue).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.firstareadialogue");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.firstareadialogue", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (firstareadialogue) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (firstareadialogue) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return firstareadialogue.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (firstareadialogue) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (firstareadialogue) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            firstareadialogue mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (firstareadialogue) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.Timer _timer1 = null;
public static String _displaytext1 = "";
public static String _displaytext2 = "";
public static String _displaytext3 = "";
public static String _displaytext4 = "";
public static String _displaytext5 = "";
public static String _displaytext6 = "";
public static String _displaytext7_1 = "";
public static String _displaytext7_2 = "";
public static int _currentindex = 0;
public anywheresoftware.b4a.objects.LabelWrapper _currentlabel = null;
public static String _currentdisplaytext = "";
public static int _currentdialogue = 0;
public anywheresoftware.b4a.objects.LabelWrapper _lbldialogue1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldialogue2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldialogue3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldialogue4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldialogue5 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldialogue6 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblplayername1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblplayername2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnldialogue1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnldialogue2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnldialogue3 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnldialogue4 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnldialogue5 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnldialogue6 = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.title _title = null;
public b4a.example.vlprompt _vlprompt = null;
public b4a.example.story _story = null;
public b4a.example.choosechar _choosechar = null;
public b4a.example.firstarea _firstarea = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="firstareadialogue";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Activity.LoadLayout(\"firstAreaDialogueLayout\")";
mostCurrent._activity.LoadLayout("firstAreaDialogueLayout",mostCurrent.activityBA);
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="lblPlayerName1.Text = chooseChar.characterName";
mostCurrent._lblplayername1.setText(BA.ObjectToCharSequence(mostCurrent._choosechar._charactername /*String*/ ));
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="lblPlayerName2.Text = chooseChar.characterName";
mostCurrent._lblplayername2.setText(BA.ObjectToCharSequence(mostCurrent._choosechar._charactername /*String*/ ));
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="Timer1.Initialize(\"Timer1\", 70)";
_timer1.Initialize(processBA,"Timer1",(long) (70));
RDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="displayText1 = \"Halt, traveler. You have entered";
mostCurrent._displaytext1 = "Halt, traveler. You have entered the Whispering Woods, a place of ancient magic and illusions. State your purpose.";
RDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="displayText2 = \"I seek to navigate these woods an";
mostCurrent._displaytext2 = "I seek to navigate these woods and uncover the secrets they hold. My quest is to destroy the Echo Stone and save the realm of Elysium.";
RDebugUtils.currentLine=3145738;
 //BA.debugLineNum = 3145738;BA.debugLine="displayText3 = \"The Echo Stone... a relic of grea";
mostCurrent._displaytext3 = "The Echo Stone... a relic of great power and great peril. Many have sought it, and many have been lost to its allure. But you... you wish to destroy it? Why should I believe you are any different from those who came before?";
RDebugUtils.currentLine=3145739;
 //BA.debugLineNum = 3145739;BA.debugLine="displayText4 = \"I have seen the suffering the Ech";
mostCurrent._displaytext4 = "I have seen the suffering the Echo Stone has caused. It must be destroyed to bring peace to Elysium.";
RDebugUtils.currentLine=3145740;
 //BA.debugLineNum = 3145740;BA.debugLine="displayText5 = \"Words are easily spoken, but acti";
mostCurrent._displaytext5 = "Words are easily spoken, but actions reveal the truth. The Whispering Woods tests not only the mind but the heart. To proceed, you must solve one of our ancient puzzles. Choose wisely, for the path you take will determine your fate.";
RDebugUtils.currentLine=3145741;
 //BA.debugLineNum = 3145741;BA.debugLine="displayText6 = \"You face two paths. The first pat";
mostCurrent._displaytext6 = "You face two paths. The first path challenges your wit with the Riddles of the Ancient, testing your ability to think and reason. The second path challenges your perception with the Cryptic Glyphs, testing your ability to see beyond the surface. Succeed, and you shall receive the Key of Insight, which unlocks the way to the Enigma of the Celestial Temple. Fail, and you shall be forever lost in these woods.";
RDebugUtils.currentLine=3145742;
 //BA.debugLineNum = 3145742;BA.debugLine="displayText7_1 = \"Very well. Prepare yourself for";
mostCurrent._displaytext7_1 = "Very well. Prepare yourself for the Riddles of the Ancient. Answer correctly, and you may continue your journey. Fail, and you shall be lost in the illusions of this.";
RDebugUtils.currentLine=3145743;
 //BA.debugLineNum = 3145743;BA.debugLine="displayText7_2 = \"As you wish. The Cryptic Glyphs";
mostCurrent._displaytext7_2 = "As you wish. The Cryptic Glyphs await you. Decipher their hidden messages, and the path shall be revealed. Fail, and you shall wander in darkness, never finding your way.";
RDebugUtils.currentLine=3145746;
 //BA.debugLineNum = 3145746;BA.debugLine="currentIndex = 0";
_currentindex = (int) (0);
RDebugUtils.currentLine=3145747;
 //BA.debugLineNum = 3145747;BA.debugLine="currentLabel = lblDialogue1";
mostCurrent._currentlabel = mostCurrent._lbldialogue1;
RDebugUtils.currentLine=3145748;
 //BA.debugLineNum = 3145748;BA.debugLine="currentDisplayText = displayText1";
mostCurrent._currentdisplaytext = mostCurrent._displaytext1;
RDebugUtils.currentLine=3145749;
 //BA.debugLineNum = 3145749;BA.debugLine="currentDialogue = 0";
_currentdialogue = (int) (0);
RDebugUtils.currentLine=3145751;
 //BA.debugLineNum = 3145751;BA.debugLine="pnlDialogue2.Visible = False";
mostCurrent._pnldialogue2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3145752;
 //BA.debugLineNum = 3145752;BA.debugLine="pnlDialogue3.Visible = False";
mostCurrent._pnldialogue3.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3145753;
 //BA.debugLineNum = 3145753;BA.debugLine="pnlDialogue4.Visible = False";
mostCurrent._pnldialogue4.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3145754;
 //BA.debugLineNum = 3145754;BA.debugLine="pnlDialogue5.Visible = False";
mostCurrent._pnldialogue5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3145755;
 //BA.debugLineNum = 3145755;BA.debugLine="pnlDialogue6.Visible = False";
mostCurrent._pnldialogue6.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3145759;
 //BA.debugLineNum = 3145759;BA.debugLine="Timer1.Enabled = True";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3145762;
 //BA.debugLineNum = 3145762;BA.debugLine="lblDialogue1.Text = \"\"";
mostCurrent._lbldialogue1.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=3145763;
 //BA.debugLineNum = 3145763;BA.debugLine="lblDialogue2.Text = \"\"";
mostCurrent._lbldialogue2.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=3145764;
 //BA.debugLineNum = 3145764;BA.debugLine="lblDialogue3.Text = \"\"";
mostCurrent._lbldialogue3.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=3145765;
 //BA.debugLineNum = 3145765;BA.debugLine="lblDialogue4.Text = \"\"";
mostCurrent._lbldialogue4.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=3145766;
 //BA.debugLineNum = 3145766;BA.debugLine="lblDialogue5.Text = \"\"";
mostCurrent._lbldialogue5.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=3145767;
 //BA.debugLineNum = 3145767;BA.debugLine="lblDialogue6.Text = \"\"";
mostCurrent._lbldialogue6.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=3145769;
 //BA.debugLineNum = 3145769;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="firstareadialogue";
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="firstareadialogue";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_touch(int _action,float _x,float _y) throws Exception{
RDebugUtils.currentModule="firstareadialogue";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_touch", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Sub Activity_Touch (Action As Int, X As Float, Y A";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="If Action = Activity.ACTION_DOWN Then";
if (_action==mostCurrent._activity.ACTION_DOWN) { 
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="If Timer1.Enabled Then";
if (_timer1.getEnabled()) { 
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="currentLabel.Text = currentDisplayText";
mostCurrent._currentlabel.setText(BA.ObjectToCharSequence(mostCurrent._currentdisplaytext));
RDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="Timer1.Enabled = False";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=3407879;
 //BA.debugLineNum = 3407879;BA.debugLine="Select Case currentDialogue";
switch (_currentdialogue) {
case 0: {
RDebugUtils.currentLine=3407881;
 //BA.debugLineNum = 3407881;BA.debugLine="currentLabel = lblDialogue2";
mostCurrent._currentlabel = mostCurrent._lbldialogue2;
RDebugUtils.currentLine=3407882;
 //BA.debugLineNum = 3407882;BA.debugLine="currentDisplayText = displayText2";
mostCurrent._currentdisplaytext = mostCurrent._displaytext2;
RDebugUtils.currentLine=3407883;
 //BA.debugLineNum = 3407883;BA.debugLine="currentDialogue = currentDialogue + 1";
_currentdialogue = (int) (_currentdialogue+1);
RDebugUtils.currentLine=3407884;
 //BA.debugLineNum = 3407884;BA.debugLine="pnlDialogue1.Visible = False";
mostCurrent._pnldialogue1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3407885;
 //BA.debugLineNum = 3407885;BA.debugLine="pnlDialogue2.Visible = True";
mostCurrent._pnldialogue2.setVisible(anywheresoftware.b4a.keywords.Common.True);
 break; }
case 1: {
RDebugUtils.currentLine=3407887;
 //BA.debugLineNum = 3407887;BA.debugLine="currentLabel = lblDialogue3";
mostCurrent._currentlabel = mostCurrent._lbldialogue3;
RDebugUtils.currentLine=3407888;
 //BA.debugLineNum = 3407888;BA.debugLine="currentDisplayText = displayText3";
mostCurrent._currentdisplaytext = mostCurrent._displaytext3;
RDebugUtils.currentLine=3407889;
 //BA.debugLineNum = 3407889;BA.debugLine="currentDialogue = currentDialogue + 1";
_currentdialogue = (int) (_currentdialogue+1);
RDebugUtils.currentLine=3407890;
 //BA.debugLineNum = 3407890;BA.debugLine="pnlDialogue2.Visible = False";
mostCurrent._pnldialogue2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3407891;
 //BA.debugLineNum = 3407891;BA.debugLine="pnlDialogue3.Visible = True";
mostCurrent._pnldialogue3.setVisible(anywheresoftware.b4a.keywords.Common.True);
 break; }
case 2: {
RDebugUtils.currentLine=3407893;
 //BA.debugLineNum = 3407893;BA.debugLine="currentLabel = lblDialogue4";
mostCurrent._currentlabel = mostCurrent._lbldialogue4;
RDebugUtils.currentLine=3407894;
 //BA.debugLineNum = 3407894;BA.debugLine="currentDisplayText = displayText4";
mostCurrent._currentdisplaytext = mostCurrent._displaytext4;
RDebugUtils.currentLine=3407895;
 //BA.debugLineNum = 3407895;BA.debugLine="currentDialogue = currentDialogue + 1";
_currentdialogue = (int) (_currentdialogue+1);
RDebugUtils.currentLine=3407896;
 //BA.debugLineNum = 3407896;BA.debugLine="pnlDialogue3.Visible = False";
mostCurrent._pnldialogue3.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3407897;
 //BA.debugLineNum = 3407897;BA.debugLine="pnlDialogue4.Visible = True";
mostCurrent._pnldialogue4.setVisible(anywheresoftware.b4a.keywords.Common.True);
 break; }
case 3: {
RDebugUtils.currentLine=3407899;
 //BA.debugLineNum = 3407899;BA.debugLine="currentLabel = lblDialogue5";
mostCurrent._currentlabel = mostCurrent._lbldialogue5;
RDebugUtils.currentLine=3407900;
 //BA.debugLineNum = 3407900;BA.debugLine="currentDisplayText = displayText5";
mostCurrent._currentdisplaytext = mostCurrent._displaytext5;
RDebugUtils.currentLine=3407901;
 //BA.debugLineNum = 3407901;BA.debugLine="currentDialogue = currentDialogue + 1";
_currentdialogue = (int) (_currentdialogue+1);
RDebugUtils.currentLine=3407902;
 //BA.debugLineNum = 3407902;BA.debugLine="pnlDialogue4.Visible = False";
mostCurrent._pnldialogue4.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3407903;
 //BA.debugLineNum = 3407903;BA.debugLine="pnlDialogue5.Visible = True";
mostCurrent._pnldialogue5.setVisible(anywheresoftware.b4a.keywords.Common.True);
 break; }
case 4: {
RDebugUtils.currentLine=3407905;
 //BA.debugLineNum = 3407905;BA.debugLine="currentLabel = lblDialogue6";
mostCurrent._currentlabel = mostCurrent._lbldialogue6;
RDebugUtils.currentLine=3407906;
 //BA.debugLineNum = 3407906;BA.debugLine="currentDisplayText = displayText6";
mostCurrent._currentdisplaytext = mostCurrent._displaytext6;
RDebugUtils.currentLine=3407907;
 //BA.debugLineNum = 3407907;BA.debugLine="currentDialogue = currentDialogue + 1";
_currentdialogue = (int) (_currentdialogue+1);
RDebugUtils.currentLine=3407908;
 //BA.debugLineNum = 3407908;BA.debugLine="pnlDialogue5.Visible = False";
mostCurrent._pnldialogue5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3407909;
 //BA.debugLineNum = 3407909;BA.debugLine="pnlDialogue6.Visible = True";
mostCurrent._pnldialogue6.setVisible(anywheresoftware.b4a.keywords.Common.True);
 break; }
case 5: {
RDebugUtils.currentLine=3407911;
 //BA.debugLineNum = 3407911;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 break; }
}
;
RDebugUtils.currentLine=3407914;
 //BA.debugLineNum = 3407914;BA.debugLine="currentIndex = 0";
_currentindex = (int) (0);
RDebugUtils.currentLine=3407915;
 //BA.debugLineNum = 3407915;BA.debugLine="currentLabel.Text = \"\"";
mostCurrent._currentlabel.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=3407916;
 //BA.debugLineNum = 3407916;BA.debugLine="Timer1.Enabled = True";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
 };
RDebugUtils.currentLine=3407919;
 //BA.debugLineNum = 3407919;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=3407920;
 //BA.debugLineNum = 3407920;BA.debugLine="End Sub";
return false;
}
public static String  _timer1_tick() throws Exception{
RDebugUtils.currentModule="firstareadialogue";
if (Debug.shouldDelegate(mostCurrent.activityBA, "timer1_tick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "timer1_tick", null));}
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub Timer1_Tick";
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="If currentIndex < currentDisplayText.Length Then";
if (_currentindex<mostCurrent._currentdisplaytext.length()) { 
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="currentLabel.Text = currentLabel.Text & currentD";
mostCurrent._currentlabel.setText(BA.ObjectToCharSequence(mostCurrent._currentlabel.getText()+BA.ObjectToString(mostCurrent._currentdisplaytext.charAt(_currentindex))));
RDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="currentIndex = currentIndex + 1";
_currentindex = (int) (_currentindex+1);
 }else {
RDebugUtils.currentLine=3342345;
 //BA.debugLineNum = 3342345;BA.debugLine="Timer1.Enabled = False";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=3342347;
 //BA.debugLineNum = 3342347;BA.debugLine="End Sub";
return "";
}
}