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
	Private lblPressToContinue As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("storyLayout")
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub lblPressToContinue_Click
	StartActivity(chooseChar)
	Activity.Finish
End Sub