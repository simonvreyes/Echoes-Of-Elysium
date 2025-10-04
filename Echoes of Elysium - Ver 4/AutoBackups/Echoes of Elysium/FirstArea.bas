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
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("firstAreaPromptLayout")
	Sleep(5000)
	Activity.RemoveAllViews
	Activity.LoadLayout("firstAreaLayout")
	Sleep(7000)
	StartActivity(FirstAreaDialogue)
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub