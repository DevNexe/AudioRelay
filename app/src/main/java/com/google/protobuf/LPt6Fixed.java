package com.google.protobuf;

import defpackage.GM;
import defpackage.ev2;
import defpackage.zw0;
import java.lang.reflect.Field;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class LPt6Fixed implements Comparable<LPt6Fixed> {
    public final Field A;
    public final int B;
    public final boolean C;
    public final boolean D;
    public final ev2 E;
    public final Field F;
    public final Class<?> G;
    public final Object H;
    public final SjP.CQf I;
    public final Field w;
    public final zw0 x;
    public final Class<?> y;
    public final int z;

    public LPt6Fixed(Field field, int i, zw0 zw0Var, Class<?> cls, Field field2, int i2, boolean z, boolean z2, ev2 ev2Var, Class<?> cls2, Object obj, SjP.CQf cQf, Field field3) {
        this.w = field;
        this.x = zw0Var;
        this.y = cls;
        this.z = i;
        this.A = field2;
        this.B = i2;
        this.C = z;
        this.D = z2;
        this.E = ev2Var;
        this.G = cls2;
        this.H = obj;
        this.I = cQf;
        this.F = field3;
    }

    public static void a(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(GM.a("fieldNumber must be positive: ", i));
        }
    }

    public static LPt6Fixed c(Field field, int i, zw0 zw0Var, boolean z) {
        a(i);
        Charset charset = SjP.a;
        if (field == null) {
            throw new NullPointerException("field");
        }
        if (zw0Var == null) {
            throw new NullPointerException("fieldType");
        }
        if (zw0Var == zw0.a0 || zw0Var == zw0.w0) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new LPt6Fixed(field, i, zw0Var, null, null, 0, false, z, null, null, null, null, null);
    }

    public static LPt6Fixed d(Field field, int i, Object obj, SjP.CQf cQf) {
        Charset charset = SjP.a;
        if (obj == null) {
            throw new NullPointerException("mapDefaultEntry");
        }
        a(i);
        if (field != null) {
            return new LPt6Fixed(field, i, zw0.x0, null, null, 0, false, true, null, null, obj, cQf, null);
        }
        throw new NullPointerException("field");
    }

    public static LPt6Fixed e(Field field, int i, zw0 zw0Var, Field field2) {
        a(i);
        Charset charset = SjP.a;
        if (field == null) {
            throw new NullPointerException("field");
        }
        if (zw0Var == null) {
            throw new NullPointerException("fieldType");
        }
        if (zw0Var == zw0.a0 || zw0Var == zw0.w0) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new LPt6Fixed(field, i, zw0Var, null, null, 0, false, false, null, null, null, null, field2);
    }

    public static LPt6Fixed g(Field field, int i, zw0 zw0Var, Class<?> cls) {
        a(i);
        Charset charset = SjP.a;
        if (field == null) {
            throw new NullPointerException("field");
        }
        if (zw0Var == null) {
            throw new NullPointerException("fieldType");
        }
        if (cls != null) {
            return new LPt6Fixed(field, i, zw0Var, cls, null, 0, false, false, null, null, null, null, null);
        }
        throw new NullPointerException("messageClass");
    }

    @Override // java.lang.Comparable
    public final int compareTo(LPt6Fixed lPt6) {
        return this.z - lPt6.z;
    }
}
