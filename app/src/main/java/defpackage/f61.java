package defpackage;

import android.graphics.Rect;
import android.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public final class f61 extends Transition.EpicenterCallback {
    public final /* synthetic */ Rect a;

    public f61(Rect rect) {
        this.a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        return this.a;
    }
}
