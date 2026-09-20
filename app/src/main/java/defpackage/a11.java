package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a11<T> implements sg3<T> {
    public static final int w = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public static y11 h(long j, TimeUnit timeUnit, c54 c54Var) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (c54Var != null) {
            return new y11(Math.max(0L, j), timeUnit, c54Var);
        }
        throw new NullPointerException("scheduler is null");
    }

    @Override // defpackage.sg3
    public final void a(gw4<? super T> gw4Var) {
        if (gw4Var instanceof v11) {
            e((v11) gw4Var);
        } else {
            if (gw4Var == null) {
                throw new NullPointerException("s is null");
            }
            e(new ou4(gw4Var));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> a11<R> c(i91<? super T, ? extends sg3<? extends R>> i91Var) {
        mq2.c(2, "prefetch");
        if (!(this instanceof s34)) {
            return new d11(this, i91Var);
        }
        Object objCall = ((s34) this).call();
        return objCall == null ? e11.x : new r11(i91Var, objCall);
    }

    public final void e(v11<? super T> v11Var) {
        if (v11Var == null) {
            throw new NullPointerException("s is null");
        }
        try {
            f(v11Var);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            XTd3.w(th);
            m14.b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void f(gw4<? super T> gw4Var);
}
