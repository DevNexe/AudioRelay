package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class of5 implements ThreadFactory {
    public final /* synthetic */ String w;
    public final /* synthetic */ boolean x;

    public /* synthetic */ of5(String str, boolean z) {
        this.w = str;
        this.x = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.w);
        thread.setDaemon(this.x);
        return thread;
    }
}
