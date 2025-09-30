package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_knightstatslayout{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("label1").vw.setLeft((int)((5d / 100 * width)));
views.get("label1").vw.setWidth((int)((40d / 100 * width) - ((5d / 100 * width))));
views.get("label1").vw.setTop((int)((25d / 100 * height) - (views.get("label1").vw.getHeight() / 2)));
views.get("label2").vw.setLeft((int)((5d / 100 * width)));
views.get("label2").vw.setWidth((int)((40d / 100 * width) - ((5d / 100 * width))));
views.get("label2").vw.setTop((int)((views.get("label1").vw.getTop() + views.get("label1").vw.getHeight())));
views.get("label3").vw.setLeft((int)((5d / 100 * width)));
views.get("label3").vw.setWidth((int)((40d / 100 * width) - ((5d / 100 * width))));
views.get("label3").vw.setTop((int)((views.get("label2").vw.getTop() + views.get("label2").vw.getHeight())));
views.get("label4").vw.setLeft((int)((views.get("label1").vw.getLeft() + views.get("label1").vw.getWidth())));
views.get("label4").vw.setWidth((int)((79d / 100 * width) - ((views.get("label1").vw.getLeft() + views.get("label1").vw.getWidth()))));
views.get("label4").vw.setTop((int)((25d / 100 * height) - (views.get("label4").vw.getHeight() / 2)));
views.get("label5").vw.setLeft((int)((views.get("label2").vw.getLeft() + views.get("label2").vw.getWidth())));
views.get("label5").vw.setWidth((int)((79d / 100 * width) - ((views.get("label2").vw.getLeft() + views.get("label2").vw.getWidth()))));
views.get("label5").vw.setTop((int)((views.get("label4").vw.getTop() + views.get("label4").vw.getHeight())));
views.get("label6").vw.setLeft((int)((views.get("label3").vw.getLeft() + views.get("label3").vw.getWidth())));
views.get("label6").vw.setWidth((int)((79d / 100 * width) - ((views.get("label3").vw.getLeft() + views.get("label3").vw.getWidth()))));
views.get("label6").vw.setTop((int)((views.get("label5").vw.getTop() + views.get("label5").vw.getHeight())));
views.get("label7").vw.setTop((int)((views.get("label6").vw.getTop() + views.get("label6").vw.getHeight())-(10d * scale)));
views.get("label7").vw.setLeft((int)((50d / 100 * width) - (views.get("label7").vw.getWidth() / 2)));

}
}