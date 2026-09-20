package defpackage;

import androidx.work.impl.model.WorkSpec;

/* JADX INFO: loaded from: classes.dex */
public final class vi0 implements Runnable {
    public final /* synthetic */ WorkSpec w;
    public final /* synthetic */ wi0 x;

    public vi0(wi0 wi0Var, WorkSpec workSpec) {
        this.x = wi0Var;
        this.w = workSpec;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s52 s52VarC = s52.c();
        String str = wi0.d;
        WorkSpec workSpec = this.w;
        s52VarC.a(str, String.format("Scheduling work %s", workSpec.a), new Throwable[0]);
        this.x.a.a(workSpec);
    }
}
