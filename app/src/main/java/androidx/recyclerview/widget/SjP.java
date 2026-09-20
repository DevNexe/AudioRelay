package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class SjP implements CQf.InterfaceC0028CQf {
    public final /* synthetic */ RecyclerView a;

    public SjP(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final int a() {
        return this.a.getChildCount();
    }

    public final void b(int i) {
        RecyclerView recyclerView = this.a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.H(childAt);
            RecyclerView.LPt8Fixed lPt8 = recyclerView.G;
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
