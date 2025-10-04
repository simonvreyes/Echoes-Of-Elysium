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
	Dim Timer1 As Timer
End Sub

Sub Globals
	Dim displayText1 As String
	Dim displayText2 As String
	Dim displayText3 As String
	Dim displayText4 As String
	Dim displayText5 As String
	Dim displayText6 As String
	Dim displayText7_1 As String
	Dim displayText7_2 As String
	
	Dim isDialogue1 As Boolean
	Dim isDialogue2 As Boolean
	Dim isDialogue3 As Boolean
	Dim isDialogue4 As Boolean
	Dim isDialogue5 As Boolean
	Dim isDialogue6 As Boolean
	Dim isDialogue7_1 As Boolean
	Dim isDialogue7_2 As Boolean
	
	Dim currentIndex As Int
	Dim currentLabel As Label
	Dim currentDisplayText As String
	
	Private lblDialogue1 As Label
	Private lblDialogue2 As Label
	
	Private lblPlayerName1 As Label
	
	Private pnlDialogue1 As Panel
	Private pnlDialogue2 As Panel
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("firstAreaDialogueLayout")
	
	lblPlayerName1.Text = chooseChar.characterName
	Timer1.Initialize("Timer1", 70) 
    
	' Set the text to display
	displayText1 = "Halt, traveler. You have entered the Whispering Woods, a place of ancient magic and illusions. State your purpose."
	displayText2 = "I seek to navigate these woods and uncover the secrets they hold. My quest is to destroy the Echo Stone and save the realm of Elysium."
	displayText3 = "The Echo Stone... a relic of great power and great peril. Many have sought it, and many have been lost to its allure. But you... you wish to destroy it? Why should I believe you are any different from those who came before?"
	displayText4 = "I have seen the suffering the Echo Stone has caused. It must be destroyed to bring peace to Elysium."
	displayText5 = "Words are easily spoken, but actions reveal the truth. The Whispering Woods tests not only the mind but the heart. To proceed, you must solve one of our ancient puzzles. Choose wisely, for the path you take will determine your fate."
	displayText6 = "You face two paths. The first path challenges your wit with the Riddles of the Ancient, testing your ability to think and reason. The second path challenges your perception with the Cryptic Glyphs, testing your ability to see beyond the surface. Succeed, and you shall receive the Key of Insight, which unlocks the way to the Enigma of the Celestial Temple. Fail, and you shall be forever lost in these woods."
	displayText7_1 = "Very well. Prepare yourself for the Riddles of the Ancient. Answer correctly, and you may continue your journey. Fail, and you shall be lost in the illusions of this."
	displayText7_2 = "As you wish. The Cryptic Glyphs await you. Decipher their hidden messages, and the path shall be revealed. Fail, and you shall wander in darkness, never finding your way."
	
    
	' Initialize the current index
	currentIndex = 0
	currentLabel = lblDialogue1
	currentDisplayText = displayText1
	isDialogue1 = True
    
	' Start the Timer
	Timer1.Enabled = True
    
	' Set the initial text of the label to empty
	lblDialogue1.Text = ""
	lblDialogue2.Text = ""
	
	pnlDialogue2.Visible = False
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Timer1_Tick
	' Check if there are more characters to display
	If currentIndex < currentDisplayText.Length Then
		' Add the next character to the label
		currentLabel.Text = currentLabel.Text & currentDisplayText.CharAt(currentIndex)
		' Move to the next character
		currentIndex = currentIndex + 1
	Else
		' Stop the Timer when all characters are displayed
		Timer1.Enabled = False
	End If
End Sub

Sub Activity_Touch (Action As Int, X As Float, Y As Float) As Boolean
	If Action = Activity.ACTION_DOWN Then
		If Timer1.Enabled Then
			currentLabel.Text = currentDisplayText
			Timer1.Enabled = False
		Else
			If isDialogue1 Then
				currentLabel = lblDialogue2
				currentDisplayText = displayText2
				isDialogue1 = False
				pnlDialogue1.Visible = False
				pnlDialogue2.Visible = True
			Else
				Return False
			End If
			
			currentIndex = 0
			currentLabel.Text = ""
			
			Timer1.Enabled = True
			
		End If
	End If
	Return True
End Sub

