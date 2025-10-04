B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=12.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: True
	#IncludeTitle: False
#End Region

Sub Process_Globals
	
End Sub

Sub Globals
	Private btnQuit As Button
	Private btnStart As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("titleLayout")
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Private Sub btnStart_Click
	StartActivity(vlPrompt)
	Activity.Finish
End Sub

Private Sub btnQuit_Click
	Msgbox2Async("Are you sure you want to quit?", "WARNING", "Yes", "Cancel", "", Null, False)
	Wait For Msgbox_Result (Result As Int)
	If Result = DialogResponse.POSITIVE Then
		ExitApplication
	End If
End Sub

Private Sub Activity_KeyPress (KeyCode As Int) As Boolean
	Dim answ As Int
	If KeyCode = KeyCodes.KEYCODE_BACK Then
		answ = Msgbox2("Are you sure you want to quit?","WARNING","Yes","Cancel","",Null)
		If answ = DialogResponse.POSITIVE Then
			Return False
		Else
			Return True
		End If
	End If
End Sub