package defpackage;

import android.os.SystemClock;
import com.google.android.gms.internal.measurement.CQf;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ze6 implements Runnable {
    public final long w;
    public final long x;
    public final boolean y;
    public final /* synthetic */ CQf z;

    public ze6(CQf cQf, boolean z) {
        this.z = cQf;
        cQf.getClass();
        this.w = System.currentTimeMillis();
        this.x = SystemClock.elapsedRealtime();
        this.y = z;
    }

    public abstract void a();

    public void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CQf cQf = this.z;
        if (cQf.e) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            cQf.b(e, false, this.y);
            b();
        }
    }
}
