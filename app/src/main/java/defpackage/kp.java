package defpackage;

import com.azefsw.audioconnect.network.exceptions.MessageException;

/* JADX INFO: loaded from: classes.dex */
public final class kp implements vt0 {
    public final g7 w;

    public static final class QnHx extends cx1 implements j81<Throwable, Boolean> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final Boolean invoke(Throwable th) {
            Throwable th2 = th;
            Throwable cause = th2;
            while (cause != null && !(cause instanceof MessageException)) {
                cause = cause.getCause();
            }
            MessageException messageException = (MessageException) cause;
            boolean z = false;
            if (!(messageException != null ? messageException.w : false) && !XTd3.q(th2, nl3.a(cc4.class))) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public kp(g7 g7Var) {
        this.w = g7Var;
    }

    @Override // defpackage.vt0
    public final ut0 a() {
        return new ix0((xb0) this.w.a(), QnHx.w);
    }
}
