package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class choosechar_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (choosechar) ","choosechar",5,choosechar.mostCurrent.activityBA,choosechar.mostCurrent,35);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.choosechar.remoteMe.runUserSub(false, "choosechar","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="Activity.LoadLayout(\"chooseCharLayout\")";
Debug.ShouldStop(8);
choosechar.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("chooseCharLayout")),choosechar.mostCurrent.activityBA);
 BA.debugLineNum = 37;BA.debugLine="thKnight.AddTab(\"Background\", \"knightBGLayout.bal";
Debug.ShouldStop(16);
choosechar.mostCurrent._thknight.runVoidMethodAndSync ("AddTab",choosechar.mostCurrent.activityBA,(Object)(BA.ObjectToString("Background")),(Object)(RemoteObject.createImmutable("knightBGLayout.bal")));
 BA.debugLineNum = 38;BA.debugLine="thKnight.AddTab(\"Stats\", \"knightStatsLayout.bal\")";
Debug.ShouldStop(32);
choosechar.mostCurrent._thknight.runVoidMethodAndSync ("AddTab",choosechar.mostCurrent.activityBA,(Object)(BA.ObjectToString("Stats")),(Object)(RemoteObject.createImmutable("knightStatsLayout.bal")));
 BA.debugLineNum = 40;BA.debugLine="thMage.AddTab(\"Background\", \"mageBGLayout.bal\")";
Debug.ShouldStop(128);
choosechar.mostCurrent._thmage.runVoidMethodAndSync ("AddTab",choosechar.mostCurrent.activityBA,(Object)(BA.ObjectToString("Background")),(Object)(RemoteObject.createImmutable("mageBGLayout.bal")));
 BA.debugLineNum = 41;BA.debugLine="thMage.AddTab(\"Stats\", \"mageStatsLayout.bal\")";
Debug.ShouldStop(256);
choosechar.mostCurrent._thmage.runVoidMethodAndSync ("AddTab",choosechar.mostCurrent.activityBA,(Object)(BA.ObjectToString("Stats")),(Object)(RemoteObject.createImmutable("mageStatsLayout.bal")));
 BA.debugLineNum = 43;BA.debugLine="thArcher.AddTab(\"Background\", \"archerBGLayout.bal";
Debug.ShouldStop(1024);
choosechar.mostCurrent._tharcher.runVoidMethodAndSync ("AddTab",choosechar.mostCurrent.activityBA,(Object)(BA.ObjectToString("Background")),(Object)(RemoteObject.createImmutable("archerBGLayout.bal")));
 BA.debugLineNum = 44;BA.debugLine="thArcher.AddTab(\"Stats\", \"archerStatsLayout.bal\")";
Debug.ShouldStop(2048);
choosechar.mostCurrent._tharcher.runVoidMethodAndSync ("AddTab",choosechar.mostCurrent.activityBA,(Object)(BA.ObjectToString("Stats")),(Object)(RemoteObject.createImmutable("archerStatsLayout.bal")));
 BA.debugLineNum = 46;BA.debugLine="pnlMage.Visible = False";
Debug.ShouldStop(8192);
choosechar.mostCurrent._pnlmage.runMethod(true,"setVisible",choosechar.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 47;BA.debugLine="pnlArcher.Visible = False";
Debug.ShouldStop(16384);
choosechar.mostCurrent._pnlarcher.runMethod(true,"setVisible",choosechar.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (choosechar) ","choosechar",5,choosechar.mostCurrent.activityBA,choosechar.mostCurrent,54);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.choosechar.remoteMe.runUserSub(false, "choosechar","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 54;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (choosechar) ","choosechar",5,choosechar.mostCurrent.activityBA,choosechar.mostCurrent,50);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.choosechar.remoteMe.runUserSub(false, "choosechar","activity_resume");}
 BA.debugLineNum = 50;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(131072);
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnnext_click() throws Exception{
try {
		Debug.PushSubsStack("btnNext_Click (choosechar) ","choosechar",5,choosechar.mostCurrent.activityBA,choosechar.mostCurrent,102);
if (RapidSub.canDelegate("btnnext_click")) { return b4a.example.choosechar.remoteMe.runUserSub(false, "choosechar","btnnext_click");}
 BA.debugLineNum = 102;BA.debugLine="Private Sub btnNext_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 103;BA.debugLine="Select Case intPanel";
Debug.ShouldStop(64);
switch (BA.switchObjectToInt(choosechar._intpanel,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2))) {
case 0: {
 BA.debugLineNum = 105;BA.debugLine="pnlKnight.SetLayoutAnimated(375,-100%x,pnlKnigh";
Debug.ShouldStop(256);
choosechar.mostCurrent._pnlknight.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 375)),(Object)(BA.numberCast(int.class, -(double) (0 + choosechar.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),choosechar.mostCurrent.activityBA).<Integer>get().intValue()))),(Object)(choosechar.mostCurrent._pnlknight.runMethod(true,"getTop")),(Object)(choosechar.mostCurrent._pnlknight.runMethod(true,"getWidth")),(Object)(choosechar.mostCurrent._pnlknight.runMethod(true,"getHeight")));
 BA.debugLineNum = 106;BA.debugLine="pnlMage.SetLayoutAnimated(375,0,pnlMage.Top,pnl";
