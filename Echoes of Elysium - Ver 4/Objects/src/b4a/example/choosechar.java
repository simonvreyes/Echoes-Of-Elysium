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

public class choosechar extends Activity implements B4AActivity{
	public static choosechar mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.choosechar");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (choosechar).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.choosechar");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.choosechar", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (choosechar) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (choosechar) Resume **");
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
		return choosechar.class;
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
            BA.LogInfo("** Activity (choosechar) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (choosechar) Pause event (activity is not paused). **");
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
            choosechar mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (choosechar) Resume **");
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
public static String _charactername = "";
public static int _hstat = 0;
public static int _istat = 0;
public static int _pstat = 0;
public anywheresoftware.b4a.objects.ButtonWrapper _btnnext = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnprev = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _ivarcher = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _ivmage = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _ivknight = null;
public anywheresoftware.b4a.objects.TabHostWrapper _thknight = null;
public anywheresoftware.b4a.objects.TabHostWrapper _thmage = null;
public anywheresoftware.b4a.objects.TabHostWrapper _tharcher = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlarcher = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlmage = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlknight = null;
public static int _intpanel = 0;
public anywheresoftware.b4a.agraham.dialogs.InputDialog _strdlg = null;
public static String _selectedchar = "";
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.title _title = null;
public b4a.example.vlprompt _vlprompt = null;
public b4a.example.story _story = null;
public b4a.example.firstarea _firstarea = null;
public b4a.example.firstareadialogue _firstareadialogue = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="choosechar";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Activity.LoadLayout(\"chooseCharLayout\")";
mostCurrent._activity.LoadLayout("chooseCharLayout",mostCurrent.activityBA);
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="thKnight.AddTab(\"Background\", \"knightBGLayout.bal";
mostCurrent._thknight.AddTab(mostCurrent.activityBA,"Background","knightBGLayout.bal");
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="thKnight.AddTab(\"Stats\", \"knightStatsLayout.bal\")";
mostCurrent._thknight.AddTab(mostCurrent.activityBA,"Stats","knightStatsLayout.bal");
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="thMage.AddTab(\"Background\", \"mageBGLayout.bal\")";
mostCurrent._thmage.AddTab(mostCurrent.activityBA,"Background","mageBGLayout.bal");
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="thMage.AddTab(\"Stats\", \"mageStatsLayout.bal\")";
mostCurrent._thmage.AddTab(mostCurrent.activityBA,"Stats","mageStatsLayout.bal");
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="thArcher.AddTab(\"Background\", \"archerBGLayout.bal";
mostCurrent._tharcher.AddTab(mostCurrent.activityBA,"Background","archerBGLayout.bal");
RDebugUtils.currentLine=2097161;
 //BA.debugLineNum = 2097161;BA.debugLine="thArcher.AddTab(\"Stats\", \"archerStatsLayout.bal\")";
mostCurrent._tharcher.AddTab(mostCurrent.activityBA,"Stats","archerStatsLayout.bal");
RDebugUtils.currentLine=2097163;
 //BA.debugLineNum = 2097163;BA.debugLine="pnlMage.Visible = False";
mostCurrent._pnlmage.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2097164;
 //BA.debugLineNum = 2097164;BA.debugLine="pnlArcher.Visible = False";
mostCurrent._pnlarcher.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2097165;
 //BA.debugLineNum = 2097165;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="choosechar";
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="choosechar";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="End Sub";
return "";
}
public static String  _btnnext_click() throws Exception{
RDebugUtils.currentModule="choosechar";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnnext_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnnext_click", null));}
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Private Sub btnNext_Click";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Select Case intPanel";
switch (_intpanel) {
case 0: {
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="pnlKnight.SetLayoutAnimated(375,-100%x,pnlKnigh";
mostCurrent._pnlknight.SetLayoutAnimated((int) (375),(int) (-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)),mostCurrent._pnlknight.getTop(),mostCurrent._pnlknight.getWidth(),mostCurrent._pnlknight.getHeight());
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="pnlMage.SetLayoutAnimated(375,0,pnlMage.Top,pnl";
mostCurrent._pnlmage.SetLayoutAnimated((int) (375),(int) (0),mostCurrent._pnlmage.getTop(),mostCurrent._pnlmage.getWidth(),mostCurrent._pnlmage.getHeight());
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="intPanel = intPanel + 1";
_intpanel = (int) (_intpanel+1);
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="selectedChar = \"Mage\"";
mostCurrent._selectedchar = "Mage";
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="pnlKnight.Visible = False";
mostCurrent._pnlknight.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="pnlMage.Visible = True";
mostCurrent._pnlmage.setVisible(anywheresoftware.b4a.keywords.Common.True);
 break; }
case 1: {
RDebugUtils.currentLine=2555914;
 //BA.debugLineNum = 2555914;BA.debugLine="pnlMage.SetLayoutAnimated(375,-100%x,pnlMage.To";
mostCurrent._pnlmage.SetLayoutAnimated((int) (375),(int) (-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)),mostCurrent._pnlmage.getTop(),mostCurrent._pnlmage.getWidth(),mostCurrent._pnlmage.getHeight());
RDebugUtils.currentLine=2555915;
 //BA.debugLineNum = 2555915;BA.debugLine="pnlArcher.SetLayoutAnimated(375,0,pnlArcher.Top";
mostCurrent._pnlarcher.SetLayoutAnimated((int) (375),(int) (0),mostCurrent._pnlarcher.getTop(),mostCurrent._pnlarcher.getWidth(),mostCurrent._pnlarcher.getHeight());
RDebugUtils.currentLine=2555916;
 //BA.debugLineNum = 2555916;BA.debugLine="intPanel = intPanel + 1";
_intpanel = (int) (_intpanel+1);
RDebugUtils.currentLine=2555917;
 //BA.debugLineNum = 2555917;BA.debugLine="selectedChar = \"Archer\"";
mostCurrent._selectedchar = "Archer";
RDebugUtils.currentLine=2555918;
 //BA.debugLineNum = 2555918;BA.debugLine="pnlMage.Visible = False";
mostCurrent._pnlmage.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2555919;
 //BA.debugLineNum = 2555919;BA.debugLine="pnlArcher.Visible = True";
mostCurrent._pnlarcher.setVisible(anywheresoftware.b4a.keywords.Common.True);
 break; }
