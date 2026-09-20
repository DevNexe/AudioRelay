package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hy0 {
    public final long a;
    public final long b;

    public static class QnHx {
        public long a = 60;
        public long b = com.google.firebase.remoteconfig.internal.QnHx.i;

        public final void a(long j) {
            if (j >= 0) {
                this.b = j;
                return;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j + " is an invalid argument");
        }
    }

    public hy0(QnHx qnHx) {
        this.a = qnHx.a;
        this.b = qnHx.b;
    }
}
