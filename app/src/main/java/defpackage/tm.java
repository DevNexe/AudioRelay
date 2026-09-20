package defpackage;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes3.dex */
public final class tm extends B8C {
    public final Typeface w;
    public final QnHx x;
    public boolean y;

    public interface QnHx {
    }

    public tm(zt ztVar, Typeface typeface) {
        this.w = typeface;
        this.x = ztVar;
    }

    @Override // defpackage.B8C
    public final void J0(int i) {
        if (this.y) {
            return;
        }
        au auVar = ((zt) this.x).a;
        tm tmVar = auVar.v;
        boolean z = true;
        if (tmVar != null) {
            tmVar.y = true;
        }
        Typeface typeface = auVar.s;
        Typeface typeface2 = this.w;
        if (typeface != typeface2) {
            auVar.s = typeface2;
        } else {
            z = false;
        }
        if (z) {
            auVar.h();
        }
    }

    @Override // defpackage.B8C
    public final void K0(Typeface typeface, boolean z) {
        if (this.y) {
            return;
        }
        au auVar = ((zt) this.x).a;
        tm tmVar = auVar.v;
        boolean z2 = true;
        if (tmVar != null) {
            tmVar.y = true;
        }
        if (auVar.s != typeface) {
            auVar.s = typeface;
        } else {
            z2 = false;
        }
        if (z2) {
            auVar.h();
        }
    }
}
