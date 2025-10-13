package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class firstareadialogue_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (firstareadialogue) ","firstareadialogue",7,firstareadialogue.mostCurrent.activityBA,firstareadialogue.mostCurrent,44);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.firstareadialogue.remoteMe.runUserSub(false, "firstareadialogue","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 44;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="Activity.LoadLayout(\"firstAreaDialogueLayout\")";
Debug.ShouldStop(4096);
firstareadialogue.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("firstAreaDialogueLayout")),firstareadialogue.mostCurrent.activityBA);
 BA.debugLineNum = 47;BA.debugLine="lblPlayerName1.Text = chooseChar.characterName";
Debug.ShouldStop(16384);
firstareadialogue.mostCurrent._lblplayername1.runMethod(true,"setText",BA.ObjectToCharSequence(firstareadialogue.mostCurrent._choosechar._charactername /*RemoteObject*/ ));
 BA.debugLineNum = 48;BA.debugLine="lblPlayerName2.Text = chooseChar.characterName";
Debug.ShouldStop(32768);
firstareadialogue.mostCurrent._lblplayername2.runMethod(true,"setText",BA.ObjectToCharSequence(firstareadialogue.mostCurrent._choosechar._charactername /*RemoteObject*/ ));
 BA.debugLineNum = 49;BA.debugLine="Timer1.Initialize(\"Timer1\", 70)";
Debug.ShouldStop(65536);
firstareadialogue._timer1.runVoidMethod ("Initialize",firstareadialogue.processBA,(Object)(BA.ObjectToString("Timer1")),(Object)(BA.numberCast(long.class, 70)));
 BA.debugLineNum = 52;BA.debugLine="displayText1 = \"Halt, traveler. You have entered";
Debug.ShouldStop(524288);
firstareadialogue.mostCurrent._displaytext1 = BA.ObjectToString("Halt, traveler. You have entered the Whispering Woods, a place of ancient magic and illusions. State your purpose.");
 BA.debugLineNum = 53;BA.debugLine="displayText2 = \"I seek to navigate these woods an";
Debug.ShouldStop(1048576);
firstareadialogue.mostCurrent._displaytext2 = BA.ObjectToString("I seek to navigate these woods and uncover the secrets they hold. My quest is to destroy the Echo Stone and save the realm of Elysium.");
 BA.debugLineNum = 54;BA.debugLine="displayText3 = \"The Echo Stone... a relic of grea";
Debug.ShouldStop(2097152);
firstareadialogue.mostCurrent._displaytext3 = BA.ObjectToString("The Echo Stone... a relic of great power and great peril. Many have sought it, and many have been lost to its allure. But you... you wish to destroy it? Why should I believe you are any different from those who came before?");
 BA.debugLineNum = 55;BA.debugLine="displayText4 = \"I have seen the suffering the Ech";
Debug.ShouldStop(4194304);
firstareadialogue.mostCurrent._displaytext4 = BA.ObjectToString("I have seen the suffering the Echo Stone has caused. It must be destroyed to bring peace to Elysium.");
 BA.debugLineNum = 56;BA.debugLine="displayText5 = \"Words are easily spoken, but acti";
Debug.ShouldStop(8388608);
firstareadialogue.mostCurrent._displaytext5 = BA.ObjectToString("Words are easily spoken, but actions reveal the truth. The Whispering Woods tests not only the mind but the heart. To proceed, you must solve one of our ancient puzzles. Choose wisely, for the path you take will determine your fate.");
 BA.debugLineNum = 57;BA.debugLine="displayText6 = \"You face two paths. The first pat";
Debug.ShouldStop(16777216);
firstareadialogue.mostCurrent._displaytext6 = BA.ObjectToString("You face two paths. The first path challenges your wit with the Riddles of the Ancient, testing your ability to think and reason. The second path challenges your perception with the Cryptic Glyphs, testing your ability to see beyond the surface. Succeed, and you shall receive the Key of Insight, which unlocks the way to the Enigma of the Celestial Temple. Fail, and you shall be forever lost in these woods.");
 BA.debugLineNum = 58;BA.debugLine="displayText7_1 = \"Very well. Prepare yourself for";
Debug.ShouldStop(33554432);
firstareadialogue.mostCurrent._displaytext7_1 = BA.ObjectToString("Very well. Prepare yourself for the Riddles of the Ancient. Answer correctly, and you may continue your journey. Fail, and you shall be lost in the illusions of this.");
 BA.debugLineNum = 59;BA.debugLine="displayText7_2 = \"As you wish. The Cryptic Glyphs";
