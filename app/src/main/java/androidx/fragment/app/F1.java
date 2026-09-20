package androidx.fragment.app;

import defpackage.a83;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class F1 implements Runnable {
    public final /* synthetic */ List w;
    public final /* synthetic */ ck32.CQf x;
    public final /* synthetic */ FJCM y;

    public F1(FJCM fjcm, ArrayList arrayList, ck32.CQf cQf) {
        this.y = fjcm;
        this.w = arrayList;
        this.x = cQf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.w;
        ck32.CQf cQf = this.x;
        if (list.contains(cQf)) {
            list.remove(cQf);
            this.y.getClass();
            a83.a(cQf.a, cQf.c.a0);
        }
    }
}
