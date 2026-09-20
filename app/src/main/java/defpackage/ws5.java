package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ws5 {
    public final Object w;

    public final ViewTreeObserver a() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) ((WeakReference) this.w).get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }
}
