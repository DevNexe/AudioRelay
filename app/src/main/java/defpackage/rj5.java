package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class rj5 extends cx1 implements j81<View, View> {
    public static final rj5 w = new rj5();

    public rj5() {
        super(1);
    }

    @Override // defpackage.j81
    public final View invoke(View view) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
