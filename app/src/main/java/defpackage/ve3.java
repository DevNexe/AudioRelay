package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ve3 implements Executor {
    public final /* synthetic */ int w;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.w) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
