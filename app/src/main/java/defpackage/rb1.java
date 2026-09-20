package defpackage;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class rb1 extends c54 {
    public final Handler b;
    public final boolean c = false;

    public static final class CQf implements Runnable, vl0 {
        public final Handler w;
        public final Runnable x;
        public volatile boolean y;

        public CQf(Handler handler, Runnable runnable) {
            this.w = handler;
            this.x = runnable;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.w.removeCallbacks(this);
            this.y = true;
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.y;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.x.run();
            } catch (Throwable th) {
                m14.b(th);
            }
        }
    }

    public static final class QnHx extends c54.F1 {
        public final Handler w;
        public final boolean x;
        public volatile boolean y;

        public QnHx(Handler handler, boolean z) {
            this.w = handler;
            this.x = z;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.y = true;
            this.w.removeCallbacksAndMessages(this);
        }

        @Override // c54.F1
        @SuppressLint({"NewApi"})
        public final vl0 d(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            boolean z = this.y;
            yr0 yr0Var = yr0.INSTANCE;
            if (z) {
                return yr0Var;
            }
            Handler handler = this.w;
            CQf cQf = new CQf(handler, runnable);
            Message messageObtain = Message.obtain(handler, cQf);
            messageObtain.obj = this;
            if (this.x) {
                messageObtain.setAsynchronous(true);
            }
            this.w.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
            if (!this.y) {
                return cQf;
            }
            this.w.removeCallbacks(cQf);
            return yr0Var;
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.y;
        }
    }

    public rb1(Handler handler) {
        this.b = handler;
    }

    @Override // defpackage.c54
    public final c54.F1 a() {
        return new QnHx(this.b, this.c);
    }

    @Override // defpackage.c54
    @SuppressLint({"NewApi"})
    public final vl0 c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        Handler handler = this.b;
        CQf cQf = new CQf(handler, runnable);
        Message messageObtain = Message.obtain(handler, cQf);
        if (this.c) {
            messageObtain.setAsynchronous(true);
        }
        handler.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
        return cQf;
    }
}
