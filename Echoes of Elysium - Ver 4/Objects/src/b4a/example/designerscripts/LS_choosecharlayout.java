package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_choosecharlayout{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("pnlknight").vw.setLeft((int)(0d));
views.get("pnlknight").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("pnlknight").vw.setTop((int)(0d));
views.get("pnlknight").vw.setHeight((int)((100d / 100 * height) - (0d)));
views.get("thknight").vw.setLeft((int)(0d));
views.get("thknight").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("thknight").vw.setTop((int)((50d / 100 * height)));
views.get("thknight").vw.setHeight((int)((100d / 100 * height) - ((50d / 100 * height))));
views.get("pnlmage").vw.setLeft((int)((100d / 100 * width)));
views.get("pnlmage").vw.setWidth((int)((200d / 100 * width) - ((100d / 100 * width))));
views.get("pnlmage").vw.setTop((int)(0d));
views.get("pnlmage").vw.setHeight((int)((100d / 100 * height) - (0d)));
views.get("thmage").vw.setLeft((int)(0d));
views.get("thmage").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("thmage").vw.setTop((int)((50d / 100 * height)));
views.get("thmage").vw.setHeight((int)((100d / 100 * height) - ((50d / 100 * height))));
views.get("pnlarcher").vw.setLeft((int)((200d / 100 * width)));
views.get("pnlarcher").vw.setWidth((int)((300d / 100 * width) - ((200d / 100 * width))));
views.get("pnlarcher").vw.setTop((int)(0d));
views.get("pnlarcher").vw.setHeight((int)((100d / 100 * height) - (0d)));
views.get("tharcher").vw.setLeft((int)(0d));
views.get("tharcher").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("tharcher").vw.setTop((int)((50d / 100 * height)));
views.get("tharcher").vw.setHeight((int)((100d / 100 * height) - ((50d / 100 * height))));
views.get("label1").vw.setLeft((int)(0d));
views.get("label1").vw.setWidth((int)((100d / 100 * width) - (0d)));
//BA.debugLineNum = 22;BA.debugLine="Label1.SetTopAndBottom(0,19.5%y)"[chooseCharLayout/General script]
views.get("label1").vw.setTop((int)(0d));
views.get("label1").vw.setHeight((int)((19.5d / 100 * height) - (0d)));
//BA.debugLineNum = 24;BA.debugLine="btnPrev.SetLeftAndRight(2.7%x,27.7%x)"[chooseCharLayout/General script]
views.get("btnprev").vw.setLeft((int)((2.7d / 100 * width)));
views.get("btnprev").vw.setWidth((int)((27.7d / 100 * width) - ((2.7d / 100 * width))));
//BA.debugLineNum = 25;BA.debugLine="btnPrev.SetTopAndBottom(Label1.Bottom + 3.2%y, 42.1%y)"[chooseCharLayout/General script]
views.get("btnprev").vw.setTop((int)((views.get("label1").vw.getTop() + views.get("label1").vw.getHeight())+(3.2d / 100 * height)));
views.get("btnprev").vw.setHeight((int)((42.1d / 100 * height) - ((views.get("label1").vw.getTop() + views.get("label1").vw.getHeight())+(3.2d / 100 * height))));
//BA.debugLineNum = 27;BA.debugLine="btnNext.SetLeftAndRight(72.3%x,97.3%x)"[chooseCharLayout/General script]
views.get("btnnext").vw.setLeft((int)((72.3d / 100 * width)));
views.get("btnnext").vw.setWidth((int)((97.3d / 100 * width) - ((72.3d / 100 * width))));
//BA.debugLineNum = 28;BA.debugLine="btnNext.SetTopAndBottom(Label1.Bottom + 3.2%y, 42.1%y)"[chooseCharLayout/General script]
views.get("btnnext").vw.setTop((int)((views.get("label1").vw.getTop() + views.get("label1").vw.getHeight())+(3.2d / 100 * height)));
views.get("btnnext").vw.setHeight((int)((42.1d / 100 * height) - ((views.get("label1").vw.getTop() + views.get("label1").vw.getHeight())+(3.2d / 100 * height))));
//BA.debugLineNum = 30;BA.debugLine="ivKnight.SetLeftAndRight(30.6%x,69.6%x)"[chooseCharLayout/General script]
views.get("ivknight").vw.setLeft((int)((30.6d / 100 * width)));
views.get("ivknight").vw.setWidth((int)((69.6d / 100 * width) - ((30.6d / 100 * width))));
//BA.debugLineNum = 31;BA.debugLine="ivKnight.SetTopAndBottom(21%y,43.6%y)"[chooseCharLayout/General script]
views.get("ivknight").vw.setTop((int)((21d / 100 * height)));
views.get("ivknight").vw.setHeight((int)((43.6d / 100 * height) - ((21d / 100 * height))));
//BA.debugLineNum = 33;BA.debugLine="lblClass1.SetLeftAndRight(27.8%x,72.3%x)"[chooseCharLayout/General script]
views.get("lblclass1").vw.setLeft((int)((27.8d / 100 * width)));
views.get("lblclass1").vw.setWidth((int)((72.3d / 100 * width) - ((27.8d / 100 * width))));
//BA.debugLineNum = 34;BA.debugLine="lblClass1.SetTopAndBottom(ivKnight.Bottom, 51.8%y)"[chooseCharLayout/General script]
views.get("lblclass1").vw.setTop((int)((views.get("ivknight").vw.getTop() + views.get("ivknight").vw.getHeight())));
views.get("lblclass1").vw.setHeight((int)((51.8d / 100 * height) - ((views.get("ivknight").vw.getTop() + views.get("ivknight").vw.getHeight()))));
//BA.debugLineNum = 36;BA.debugLine="ivMage.SetLeftAndRight(30.6%x,69.6%x)"[chooseCharLayout/General script]
views.get("ivmage").vw.setLeft((int)((30.6d / 100 * width)));
views.get("ivmage").vw.setWidth((int)((69.6d / 100 * width) - ((30.6d / 100 * width))));
//BA.debugLineNum = 37;BA.debugLine="ivMage.SetTopAndBottom(21%y,43.6%y)"[chooseCharLayout/General script]
views.get("ivmage").vw.setTop((int)((21d / 100 * height)));
views.get("ivmage").vw.setHeight((int)((43.6d / 100 * height) - ((21d / 100 * height))));
//BA.debugLineNum = 39;BA.debugLine="lblClass2.SetLeftAndRight(27.8%x,72.3%x)"[chooseCharLayout/General script]
views.get("lblclass2").vw.setLeft((int)((27.8d / 100 * width)));
views.get("lblclass2").vw.setWidth((int)((72.3d / 100 * width) - ((27.8d / 100 * width))));
//BA.debugLineNum = 40;BA.debugLine="lblClass2.SetTopAndBottom(ivMage.Bottom, 51.8%y)"[chooseCharLayout/General script]
views.get("lblclass2").vw.setTop((int)((views.get("ivmage").vw.getTop() + views.get("ivmage").vw.getHeight())));
views.get("lblclass2").vw.setHeight((int)((51.8d / 100 * height) - ((views.get("ivmage").vw.getTop() + views.get("ivmage").vw.getHeight()))));
//BA.debugLineNum = 42;BA.debugLine="ivArcher.SetLeftAndRight(30.6%x,69.6%x)"[chooseCharLayout/General script]
views.get("ivarcher").vw.setLeft((int)((30.6d / 100 * width)));
views.get("ivarcher").vw.setWidth((int)((69.6d / 100 * width) - ((30.6d / 100 * width))));
//BA.debugLineNum = 43;BA.debugLine="ivArcher.SetTopAndBottom(21%y,43.6%y)"[chooseCharLayout/General script]
views.get("ivarcher").vw.setTop((int)((21d / 100 * height)));
views.get("ivarcher").vw.setHeight((int)((43.6d / 100 * height) - ((21d / 100 * height))));
//BA.debugLineNum = 45;BA.debugLine="lblClass3.SetLeftAndRight(27.8%x,72.3%x)"[chooseCharLayout/General script]
views.get("lblclass3").vw.setLeft((int)((27.8d / 100 * width)));
views.get("lblclass3").vw.setWidth((int)((72.3d / 100 * width) - ((27.8d / 100 * width))));
//BA.debugLineNum = 46;BA.debugLine="lblClass3.SetTopAndBottom(ivArcher.Bottom, 51.8%y)"[chooseCharLayout/General script]
views.get("lblclass3").vw.setTop((int)((views.get("ivarcher").vw.getTop() + views.get("ivarcher").vw.getHeight())));
views.get("lblclass3").vw.setHeight((int)((51.8d / 100 * height) - ((views.get("ivarcher").vw.getTop() + views.get("ivarcher").vw.getHeight()))));

}
}