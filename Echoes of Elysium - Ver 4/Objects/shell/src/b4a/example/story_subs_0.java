package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class story_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (story) ","story",4,story.mostCurrent.activityBA,story.mostCurrent,14);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.story.remoteMe.runUserSub(false, "story","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 14;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="Activity.LoadLayout(\"storyLayout\")";
Debug.ShouldStop(16384);
story.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("storyLayout")),story.mostCurrent.activityBA);
 BA.debugLineNum = 16;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Pause (story) ","story",4,story.mostCurrent.activityBA,story.mostCurrent,22);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.story.remoteMe.runUserSub(false, "story","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 22;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 24;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Resume (story) ","story",4,story.mostCurrent.activityBA,story.mostCurrent,18);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.story.remoteMe.runUserSub(false, "story","activity_resume");}
 BA.debugLineNum = 18;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(131072);
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
 //BA.debugLineNum = 11;BA.debugLine="Private lblPressToContinue As Label";
story.mostCurrent._lblpresstocontinue = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lblpresstocontinue_click() throws Exception{
try {
		Debug.PushSubsStack("lblPressToContinue_Click (story) ","story",4,story.mostCurrent.activityBA,story.mostCurrent,27);
if (RapidSub.canDelegate("lblpresstocontinue_click")) { return b4a.example.story.remoteMe.runUserSub(false, "story","lblpresstocontinue_click");}
 BA.debugLineNum = 27;BA.debugLine="Private Sub lblPressToContinue_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="StartActivity(chooseChar)";
Debug.ShouldStop(134217728);
story.mostCurrent.__c.runVoidMethod ("StartActivity",story.processBA,(Object)((story.mostCurrent._choosechar.getObject())));
 BA.debugLineNum = 29;BA.debugLine="Activity.Finish";
Debug.ShouldStop(268435456);
story.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}