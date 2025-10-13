package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class firstarea_subs_0 {


public static void  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (firstarea) ","firstarea",6,firstarea.mostCurrent.activityBA,firstarea.mostCurrent,14);
if (RapidSub.canDelegate("activity_create")) { b4a.example.firstarea.remoteMe.runUserSub(false, "firstarea","activity_create", _firsttime); return;}
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(b4a.example.firstarea parent,RemoteObject _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.firstarea parent;
RemoteObject _firsttime;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (firstarea) ","firstarea",6,firstarea.mostCurrent.activityBA,firstarea.mostCurrent,14);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 15;BA.debugLine="Activity.LoadLayout(\"firstAreaPromptLayout\")";
Debug.ShouldStop(16384);
parent.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("firstAreaPromptLayout")),firstarea.mostCurrent.activityBA);
 BA.debugLineNum = 16;BA.debugLine="Sleep(5000)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("Sleep",firstarea.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "firstarea", "activity_create"),BA.numberCast(int.class, 5000));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 17;BA.debugLine="Activity.RemoveAllViews";
Debug.ShouldStop(65536);
parent.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 18;BA.debugLine="Activity.LoadLayout(\"firstAreaLayout\")";
Debug.ShouldStop(131072);
parent.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("firstAreaLayout")),firstarea.mostCurrent.activityBA);
 BA.debugLineNum = 19;BA.debugLine="Sleep(7000)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("Sleep",firstarea.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "firstarea", "activity_create"),BA.numberCast(int.class, 7000));
this.state = 2;
return;
case 2:
//C
this.state = -1;
;
 BA.debugLineNum = 20;BA.debugLine="StartActivity(FirstAreaDialogue)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",firstarea.processBA,(Object)((parent.mostCurrent._firstareadialogue.getObject())));
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (firstarea) ","firstarea",6,firstarea.mostCurrent.activityBA,firstarea.mostCurrent,27);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.firstarea.remoteMe.runUserSub(false, "firstarea","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Activity_Resume (firstarea) ","firstarea",6,firstarea.mostCurrent.activityBA,firstarea.mostCurrent,23);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.firstarea.remoteMe.runUserSub(false, "firstarea","activity_resume");}
 BA.debugLineNum = 23;BA.debugLine="Sub Activity_Resume";
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}