case 2: {
RDebugUtils.currentLine=2555921;
 //BA.debugLineNum = 2555921;BA.debugLine="ToastMessageShow(\"No more characters\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No more characters"),anywheresoftware.b4a.keywords.Common.False);
 break; }
}
;
RDebugUtils.currentLine=2555923;
 //BA.debugLineNum = 2555923;BA.debugLine="End Sub";
return "";
}
public static String  _btnprev_click() throws Exception{
RDebugUtils.currentModule="choosechar";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnprev_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnprev_click", null));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Private Sub btnPrev_Click";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Select Case intPanel";
switch (_intpanel) {
case 0: {
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="ToastMessageShow(\"No more characters\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No more characters"),anywheresoftware.b4a.keywords.Common.False);
 break; }
case 1: {
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="pnlMage.SetLayoutAnimated(375,100%x,pnlMage.Top";
mostCurrent._pnlmage.SetLayoutAnimated((int) (375),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),mostCurrent._pnlmage.getTop(),mostCurrent._pnlmage.getWidth(),mostCurrent._pnlmage.getHeight());
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="pnlKnight.SetLayoutAnimated(375,0,pnlKnight.Top";
mostCurrent._pnlknight.SetLayoutAnimated((int) (375),(int) (0),mostCurrent._pnlknight.getTop(),mostCurrent._pnlknight.getWidth(),mostCurrent._pnlknight.getHeight());
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="intPanel = intPanel - 1";
_intpanel = (int) (_intpanel-1);
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="selectedChar = \"Knight\"";
mostCurrent._selectedchar = "Knight";
RDebugUtils.currentLine=2490377;
 //BA.debugLineNum = 2490377;BA.debugLine="pnlKnight.Visible = True";
mostCurrent._pnlknight.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2490378;
 //BA.debugLineNum = 2490378;BA.debugLine="pnlMage.Visible = False";
mostCurrent._pnlmage.setVisible(anywheresoftware.b4a.keywords.Common.False);
 break; }
