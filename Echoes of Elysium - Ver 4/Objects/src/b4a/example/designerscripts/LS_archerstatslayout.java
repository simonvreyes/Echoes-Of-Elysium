package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_archerstatslayout{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("label1").vw.setLeft((int)((5d / 100 * width)));
views.get("label1").vw.setWidth((int)((40d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 3;BA.debugLine="Label1.VerticalCenter = 25%y"[archerStatsLayout/General script]
views.get("label1").vw.setTop((int)((25d / 100 * height) - (views.get("label1").vw.getHeight() / 2)));
//BA.debugLineNum = 5;BA.debugLine="Label2.SetLeftAndRight(5%x, 40%x)"[archerStatsLayout/General script]
views.get("label2").vw.setLeft((int)((5d / 100 * width)));
views.get("label2").vw.setWidth((int)((40d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 6;BA.debugLine="Label2.Top = Label1.Bottom"[archerStatsLayout/General script]
views.get("label2").vw.setTop((int)((views.get("label1").vw.getTop() + views.get("label1").vw.getHeight())));
//BA.debugLineNum = 8;BA.debugLine="Label3.SetLeftAndRight(5%x, 40%x)"[archerStatsLayout/General script]
views.get("label3").vw.setLeft((int)((5d / 100 * width)));
views.get("label3").vw.setWidth((int)((40d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 9;BA.debugLine="Label3.Top = Label2.Bottom"[archerStatsLayout/General script]
views.get("label3").vw.setTop((int)((views.get("label2").vw.getTop() + views.get("label2").vw.getHeight())));
//BA.debugLineNum = 11;BA.debugLine="Label4.SetLeftAndRight(Label1.Right,79%x)"[archerStatsLayout/General script]
views.get("label4").vw.setLeft((int)((views.get("label1").vw.getLeft() + views.get("label1").vw.getWidth())));
views.get("label4").vw.setWidth((int)((79d / 100 * width) - ((views.get("label1").vw.getLeft() + views.get("label1").vw.getWidth()))));
//BA.debugLineNum = 12;BA.debugLine="Label4.VerticalCenter = 25%y"[archerStatsLayout/General script]
views.get("label4").vw.setTop((int)((25d / 100 * height) - (views.get("label4").vw.getHeight() / 2)));
//BA.debugLineNum = 14;BA.debugLine="Label5.SetLeftAndRight(Label2.Right,79%x)"[archerStatsLayout/General script]
views.get("label5").vw.setLeft((int)((views.get("label2").vw.getLeft() + views.get("label2").vw.getWidth())));
views.get("label5").vw.setWidth((int)((79d / 100 * width) - ((views.get("label2").vw.getLeft() + views.get("label2").vw.getWidth()))));
//BA.debugLineNum = 15;BA.debugLine="Label5.Top = Label4.Bottom"[archerStatsLayout/General script]
views.get("label5").vw.setTop((int)((views.get("label4").vw.getTop() + views.get("label4").vw.getHeight())));
//BA.debugLineNum = 17;BA.debugLine="Label6.SetLeftAndRight(Label3.Right,79%x)"[archerStatsLayout/General script]
views.get("label6").vw.setLeft((int)((views.get("label3").vw.getLeft() + views.get("label3").vw.getWidth())));
views.get("label6").vw.setWidth((int)((79d / 100 * width) - ((views.get("label3").vw.getLeft() + views.get("label3").vw.getWidth()))));
//BA.debugLineNum = 18;BA.debugLine="Label6.Top = Label5.Bottom"[archerStatsLayout/General script]
views.get("label6").vw.setTop((int)((views.get("label5").vw.getTop() + views.get("label5").vw.getHeight())));
//BA.debugLineNum = 20;BA.debugLine="Label7.Top = Label6.Bottom - 10dip"[archerStatsLayout/General script]
views.get("label7").vw.setTop((int)((views.get("label6").vw.getTop() + views.get("label6").vw.getHeight())-(10d * scale)));
//BA.debugLineNum = 21;BA.debugLine="Label7.HorizontalCenter = 50%x"[archerStatsLayout/General script]
views.get("label7").vw.setLeft((int)((50d / 100 * width) - (views.get("label7").vw.getWidth() / 2)));

}
}