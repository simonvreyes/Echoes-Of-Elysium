package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class story_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (story) ","story",3,story.mostCurrent.activityBA,story.mostCurrent,19);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.story.remoteMe.runUserSub(false, "story","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 19;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="Activity.LoadLayout(\"storyLayout\")";
Debug.ShouldStop(524288);
story.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("storyLayout")),story.mostCurrent.activityBA);
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (story) ","story",3,story.mostCurrent.activityBA,story.mostCurrent,27);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.story.remoteMe.runUserSub(false, "story","activity_pause", _userclosed);}
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
		Debug.PushSubsStack("Activity_Resume (story) ","story",3,story.mostCurrent.activityBA,story.mostCurrent,23);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.story.remoteMe.runUserSub(false, "story","activity_resume");}
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
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private lbPressToContinue As Label";
story.mostCurrent._lbpresstocontinue = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lbpresstocontinue_click() throws Exception{
try {
		Debug.PushSubsStack("lbPressToContinue_Click (story) ","story",3,story.mostCurrent.activityBA,story.mostCurrent,32);
if (RapidSub.canDelegate("lbpresstocontinue_click")) { return b4a.example.story.remoteMe.runUserSub(false, "story","lbpresstocontinue_click");}
 BA.debugLineNum = 32;BA.debugLine="Private Sub lbPressToContinue_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="StartActivity(chooseChar)";
Debug.ShouldStop(1);
story.mostCurrent.__c.runVoidMethod ("StartActivity",story.processBA,(Object)((story.mostCurrent._choosechar.getObject())));
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}