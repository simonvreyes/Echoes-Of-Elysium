package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_archerbglayout{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="Label1.SetLeftAndRight(0,100%x)"[archerBGLayout/General script]
views.get("label1").vw.setLeft((int)(0d));
views.get("label1").vw.setWidth((int)((100d / 100 * width) - (0d)));
//BA.debugLineNum = 3;BA.debugLine="Label1.VerticalCenter = 50%y"[archerBGLayout/General script]
views.get("label1").vw.setTop((int)((50d / 100 * height) - (views.get("label1").vw.getHeight() / 2)));

}
}