package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class ky2 implements w64 {
    public static final f34 h = NRt.b(QnHx.w, CQf.w);
    public final q12 a;
    public final kz2 b;
    public int c;
    public final uj0 d;
    public final uj0 e;
    public final kz2 f;
    public final kz2 g;

    public static final class CQf extends cx1 implements j81<List<? extends Object>, ky2> {
        public static final CQf w = new CQf();

        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final ky2 invoke(List<? extends Object> list) {
            return new ky2(((Integer) list.get(0)).intValue());
        }
    }

    public static final class F1 extends cx1 implements h81<Float> {
        public F1() {
            super(0);
        }

        @Override // defpackage.h81
        public final Float invoke() {
            k02 k02VarPrevious;
            ky2 ky2Var = ky2.this;
            List<k02> listE = ky2Var.a.g().e();
            ListIterator<k02> listIterator = listE.listIterator(listE.size());
            do {
                if (!listIterator.hasPrevious()) {
                    k02VarPrevious = null;
                    break;
                }
                k02VarPrevious = listIterator.previous();
            } while (!(k02VarPrevious.getIndex() == ky2Var.f()));
            k02 k02Var = k02VarPrevious;
            return Float.valueOf(k02Var != null ? AY.n((-k02Var.getOffset()) / k02Var.a(), -1.0f, 1.0f) : 0.0f);
        }
    }

    public static final class LPt8Fixed extends cx1 implements h81<Integer> {
        public LPt8Fixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final Integer invoke() {
            return Integer.valueOf(ky2.this.a.g().d());
        }
    }

    public static final class QnHx extends cx1 implements x81<g34, ky2, List<? extends Object>> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(2);
        }

        @Override // defpackage.x81
        public final List<? extends Object> invoke(g34 g34Var, ky2 ky2Var) {
            return Collections.singletonList(Integer.valueOf(ky2Var.f()));
        }
    }

    public ky2(int i) {
        this.a = new q12(i, 2, 0);
        this.b = ps0.R(Integer.valueOf(i));
        this.d = ps0.x(new LPt8Fixed());
        this.e = ps0.x(new F1());
        this.f = ps0.R(null);
        this.g = ps0.R(null);
    }

    @Override // defpackage.w64
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.w64
    public final Object b(vi2 vi2Var, x81<? super l64, ? super z80<? super sd5>, ? extends Object> x81Var, z80<? super sd5> z80Var) throws Throwable {
        Object objB = this.a.b(vi2Var, x81Var, z80Var);
        return objB == va0.COROUTINE_SUSPENDED ? objB : sd5.a;
    }

    @Override // defpackage.w64
    public final float c(float f) {
        return this.a.c(f);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a9 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:18:0x0045, B:26:0x005d, B:44:0x009e, B:46:0x00a9, B:50:0x00bc), top: B:102:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bc A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:18:0x0045, B:26:0x005d, B:44:0x009e, B:46:0x00a9, B:50:0x00bc), top: B:102:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e8 A[Catch: all -> 0x003c, TryCatch #3 {all -> 0x003c, blocks: (B:13:0x0037, B:74:0x014d, B:75:0x015d, B:77:0x0163, B:84:0x0177, B:86:0x017b, B:88:0x0181, B:53:0x00d2, B:54:0x00e2, B:56:0x00e8, B:63:0x00fc, B:66:0x0102, B:69:0x0119, B:71:0x0126), top: B:102:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:66:0x0102 A[Catch: all -> 0x003c, TRY_ENTER, TryCatch #3 {all -> 0x003c, blocks: (B:13:0x0037, B:74:0x014d, B:75:0x015d, B:77:0x0163, B:84:0x0177, B:86:0x017b, B:88:0x0181, B:53:0x00d2, B:54:0x00e2, B:56:0x00e8, B:63:0x00fc, B:66:0x0102, B:69:0x0119, B:71:0x0126), top: B:102:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0118 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x0119 A[Catch: all -> 0x003c, TryCatch #3 {all -> 0x003c, blocks: (B:13:0x0037, B:74:0x014d, B:75:0x015d, B:77:0x0163, B:84:0x0177, B:86:0x017b, B:88:0x0181, B:53:0x00d2, B:54:0x00e2, B:56:0x00e8, B:63:0x00fc, B:66:0x0102, B:69:0x0119, B:71:0x0126), top: B:102:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0126 A[Catch: all -> 0x003c, TryCatch #3 {all -> 0x003c, blocks: (B:13:0x0037, B:74:0x014d, B:75:0x015d, B:77:0x0163, B:84:0x0177, B:86:0x017b, B:88:0x0181, B:53:0x00d2, B:54:0x00e2, B:56:0x00e8, B:63:0x00fc, B:66:0x0102, B:69:0x0119, B:71:0x0126), top: B:102:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x014c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:77:0x0163 A[Catch: all -> 0x003c, TryCatch #3 {all -> 0x003c, blocks: (B:13:0x0037, B:74:0x014d, B:75:0x015d, B:77:0x0163, B:84:0x0177, B:86:0x017b, B:88:0x0181, B:53:0x00d2, B:54:0x00e2, B:56:0x00e8, B:63:0x00fc, B:66:0x0102, B:69:0x0119, B:71:0x0126), top: B:102:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0170  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:80:0x0172  */
    /* JADX WARN: Code duplicated, block: B:86:0x017b A[Catch: all -> 0x003c, TryCatch #3 {all -> 0x003c, blocks: (B:13:0x0037, B:74:0x014d, B:75:0x015d, B:77:0x0163, B:84:0x0177, B:86:0x017b, B:88:0x0181, B:53:0x00d2, B:54:0x00e2, B:56:0x00e8, B:63:0x00fc, B:66:0x0102, B:69:0x0119, B:71:0x0126), top: B:102:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0199 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    public final Object d(int i, z80 z80Var) throws Throwable {
        ly2 ly2Var;
        Throwable th;
        ky2 ky2Var;
        ky2 ky2Var2;
        int i2;
        float f;
        q12 q12Var;
        my2 my2Var;
        q12 q12Var2;
        ky2 ky2Var3;
        ky2 ky2Var4;
        int i3;
        float f2;
        y02 y02VarG;
        Iterator<T> it;
        Object next;
        k02 k02Var;
        q12 q12Var3;
        int iA;
        int iC;
        int iC2;
        boolean z;
        Iterator<T> it2;
        Object next2;
        k02 k02Var2;
        q12 q12Var4;
        int iC3;
        boolean z2;
        q12 q12Var5 = this.a;
        if (z80Var instanceof ly2) {
            ly2Var = (ly2) z80Var;
            int i4 = ly2Var.F;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                ly2Var.F = i4 - Integer.MIN_VALUE;
            } else {
                ly2Var = new ly2(this, z80Var);
            }
        } else {
            ly2Var = new ly2(this, z80Var);
        }
        Object obj = ly2Var.D;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        ?? r3 = ly2Var.F;
        try {
            try {
                switch (r3) {
                    case 0:
                        C0239D.H(obj);
                        if (!(i >= 0)) {
                            throw new IllegalArgumentException(ex0.b("page[", i, "] must be >= 0").toString());
                        }
                        try {
                            this.f.setValue(new Integer(i));
                            int iE = q12Var5.e();
                            if (Math.abs(i - iE) > 3) {
                                int i5 = i > iE ? i - 3 : i + 3;
                                ly2Var.z = this;
                                ly2Var.A = i;
                                ly2Var.C = 0.0f;
                                ly2Var.F = 1;
                                if (q12.h(q12Var5, i5, ly2Var) == va0Var) {
                                    return va0Var;
                                }
                            }
                            ky2Var2 = this;
                            i2 = i;
                            f = 0.0f;
                            if (Math.abs(f) <= 0.005f) {
                                q12Var2 = ky2Var2.a;
                                ly2Var.z = ky2Var2;
                                ly2Var.F = 2;
                                f34 f34Var = q12.s;
                                if (q12Var2.d(i2, 0, ly2Var) == va0Var) {
                                    return va0Var;
                                }
                                ky2Var3 = ky2Var2;
                            } else {
                                q12Var = ky2Var2.a;
                                my2Var = new my2(null);
                                ly2Var.z = ky2Var2;
                                ly2Var.A = i2;
                                ly2Var.C = f;
                                ly2Var.F = 3;
                                if (q12Var.b(vi2.Default, my2Var, ly2Var) == va0Var) {
                                    return va0Var;
                                }
                                ky2Var4 = ky2Var2;
                                i3 = i2;
                                f2 = f;
                                y02VarG = ky2Var4.a.g();
                                it = y02VarG.e().iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = it.next();
                                        if (((k02) next).getIndex() == i3) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                    } else {
                                        next = null;
                                    }
                                    k02Var = (k02) next;
                                    q12Var3 = ky2Var4.a;
                                    if (k02Var != null) {
                                        iC2 = sy4.c(k02Var.a() * f2);
                                        ly2Var.z = ky2Var4;
                                        ly2Var.F = 4;
                                        if (q12Var3.d(i3, iC2, ly2Var) == va0Var) {
                                            return va0Var;
                                        }
                                    } else if (true ^ y02VarG.e().isEmpty()) {
                                        iA = ((k02) wu.H0(y02VarG.e())).a();
                                        iC = sy4.c(iA * f2);
                                        ly2Var.z = ky2Var4;
                                        ly2Var.A = i3;
                                        ly2Var.C = f2;
                                        ly2Var.B = iA;
                                        ly2Var.F = 5;
                                        if (q12Var3.d(i3, iC, ly2Var) == va0Var) {
                                            return va0Var;
                                        }
                                        it2 = ky2Var4.a.g().e().iterator();
                                        do {
                                            if (it2.hasNext()) {
                                                next2 = it2.next();
                                                if (((k02) next2).getIndex() == i3) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                            } else {
                                                next2 = null;
                                            }
                                            k02Var2 = (k02) next2;
                                            if (k02Var2 != null && k02Var2.a() != iA) {
                                                q12Var4 = ky2Var4.a;
                                                iC3 = sy4.c(k02Var2.a() * f2);
                                                ly2Var.z = ky2Var4;
                                                ly2Var.F = 6;
                                                if (q12Var4.d(i3, iC3, ly2Var) == va0Var) {
                                                    return va0Var;
                                                }
                                            }
                                        } while (!z2);
                                        k02Var2 = (k02) next2;
                                        if (k02Var2 != null) {
                                            q12Var4 = ky2Var4.a;
                                            iC3 = sy4.c(k02Var2.a() * f2);
                                            ly2Var.z = ky2Var4;
                                            ly2Var.F = 6;
                                            if (q12Var4.d(i3, iC3, ly2Var) == va0Var) {
                                                return va0Var;
                                            }
                                        }
                                    }
                                    ky2Var3 = ky2Var4;
                                } while (!z);
                                k02Var = (k02) next;
                                q12Var3 = ky2Var4.a;
                                if (k02Var != null) {
                                    iC2 = sy4.c(k02Var.a() * f2);
                                    ly2Var.z = ky2Var4;
                                    ly2Var.F = 4;
                                    if (q12Var3.d(i3, iC2, ly2Var) == va0Var) {
                                        return va0Var;
                                    }
                                } else if (true ^ y02VarG.e().isEmpty()) {
                                    iA = ((k02) wu.H0(y02VarG.e())).a();
                                    iC = sy4.c(iA * f2);
                                    ly2Var.z = ky2Var4;
                                    ly2Var.A = i3;
                                    ly2Var.C = f2;
                                    ly2Var.B = iA;
                                    ly2Var.F = 5;
                                    if (q12Var3.d(i3, iC, ly2Var) == va0Var) {
                                        return va0Var;
                                    }
                                    it2 = ky2Var4.a.g().e().iterator();
                                    do {
                                        if (it2.hasNext()) {
                                            next2 = it2.next();
                                            if (((k02) next2).getIndex() == i3) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                        } else {
                                            next2 = null;
                                        }
                                        k02Var2 = (k02) next2;
                                        if (k02Var2 != null) {
                                            q12Var4 = ky2Var4.a;
                                            iC3 = sy4.c(k02Var2.a() * f2);
                                            ly2Var.z = ky2Var4;
                                            ly2Var.F = 6;
                                            if (q12Var4.d(i3, iC3, ly2Var) == va0Var) {
                                                return va0Var;
                                            }
                                        }
                                    } while (!z2);
                                    k02Var2 = (k02) next2;
                                    if (k02Var2 != null) {
                                        q12Var4 = ky2Var4.a;
                                        iC3 = sy4.c(k02Var2.a() * f2);
                                        ly2Var.z = ky2Var4;
                                        ly2Var.F = 6;
                                        if (q12Var4.d(i3, iC3, ly2Var) == va0Var) {
                                            return va0Var;
                                        }
                                    }
                                }
                                ky2Var3 = ky2Var4;
                            }
                            ky2Var3.f.setValue(null);
                            return sd5.a;
                        } catch (Throwable th2) {
                            th = th2;
                            ky2Var = this;
                            ky2Var.f.setValue(null);
                            throw th;
                        }
                    case 1:
                        f = ly2Var.C;
                        i2 = ly2Var.A;
                        ky2Var2 = ly2Var.z;
                        C0239D.H(obj);
                        if (Math.abs(f) <= 0.005f) {
                            q12Var2 = ky2Var2.a;
                            ly2Var.z = ky2Var2;
                            ly2Var.F = 2;
                            f34 f34Var2 = q12.s;
                            if (q12Var2.d(i2, 0, ly2Var) == va0Var) {
                                return va0Var;
                            }
                            ky2Var3 = ky2Var2;
                        } else {
                            q12Var = ky2Var2.a;
                            my2Var = new my2(null);
                            ly2Var.z = ky2Var2;
                            ly2Var.A = i2;
                            ly2Var.C = f;
                            ly2Var.F = 3;
                            if (q12Var.b(vi2.Default, my2Var, ly2Var) == va0Var) {
                                return va0Var;
                            }
                            ky2Var4 = ky2Var2;
                            i3 = i2;
                            f2 = f;
                            y02VarG = ky2Var4.a.g();
                            it = y02VarG.e().iterator();
                            do {
                                if (it.hasNext()) {
                                    next = it.next();
                                    if (((k02) next).getIndex() == i3) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                } else {
                                    next = null;
                                }
                                k02Var = (k02) next;
                                q12Var3 = ky2Var4.a;
                                if (k02Var != null) {
                                    iC2 = sy4.c(k02Var.a() * f2);
                                    ly2Var.z = ky2Var4;
                                    ly2Var.F = 4;
                                    if (q12Var3.d(i3, iC2, ly2Var) == va0Var) {
                                        return va0Var;
                                    }
                                } else if (true ^ y02VarG.e().isEmpty()) {
                                    iA = ((k02) wu.H0(y02VarG.e())).a();
                                    iC = sy4.c(iA * f2);
                                    ly2Var.z = ky2Var4;
                                    ly2Var.A = i3;
                                    ly2Var.C = f2;
                                    ly2Var.B = iA;
                                    ly2Var.F = 5;
                                    if (q12Var3.d(i3, iC, ly2Var) == va0Var) {
                                        return va0Var;
                                    }
                                    it2 = ky2Var4.a.g().e().iterator();
                                    do {
                                        if (it2.hasNext()) {
                                            next2 = it2.next();
                                            if (((k02) next2).getIndex() == i3) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                        } else {
                                            next2 = null;
                                        }
                                        k02Var2 = (k02) next2;
                                        if (k02Var2 != null) {
                                            q12Var4 = ky2Var4.a;
                                            iC3 = sy4.c(k02Var2.a() * f2);
                                            ly2Var.z = ky2Var4;
                                            ly2Var.F = 6;
                                            if (q12Var4.d(i3, iC3, ly2Var) == va0Var) {
                                                return va0Var;
                                            }
                                        }
                                    } while (!z2);
                                    k02Var2 = (k02) next2;
                                    if (k02Var2 != null) {
                                        q12Var4 = ky2Var4.a;
                                        iC3 = sy4.c(k02Var2.a() * f2);
                                        ly2Var.z = ky2Var4;
                                        ly2Var.F = 6;
                                        if (q12Var4.d(i3, iC3, ly2Var) == va0Var) {
                                            return va0Var;
                                        }
                                    }
                                }
                                ky2Var3 = ky2Var4;
                            } while (!z);
                            k02Var = (k02) next;
                            q12Var3 = ky2Var4.a;
                            if (k02Var != null) {
                                iC2 = sy4.c(k02Var.a() * f2);
                                ly2Var.z = ky2Var4;
                                ly2Var.F = 4;
                                if (q12Var3.d(i3, iC2, ly2Var) == va0Var) {
                                    return va0Var;
                                }
                            } else if (true ^ y02VarG.e().isEmpty()) {
                                iA = ((k02) wu.H0(y02VarG.e())).a();
                                iC = sy4.c(iA * f2);
                                ly2Var.z = ky2Var4;
                                ly2Var.A = i3;
                                ly2Var.C = f2;
                                ly2Var.B = iA;
                                ly2Var.F = 5;
                                if (q12Var3.d(i3, iC, ly2Var) == va0Var) {
                                    return va0Var;
                                }
                                it2 = ky2Var4.a.g().e().iterator();
                                do {
                                    if (it2.hasNext()) {
                                        next2 = it2.next();
                                        if (((k02) next2).getIndex() == i3) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                    k02Var2 = (k02) next2;
                                    if (k02Var2 != null) {
                                        q12Var4 = ky2Var4.a;
                                        iC3 = sy4.c(k02Var2.a() * f2);
                                        ly2Var.z = ky2Var4;
                                        ly2Var.F = 6;
                                        if (q12Var4.d(i3, iC3, ly2Var) == va0Var) {
                                            return va0Var;
                                        }
                                    }
                                } while (!z2);
                                k02Var2 = (k02) next2;
                                if (k02Var2 != null) {
                                    q12Var4 = ky2Var4.a;
                                    iC3 = sy4.c(k02Var2.a() * f2);
                                    ly2Var.z = ky2Var4;
                                    ly2Var.F = 6;
                                    if (q12Var4.d(i3, iC3, ly2Var) == va0Var) {
                                        return va0Var;
                                    }
                                }
                            }
                            ky2Var3 = ky2Var4;
                        }
                        ky2Var3.f.setValue(null);
                        return sd5.a;
                    case 2:
                    case 4:
                    case 6:
                        ky2Var = ly2Var.z;
                        try {
                            C0239D.H(obj);
                            ky2Var3 = ky2Var;
                            ky2Var3.f.setValue(null);
                            return sd5.a;
                        } catch (Throwable th3) {
                            th = th3;
                            ky2Var.f.setValue(null);
                            throw th;
                        }
                    case 3:
                        f = ly2Var.C;
                        i2 = ly2Var.A;
                        ky2Var2 = ly2Var.z;
                        C0239D.H(obj);
                        ky2Var4 = ky2Var2;
                        i3 = i2;
                        f2 = f;
                        y02VarG = ky2Var4.a.g();
                        it = y02VarG.e().iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                                if (((k02) next).getIndex() == i3) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                next = null;
                            }
                            k02Var = (k02) next;
                            q12Var3 = ky2Var4.a;
                            if (k02Var != null) {
                                iC2 = sy4.c(k02Var.a() * f2);
                                ly2Var.z = ky2Var4;
                                ly2Var.F = 4;
                                if (q12Var3.d(i3, iC2, ly2Var) == va0Var) {
                                    return va0Var;
                                }
                            } else if (true ^ y02VarG.e().isEmpty()) {
                                iA = ((k02) wu.H0(y02VarG.e())).a();
                                iC = sy4.c(iA * f2);
                                ly2Var.z = ky2Var4;
                                ly2Var.A = i3;
                                ly2Var.C = f2;
                                ly2Var.B = iA;
                                ly2Var.F = 5;
                                if (q12Var3.d(i3, iC, ly2Var) == va0Var) {
                                    return va0Var;
                                }
                                it2 = ky2Var4.a.g().e().iterator();
                                do {
                                    if (it2.hasNext()) {
                                        next2 = it2.next();
                                        if (((k02) next2).getIndex() == i3) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                    k02Var2 = (k02) next2;
                                    if (k02Var2 != null) {
                                        q12Var4 = ky2Var4.a;
                                        iC3 = sy4.c(k02Var2.a() * f2);
                                        ly2Var.z = ky2Var4;
                                        ly2Var.F = 6;
                                        if (q12Var4.d(i3, iC3, ly2Var) == va0Var) {
                                            return va0Var;
                                        }
                                    }
                                } while (!z2);
                                k02Var2 = (k02) next2;
                                if (k02Var2 != null) {
                                    q12Var4 = ky2Var4.a;
                                    iC3 = sy4.c(k02Var2.a() * f2);
                                    ly2Var.z = ky2Var4;
                                    ly2Var.F = 6;
                                    if (q12Var4.d(i3, iC3, ly2Var) == va0Var) {
                                        return va0Var;
                                    }
                                }
                            }
                            ky2Var3 = ky2Var4;
                            ky2Var3.f.setValue(null);
                            return sd5.a;
                        } while (!z);
                        k02Var = (k02) next;
                        q12Var3 = ky2Var4.a;
                        if (k02Var != null) {
                            iC2 = sy4.c(k02Var.a() * f2);
                            ly2Var.z = ky2Var4;
                            ly2Var.F = 4;
                            if (q12Var3.d(i3, iC2, ly2Var) == va0Var) {
                                return va0Var;
                            }
                        } else if (true ^ y02VarG.e().isEmpty()) {
                            iA = ((k02) wu.H0(y02VarG.e())).a();
                            iC = sy4.c(iA * f2);
                            ly2Var.z = ky2Var4;
                            ly2Var.A = i3;
                            ly2Var.C = f2;
                            ly2Var.B = iA;
                            ly2Var.F = 5;
                            if (q12Var3.d(i3, iC, ly2Var) == va0Var) {
                                return va0Var;
                            }
                            it2 = ky2Var4.a.g().e().iterator();
                            do {
                                if (it2.hasNext()) {
                                    next2 = it2.next();
                                    if (((k02) next2).getIndex() == i3) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                } else {
                                    next2 = null;
                                }
                                k02Var2 = (k02) next2;
                                if (k02Var2 != null) {
                                    q12Var4 = ky2Var4.a;
                                    iC3 = sy4.c(k02Var2.a() * f2);
                                    ly2Var.z = ky2Var4;
                                    ly2Var.F = 6;
                                    if (q12Var4.d(i3, iC3, ly2Var) == va0Var) {
                                        return va0Var;
                                    }
                                }
                            } while (!z2);
                            k02Var2 = (k02) next2;
                            if (k02Var2 != null) {
                                q12Var4 = ky2Var4.a;
                                iC3 = sy4.c(k02Var2.a() * f2);
                                ly2Var.z = ky2Var4;
                                ly2Var.F = 6;
                                if (q12Var4.d(i3, iC3, ly2Var) == va0Var) {
                                    return va0Var;
                                }
                            }
                        }
                        ky2Var3 = ky2Var4;
                        ky2Var3.f.setValue(null);
                        return sd5.a;
                    case 5:
                        iA = ly2Var.B;
                        f2 = ly2Var.C;
                        i3 = ly2Var.A;
                        ky2Var4 = ly2Var.z;
                        C0239D.H(obj);
                        it2 = ky2Var4.a.g().e().iterator();
                        do {
                            if (it2.hasNext()) {
                                next2 = it2.next();
                                if (((k02) next2).getIndex() == i3) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                next2 = null;
                            }
                            k02Var2 = (k02) next2;
                            if (k02Var2 != null) {
                                q12Var4 = ky2Var4.a;
                                iC3 = sy4.c(k02Var2.a() * f2);
                                ly2Var.z = ky2Var4;
                                ly2Var.F = 6;
                                if (q12Var4.d(i3, iC3, ly2Var) == va0Var) {
                                    return va0Var;
                                }
                            }
                            ky2Var3 = ky2Var4;
                            ky2Var3.f.setValue(null);
                            return sd5.a;
                        } while (!z2);
                        k02Var2 = (k02) next2;
                        if (k02Var2 != null) {
                            q12Var4 = ky2Var4.a;
                            iC3 = sy4.c(k02Var2.a() * f2);
                            ly2Var.z = ky2Var4;
                            ly2Var.F = 6;
                            if (q12Var4.d(i3, iC3, ly2Var) == va0Var) {
                                return va0Var;
                            }
                        }
                        ky2Var3 = ky2Var4;
                        ky2Var3.f.setValue(null);
                        return sd5.a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th4) {
                th = th4;
                ky2Var = 3;
            }
        } catch (Throwable th5) {
            th = th5;
            ky2Var = r3;
        }
    }

    public final k02 e() {
        Object obj;
        y02 y02VarG = this.a.g();
        Iterator<T> it = y02VarG.e().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                k02 k02Var = (k02) next;
                int iMin = Math.min(k02Var.a() + k02Var.getOffset(), y02VarG.b() - this.c) - Math.max(k02Var.getOffset(), 0);
                do {
                    Object next2 = it.next();
                    k02 k02Var2 = (k02) next2;
                    int iMin2 = Math.min(k02Var2.a() + k02Var2.getOffset(), y02VarG.b() - this.c) - Math.max(k02Var2.getOffset(), 0);
                    if (iMin < iMin2) {
                        next = next2;
                        iMin = iMin2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (k02) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int f() {
        return ((Number) this.b.getValue()).intValue();
    }

    public final String toString() {
        return "PagerState(pageCount=" + ((Number) this.d.getValue()).intValue() + ", currentPage=" + f() + ", currentPageOffset=" + ((Number) this.e.getValue()).floatValue() + ')';
    }

    public ky2() {
        this(0);
    }
}
