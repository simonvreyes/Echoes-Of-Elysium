package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_titlelayout{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("label1").vw.setWidth((int)((100d / 100 * width)));
views.get("btnstart").vw.setWidth((int)((40d / 100 * width)));
views.get("btnquit").vw.setWidth((int)((40d / 100 * width)));
views.get("btnstart").vw.setLeft((int)((50d / 100 * width) - (views.get("btnstart").vw.getWidth() / 2)));
views.get("btnstart").vw.setTop((int)((50d / 100 * height) - (views.get("btnstart").vw.getHeight() / 2)));
views.get("label1").vw.setLeft((int)((50d / 100 * width) - (views.get("label1").vw.getWidth() / 2)));
views.get("label1").vw.setTop((int)((views.get("btnstart").vw.getTop())-(20d * scale) - (views.get("label1").vw.getHeight())));
views.get("btnquit").vw.setLeft((int)((50d / 100 * width) - (views.get("btnquit").vw.getWidth() / 2)));
views.get("btnquit").vw.setTop((int)((views.get("btnstart").vw.getTop() + views.get("btnstart").vw.getHeight())));

}
}