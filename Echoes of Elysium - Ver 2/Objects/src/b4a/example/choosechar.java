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
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.choosechar");
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

public anywheresoftware.b4a.keywords.Common __c = null;
public static String _charactername = "";
public anywheresoftware.b4a.objects.ButtonWrapper _btnnext = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnprev = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgarcher = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgmage = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgsm = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlarcher = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlmage = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlsm = null;
public static int _intpanel = 0;
public anywheresoftware.b4a.agraham.dialogs.InputDialog _strdlg = null;
public static String _selectedchar = "";
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.vlprompt _vlprompt = null;
public b4a.example.story _story = null;
public b4a.example.firstarea _firstarea = null;

public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public static String  _activity_create(boolean _firsttime) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 25;BA.debugLine="Activity.LoadLayout(\"chooseCharLayout\")";
mostCurrent._activity.LoadLayout("chooseCharLayout",mostCurrent.activityBA);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public static String  _btnnext_click() throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Private Sub btnNext_Click";
 //BA.debugLineNum = 68;BA.debugLine="Select Case intPanel";
switch (_intpanel) {
case 0: {
 //BA.debugLineNum = 70;BA.debugLine="pnlSM.SetLayoutAnimated(375,-100%x,pnlSM.Top,pn";
mostCurrent._pnlsm.SetLayoutAnimated((int) (375),(int) (-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)),mostCurrent._pnlsm.getTop(),mostCurrent._pnlsm.getWidth(),mostCurrent._pnlsm.getHeight());
 //BA.debugLineNum = 71;BA.debugLine="pnlMage.SetLayoutAnimated(375,0,pnlMage.Top,pnl";
mostCurrent._pnlmage.SetLayoutAnimated((int) (375),(int) (0),mostCurrent._pnlmage.getTop(),mostCurrent._pnlmage.getWidth(),mostCurrent._pnlmage.getHeight());
 //BA.debugLineNum = 72;BA.debugLine="intPanel = intPanel + 1";
_intpanel = (int) (_intpanel+1);
 //BA.debugLineNum = 73;BA.debugLine="selectedChar = \"Mage\"";
mostCurrent._selectedchar = "Mage";
 break; }
case 1: {
 //BA.debugLineNum = 75;BA.debugLine="pnlMage.SetLayoutAnimated(375,-100%x,pnlMage.To";
mostCurrent._pnlmage.SetLayoutAnimated((int) (375),(int) (-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)),mostCurrent._pnlmage.getTop(),mostCurrent._pnlmage.getWidth(),mostCurrent._pnlmage.getHeight());
 //BA.debugLineNum = 76;BA.debugLine="pnlArcher.SetLayoutAnimated(375,0,pnlArcher.Top";
mostCurrent._pnlarcher.SetLayoutAnimated((int) (375),(int) (0),mostCurrent._pnlarcher.getTop(),mostCurrent._pnlarcher.getWidth(),mostCurrent._pnlarcher.getHeight());
 //BA.debugLineNum = 77;BA.debugLine="intPanel = intPanel + 1";
_intpanel = (int) (_intpanel+1);
 //BA.debugLineNum = 78;BA.debugLine="selectedChar = \"Archer\"";
mostCurrent._selectedchar = "Archer";
 break; }
case 2: {
 //BA.debugLineNum = 80;BA.debugLine="ToastMessageShow(\"No more characters\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No more characters"),anywheresoftware.b4a.keywords.Common.False);
 break; }
}
;
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public static String  _btnprev_click() throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Private Sub btnPrev_Click";
 //BA.debugLineNum = 50;BA.debugLine="Select Case intPanel";
switch (_intpanel) {
case 0: {
 //BA.debugLineNum = 52;BA.debugLine="ToastMessageShow(\"No more characters\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No more characters"),anywheresoftware.b4a.keywords.Common.False);
 break; }
case 1: {
 //BA.debugLineNum = 55;BA.debugLine="pnlMage.SetLayoutAnimated(375,100%x,pnlMage.Top";
mostCurrent._pnlmage.SetLayoutAnimated((int) (375),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),mostCurrent._pnlmage.getTop(),mostCurrent._pnlmage.getWidth(),mostCurrent._pnlmage.getHeight());
 //BA.debugLineNum = 56;BA.debugLine="pnlSM.SetLayoutAnimated(375,0,pnlSM.Top,pnlSM.W";
mostCurrent._pnlsm.SetLayoutAnimated((int) (375),(int) (0),mostCurrent._pnlsm.getTop(),mostCurrent._pnlsm.getWidth(),mostCurrent._pnlsm.getHeight());
 //BA.debugLineNum = 57;BA.debugLine="intPanel = intPanel - 1";
_intpanel = (int) (_intpanel-1);
 //BA.debugLineNum = 58;BA.debugLine="selectedChar = \"Swordmaster\"";
mostCurrent._selectedchar = "Swordmaster";
 break; }
