package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class title_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (title) ","title",2,title.mostCurrent.activityBA,title.mostCurrent,15);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.title.remoteMe.runUserSub(false, "title","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 15;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="Activity.LoadLayout(\"titleLayout\")";
Debug.ShouldStop(32768);
title.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("titleLayout")),title.mostCurrent.activityBA);
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (title) ","title",2,title.mostCurrent.activityBA,title.mostCurrent,40);
if (RapidSub.canDelegate("activity_keypress")) { return b4a.example.title.remoteMe.runUserSub(false, "title","activity_keypress", _keycode);}
RemoteObject _answ = RemoteObject.createImmutable(0);
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 40;BA.debugLine="Private Sub Activity_KeyPress (KeyCode As Int) As";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="Dim answ As Int";
Debug.ShouldStop(256);
_answ = RemoteObject.createImmutable(0);Debug.locals.put("answ", _answ);
 BA.debugLineNum = 42;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, title.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 43;BA.debugLine="answ = Msgbox2(\"Are you sure you want to quit?\",";
Debug.ShouldStop(1024);
_answ = title.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Are you sure you want to quit?")),(Object)(BA.ObjectToCharSequence("WARNING")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("")),(Object)((title.mostCurrent.__c.getField(false,"Null"))),title.mostCurrent.activityBA);Debug.locals.put("answ", _answ);
 BA.debugLineNum = 44;BA.debugLine="If answ = DialogResponse.POSITIVE Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_answ,BA.numberCast(double.class, title.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 45;BA.debugLine="Return False";
Debug.ShouldStop(4096);
if (true) return title.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 47;BA.debugLine="Return True";
Debug.ShouldStop(16384);
if (true) return title.mostCurrent.__c.getField(true,"True");
 };
 };
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (title) ","title",2,title.mostCurrent.activityBA,title.mostCurrent,23);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.title.remoteMe.runUserSub(false, "title","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 23;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Activity_Resume (title) ","title",2,title.mostCurrent.activityBA,title.mostCurrent,19);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.title.remoteMe.runUserSub(false, "title","activity_resume");}
 BA.debugLineNum = 19;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(262144);
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnquit_click() throws Exception{
try {
		Debug.PushSubsStack("btnQuit_Click (title) ","title",2,title.mostCurrent.activityBA,title.mostCurrent,32);
if (RapidSub.canDelegate("btnquit_click")) { b4a.example.title.remoteMe.runUserSub(false, "title","btnquit_click"); return;}
ResumableSub_btnQuit_Click rsub = new ResumableSub_btnQuit_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnQuit_Click extends BA.ResumableSub {
public ResumableSub_btnQuit_Click(b4a.example.title parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.title parent;
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnQuit_Click (title) ","title",2,title.mostCurrent.activityBA,title.mostCurrent,32);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 33;BA.debugLine="Msgbox2Async(\"Are you sure you want to quit?\", \"W";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Are you sure you want to quit?")),(Object)(BA.ObjectToCharSequence("WARNING")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),title.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 34;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", title.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "title", "btnquit_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 35;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(4);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 36;BA.debugLine="ExitApplication";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("ExitApplication");
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _msgbox_result(RemoteObject _result) throws Exception{
}
public static RemoteObject  _btnstart_click() throws Exception{
try {
		Debug.PushSubsStack("btnStart_Click (title) ","title",2,title.mostCurrent.activityBA,title.mostCurrent,27);
if (RapidSub.canDelegate("btnstart_click")) { return b4a.example.title.remoteMe.runUserSub(false, "title","btnstart_click");}
 BA.debugLineNum = 27;BA.debugLine="Private Sub btnStart_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="StartActivity(vlPrompt)";
Debug.ShouldStop(134217728);
title.mostCurrent.__c.runVoidMethod ("StartActivity",title.processBA,(Object)((title.mostCurrent._vlprompt.getObject())));
 BA.debugLineNum = 29;BA.debugLine="Activity.Finish";
Debug.ShouldStop(268435456);
title.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 11;BA.debugLine="Private btnQuit As Button";
title.mostCurrent._btnquit = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Private btnStart As Button";
title.mostCurrent._btnstart = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}