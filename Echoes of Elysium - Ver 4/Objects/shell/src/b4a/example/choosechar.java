
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class choosechar implements IRemote{
	public static choosechar mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public choosechar() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("choosechar"), "b4a.example.choosechar");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, choosechar.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _charactername = RemoteObject.createImmutable("");
public static RemoteObject _hstat = RemoteObject.createImmutable(0);
public static RemoteObject _istat = RemoteObject.createImmutable(0);
public static RemoteObject _pstat = RemoteObject.createImmutable(0);
public static RemoteObject _btnnext = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnprev = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _ivarcher = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _ivmage = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _ivknight = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _thknight = RemoteObject.declareNull("anywheresoftware.b4a.objects.TabHostWrapper");
public static RemoteObject _thmage = RemoteObject.declareNull("anywheresoftware.b4a.objects.TabHostWrapper");
public static RemoteObject _tharcher = RemoteObject.declareNull("anywheresoftware.b4a.objects.TabHostWrapper");
public static RemoteObject _pnlarcher = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnlmage = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnlknight = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _intpanel = RemoteObject.createImmutable(0);
public static RemoteObject _strdlg = RemoteObject.declareNull("anywheresoftware.b4a.agraham.dialogs.InputDialog");
public static RemoteObject _selectedchar = RemoteObject.createImmutable("");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.title _title = null;
public static b4a.example.vlprompt _vlprompt = null;
public static b4a.example.story _story = null;
public static b4a.example.firstarea _firstarea = null;
public static b4a.example.firstareadialogue _firstareadialogue = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",choosechar.mostCurrent._activity,"btnNext",choosechar.mostCurrent._btnnext,"btnPrev",choosechar.mostCurrent._btnprev,"characterName",choosechar._charactername,"FirstArea",Debug.moduleToString(b4a.example.firstarea.class),"FirstAreaDialogue",Debug.moduleToString(b4a.example.firstareadialogue.class),"hStat",choosechar._hstat,"intPanel",choosechar._intpanel,"iStat",choosechar._istat,"ivArcher",choosechar.mostCurrent._ivarcher,"ivKnight",choosechar.mostCurrent._ivknight,"ivMage",choosechar.mostCurrent._ivmage,"Main",Debug.moduleToString(b4a.example.main.class),"pnlArcher",choosechar.mostCurrent._pnlarcher,"pnlKnight",choosechar.mostCurrent._pnlknight,"pnlMage",choosechar.mostCurrent._pnlmage,"pStat",choosechar._pstat,"selectedChar",choosechar.mostCurrent._selectedchar,"Starter",Debug.moduleToString(b4a.example.starter.class),"story",Debug.moduleToString(b4a.example.story.class),"strDLG",choosechar.mostCurrent._strdlg,"thArcher",choosechar.mostCurrent._tharcher,"thKnight",choosechar.mostCurrent._thknight,"thMage",choosechar.mostCurrent._thmage,"Title",Debug.moduleToString(b4a.example.title.class),"vlPrompt",Debug.moduleToString(b4a.example.vlprompt.class)};
}
}