case 2: {
 //BA.debugLineNum = 60;BA.debugLine="pnlArcher.SetLayoutAnimated(375,100%x,pnlArcher";
mostCurrent._pnlarcher.SetLayoutAnimated((int) (375),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),mostCurrent._pnlarcher.getTop(),mostCurrent._pnlarcher.getWidth(),mostCurrent._pnlarcher.getHeight());
 //BA.debugLineNum = 61;BA.debugLine="pnlMage.SetLayoutAnimated(375,0,pnlMage.Top,pnl";
mostCurrent._pnlmage.SetLayoutAnimated((int) (375),(int) (0),mostCurrent._pnlmage.getTop(),mostCurrent._pnlmage.getWidth(),mostCurrent._pnlmage.getHeight());
 //BA.debugLineNum = 62;BA.debugLine="intPanel = intPanel - 1";
_intpanel = (int) (_intpanel-1);
 //BA.debugLineNum = 63;BA.debugLine="selectedChar = \"Mage\"";
mostCurrent._selectedchar = "Mage";
 break; }
}
;
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return "";
}
public static String  _entername() throws Exception{
String _ans = "";
 //BA.debugLineNum = 84;BA.debugLine="Sub enterName";
 //BA.debugLineNum = 85;BA.debugLine="Dim ans As String";
_ans = "";
 //BA.debugLineNum = 87;BA.debugLine="strDLG.InputType = strDLG.INPUT_TYPE_TEXT";
mostCurrent._strdlg.setInputType(mostCurrent._strdlg.INPUT_TYPE_TEXT);
 //BA.debugLineNum = 89;BA.debugLine="ans = strDLG.Show(\"Enter Your Name\",selectedChar,";
_ans = BA.NumberToString(mostCurrent._strdlg.Show("Enter Your Name",mostCurrent._selectedchar,"Confirm","Cancel","",mostCurrent.activityBA,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 90;BA.debugLine="If ans = DialogResponse.POSITIVE Then";
if ((_ans).equals(BA.NumberToString(anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE))) { 
 //BA.debugLineNum = 91;BA.debugLine="characterName = strDLG.Input";
_charactername = mostCurrent._strdlg.getInput();
 //BA.debugLineNum = 92;BA.debugLine="StartActivity(FirstArea)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._firstarea.getObject()));
 };
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 11;BA.debugLine="Private btnNext As Button";
mostCurrent._btnnext = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private btnPrev As Button";
mostCurrent._btnprev = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private imgArcher As ImageView";
mostCurrent._imgarcher = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private imgMage As ImageView";
mostCurrent._imgmage = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private imgSM As ImageView";
mostCurrent._imgsm = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private pnlArcher As Panel";
mostCurrent._pnlarcher = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private pnlMage As Panel";
mostCurrent._pnlmage = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private pnlSM As Panel";
mostCurrent._pnlsm = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Dim intPanel As Int = 0";
_intpanel = (int) (0);
 //BA.debugLineNum = 20;BA.debugLine="Dim strDLG As InputDialog";
mostCurrent._strdlg = new anywheresoftware.b4a.agraham.dialogs.InputDialog();
 //BA.debugLineNum = 21;BA.debugLine="Dim selectedChar As String = \"Swordmaster\"";
mostCurrent._selectedchar = "Swordmaster";
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public static String  _imgarcher_click() throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Private Sub imgArcher_Click";
 //BA.debugLineNum = 46;BA.debugLine="enterName";
_entername();
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public static String  _imgmage_click() throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Private Sub imgMage_Click";
 //BA.debugLineNum = 42;BA.debugLine="enterName";
_entername();
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public static String  _imgsm_click() throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Private Sub imgSM_Click";
 //BA.debugLineNum = 38;BA.debugLine="enterName";
_entername();
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Dim characterName As String";
_charactername = "";
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
}
