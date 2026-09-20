package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class byN implements Runnable {
    public final /* synthetic */ ArrayList w;

    public byN(ArrayList arrayList) {
        this.w = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ta.b(this.w, 4);
    }
}
