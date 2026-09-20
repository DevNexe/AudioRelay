package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class oj5 {
    public final View a;
    public int b;
    public int c;
    public int d;

    public oj5(View view) {
        this.a = view;
    }

    public final void a() {
        int i = this.d;
        View view = this.a;
        bi5.h(view, i - (view.getTop() - this.b));
        bi5.g(view, 0 - (view.getLeft() - this.c));
    }
}
