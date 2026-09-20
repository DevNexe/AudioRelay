package defpackage;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.F1;

/* JADX INFO: loaded from: classes3.dex */
public final class y92 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ F1 x;

    public y92(F1 f1, int i) {
        this.x = f1;
        this.w = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.x.w0;
        if (recyclerView.Q) {
            return;
        }
        RecyclerView.PRnFixed pRn = recyclerView.H;
        if (pRn == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pRn.s0(recyclerView, this.w);
        }
    }
}
