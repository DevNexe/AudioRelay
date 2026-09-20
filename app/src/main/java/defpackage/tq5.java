package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class tq5<ResultT> extends zp5 {
    public final y05<Object, ResultT> b;
    public final z05<ResultT> c;
    public final su4 d;

    public tq5(int i, kq5 kq5Var, z05 z05Var, su4 su4Var) {
        super(i);
        this.c = z05Var;
        this.b = kq5Var;
        this.d = su4Var;
        if (i == 2 && kq5Var.b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // defpackage.xq5
    public final void a(Status status) {
        this.d.getClass();
        this.c.b(status.z != null ? new ResolvableApiException(status) : new ApiException(status));
    }

    @Override // defpackage.xq5
    public final void b(RuntimeException runtimeException) {
        this.c.b(runtimeException);
    }

    @Override // defpackage.xq5
    public final void c(tp5<?> tp5Var) throws DeadObjectException {
        z05<ResultT> z05Var = this.c;
        try {
            y05<Object, ResultT> y05Var = this.b;
            ((kq5) y05Var).d.a.a(tp5Var.x, z05Var);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(xq5.e(e2));
        } catch (RuntimeException e3) {
            z05Var.b(e3);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.xq5
    public final void d(gp5 gp5Var, boolean z) {
        Map<z05<?>, Boolean> map = gp5Var.b;
        Boolean boolValueOf = Boolean.valueOf(z);
        z05<ResultT> z05Var = this.c;
        map.put((z05<?>) z05Var, boolValueOf);
        kc7<TResult> kc7Var = z05Var.a;
        cq4 cq4Var = new cq4(gp5Var, z05Var, 13);
        kc7Var.getClass();
        kc7Var.b.a(new tz6(d15.a, cq4Var));
        kc7Var.v();
    }

    @Override // defpackage.zp5
    public final boolean f(tp5<?> tp5Var) {
        return this.b.b;
    }

    @Override // defpackage.zp5
    public final tw0[] g(tp5<?> tp5Var) {
        return this.b.a;
    }
}
