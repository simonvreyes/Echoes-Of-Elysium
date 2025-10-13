
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

public class firstareadialogue implements IRemote{
	public static firstareadialogue mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public firstareadialogue() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("firstareadialogue"), "b4a.example.firstareadialogue");
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
		pcBA = new PCBA(this, firstareadialogue.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _timer1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _displaytext1 = RemoteObject.createImmutable("");
public static RemoteObject _displaytext2 = RemoteObject.createImmutable("");
public static RemoteObject _displaytext3 = RemoteObject.createImmutable("");
public static RemoteObject _displaytext4 = RemoteObject.createImmutable("");
public static RemoteObject _displaytext5 = RemoteObject.createImmutable("");
public static RemoteObject _displaytext6 = RemoteObject.createImmutable("");
public static RemoteObject _displaytext7_1 = RemoteObject.createImmutable("");
public static RemoteObject _displaytext7_2 = RemoteObject.createImmutable("");
public static RemoteObject _currentindex = RemoteObject.createImmutable(0);
public static RemoteObject _currentlabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _currentdisplaytext = RemoteObject.createImmutable("");
public static RemoteObject _currentdialogue = RemoteObject.createImmutable(0);
public static RemoteObject _lbldialogue1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbldialogue2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbldialogue3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbldialogue4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbldialogue5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbldialogue6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblplayername1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblplayername2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnldialogue1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnldialogue2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnldialogue3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnldialogue4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnldialogue5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnldialogue6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.title _title = null;
public static b4a.example.vlprompt _vlprompt = null;
public static b4a.example.story _story = null;
public static b4a.example.choosechar _choosechar = null;
public static b4a.example.firstarea _firstarea = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",firstareadialogue.mostCurrent._activity,"chooseChar",Debug.moduleToString(b4a.example.choosechar.class),"currentDialogue",firstareadialogue._currentdialogue,"currentDisplayText",firstareadialogue.mostCurrent._currentdisplaytext,"currentIndex",firstareadialogue._currentindex,"currentLabel",firstareadialogue.mostCurrent._currentlabel,"displayText1",firstareadialogue.mostCurrent._displaytext1,"displayText2",firstareadialogue.mostCurrent._displaytext2,"displayText3",firstareadialogue.mostCurrent._displaytext3,"displayText4",firstareadialogue.mostCurrent._displaytext4,"displayText5",firstareadialogue.mostCurrent._displaytext5,"displayText6",firstareadialogue.mostCurrent._displaytext6,"displayText7_1",firstareadialogue.mostCurrent._displaytext7_1,"displayText7_2",firstareadialogue.mostCurrent._displaytext7_2,"FirstArea",Debug.moduleToString(b4a.example.firstarea.class),"lblDialogue1",firstareadialogue.mostCurrent._lbldialogue1,"lblDialogue2",firstareadialogue.mostCurrent._lbldialogue2,"lblDialogue3",firstareadialogue.mostCurrent._lbldialogue3,"lblDialogue4",firstareadialogue.mostCurrent._lbldialogue4,"lblDialogue5",firstareadialogue.mostCurrent._lbldialogue5,"lblDialogue6",firstareadialogue.mostCurrent._lbldialogue6,"lblPlayerName1",firstareadialogue.mostCurrent._lblplayername1,"lblPlayerName2",firstareadialogue.mostCurrent._lblplayername2,"Main",Debug.moduleToString(b4a.example.main.class),"pnlDialogue1",firstareadialogue.mostCurrent._pnldialogue1,"pnlDialogue2",firstareadialogue.mostCurrent._pnldialogue2,"pnlDialogue3",firstareadialogue.mostCurrent._pnldialogue3,"pnlDialogue4",firstareadialogue.mostCurrent._pnldialogue4,"pnlDialogue5",firstareadialogue.mostCurrent._pnldialogue5,"pnlDialogue6",firstareadialogue.mostCurrent._pnldialogue6,"Starter",Debug.moduleToString(b4a.example.starter.class),"story",Debug.moduleToString(b4a.example.story.class),"Timer1",firstareadialogue._timer1,"Title",Debug.moduleToString(b4a.example.title.class),"vlPrompt",Debug.moduleToString(b4a.example.vlprompt.class)};
}
}