Debug.ShouldStop(512);
choosechar.mostCurrent._pnlmage.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 375)),(Object)(BA.numberCast(int.class, 0)),(Object)(choosechar.mostCurrent._pnlmage.runMethod(true,"getTop")),(Object)(choosechar.mostCurrent._pnlmage.runMethod(true,"getWidth")),(Object)(choosechar.mostCurrent._pnlmage.runMethod(true,"getHeight")));
 BA.debugLineNum = 107;BA.debugLine="intPanel = intPanel + 1";
Debug.ShouldStop(1024);
choosechar._intpanel = RemoteObject.solve(new RemoteObject[] {choosechar._intpanel,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 108;BA.debugLine="selectedChar = \"Mage\"";
Debug.ShouldStop(2048);
choosechar.mostCurrent._selectedchar = BA.ObjectToString("Mage");
 BA.debugLineNum = 109;BA.debugLine="pnlKnight.Visible = False";
Debug.ShouldStop(4096);
choosechar.mostCurrent._pnlknight.runMethod(true,"setVisible",choosechar.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 110;BA.debugLine="pnlMage.Visible = True";
Debug.ShouldStop(8192);
choosechar.mostCurrent._pnlmage.runMethod(true,"setVisible",choosechar.mostCurrent.__c.getField(true,"True"));
 break; }
case 1: {
 BA.debugLineNum = 112;BA.debugLine="pnlMage.SetLayoutAnimated(375,-100%x,pnlMage.To";
Debug.ShouldStop(32768);
choosechar.mostCurrent._pnlmage.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 375)),(Object)(BA.numberCast(int.class, -(double) (0 + choosechar.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),choosechar.mostCurrent.activityBA).<Integer>get().intValue()))),(Object)(choosechar.mostCurrent._pnlmage.runMethod(true,"getTop")),(Object)(choosechar.mostCurrent._pnlmage.runMethod(true,"getWidth")),(Object)(choosechar.mostCurrent._pnlmage.runMethod(true,"getHeight")));
 BA.debugLineNum = 113;BA.debugLine="pnlArcher.SetLayoutAnimated(375,0,pnlArcher.Top";
Debug.ShouldStop(65536);
choosechar.mostCurrent._pnlarcher.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 375)),(Object)(BA.numberCast(int.class, 0)),(Object)(choosechar.mostCurrent._pnlarcher.runMethod(true,"getTop")),(Object)(choosechar.mostCurrent._pnlarcher.runMethod(true,"getWidth")),(Object)(choosechar.mostCurrent._pnlarcher.runMethod(true,"getHeight")));
 BA.debugLineNum = 114;BA.debugLine="intPanel = intPanel + 1";
