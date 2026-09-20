package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bn {
    public boolean a;
    public QnHx b;
    public boolean c;

    public interface QnHx {
        void onCancel();
    }

    public final void a() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            this.c = true;
            QnHx qnHx = this.b;
            if (qnHx != null) {
                try {
                    qnHx.onCancel();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.c = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.c = false;
                notifyAll();
            }
        }
    }

    public final void b(QnHx qnHx) {
        synchronized (this) {
            while (this.c) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.b == qnHx) {
                return;
            }
            this.b = qnHx;
            if (this.a) {
                qnHx.onCancel();
            }
        }
    }
}
