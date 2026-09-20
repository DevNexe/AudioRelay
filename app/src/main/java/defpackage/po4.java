package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes3.dex */
public final class po4 {
    public static po4 b;
    public final Object a = new Object();

    public static class CQf {
    }

    public class QnHx implements Handler.Callback {
        public QnHx() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            po4 po4Var = po4.this;
            CQf cQf = (CQf) message.obj;
            synchronized (po4Var.a) {
                try {
                    if (cQf == null) {
                        cQf.getClass();
                        throw null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
    }

    public po4() {
        new Handler(Looper.getMainLooper(), new QnHx());
    }
}
