package defpackage;

import com.google.auto.value.AutoValue;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class e54 {

    public enum CQf {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    @AutoValue
    public static abstract class QnHx {

        /* JADX INFO: renamed from: e54$QnHx$QnHx, reason: collision with other inner class name */
        @AutoValue.Builder
        public static abstract class AbstractC0120QnHx {
        }

        public abstract long a();

        public abstract Set<CQf> b();

        public abstract long c();
    }

    public abstract at a();

    public final long b(ie3 ie3Var, long j, int i) {
        long jA = j - a().a();
        QnHx qnHx = c().get(ie3Var);
        long jA2 = qnHx.a();
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * jA2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((jA2 > 1 ? jA2 : 2L) * ((long) i2)))), jA), qnHx.c());
    }

    public abstract Map<ie3, QnHx> c();
}
