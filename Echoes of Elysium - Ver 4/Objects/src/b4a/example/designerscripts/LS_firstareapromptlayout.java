package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_firstareapromptlayout{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("label1").vw.setLeft((int)((10d / 100 * width)));
views.get("label1").vw.setWidth((int)((90d / 100 * width) - ((10d / 100 * width))));
views.get("label1").vw.setHeight((int)((20d / 100 * height)));
views.get("label1").vw.setTop((int)((50d / 100 * height) - (views.get("label1").vw.getHeight() / 2)));

}
}