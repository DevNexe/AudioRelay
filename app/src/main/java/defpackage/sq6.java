package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class sq6 extends jq6 {
    public final Callable y;
    public final /* synthetic */ tq6 z;

    public sq6(tq6 tq6Var, Callable callable) {
        this.z = tq6Var;
        callable.getClass();
        this.y = callable;
    }

    @Override // defpackage.jq6
    public final Object a() {
        return this.y.call();
    }

    @Override // defpackage.jq6
    public final String b() {
        return this.y.toString();
    }

    @Override // defpackage.jq6
    public final void d(Throwable th) {
        this.z.zze(th);
    }

    @Override // defpackage.jq6
    public final void e(Object obj) {
        this.z.zzd(obj);
    }

    @Override // defpackage.jq6
    public final boolean f() {
        return this.z.isDone();
    }
}