case 2: {
RDebugUtils.currentLine=2490381;
 //BA.debugLineNum = 2490381;BA.debugLine="pnlArcher.SetLayoutAnimated(375,100%x,pnlArcher";
mostCurrent._pnlarcher.SetLayoutAnimated((int) (375),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),mostCurrent._pnlarcher.getTop(),mostCurrent._pnlarcher.getWidth(),mostCurrent._pnlarcher.getHeight());
RDebugUtils.currentLine=2490382;
 //BA.debugLineNum = 2490382;BA.debugLine="pnlMage.SetLayoutAnimated(375,0,pnlMage.Top,pnl";
mostCurrent._pnlmage.SetLayoutAnimated((int) (375),(int) (0),mostCurrent._pnlmage.getTop(),mostCurrent._pnlmage.getWidth(),mostCurrent._pnlmage.getHeight());
RDebugUtils.currentLine=2490383;
 //BA.debugLineNum = 2490383;BA.debugLine="intPanel = intPanel - 1";
_intpanel = (int) (_intpanel-1);
RDebugUtils.currentLine=2490384;
 //BA.debugLineNum = 2490384;BA.debugLine="selectedChar = \"Mage\"";
mostCurrent._selectedchar = "Mage";
RDebugUtils.currentLine=2490385;
 //BA.debugLineNum = 2490385;BA.debugLine="pnlMage.Visible = True";
mostCurrent._pnlmage.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2490386;
 //BA.debugLineNum = 2490386;BA.debugLine="pnlArcher.Visible = False";
mostCurrent._pnlarcher.setVisible(anywheresoftware.b4a.keywords.Common.False);
 break; }
}
;
RDebugUtils.currentLine=2490388;
 //BA.debugLineNum = 2490388;BA.debugLine="End Sub";
return "";
}
public static String  _entername() throws Exception{
RDebugUtils.currentModule="choosechar";
if (Debug.shouldDelegate(mostCurrent.activityBA, "entername", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "entername", null));}
String _ans = "";
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub enterName";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Dim ans As String";
_ans = "";
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="strDLG.InputType = strDLG.INPUT_TYPE_TEXT";
mostCurrent._strdlg.setInputType(mostCurrent._strdlg.INPUT_TYPE_TEXT);
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="ans = strDLG.Show(\"Enter Your Name\",selectedChar,";
_ans = BA.NumberToString(mostCurrent._strdlg.Show("Enter Your Name",mostCurrent._selectedchar,"Confirm","Cancel","",mostCurrent.activityBA,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="If ans = DialogResponse.POSITIVE Then";
if ((_ans).equals(BA.NumberToString(anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE))) { 
RDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="characterName = strDLG.Input";
_charactername = mostCurrent._strdlg.getInput();
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="StartActivity(FirstArea)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._firstarea.getObject()));
 };
RDebugUtils.currentLine=2621450;
 //BA.debugLineNum = 2621450;BA.debugLine="End Sub";
return "";
}
public static String  _ivarcher_click() throws Exception{
RDebugUtils.currentModule="choosechar";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ivarcher_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "ivarcher_click", null));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Private Sub ivArcher_Click";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="hStat = 3";
_hstat = (int) (3);
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="iStat = 3";
_istat = (int) (3);
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="pStat = 5";
_pstat = (int) (5);
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="enterName";
_entername();
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="End Sub";
return "";
}
public static String  _ivknight_click() throws Exception{
RDebugUtils.currentModule="choosechar";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ivknight_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "ivknight_click", null));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Private Sub ivKnight_Click";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="hStat = 5";
_hstat = (int) (5);
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="iStat = 3";
_istat = (int) (3);
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="pStat = 3";
_pstat = (int) (3);
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="enterName";
_entername();
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="End Sub";
return "";
}
public static String  _ivmage_click() throws Exception{
RDebugUtils.currentModule="choosechar";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ivmage_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "ivmage_click", null));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Private Sub ivMage_Click";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="hStat = 3";
_hstat = (int) (3);
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="iStat = 5";
_istat = (int) (5);
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="pStat = 3";
_pstat = (int) (3);
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="enterName";
_entername();
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="End Sub";
return "";
}
}