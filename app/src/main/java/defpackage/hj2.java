package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class hj2 implements eo1<ej2, Object, fj2> {
    public final fm3 a;
    public final B8C b;
    public final d7G c;
    public final c2 d;

    @if0(c = "com.azefsw.audioconnect.settings.ui.name.NameEditorInputHandler", f = "NameEditorInputHandler.kt", l = {71, 74}, m = "getSuggestions")
    public static final class CQf extends b90 {
        public /* synthetic */ Object A;
        public int C;
        public hj2 z;

        public CQf(z80<? super CQf> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return hj2.this.c(this);
        }
    }

    @if0(c = "com.azefsw.audioconnect.settings.ui.name.NameEditorInputHandler", f = "NameEditorInputHandler.kt", l = {67}, m = "getInitialName")
    public static final class QnHx extends b90 {
        public int B;
        public /* synthetic */ Object z;

        public QnHx(z80<? super QnHx> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.z = obj;
            this.B |= Integer.MIN_VALUE;
            return hj2.this.b(this);
        }
    }

    public hj2(fm3 fm3Var, B8C b8c, d7G d7g) {
        this.a = fm3Var;
        this.b = b8c;
        this.c = d7g;
        gq0.QnHx qnHx = gq0.x;
        this.d = new c2(ps0.o0(5000, kq0.MILLISECONDS));
        a62.a.e("visited_name_editor");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(z80<? super String> z80Var) throws Throwable {
        QnHx qnHx;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i = qnHx.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnHx.B = i - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(z80Var);
            }
        } else {
            qnHx = new QnHx(z80Var);
        }
        Object objC = qnHx.z;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.B;
        if (i2 == 0) {
            C0239D.H(objC);
            cs2 cs2VarO0 = this.b.O0(j54.b);
            cs2VarO0.getClass();
            mr2 mr2Var = new mr2(cs2VarO0);
            qnHx.B = 1;
            objC = JUCk.c(mr2Var, qnHx);
            if (objC == va0Var) {
                return va0Var;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(objC);
        }
        return objC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(z80<? super List<uj2>> z80Var) throws Throwable {
        CQf cQf;
        hj2 hj2Var;
        if (z80Var instanceof CQf) {
            cQf = (CQf) z80Var;
            int i = cQf.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                cQf.C = i - Integer.MIN_VALUE;
            } else {
                cQf = new CQf(z80Var);
            }
        } else {
            cQf = new CQf(z80Var);
        }
        Object objC = cQf.A;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = cQf.C;
        int i3 = 2;
        if (i2 != 0) {
            if (i2 == 1) {
                hj2Var = cQf.z;
                C0239D.H(objC);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(objC);
            }
            return (List) objC;
        }
        C0239D.H(objC);
        vk4<Boolean> vk4VarV = this.a.v();
        cQf.z = this;
        cQf.C = 1;
        objC = JUCk.c(vk4VarV, cQf);
        if (objC == va0Var) {
            return va0Var;
        }
        hj2Var = this;
        if (!((Boolean) objC).booleanValue()) {
            return cs0.w;
        }
        d7G d7g = hj2Var.c;
        d7g.getClass();
        il4 il4Var = new il4(new ma(d7g, i3));
        cQf.z = null;
        cQf.C = 2;
        objC = JUCk.c(il4Var, cQf);
        if (objC == va0Var) {
            return va0Var;
        }
        return (List) objC;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0078 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.eo1
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object a(go1 go1Var, ej2 ej2Var, z80 z80Var) throws Throwable {
        ij2 ij2Var;
        hj2 hj2Var;
        fo1 fo1Var;
        String str;
        Object objC;
        fo1 fo1Var2;
        String str2;
        if (z80Var instanceof ij2) {
            ij2Var = (ij2) z80Var;
            int i = ij2Var.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                ij2Var.D = i - Integer.MIN_VALUE;
            } else {
                ij2Var = new ij2(this, z80Var);
            }
        } else {
            ij2Var = new ij2(this, z80Var);
        }
        Object objB = ij2Var.B;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = ij2Var.D;
        if (i2 != 0) {
            if (i2 == 1) {
                fo1 fo1Var3 = (fo1) ij2Var.A;
                hj2Var = (hj2) ij2Var.z;
                C0239D.H(objB);
                fo1Var = fo1Var3;
                str = (String) objB;
                ij2Var.z = fo1Var;
                ij2Var.A = str;
                ij2Var.D = 2;
                objC = hj2Var.c(ij2Var);
                if (objC == va0Var) {
                    return va0Var;
                }
                fo1Var2 = fo1Var;
                str2 = str;
                objB = objC;
            } else if (i2 == 2) {
                str2 = (String) ij2Var.A;
                fo1 fo1Var4 = (fo1) ij2Var.z;
                C0239D.H(objB);
                fo1Var2 = fo1Var4;
            } else {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C0239D.H(objB);
                    return sd5.a;
                }
                C0239D.H(objB);
            }
            return sd5.a;
        }
        C0239D.H(objB);
        if (!(ej2Var instanceof ej2.CQf)) {
            if (!(ej2Var instanceof ej2.QnHx)) {
                if (!(ej2Var instanceof ej2.F1)) {
                    throw new NoWhenBranchMatchedException();
                }
                ij2Var.D = 4;
                if (e(go1Var, (ej2.F1) ej2Var, ij2Var) == va0Var) {
                    return va0Var;
                }
                return sd5.a;
            }
            this.d.a(gj2.w);
            String str3 = ((ej2.QnHx) ej2Var).a;
            B8C b8c = this.b;
            b8c.getClass();
            b8c.M0(pv4.Z(1024, str3));
            go1Var.q();
            return sd5.a;
        }
        ij2Var.z = this;
        ij2Var.A = go1Var;
        ij2Var.D = 1;
        objB = b(ij2Var);
        if (objB == va0Var) {
            return va0Var;
        }
        hj2Var = this;
        fo1Var = go1Var;
        str = (String) objB;
        ij2Var.z = fo1Var;
        ij2Var.A = str;
        ij2Var.D = 2;
        objC = hj2Var.c(ij2Var);
        if (objC == va0Var) {
            return va0Var;
        }
        fo1Var2 = fo1Var;
        str2 = str;
        objB = objC;
        jj2 jj2Var = new jj2(str2, (List) objB);
        ij2Var.z = null;
        ij2Var.A = null;
        ij2Var.D = 3;
        if (fo1Var2.s(jj2Var) == va0Var) {
            return va0Var;
        }
        return sd5.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(go1 go1Var, ej2.F1 f1, z80 z80Var) throws Throwable {
        kj2 kj2Var;
        hj2 hj2Var;
        if (z80Var instanceof kj2) {
            kj2Var = (kj2) z80Var;
            int i = kj2Var.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                kj2Var.D = i - Integer.MIN_VALUE;
            } else {
                kj2Var = new kj2(this, z80Var);
            }
        } else {
            kj2Var = new kj2(this, z80Var);
        }
        Object obj = kj2Var.B;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = kj2Var.D;
        if (i2 == 0) {
            C0239D.H(obj);
            lj2 lj2Var = new lj2(f1);
            kj2Var.z = this;
            kj2Var.A = f1;
            kj2Var.D = 1;
            if (go1Var.s(lj2Var) == va0Var) {
                return va0Var;
            }
            hj2Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f1 = kj2Var.A;
            hj2Var = kj2Var.z;
            C0239D.H(obj);
        }
        a62.a.h("settings", "changed_name_to_suggestion", f1.a.b);
        B8C b8c = hj2Var.b;
        String str = f1.a.a;
        b8c.getClass();
        b8c.M0(pv4.Z(1024, str));
        return sd5.a;
    }
}
