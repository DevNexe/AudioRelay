package defpackage;

import android.database.ContentObserver;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ww6 extends ContentObserver {
    public final /* synthetic */ xw6 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww6(xw6 xw6Var) {
        super(null);
        this.a = xw6Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        xw6 xw6Var = this.a;
        synchronized (xw6Var.e) {
            xw6Var.f = null;
            xw6Var.c.run();
        }
        synchronized (xw6Var) {
            Iterator it = xw6Var.g.iterator();
            while (it.hasNext()) {
                ((yw6) it.next()).zza();
            }
        }
    }
}
