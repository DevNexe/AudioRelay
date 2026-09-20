package defpackage;

import com.google.firebase.remoteconfig.internal.CQf;
import com.google.firebase.remoteconfig.internal.QnHx;

/* JADX INFO: loaded from: classes.dex */
public final class gy0 {
    public final xk4 a = new xk4(new fl4(new il4(new dy0(0)), new NFo7(this, 6)));

    public static boolean a(cy0 cy0Var) {
        long j;
        CQf cQf = cy0Var.g;
        synchronized (cQf.b) {
            j = cQf.a.getLong("last_fetch_time_in_millis", -1L);
            cQf.a.getInt("last_fetch_status", 0);
            hy0.QnHx qnHx = new hy0.QnHx();
            long j2 = cQf.a.getLong("fetch_timeout_in_seconds", 60L);
            if (j2 < 0) {
                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j2)));
            }
            qnHx.a = j2;
            qnHx.a(cQf.a.getLong("minimum_fetch_interval_in_seconds", QnHx.i));
        }
        return j > -1;
    }
}
