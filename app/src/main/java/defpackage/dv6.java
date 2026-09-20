package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes3.dex */
public class dv6 implements xv6 {
    public final dq6 a;

    public /* synthetic */ dv6(dq6 dq6Var) {
        oa3.h(dq6Var);
        this.a = dq6Var;
    }

    public /* synthetic */ dv6(dq6 dq6Var, int i) {
        this.a = dq6Var;
    }

    @Override // defpackage.xv6
    @Pure
    public final ft b() {
        throw null;
    }

    @Override // defpackage.xv6
    @Pure
    public final Context c() {
        throw null;
    }

    public boolean d() {
        dq6 dq6Var = this.a;
        if (!TextUtils.isEmpty(dq6Var.b)) {
            return false;
        }
        bi6 bi6Var = dq6Var.i;
        dq6.h(bi6Var);
        return Log.isLoggable(bi6Var.q(), 3);
    }

    public void e() {
        ro6 ro6Var = this.a.j;
        dq6.h(ro6Var);
        ro6Var.e();
    }

    @Override // defpackage.xv6
    @Pure
    public final sy4 zzaw() {
        throw null;
    }

    @Override // defpackage.xv6
    @Pure
    public final bi6 zzay() {
        throw null;
    }

    @Override // defpackage.xv6
    @Pure
    public final ro6 zzaz() {
        throw null;
    }
}
