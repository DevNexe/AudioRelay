package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mv6 {
    public final Unsafe a;

    public long A(Field field) {
        return this.a.objectFieldOffset(field);
    }

    public void B(Object obj, long j, int i) {
        this.a.putInt(obj, j, i);
    }

    public Object C(long j, Object obj) {
        return this.a.getObject(obj, j);
    }

    public void D(Object obj, long j, long j2) {
        this.a.putLong(obj, j, j2);
    }

    public void E(long j, Object obj, Object obj2) {
        this.a.putObject(obj, j, obj2);
    }

    public void F(Object obj, long j, int i) {
        this.a.putInt(obj, j, i);
    }

    public void G(Object obj, long j, long j2) {
        this.a.putLong(obj, j, j2);
    }

    public void H(long j, Object obj, Object obj2) {
        this.a.putObject(obj, j, obj2);
    }

    public abstract byte a(long j);

    public abstract double b(long j, Object obj);

    public abstract double c(long j, Object obj);

    public abstract float d(long j, Object obj);

    public abstract float e(long j, Object obj);

    public abstract void f(Object obj, long j, boolean z);

    public abstract void g(long j, byte[] bArr, long j2, long j3);

    public abstract void h(Object obj, long j, byte b);

    public abstract void i(Object obj, long j, double d);

    public abstract void j(Object obj, long j, boolean z);

    public abstract void k(Object obj, long j, byte b);

    public abstract void l(Object obj, long j, float f);

    public abstract void m(Object obj, long j, double d);

    public abstract boolean n(long j, Object obj);

    public int o(Class cls) {
        return this.a.arrayBaseOffset(cls);
    }

    public abstract void p(Object obj, long j, float f);

    public int q(Class cls) {
        return this.a.arrayIndexScale(cls);
    }

    public abstract boolean r(long j, Object obj);

    public int s(long j, Object obj) {
        return this.a.getInt(obj, j);
    }

    public int t(Class cls) {
        return this.a.arrayBaseOffset(cls);
    }

    public int u(Class cls) {
        return this.a.arrayIndexScale(cls);
    }

    public long v(long j, Object obj) {
        return this.a.getLong(obj, j);
    }

    public int w(long j, Object obj) {
        return this.a.getInt(obj, j);
    }

    public void x(Field field) {
        this.a.objectFieldOffset(field);
    }

    public long y(long j, Object obj) {
        return this.a.getLong(obj, j);
    }

    public Object z(long j, Object obj) {
        return this.a.getObject(obj, j);
    }
}
