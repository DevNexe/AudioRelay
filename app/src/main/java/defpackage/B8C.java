package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.view.View;
import com.google.android.gms.internal.ads.ct;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AddedAbstractMethod"})
public abstract class B8C implements yy, pf0, g40, ls0, i40 {
    @Override // defpackage.g40
    public String A(pa4 pa4Var, int i) {
        return Q();
    }

    public abstract Path A0(float f, float f2, float f3, float f4);

    public abstract h04 B0();

    @Override // defpackage.pf0
    public abstract int C();

    public abstract List C0();

    @Override // defpackage.g40
    public short D(ce3 ce3Var, int i) {
        return l0();
    }

    public abstract cs2 D0(c54 c54Var);

    public abstract vq2 E0(c54 c54Var);

    @Override // defpackage.ls0
    public abstract void F(db4 db4Var, Object obj);

    public abstract ds2 F0(c54 c54Var);

    @Override // defpackage.g40
    public void G(pa4 pa4Var) {
    }

    public boolean G0() {
        switch (z0()) {
            case UNKNOWN:
            case IOS:
            case ANDROID:
            case ANDROID_TV:
                return false;
            case WINDOWS:
            case LINUX:
            case MAC_OS:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public abstract void H0(@SuppressLint({"UnknownNullness"}) Object obj);

    @Override // defpackage.i40
    public void I(ce3 ce3Var, int i, byte b) {
        x0(ce3Var, i);
        o(b);
    }

    public abstract View I0(int i);

    @Override // defpackage.g40
    public Object J(pa4 pa4Var, int i, zj0 zj0Var, Object obj) {
        return O(zj0Var);
    }

    public abstract void J0(int i);

    @Override // defpackage.ls0
    public abstract void K(char c);

    public abstract void K0(Typeface typeface, boolean z);

    @Override // defpackage.pf0
    public void L() {
    }

    public abstract boolean L0();

    public abstract void M0(String str);

    public abstract void N0();

    @Override // defpackage.pf0
    public Object O(zj0 zj0Var) {
        return zj0Var.c(this);
    }

    public abstract cs2 O0(c54 c54Var);

    @Override // defpackage.ls0
    public void P() {
    }

    public abstract void P0(eg4 eg4Var);

    @Override // defpackage.pf0
    public String Q() {
        w0();
        throw null;
    }

    public abstract void Q0();

    @Override // defpackage.i40
    public void R(ce3 ce3Var, int i, float f) {
        x0(ce3Var, i);
        x(f);
    }

    public abstract void R0(byte[] bArr, int i, int i2);

    @Override // defpackage.pf0
    public int S(pa4 pa4Var) {
        w0();
        throw null;
    }

    public abstract void S0(zi3 zi3Var);

    public abstract int T0(ct ctVar);

    public abstract void U0(ct ctVar, Set set);

    @Override // defpackage.pf0
    public abstract long V();

    @Override // defpackage.g40
    public int W(ce3 ce3Var, int i) {
        return C();
    }

    @Override // defpackage.pf0
    public boolean X() {
        return true;
    }

    @Override // defpackage.yy
    public Set Y(Class cls) {
        return (Set) N(cls).get();
    }

    @Override // defpackage.i40
    public void Z(ce3 ce3Var, int i, short s) {
        x0(ce3Var, i);
        m(s);
    }

    @Override // defpackage.i40
    public void a0(ce3 ce3Var, int i, boolean z) {
        x0(ce3Var, i);
        q(z);
    }

    @Override // defpackage.pf0
    public g40 b(pa4 pa4Var) {
        return this;
    }

    @Override // defpackage.g40
    public void b0() {
    }

    @Override // defpackage.i40
    public void c0(pa4 pa4Var, int i, String str) {
        x0(pa4Var, i);
        r0(str);
    }

    @Override // defpackage.yy
    public Object d(Class cls) {
        pg3 pg3VarU = u(cls);
        if (pg3VarU == null) {
            return null;
        }
        return pg3VarU.get();
    }

    @Override // defpackage.i40
    public void d0(ce3 ce3Var, int i, char c) {
        x0(ce3Var, i);
        K(c);
    }

    @Override // defpackage.i40
    public void f(ce3 ce3Var, int i, double d) {
        x0(ce3Var, i);
        l(d);
    }

    @Override // defpackage.ls0
    public abstract void f0(int i);

    @Override // defpackage.i40
    public void g(int i, int i2, ce3 ce3Var) {
        x0(ce3Var, i);
        f0(i2);
    }

    @Override // defpackage.pf0
    public pf0 g0(mn1 mn1Var) {
        return this;
    }

    @Override // defpackage.ls0
    public abstract void h0(long j);

    @Override // defpackage.pf0
    public boolean i() {
        w0();
        throw null;
    }

    @Override // defpackage.g40
    public boolean i0(ce3 ce3Var, int i) {
        return i();
    }

    @Override // defpackage.pf0
    public char j() {
        w0();
        throw null;
    }

    @Override // defpackage.pf0
    public abstract byte j0();

    @Override // defpackage.i40
    public void k0(pa4 pa4Var, int i, db4 db4Var, Object obj) {
        x0(pa4Var, i);
        F(db4Var, obj);
    }

    @Override // defpackage.ls0
    public abstract void l(double d);

    @Override // defpackage.pf0
    public abstract short l0();

    @Override // defpackage.ls0
    public abstract void m(short s);

    @Override // defpackage.i40
    public void n(pa4 pa4Var, int i, long j) {
        x0(pa4Var, i);
        h0(j);
    }

    @Override // defpackage.pf0
    public float n0() {
        w0();
        throw null;
    }

    @Override // defpackage.ls0
    public abstract void o(byte b);

    @Override // defpackage.g40
    public Object o0(u83 u83Var, int i, rv1 rv1Var, Object obj) {
        if (rv1Var.a().c() || X()) {
            return O(rv1Var);
        }
        L();
        return null;
    }

    @Override // defpackage.g40
    public long p0(pa4 pa4Var, int i) {
        return V();
    }

    @Override // defpackage.ls0
    public abstract void q(boolean z);

    @Override // defpackage.ls0
    public abstract void r0(String str);

    @Override // defpackage.g40
    public double s(ce3 ce3Var, int i) {
        return s0();
    }

    @Override // defpackage.pf0
    public double s0() {
        w0();
        throw null;
    }

    @Override // defpackage.g40
    public char t(ce3 ce3Var, int i) {
        return j();
    }

    public abstract List t0(String str, List list);

    public abstract long u0();

    @Override // defpackage.g40
    public float v(ce3 ce3Var, int i) {
        return n0();
    }

    public abstract void v0();

    @Override // defpackage.ls0
    public eu1 w(pa4 pa4Var) {
        return ((mu4) this).b(pa4Var);
    }

    public void w0() {
        throw new SerializationException(nl3.a(getClass()) + " can't retrieve untyped values");
    }

    @Override // defpackage.ls0
    public abstract void x(float f);

    public abstract void x0(pa4 pa4Var, int i);

    public String y0() {
        return B0().a;
    }

    @Override // defpackage.g40
    public byte z(ce3 ce3Var, int i) {
        return j0();
    }

    public abstract mv2 z0();
}
