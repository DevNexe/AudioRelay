package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class LPt6Fixed {
    public static final LPt6Fixed b = new LPt6Fixed(new QnHx());
    public final Throwable a;

    public class QnHx extends Throwable {
        public QnHx() {
            super("Failure occurred while trying to finish a future.");
        }

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public LPt6Fixed(Throwable th) {
        th.getClass();
        this.a = th;
    }
}
