package defpackage;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class WFia implements ff {
    public final View w;

    public WFia(View view) {
        this.w = view;
    }

    @Override // defpackage.ff
    public final Object a(dl3 dl3Var, iy1 iy1Var, z80<? super sd5> z80Var) {
        dl3 dl3VarE = dl3Var.e(ps0.b0(iy1Var));
        this.w.requestRectangleOnScreen(new Rect((int) dl3VarE.a, (int) dl3VarE.b, (int) dl3VarE.c, (int) dl3VarE.d), false);
        return sd5.a;
    }
}