Debug.ShouldStop(131072);
choosechar._intpanel = RemoteObject.solve(new RemoteObject[] {choosechar._intpanel,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 115;BA.debugLine="selectedChar = \"Archer\"";
Debug.ShouldStop(262144);
choosechar.mostCurrent._selectedchar = BA.ObjectToString("Archer");
 BA.debugLineNum = 116;BA.debugLine="pnlMage.Visible = False";
Debug.ShouldStop(524288);
choosechar.mostCurrent._pnlmage.runMethod(true,"setVisible",choosechar.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 117;BA.debugLine="pnlArcher.Visible = True";
Debug.ShouldStop(1048576);
choosechar.mostCurrent._pnlarcher.runMethod(true,"setVisible",choosechar.mostCurrent.__c.getField(true,"True"));
 break; }
case 2: {
 BA.debugLineNum = 119;BA.debugLine="ToastMessageShow(\"No more characters\",False)";
Debug.ShouldStop(4194304);
choosechar.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("No more characters")),(Object)(choosechar.mostCurrent.__c.getField(true,"False")));
 break; }
}
;
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnprev_click() throws Exception{
try {
		Debug.PushSubsStack("btnPrev_Click (choosechar) ","choosechar",5,choosechar.mostCurrent.activityBA,choosechar.mostCurrent,80);
if (RapidSub.canDelegate("btnprev_click")) { return b4a.example.choosechar.remoteMe.runUserSub(false, "choosechar","btnprev_click");}
 BA.debugLineNum = 80;BA.debugLine="Private Sub btnPrev_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="Select Case intPanel";
Debug.ShouldStop(65536);
switch (BA.switchObjectToInt(choosechar._intpanel,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2))) {
case 0: {
 BA.debugLineNum = 83;BA.debugLine="ToastMessageShow(\"No more characters\",False)";
Debug.ShouldStop(262144);
choosechar.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("No more characters")),(Object)(choosechar.mostCurrent.__c.getField(true,"False")));
 break; }
case 1: {
 BA.debugLineNum = 85;BA.debugLine="pnlMage.SetLayoutAnimated(375,100%x,pnlMage.Top";
Debug.ShouldStop(1048576);
choosechar.mostCurrent._pnlmage.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 375)),(Object)(choosechar.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),choosechar.mostCurrent.activityBA)),(Object)(choosechar.mostCurrent._pnlmage.runMethod(true,"getTop")),(Object)(choosechar.mostCurrent._pnlmage.runMethod(true,"getWidth")),(Object)(choosechar.mostCurrent._pnlmage.runMethod(true,"getHeight")));
 BA.debugLineNum = 86;BA.debugLine="pnlKnight.SetLayoutAnimated(375,0,pnlKnight.Top";
Debug.ShouldStop(2097152);
choosechar.mostCurrent._pnlknight.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 375)),(Object)(BA.numberCast(int.class, 0)),(Object)(choosechar.mostCurrent._pnlknight.runMethod(true,"getTop")),(Object)(choosechar.mostCurrent._pnlknight.runMethod(true,"getWidth")),(Object)(choosechar.mostCurrent._pnlknight.runMethod(true,"getHeight")));
 BA.debugLineNum = 87;BA.debugLine="intPanel = intPanel - 1";
Debug.ShouldStop(4194304);
choosechar._intpanel = RemoteObject.solve(new RemoteObject[] {choosechar._intpanel,RemoteObject.createImmutable(1)}, "-",1, 1);
 BA.debugLineNum = 88;BA.debugLine="selectedChar = \"Knight\"";
Debug.ShouldStop(8388608);
choosechar.mostCurrent._selectedchar = BA.ObjectToString("Knight");
 BA.debugLineNum = 89;BA.debugLine="pnlKnight.Visible = True";
Debug.ShouldStop(16777216);
choosechar.mostCurrent._pnlknight.runMethod(true,"setVisible",choosechar.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 90;BA.debugLine="pnlMage.Visible = False";
Debug.ShouldStop(33554432);
choosechar.mostCurrent._pnlmage.runMethod(true,"setVisible",choosechar.mostCurrent.__c.getField(true,"False"));
 break; }
case 2: {
 BA.debugLineNum = 93;BA.debugLine="pnlArcher.SetLayoutAnimated(375,100%x,pnlArcher";
Debug.ShouldStop(268435456);
choosechar.mostCurrent._pnlarcher.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 375)),(Object)(choosechar.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),choosechar.mostCurrent.activityBA)),(Object)(choosechar.mostCurrent._pnlarcher.runMethod(true,"getTop")),(Object)(choosechar.mostCurrent._pnlarcher.runMethod(true,"getWidth")),(Object)(choosechar.mostCurrent._pnlarcher.runMethod(true,"getHeight")));
 BA.debugLineNum = 94;BA.debugLine="pnlMage.SetLayoutAnimated(375,0,pnlMage.Top,pnl";
