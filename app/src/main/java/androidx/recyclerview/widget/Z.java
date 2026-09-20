package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z extends RecyclerView.RBi {
    public RecyclerView a;
    public final QnHx b = new QnHx();

    public class QnHx extends RecyclerView.LPt6Fixed {
        public boolean a = false;

        public QnHx() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LPt6Fixed
        public final void a(RecyclerView recyclerView, int i) {
            if (i == 0 && this.a) {
                this.a = false;
                Z.this.b();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LPt6Fixed
        public final void b(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.a = true;
        }
    }

    public abstract int[] a(RecyclerView.PRnFixed pRn, View view);

    public final void b() {
        RecyclerView.PRnFixed layoutManager;
        View viewD;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        ck32 ck32Var = (ck32) this;
        if (layoutManager.e()) {
            viewD = ck32.d(layoutManager, ck32Var.f(layoutManager));
        } else {
            viewD = layoutManager.d() ? ck32.d(layoutManager, ck32Var.e(layoutManager)) : null;
        }
        if (viewD == null) {
            return;
        }
        int[] iArrA = a(layoutManager, viewD);
        int i = iArrA[0];
        if (i == 0 && iArrA[1] == 0) {
            return;
        }
        this.a.Z(i, iArrA[1], false);
    }
}
