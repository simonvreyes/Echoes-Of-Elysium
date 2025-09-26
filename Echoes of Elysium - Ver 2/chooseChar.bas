B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=12.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	Dim characterName As String
End Sub

Sub Globals
	Private btnNext As Button
	Private btnPrev As Button
	Private imgArcher As ImageView
	Private imgMage As ImageView
	Private imgSM As ImageView
	Private pnlArcher As Panel
	Private pnlMage As Panel
	Private pnlSM As Panel
	Dim intPanel As Int = 0
	Dim strDLG As InputDialog
	Dim selectedChar As String = "Swordmaster"
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("chooseCharLayout")
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub imgSM_Click
	enterName
End Sub

Private Sub imgMage_Click
	enterName
End Sub

Private Sub imgArcher_Click
	enterName
End Sub

Private Sub btnPrev_Click
	Select Case intPanel
		Case 0
			ToastMessageShow("No more characters",False)
	
		Case 1
			pnlMage.SetLayoutAnimated(375,100%x,pnlMage.Top,pnlMage.Width,pnlMage.Height)
			pnlSM.SetLayoutAnimated(375,0,pnlSM.Top,pnlSM.Width,pnlSM.Height)
			intPanel = intPanel - 1
			selectedChar = "Swordmaster"
		Case 2
			pnlArcher.SetLayoutAnimated(375,100%x,pnlArcher.Top,pnlArcher.Width,pnlArcher.Height)
			pnlMage.SetLayoutAnimated(375,0,pnlMage.Top,pnlMage.Width,pnlMage.Height)
			intPanel = intPanel - 1
			selectedChar = "Mage"
	End Select
End Sub

Private Sub btnNext_Click
	Select Case intPanel
		Case 0
			pnlSM.SetLayoutAnimated(375,-100%x,pnlSM.Top,pnlSM.Width,pnlSM.Height)
			pnlMage.SetLayoutAnimated(375,0,pnlMage.Top,pnlMage.Width,pnlMage.Height)
			intPanel = intPanel + 1
			selectedChar = "Mage"
		Case 1
			pnlMage.SetLayoutAnimated(375,-100%x,pnlMage.Top,pnlMage.Width,pnlMage.Height)
			pnlArcher.SetLayoutAnimated(375,0,pnlArcher.Top,pnlArcher.Width,pnlArcher.Height)
			intPanel = intPanel + 1
			selectedChar = "Archer"
		Case 2
			ToastMessageShow("No more characters",False)
	End Select
End Sub

Sub enterName
	Dim ans As String
	
	strDLG.InputType = strDLG.INPUT_TYPE_TEXT
	
	ans = strDLG.Show("Enter Your Name",selectedChar,"Confirm","Cancel","",Null)
	If ans = DialogResponse.POSITIVE Then
		characterName = strDLG.Input
		StartActivity(FirstArea)
	End If
End Sub