Debug.ShouldStop(536870912);
choosechar.mostCurrent._pnlmage.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 375)),(Object)(BA.numberCast(int.class, 0)),(Object)(choosechar.mostCurrent._pnlmage.runMethod(true,"getTop")),(Object)(choosechar.mostCurrent._pnlmage.runMethod(true,"getWidth")),(Object)(choosechar.mostCurrent._pnlmage.runMethod(true,"getHeight")));
 BA.debugLineNum = 95;BA.debugLine="intPanel = intPanel - 1";
Debug.ShouldStop(1073741824);
choosechar._intpanel = RemoteObject.solve(new RemoteObject[] {choosechar._intpanel,RemoteObject.createImmutable(1)}, "-",1, 1);
 BA.debugLineNum = 96;BA.debugLine="selectedChar = \"Mage\"";
Debug.ShouldStop(-2147483648);
choosechar.mostCurrent._selectedchar = BA.ObjectToString("Mage");
 BA.debugLineNum = 97;BA.debugLine="pnlMage.Visible = True";
Debug.ShouldStop(1);
choosechar.mostCurrent._pnlmage.runMethod(true,"setVisible",choosechar.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 98;BA.debugLine="pnlArcher.Visible = False";
Debug.ShouldStop(2);
choosechar.mostCurrent._pnlarcher.runMethod(true,"setVisible",choosechar.mostCurrent.__c.getField(true,"False"));
 break; }
}
;
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _entername() throws Exception{
try {
		Debug.PushSubsStack("enterName (choosechar) ","choosechar",5,choosechar.mostCurrent.activityBA,choosechar.mostCurrent,123);
if (RapidSub.canDelegate("entername")) { return b4a.example.choosechar.remoteMe.runUserSub(false, "choosechar","entername");}
RemoteObject _ans = RemoteObject.createImmutable("");
 BA.debugLineNum = 123;BA.debugLine="Sub enterName";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 124;BA.debugLine="Dim ans As String";
Debug.ShouldStop(134217728);
_ans = RemoteObject.createImmutable("");Debug.locals.put("ans", _ans);
 BA.debugLineNum = 126;BA.debugLine="strDLG.InputType = strDLG.INPUT_TYPE_TEXT";
Debug.ShouldStop(536870912);
choosechar.mostCurrent._strdlg.runMethod(true,"setInputType",choosechar.mostCurrent._strdlg.getField(true,"INPUT_TYPE_TEXT"));
 BA.debugLineNum = 128;BA.debugLine="ans = strDLG.Show(\"Enter Your Name\",selectedChar,";
Debug.ShouldStop(-2147483648);
_ans = BA.NumberToString(choosechar.mostCurrent._strdlg.runMethodAndSync(true,"Show",(Object)(BA.ObjectToString("Enter Your Name")),(Object)(choosechar.mostCurrent._selectedchar),(Object)(BA.ObjectToString("Confirm")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("")),choosechar.mostCurrent.activityBA,(Object)((choosechar.mostCurrent.__c.getField(false,"Null")))));Debug.locals.put("ans", _ans);
 BA.debugLineNum = 129;BA.debugLine="If ans = DialogResponse.POSITIVE Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_ans,BA.NumberToString(choosechar.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 130;BA.debugLine="characterName = strDLG.Input";
Debug.ShouldStop(2);
choosechar._charactername = choosechar.mostCurrent._strdlg.runMethod(true,"getInput");
 BA.debugLineNum = 131;BA.debugLine="StartActivity(FirstArea)";
Debug.ShouldStop(4);
choosechar.mostCurrent.__c.runVoidMethod ("StartActivity",choosechar.processBA,(Object)((choosechar.mostCurrent._firstarea.getObject())));
 };
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 14;BA.debugLine="Private btnNext As Button";
choosechar.mostCurrent._btnnext = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private btnPrev As Button";
choosechar.mostCurrent._btnprev = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private ivArcher As ImageView";
choosechar.mostCurrent._ivarcher = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private ivMage As ImageView";
choosechar.mostCurrent._ivmage = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private ivKnight As ImageView";
choosechar.mostCurrent._ivknight = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private thKnight As TabHost";
choosechar.mostCurrent._thknight = RemoteObject.createNew ("anywheresoftware.b4a.objects.TabHostWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private thMage As TabHost";
choosechar.mostCurrent._thmage = RemoteObject.createNew ("anywheresoftware.b4a.objects.TabHostWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private thArcher As TabHost";
choosechar.mostCurrent._tharcher = RemoteObject.createNew ("anywheresoftware.b4a.objects.TabHostWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private pnlArcher As Panel";
choosechar.mostCurrent._pnlarcher = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private pnlMage As Panel";
choosechar.mostCurrent._pnlmage = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private pnlKnight As Panel";
choosechar.mostCurrent._pnlknight = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Dim intPanel As Int = 0";
choosechar._intpanel = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 30;BA.debugLine="Dim strDLG As InputDialog";
choosechar.mostCurrent._strdlg = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog");
 //BA.debugLineNum = 31;BA.debugLine="Dim selectedChar As String = \"Knight\"";
choosechar.mostCurrent._selectedchar = BA.ObjectToString("Knight");
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _ivarcher_click() throws Exception{
try {
		Debug.PushSubsStack("ivArcher_Click (choosechar) ","choosechar",5,choosechar.mostCurrent.activityBA,choosechar.mostCurrent,73);
if (RapidSub.canDelegate("ivarcher_click")) { return b4a.example.choosechar.remoteMe.runUserSub(false, "choosechar","ivarcher_click");}
 BA.debugLineNum = 73;BA.debugLine="Private Sub ivArcher_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="hStat = 3";
Debug.ShouldStop(512);
choosechar._hstat = BA.numberCast(int.class, 3);
 BA.debugLineNum = 75;BA.debugLine="iStat = 3";
Debug.ShouldStop(1024);
choosechar._istat = BA.numberCast(int.class, 3);
 BA.debugLineNum = 76;BA.debugLine="pStat = 5";
Debug.ShouldStop(2048);
choosechar._pstat = BA.numberCast(int.class, 5);
 BA.debugLineNum = 77;BA.debugLine="enterName";
Debug.ShouldStop(4096);
_entername();
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ivknight_click() throws Exception{
try {
		Debug.PushSubsStack("ivKnight_Click (choosechar) ","choosechar",5,choosechar.mostCurrent.activityBA,choosechar.mostCurrent,59);
if (RapidSub.canDelegate("ivknight_click")) { return b4a.example.choosechar.remoteMe.runUserSub(false, "choosechar","ivknight_click");}
 BA.debugLineNum = 59;BA.debugLine="Private Sub ivKnight_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="hStat = 5";
Debug.ShouldStop(134217728);
choosechar._hstat = BA.numberCast(int.class, 5);
 BA.debugLineNum = 61;BA.debugLine="iStat = 3";
Debug.ShouldStop(268435456);
choosechar._istat = BA.numberCast(int.class, 3);
 BA.debugLineNum = 62;BA.debugLine="pStat = 3";
Debug.ShouldStop(536870912);
choosechar._pstat = BA.numberCast(int.class, 3);
 BA.debugLineNum = 63;BA.debugLine="enterName";
Debug.ShouldStop(1073741824);
_entername();
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ivmage_click() throws Exception{
try {
		Debug.PushSubsStack("ivMage_Click (choosechar) ","choosechar",5,choosechar.mostCurrent.activityBA,choosechar.mostCurrent,66);
if (RapidSub.canDelegate("ivmage_click")) { return b4a.example.choosechar.remoteMe.runUserSub(false, "choosechar","ivmage_click");}
 BA.debugLineNum = 66;BA.debugLine="Private Sub ivMage_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="hStat = 3";
Debug.ShouldStop(4);
choosechar._hstat = BA.numberCast(int.class, 3);
 BA.debugLineNum = 68;BA.debugLine="iStat = 5";
Debug.ShouldStop(8);
choosechar._istat = BA.numberCast(int.class, 5);
 BA.debugLineNum = 69;BA.debugLine="pStat = 3";
Debug.ShouldStop(16);
choosechar._pstat = BA.numberCast(int.class, 3);
 BA.debugLineNum = 70;BA.debugLine="enterName";
Debug.ShouldStop(32);
_entername();
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Dim characterName As String";
choosechar._charactername = RemoteObject.createImmutable("");
 //BA.debugLineNum = 8;BA.debugLine="Dim hStat As Int";
choosechar._hstat = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 9;BA.debugLine="Dim iStat As Int";
choosechar._istat = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 10;BA.debugLine="Dim pStat As Int";
choosechar._pstat = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}