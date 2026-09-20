package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public class qn4 extends LinearLayoutManager {
    public qn4(int i) {
        super(i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void s0(RecyclerView recyclerView, int i) {
        pn4 pn4Var = new pn4(recyclerView.getContext());
        pn4Var.a = i;
        t0(pn4Var);
    }
}
