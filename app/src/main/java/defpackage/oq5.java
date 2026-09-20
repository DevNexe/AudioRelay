package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class oq5<T> extends zp5 {
    public final z05<T> b;

    public oq5(z05 z05Var) {
        super(4);
        this.b = z05Var;
    }

    @Override // defpackage.xq5
    public final void a(Status status) {
        this.b.b(new ApiException(status));
    }

    @Override // defpackage.xq5
    public final void b(RuntimeException runtimeException) {
        this.b.b(runtimeException);
    }

    @Override // defpackage.xq5
    public final void c(tp5<?> tp5Var) throws DeadObjectException {
        try {
            h(tp5Var);
        } catch (DeadObjectException e) {
            a(xq5.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(xq5.e(e2));
        } catch (RuntimeException e3) {
            this.b.b(e3);
        }
    }

    public abstract void h(tp5<?> tp5Var);
}
