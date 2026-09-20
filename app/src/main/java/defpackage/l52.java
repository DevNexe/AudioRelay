package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l52 {
    public final long a;
    public final QnHx b;

    public enum QnHx implements qf3 {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        public final int w;

        QnHx(int i) {
            this.w = i;
        }

        @Override // defpackage.qf3
        public final int b() {
            return this.w;
        }
    }

    public l52(long j, QnHx qnHx) {
        this.a = j;
        this.b = qnHx;
    }
}
