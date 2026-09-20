package defpackage;

import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.LPt8Fixed;

/* JADX INFO: loaded from: classes3.dex */
public final class fz0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ LPt8Fixed w;

    public fz0(LPt8Fixed lPt8) {
        this.w = lPt8;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        LPt8Fixed lPt8 = this.w;
        float rotation = lPt8.r.getRotation();
        if (lPt8.l == rotation) {
            return true;
        }
        lPt8.l = rotation;
        lPt8.k();
        return true;
    }
}
