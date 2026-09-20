package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qw implements tx {
    public static lx e(Iterable iterable) {
        if (iterable != null) {
            return new lx(iterable);
        }
        throw new NullPointerException("sources is null");
    }

    @Override // defpackage.tx
    public final void b(nx nxVar) {
        if (nxVar == null) {
            throw new NullPointerException("observer is null");
        }
        try {
            h(nxVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            XTd3.w(th);
            m14.b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final rx c(m70 m70Var) {
        m91.byN byn = m91.d;
        m91.T23 t23 = m91.c;
        return new rx(this, byn, m70Var, t23, t23);
    }

    public final rx d(m70 m70Var) {
        m91.byN byn = m91.d;
        m91.T23 t23 = m91.c;
        return new rx(this, m70Var, byn, t23, t23);
    }

    public final zl f(InterfaceC1443fH interfaceC1443fH, m70 m70Var) {
        if (interfaceC1443fH == null) {
            throw new NullPointerException("onComplete is null");
        }
        zl zlVar = new zl(interfaceC1443fH, m70Var);
        b(zlVar);
        return zlVar;
    }

    public final vr0 g() {
        vr0 vr0Var = new vr0();
        b(vr0Var);
        return vr0Var;
    }

    public abstract void h(nx nxVar);

    public final ux i(c54 c54Var) {
        if (c54Var != null) {
            return new ux(this, c54Var);
        }
        throw new NullPointerException("scheduler is null");
    }
}
