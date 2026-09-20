package defpackage;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes.dex */
public interface pv2 {

    @SuppressLint({"SyntheticAccessor"})
    public static final QnHx.F1 a = new QnHx.F1();

    @SuppressLint({"SyntheticAccessor"})
    public static final QnHx.CQf b = new QnHx.CQf();

    public static abstract class QnHx {

        public static final class CQf extends QnHx {
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class F1 extends QnHx {
            public final String toString() {
                return "SUCCESS";
            }
        }

        /* JADX INFO: renamed from: pv2$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0183QnHx extends QnHx {
            public final Throwable a;

            public C0183QnHx(Throwable th) {
                this.a = th;
            }

            public final String toString() {
                return String.format("FAILURE (%s)", this.a.getMessage());
            }
        }
    }
}
