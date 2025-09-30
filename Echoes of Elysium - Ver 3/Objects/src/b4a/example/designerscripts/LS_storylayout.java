package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_storylayout{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("label1").vw.setWidth((int)((83d / 100 * width)));
views.get("lblpresstocontinue").vw.setWidth((int)((41.5d / 100 * width)));
views.get("lblpresstocontinue").vw.setLeft((int)((91.5d / 100 * width) - (views.get("lblpresstocontinue").vw.getWidth())));
views.get("lblpresstocontinue").vw.setTop((int)((100d / 100 * height) - (views.get("lblpresstocontinue").vw.getHeight())));
views.get("label1").vw.setTop((int)((views.get("lblpresstocontinue").vw.getTop()) - (views.get("label1").vw.getHeight())));
views.get("label1").vw.setLeft((int)((50d / 100 * width) - (views.get("label1").vw.getWidth() / 2)));

}
}