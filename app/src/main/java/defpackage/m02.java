package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class m02 {
    public final ua0 a;
    public final boolean b;
    public int f;
    public int h;
    public final LinkedHashMap c = new LinkedHashMap();
    public Map<Object, Integer> d = ds0.w;
    public int e = -1;
    public int g = -1;
    public final LinkedHashSet i = new LinkedHashSet();

    @if0(c = "androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1", f = "LazyListItemPlacementAnimator.kt", l = {400}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public final /* synthetic */ c43 B;
        public final /* synthetic */ lx0<mp1> C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(c43 c43Var, lx0<mp1> lx0Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.B = c43Var;
            this.C = lx0Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new QnHx(this.B, this.C, z80Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            c43 c43Var = this.B;
            try {
                if (i == 0) {
                    C0239D.H(obj);
                    boolean zBooleanValue = ((Boolean) c43Var.b.d.getValue()).booleanValue();
                    Ah ah = this.C;
                    if (zBooleanValue) {
                        ah = ah instanceof hr4 ? (hr4) ah : n02.a;
                    }
                    Ah ah2 = ah;
                    OVbg<mp1, Bd_> oVbg = c43Var.b;
                    mp1 mp1Var = new mp1(c43Var.c);
                    this.A = 1;
                    if (OVbg.c(oVbg, mp1Var, ah2, null, this, 12) == va0Var) {
                        return va0Var;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C0239D.H(obj);
                }
                c43Var.d.setValue(Boolean.FALSE);
            } catch (CancellationException unused) {
            }
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    public m02(ua0 ua0Var, boolean z) {
        this.a = ua0Var;
        this.b = z;
    }

    public static int b(int i, int i2, ArrayList arrayList) {
        if (!arrayList.isEmpty() && i >= ((f12) wu.H0(arrayList)).b && i <= ((f12) wu.N0(arrayList)).b) {
            if (i - ((f12) wu.H0(arrayList)).b >= ((f12) wu.N0(arrayList)).b - i) {
                for (int iJ = ps0.J(arrayList); -1 < iJ; iJ--) {
                    f12 f12Var = (f12) arrayList.get(iJ);
                    int i3 = f12Var.b;
                    if (i3 == i) {
                        return f12Var.e;
                    }
                    if (i3 < i) {
                        break;
                    }
                }
            } else {
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    f12 f12Var2 = (f12) arrayList.get(i4);
                    int i5 = f12Var2.b;
                    if (i5 == i) {
                        return f12Var2.e;
                    }
                    if (i5 > i) {
                        break;
                    }
                }
            }
        }
        return i2;
    }

    public final int a(int i, int i2, int i3, long j, boolean z, int i4, int i5, ArrayList arrayList) {
        int i6 = this.g;
        int iB = 0;
        boolean z2 = z ? i6 > i : i6 < i;
        int i7 = this.e;
        boolean z3 = z ? i7 < i : i7 > i;
        if (z2) {
            pp1 pp1VarV = !z ? AY.V(i6 + 1, i) : AY.V(i + 1, i6);
            int i8 = pp1VarV.w;
            int i9 = pp1VarV.x;
            if (i8 <= i9) {
                while (true) {
                    iB += b(i8, i3, arrayList);
                    if (i8 == i9) {
                        break;
                    }
                    i8++;
                }
            }
            return c(j) + i4 + this.h + iB;
        }
        if (!z3) {
            return i5;
        }
        pp1 pp1VarV2 = !z ? AY.V(i + 1, i7) : AY.V(i7 + 1, i);
        int i10 = pp1VarV2.w;
        int i11 = pp1VarV2.x;
        if (i10 <= i11) {
            while (true) {
                i2 += b(i10, i3, arrayList);
                if (i10 == i11) {
                    break;
                }
                i10++;
            }
        }
        return c(j) + (this.f - i2);
    }

    public final int c(long j) {
        if (this.b) {
            return mp1.a(j);
        }
        int i = mp1.c;
        return (int) (j >> 32);
    }

    public final void d(f12 f12Var, gs1 gs1Var) {
        ArrayList arrayList;
        List<d12> list;
        int i;
        while (true) {
            arrayList = gs1Var.b;
            int size = arrayList.size();
            list = f12Var.i;
            if (size <= list.size()) {
                break;
            } else {
                su.A0(arrayList);
            }
        }
        while (arrayList.size() < list.size()) {
            int size2 = arrayList.size();
            long jD = f12Var.d(size2);
            long j = gs1Var.a;
            arrayList.add(new c43(f12Var.c(size2), C0239D.d(((int) (jD >> 32)) - ((int) (j >> 32)), mp1.a(jD) - mp1.a(j))));
        }
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2 = i + 1) {
            c43 c43Var = (c43) arrayList.get(i2);
            long j2 = c43Var.c;
            long j3 = gs1Var.a;
            long jD2 = C0239D.d(((int) (j2 >> 32)) + ((int) (j3 >> 32)), mp1.a(j3) + mp1.a(j2));
            long jD3 = f12Var.d(i2);
            c43Var.a = f12Var.c(i2);
            lx0<mp1> lx0VarB = f12Var.b(i2);
            if (jD2 == jD3) {
                i = i2;
            } else {
                long j4 = gs1Var.a;
                i = i2;
                c43Var.c = C0239D.d(((int) (jD3 >> 32)) - ((int) (j4 >> 32)), mp1.a(jD3) - mp1.a(j4));
                if (lx0VarB != null) {
                    c43Var.d.setValue(Boolean.TRUE);
                    fp1.k0(this.a, null, 0, new QnHx(c43Var, lx0VarB, null), 3);
                }
            }
        }
    }
}
