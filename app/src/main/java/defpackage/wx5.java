package defpackage;

import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzakm;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class wx5 {
    public static final boolean c = zzakm.zzb;
    public final ArrayList a = new ArrayList();
    public boolean b = false;

    public final synchronized void a(String str, long j) {
        if (this.b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.a.add(new vx5(str, j, SystemClock.elapsedRealtime()));
    }

    public final synchronized void b(String str) {
        long j;
        this.b = true;
        if (this.a.size() == 0) {
            j = 0;
        } else {
            long j2 = ((vx5) this.a.get(0)).c;
            ArrayList arrayList = this.a;
            j = ((vx5) arrayList.get(arrayList.size() - 1)).c - j2;
        }
        if (j <= 0) {
            return;
        }
        long j3 = ((vx5) this.a.get(0)).c;
        zzakm.zza("(%-4d ms) %s", Long.valueOf(j), str);
        for (vx5 vx5Var : this.a) {
            long j4 = vx5Var.c;
            zzakm.zza("(+%-4d) [%2d] %s", Long.valueOf(j4 - j3), Long.valueOf(vx5Var.b), vx5Var.a);
            j3 = j4;
        }
    }

    public final void finalize() {
        if (this.b) {
            return;
        }
        b("Request on the loose");
        zzakm.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
