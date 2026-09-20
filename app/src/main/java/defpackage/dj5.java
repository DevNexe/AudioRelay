package defpackage;

import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dj5 extends l91 implements j81<ViewParent, ViewParent> {
    public static final dj5 F = new dj5();

    public dj5() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // defpackage.j81
    public final ViewParent invoke(ViewParent viewParent) {
        return viewParent.getParent();
    }
}
