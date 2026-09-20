package defpackage;

import android.os.Process;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n5 implements Runnable {
    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
