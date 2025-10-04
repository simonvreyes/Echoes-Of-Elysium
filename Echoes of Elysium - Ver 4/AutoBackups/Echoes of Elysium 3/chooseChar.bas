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
	Dim characterName As String
End Sub

Sub Globals
	Private btnNext As Button
	Private btnPrev As Button
	
	Private ivArcher As ImageView
	Private ivMage As ImageView
	Private ivKnight As ImageView
	
	Private thKnight As TabHost
	Private thMage As TabHost
	Private thArcher As TabHost
	
	Private pnlArcher As Panel
	Private pnlMage As Panel
	Private pnlKnight As Panel
	
	Dim intPanel As Int = 0
	Dim strDLG As InputDialog
	Dim selectedChar As String = "Knight"
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("chooseCharLayout")
	thKnight.AddTab("Background", "knightBGLayout.bal")
	thKnight.AddTab("Stats", "knightStatsLayout.bal")
	
	thMage.AddTab("Background", "mageBGLayout.bal")
	thMage.AddTab("Stats", "mageStatsLayout.bal")
	
	thArcher.AddTab("Background", "archerBGLayout.bal")
	thArcher.AddTab("Stats", "archerStatsLayout.bal")
	
	pnlMage.Visible = False
	pnlArcher.Visible = False
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub ivKnight_Click
	enterName
End Sub

Private Sub ivMage_Click
	enterName
End Sub

Private Sub ivArcher_Click
	enterName
End Sub

Private Sub btnPrev_Click
	Select Case intPanel
		Case 0
			ToastMessageShow("No more characters",False)
		Case 1
			pnlMage.SetLayoutAnimated(375,100%x,pnlMage.Top,pnlMage.Width,pnlMage.Height)
			pnlKnight.SetLayoutAnimated(375,0,pnlKnight.Top,pnlKnight.Width,pnlKnight.Height)
			intPanel = intPanel - 1
			selectedChar = "Knight"
			pnlKnight.Visible = True
			pnlMage.Visible = False
			
		Case 2
			pnlArcher.SetLayoutAnimated(375,100%x,pnlArcher.Top,pnlArcher.Width,pnlArcher.Height)
			pnlMage.SetLayoutAnimated(375,0,pnlMage.Top,pnlMage.Width,pnlMage.Height)
			intPanel = intPanel - 1
			selectedChar = "Mage"
			pnlMage.Visible = True
			pnlArcher.Visible = False
	End Select
End Sub

Private Sub btnNext_Click
	Select Case intPanel
		Case 0
			pnlKnight.SetLayoutAnimated(375,-100%x,pnlKnight.Top,pnlKnight.Width,pnlKnight.Height)
			pnlMage.SetLayoutAnimated(375,0,pnlMage.Top,pnlMage.Width,pnlMage.Height)
			intPanel = intPanel + 1
			selectedChar = "Mage"
			pnlKnight.Visible = False
			pnlMage.Visible = True
		Case 1
			pnlMage.SetLayoutAnimated(375,-100%x,pnlMage.Top,pnlMage.Width,pnlMage.Height)
			pnlArcher.SetLayoutAnimated(375,0,pnlArcher.Top,pnlArcher.Width,pnlArcher.Height)
			intPanel = intPanel + 1
			selectedChar = "Archer"
			pnlMage.Visible = False
			pnlArcher.Visible = True
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