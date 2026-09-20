package defpackage;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class ea3 extends fa3 {
    @Override // defpackage.fa3, defpackage.da3
    public final void b(View view, int i, int i2) {
        view.setSystemGestureExclusionRects(ps0.P(new Rect(0, 0, i, i2)));
    }
}