Debug.ShouldStop(67108864);
firstareadialogue.mostCurrent._displaytext7_2 = BA.ObjectToString("As you wish. The Cryptic Glyphs await you. Decipher their hidden messages, and the path shall be revealed. Fail, and you shall wander in darkness, never finding your way.");
 BA.debugLineNum = 62;BA.debugLine="currentIndex = 0";
Debug.ShouldStop(536870912);
firstareadialogue._currentindex = BA.numberCast(int.class, 0);
 BA.debugLineNum = 63;BA.debugLine="currentLabel = lblDialogue1";
Debug.ShouldStop(1073741824);
firstareadialogue.mostCurrent._currentlabel = firstareadialogue.mostCurrent._lbldialogue1;
 BA.debugLineNum = 64;BA.debugLine="currentDisplayText = displayText1";
Debug.ShouldStop(-2147483648);
firstareadialogue.mostCurrent._currentdisplaytext = firstareadialogue.mostCurrent._displaytext1;
 BA.debugLineNum = 65;BA.debugLine="currentDialogue = 0";
Debug.ShouldStop(1);
firstareadialogue._currentdialogue = BA.numberCast(int.class, 0);
 BA.debugLineNum = 67;BA.debugLine="pnlDialogue2.Visible = False";
Debug.ShouldStop(4);
firstareadialogue.mostCurrent._pnldialogue2.runMethod(true,"setVisible",firstareadialogue.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 68;BA.debugLine="pnlDialogue3.Visible = False";
Debug.ShouldStop(8);
firstareadialogue.mostCurrent._pnldialogue3.runMethod(true,"setVisible",firstareadialogue.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 69;BA.debugLine="pnlDialogue4.Visible = False";
Debug.ShouldStop(16);
firstareadialogue.mostCurrent._pnldialogue4.runMethod(true,"setVisible",firstareadialogue.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 70;BA.debugLine="pnlDialogue5.Visible = False";
Debug.ShouldStop(32);
firstareadialogue.mostCurrent._pnldialogue5.runMethod(true,"setVisible",firstareadialogue.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 71;BA.debugLine="pnlDialogue6.Visible = False";
Debug.ShouldStop(64);
firstareadialogue.mostCurrent._pnldialogue6.runMethod(true,"setVisible",firstareadialogue.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 75;BA.debugLine="Timer1.Enabled = True";
Debug.ShouldStop(1024);
firstareadialogue._timer1.runMethod(true,"setEnabled",firstareadialogue.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 78;BA.debugLine="lblDialogue1.Text = \"\"";
Debug.ShouldStop(8192);
firstareadialogue.mostCurrent._lbldialogue1.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 79;BA.debugLine="lblDialogue2.Text = \"\"";
Debug.ShouldStop(16384);
firstareadialogue.mostCurrent._lbldialogue2.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 80;BA.debugLine="lblDialogue3.Text = \"\"";
Debug.ShouldStop(32768);
firstareadialogue.mostCurrent._lbldialogue3.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 81;BA.debugLine="lblDialogue4.Text = \"\"";
Debug.ShouldStop(65536);
firstareadialogue.mostCurrent._lbldialogue4.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 82;BA.debugLine="lblDialogue5.Text = \"\"";
Debug.ShouldStop(131072);
firstareadialogue.mostCurrent._lbldialogue5.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 83;BA.debugLine="lblDialogue6.Text = \"\"";
Debug.ShouldStop(262144);
firstareadialogue.mostCurrent._lbldialogue6.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 85;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Pause (firstareadialogue) ","firstareadialogue",7,firstareadialogue.mostCurrent.activityBA,firstareadialogue.mostCurrent,91);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.firstareadialogue.remoteMe.runUserSub(false, "firstareadialogue","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 91;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 93;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Resume (firstareadialogue) ","firstareadialogue",7,firstareadialogue.mostCurrent.activityBA,firstareadialogue.mostCurrent,87);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.firstareadialogue.remoteMe.runUserSub(false, "firstareadialogue","activity_resume");}
 BA.debugLineNum = 87;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_touch(RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("Activity_Touch (firstareadialogue) ","firstareadialogue",7,firstareadialogue.mostCurrent.activityBA,firstareadialogue.mostCurrent,108);
if (RapidSub.canDelegate("activity_touch")) { return b4a.example.firstareadialogue.remoteMe.runUserSub(false, "firstareadialogue","activity_touch", _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 108;BA.debugLine="Sub Activity_Touch (Action As Int, X As Float, Y A";
Debug.ShouldStop(2048);
 BA.debugLineNum = 109;BA.debugLine="If Action = Activity.ACTION_DOWN Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, firstareadialogue.mostCurrent._activity.getField(true,"ACTION_DOWN")))) { 
 BA.debugLineNum = 110;BA.debugLine="If Timer1.Enabled Then";
Debug.ShouldStop(8192);
if (firstareadialogue._timer1.runMethod(true,"getEnabled").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 111;BA.debugLine="currentLabel.Text = currentDisplayText";
Debug.ShouldStop(16384);
firstareadialogue.mostCurrent._currentlabel.runMethod(true,"setText",BA.ObjectToCharSequence(firstareadialogue.mostCurrent._currentdisplaytext));
 BA.debugLineNum = 112;BA.debugLine="Timer1.Enabled = False";
Debug.ShouldStop(32768);
firstareadialogue._timer1.runMethod(true,"setEnabled",firstareadialogue.mostCurrent.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 115;BA.debugLine="Select Case currentDialogue";
Debug.ShouldStop(262144);
switch (BA.switchObjectToInt(firstareadialogue._currentdialogue,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5))) {
case 0: {
 BA.debugLineNum = 117;BA.debugLine="currentLabel = lblDialogue2";
Debug.ShouldStop(1048576);
firstareadialogue.mostCurrent._currentlabel = firstareadialogue.mostCurrent._lbldialogue2;
 BA.debugLineNum = 118;BA.debugLine="currentDisplayText = displayText2";
Debug.ShouldStop(2097152);
firstareadialogue.mostCurrent._currentdisplaytext = firstareadialogue.mostCurrent._displaytext2;
 BA.debugLineNum = 119;BA.debugLine="currentDialogue = currentDialogue + 1";
Debug.ShouldStop(4194304);
firstareadialogue._currentdialogue = RemoteObject.solve(new RemoteObject[] {firstareadialogue._currentdialogue,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 120;BA.debugLine="pnlDialogue1.Visible = False";
Debug.ShouldStop(8388608);
firstareadialogue.mostCurrent._pnldialogue1.runMethod(true,"setVisible",firstareadialogue.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 121;BA.debugLine="pnlDialogue2.Visible = True";
Debug.ShouldStop(16777216);
firstareadialogue.mostCurrent._pnldialogue2.runMethod(true,"setVisible",firstareadialogue.mostCurrent.__c.getField(true,"True"));
 break; }
case 1: {
 BA.debugLineNum = 123;BA.debugLine="currentLabel = lblDialogue3";
Debug.ShouldStop(67108864);
firstareadialogue.mostCurrent._currentlabel = firstareadialogue.mostCurrent._lbldialogue3;
 BA.debugLineNum = 124;BA.debugLine="currentDisplayText = displayText3";
Debug.ShouldStop(134217728);
firstareadialogue.mostCurrent._currentdisplaytext = firstareadialogue.mostCurrent._displaytext3;
 BA.debugLineNum = 125;BA.debugLine="currentDialogue = currentDialogue + 1";
Debug.ShouldStop(268435456);
firstareadialogue._currentdialogue = RemoteObject.solve(new RemoteObject[] {firstareadialogue._currentdialogue,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 126;BA.debugLine="pnlDialogue2.Visible = False";
Debug.ShouldStop(536870912);
firstareadialogue.mostCurrent._pnldialogue2.runMethod(true,"setVisible",firstareadialogue.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 127;BA.debugLine="pnlDialogue3.Visible = True";
Debug.ShouldStop(1073741824);
firstareadialogue.mostCurrent._pnldialogue3.runMethod(true,"setVisible",firstareadialogue.mostCurrent.__c.getField(true,"True"));
 break; }
case 2: {
 BA.debugLineNum = 129;BA.debugLine="currentLabel = lblDialogue4";
Debug.ShouldStop(1);
firstareadialogue.mostCurrent._currentlabel = firstareadialogue.mostCurrent._lbldialogue4;
 BA.debugLineNum = 130;BA.debugLine="currentDisplayText = displayText4";
Debug.ShouldStop(2);
firstareadialogue.mostCurrent._currentdisplaytext = firstareadialogue.mostCurrent._displaytext4;
 BA.debugLineNum = 131;BA.debugLine="currentDialogue = currentDialogue + 1";
Debug.ShouldStop(4);
firstareadialogue._currentdialogue = RemoteObject.solve(new RemoteObject[] {firstareadialogue._currentdialogue,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 132;BA.debugLine="pnlDialogue3.Visible = False";
Debug.ShouldStop(8);
firstareadialogue.mostCurrent._pnldialogue3.runMethod(true,"setVisible",firstareadialogue.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 133;BA.debugLine="pnlDialogue4.Visible = True";
Debug.ShouldStop(16);
firstareadialogue.mostCurrent._pnldialogue4.runMethod(true,"setVisible",firstareadialogue.mostCurrent.__c.getField(true,"True"));
 break; }
case 3: {
 BA.debugLineNum = 135;BA.debugLine="currentLabel = lblDialogue5";
Debug.ShouldStop(64);
firstareadialogue.mostCurrent._currentlabel = firstareadialogue.mostCurrent._lbldialogue5;
 BA.debugLineNum = 136;BA.debugLine="currentDisplayText = displayText5";
Debug.ShouldStop(128);
firstareadialogue.mostCurrent._currentdisplaytext = firstareadialogue.mostCurrent._displaytext5;
 BA.debugLineNum = 137;BA.debugLine="currentDialogue = currentDialogue + 1";
Debug.ShouldStop(256);
firstareadialogue._currentdialogue = RemoteObject.solve(new RemoteObject[] {firstareadialogue._currentdialogue,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 138;BA.debugLine="pnlDialogue4.Visible = False";
Debug.ShouldStop(512);
firstareadialogue.mostCurrent._pnldialogue4.runMethod(true,"setVisible",firstareadialogue.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 139;BA.debugLine="pnlDialogue5.Visible = True";
Debug.ShouldStop(1024);
firstareadialogue.mostCurrent._pnldialogue5.runMethod(true,"setVisible",firstareadialogue.mostCurrent.__c.getField(true,"True"));
 break; }
case 4: {
 BA.debugLineNum = 141;BA.debugLine="currentLabel = lblDialogue6";
Debug.ShouldStop(4096);
firstareadialogue.mostCurrent._currentlabel = firstareadialogue.mostCurrent._lbldialogue6;
 BA.debugLineNum = 142;BA.debugLine="currentDisplayText = displayText6";
Debug.ShouldStop(8192);
firstareadialogue.mostCurrent._currentdisplaytext = firstareadialogue.mostCurrent._displaytext6;
 BA.debugLineNum = 143;BA.debugLine="currentDialogue = currentDialogue + 1";
Debug.ShouldStop(16384);
firstareadialogue._currentdialogue = RemoteObject.solve(new RemoteObject[] {firstareadialogue._currentdialogue,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 144;BA.debugLine="pnlDialogue5.Visible = False";
Debug.ShouldStop(32768);
firstareadialogue.mostCurrent._pnldialogue5.runMethod(true,"setVisible",firstareadialogue.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 145;BA.debugLine="pnlDialogue6.Visible = True";
Debug.ShouldStop(65536);
firstareadialogue.mostCurrent._pnldialogue6.runMethod(true,"setVisible",firstareadialogue.mostCurrent.__c.getField(true,"True"));
 break; }
case 5: {
 BA.debugLineNum = 147;BA.debugLine="Return False";
Debug.ShouldStop(262144);
if (true) return firstareadialogue.mostCurrent.__c.getField(true,"False");
 break; }
}
;
 BA.debugLineNum = 150;BA.debugLine="currentIndex = 0";
Debug.ShouldStop(2097152);
firstareadialogue._currentindex = BA.numberCast(int.class, 0);
 BA.debugLineNum = 151;BA.debugLine="currentLabel.Text = \"\"";
Debug.ShouldStop(4194304);
firstareadialogue.mostCurrent._currentlabel.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 152;BA.debugLine="Timer1.Enabled = True";
Debug.ShouldStop(8388608);
firstareadialogue._timer1.runMethod(true,"setEnabled",firstareadialogue.mostCurrent.__c.getField(true,"True"));
 };
 };
 BA.debugLineNum = 155;BA.debugLine="Return True";
Debug.ShouldStop(67108864);
if (true) return firstareadialogue.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 11;BA.debugLine="Dim displayText1 As String";
firstareadialogue.mostCurrent._displaytext1 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Dim displayText2 As String";
firstareadialogue.mostCurrent._displaytext2 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="Dim displayText3 As String";
firstareadialogue.mostCurrent._displaytext3 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="Dim displayText4 As String";
firstareadialogue.mostCurrent._displaytext4 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="Dim displayText5 As String";
firstareadialogue.mostCurrent._displaytext5 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 16;BA.debugLine="Dim displayText6 As String";
firstareadialogue.mostCurrent._displaytext6 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 17;BA.debugLine="Dim displayText7_1 As String";
firstareadialogue.mostCurrent._displaytext7_1 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 18;BA.debugLine="Dim displayText7_2 As String";
firstareadialogue.mostCurrent._displaytext7_2 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 21;BA.debugLine="Dim currentIndex As Int";
firstareadialogue._currentindex = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 22;BA.debugLine="Dim currentLabel As Label";
firstareadialogue.mostCurrent._currentlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Dim currentDisplayText As String";
firstareadialogue.mostCurrent._currentdisplaytext = RemoteObject.createImmutable("");
 //BA.debugLineNum = 24;BA.debugLine="Dim currentDialogue As Int";
firstareadialogue._currentdialogue = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 26;BA.debugLine="Private lblDialogue1 As Label";
firstareadialogue.mostCurrent._lbldialogue1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private lblDialogue2 As Label";
firstareadialogue.mostCurrent._lbldialogue2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private lblDialogue3 As Label";
firstareadialogue.mostCurrent._lbldialogue3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private lblDialogue4 As Label";
firstareadialogue.mostCurrent._lbldialogue4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private lblDialogue5 As Label";
firstareadialogue.mostCurrent._lbldialogue5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private lblDialogue6 As Label";
firstareadialogue.mostCurrent._lbldialogue6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private lblPlayerName1 As Label";
firstareadialogue.mostCurrent._lblplayername1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private lblPlayerName2 As Label";
firstareadialogue.mostCurrent._lblplayername2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private pnlDialogue1 As Panel";
firstareadialogue.mostCurrent._pnldialogue1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private pnlDialogue2 As Panel";
firstareadialogue.mostCurrent._pnldialogue2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private pnlDialogue3 As Panel";
firstareadialogue.mostCurrent._pnldialogue3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private pnlDialogue4 As Panel";
firstareadialogue.mostCurrent._pnldialogue4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private pnlDialogue5 As Panel";
firstareadialogue.mostCurrent._pnldialogue5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private pnlDialogue6 As Panel";
firstareadialogue.mostCurrent._pnldialogue6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Dim Timer1 As Timer";
firstareadialogue._timer1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _timer1_tick() throws Exception{
try {
		Debug.PushSubsStack("Timer1_Tick (firstareadialogue) ","firstareadialogue",7,firstareadialogue.mostCurrent.activityBA,firstareadialogue.mostCurrent,95);
if (RapidSub.canDelegate("timer1_tick")) { return b4a.example.firstareadialogue.remoteMe.runUserSub(false, "firstareadialogue","timer1_tick");}
 BA.debugLineNum = 95;BA.debugLine="Sub Timer1_Tick";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 97;BA.debugLine="If currentIndex < currentDisplayText.Length Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("<",firstareadialogue._currentindex,BA.numberCast(double.class, firstareadialogue.mostCurrent._currentdisplaytext.runMethod(true,"length")))) { 
 BA.debugLineNum = 99;BA.debugLine="currentLabel.Text = currentLabel.Text & currentD";
Debug.ShouldStop(4);
firstareadialogue.mostCurrent._currentlabel.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(firstareadialogue.mostCurrent._currentlabel.runMethod(true,"getText"),firstareadialogue.mostCurrent._currentdisplaytext.runMethod(true,"charAt",(Object)(firstareadialogue._currentindex)))));
 BA.debugLineNum = 101;BA.debugLine="currentIndex = currentIndex + 1";
Debug.ShouldStop(16);
firstareadialogue._currentindex = RemoteObject.solve(new RemoteObject[] {firstareadialogue._currentindex,RemoteObject.createImmutable(1)}, "+",1, 1);
 }else {
 BA.debugLineNum = 104;BA.debugLine="Timer1.Enabled = False";
Debug.ShouldStop(128);
firstareadialogue._timer1.runMethod(true,"setEnabled",firstareadialogue.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}