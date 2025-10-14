B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=12.8
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals

End Sub

Public Sub handleKey (KeyCode As Int) As Boolean
	If KeyCode = KeyCodes.KEYCODE_BACK Then
		Dim res As Int
		res = Msgbox2("Are you sure you want to quit?","WARNING","Yes","Cancel","",Null)
		If res = DialogResponse.POSITIVE Then
			ExitApplication
		Else
			Return True
		End If
	End If
	Return False
End Sub