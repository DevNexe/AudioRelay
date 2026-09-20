package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vk4<T> implements rl4<T> {
    public static el4 e(Throwable th) {
        if (th != null) {
            return new el4(new m91.PRnFixed(th));
        }
        throw new NullPointerException("exception is null");
    }

    public static jl4 f(Object obj) {
        if (obj != null) {
            return new jl4(obj);
        }
        throw new NullPointerException("item is null");
    }

    public static vk4 k(vk4 vk4Var, vk4 vk4Var2, ba baVar) {
        if (vk4Var == null) {
            throw new NullPointerException("source1 is null");
        }
        if (vk4Var2 != null) {
            return m(new m91.CQf(baVar), vk4Var, vk4Var2);
        }
        throw new NullPointerException("source2 is null");
    }

    public static vk4 l(vk4 vk4Var, vk4 vk4Var2, vk4 vk4Var3, vk4 vk4Var4, b91 b91Var) {
        if (vk4Var == null) {
            throw new NullPointerException("source1 is null");
        }
        if (vk4Var2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (vk4Var3 != null) {
            return m(new m91.LPt8Fixed(b91Var), vk4Var, vk4Var2, vk4Var3, vk4Var4);
        }
        throw new NullPointerException("source3 is null");
    }

    public static <T, R> vk4<R> m(i91<? super Object[], ? extends R> i91Var, rl4<? extends T>... rl4VarArr) {
        return rl4VarArr.length == 0 ? e(new NoSuchElementException()) : new am4(i91Var, rl4VarArr);
    }

    @Override // defpackage.rl4
    public final void b(ml4<? super T> ml4Var) {
        if (ml4Var == null) {
            throw new NullPointerException("observer is null");
        }
        try {
            i(ml4Var);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            XTd3.w(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final ll4 g(c54 c54Var) {
        if (c54Var != null) {
            return new ll4(this, c54Var);
        }
        throw new NullPointerException("scheduler is null");
    }

    public final nl4 h(Object obj) {
        if (obj != null) {
            return new nl4(this, obj);
        }
        throw new NullPointerException("value is null");
    }

    public abstract void i(ml4<? super T> ml4Var);

    /* JADX WARN: Multi-variable type inference failed */
    public final vq2<T> j() {
        return this instanceof p91 ? ((p91) this).a() : new xl4(this);
    }
}
