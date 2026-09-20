package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import defpackage.j61;

/* JADX INFO: loaded from: classes.dex */
public final class T23 implements Runnable {
    public final /* synthetic */ j61 w;
    public final /* synthetic */ View x;
    public final /* synthetic */ Rect y;

    public T23(j61 j61Var, View view, Rect rect) {
        this.w = j61Var;
        this.x = view;
        this.y = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.w.getClass();
        j61.g(this.x, this.y);
    }
}
