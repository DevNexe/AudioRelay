package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class ox5 implements Executor {
    public final /* synthetic */ Handler w;

    public ox5(Handler handler) {
        this.w = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.w.post(runnable);
    }
}
