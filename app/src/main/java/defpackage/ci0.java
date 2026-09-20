package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2", f = "DefaultTransform.kt", l = {64, 68, 68, 73, 73, 77, 84, 110, 115}, m = "invokeSuspend")
public final class ci0 extends px4 implements y81<k33<rg1, ve1>, rg1, z80<? super sd5>, Object> {
    public qg1 A;
    public int B;
    public /* synthetic */ k33 C;
    public /* synthetic */ Object D;

    public static final class CQf extends cx1 implements j81<Throwable, sd5> {
        public final /* synthetic */ jx w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(os1 os1Var) {
            super(1);
            this.w = os1Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(Throwable th) {
            this.w.h();
            return sd5.a;
        }
    }

    @if0(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2$channel$1", f = "DefaultTransform.kt", l = {94}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<uo5, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ Object C;
        public final /* synthetic */ qg1 D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(Object obj, qg1 qg1Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.C = obj;
            this.D = qg1Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            QnHx qnHx = new QnHx(this.C, this.D, z80Var);
            qnHx.B = obj;
            return qnHx;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            qg1 qg1Var = this.D;
            try {
                if (i != 0) {
                    try {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C0239D.H(obj);
                    } catch (Throwable th) {
                        tg1.b(qg1Var);
                        throw th;
                    }
                } else {
                    C0239D.H(obj);
                    uo5 uo5Var = (uo5) this.B;
                    fk fkVar = (fk) this.C;
                    oj ojVarL0 = uo5Var.l0();
                    this.A = 1;
                    if (gk.a(fkVar, ojVarL0, this) == va0Var) {
                        return va0Var;
                    }
                }
                tg1.b(qg1Var);
                return sd5.a;
            } catch (CancellationException e) {
                fp1.H(qg1Var, e);
                throw e;
            } catch (Throwable th2) {
                fp1.H(qg1Var, ps0.b("Receive failed", th2));
                throw th2;
            }
        }

        @Override // defpackage.x81
        public final Object invoke(uo5 uo5Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(uo5Var, z80Var)).i(sd5.a);
        }
    }

    public ci0(z80<? super ci0> z80Var) {
        super(3, z80Var);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00f8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x0127  */
    /* JADX WARN: Code duplicated, block: B:48:0x0130  */
    /* JADX WARN: Code duplicated, block: B:56:0x0151  */
    /* JADX WARN: Code duplicated, block: B:59:0x0155  */
    /* JADX WARN: Code duplicated, block: B:63:0x018a A[RETURN] */
    /* JADX WARN: Instruction removed from duplicated block: B:59:0x0155, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        k33 k33Var;
        rb5 rb5Var;
        qg1 qg1VarE;
        rb5 rb5Var2;
        k33 k33Var2;
        rb5 rb5Var3;
        k33 k33Var3;
        rg1 rg1Var;
        rg1 rg1Var2;
        byte[] bArr;
        String str;
        Long lValueOf;
        rg1 rg1Var3;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        switch (this.B) {
            case 0:
                C0239D.H(obj);
                k33Var = this.C;
                rg1 rg1Var4 = (rg1) this.D;
                rb5Var = rg1Var4.a;
                Object obj2 = rg1Var4.b;
                if (!(obj2 instanceof fk)) {
                    return sd5.a;
                }
                qg1VarE = ((ve1) k33Var.w).e();
                fv1<?> fv1Var = rb5Var.a;
                if (ur1.a(fv1Var, nl3.a(sd5.class))) {
                    ((fk) obj2).l(null);
                    rg1 rg1Var5 = new rg1(rb5Var, sd5.a);
                    this.C = null;
                    this.B = 1;
                    if (k33Var.e(rg1Var5, this) == va0Var) {
                        return va0Var;
                    }
                } else if (ur1.a(fv1Var, nl3.a(Integer.TYPE))) {
                    this.C = k33Var;
                    this.D = rb5Var;
                    this.B = 2;
                    obj = ((fk) obj2).p(Long.MAX_VALUE, this);
                    if (obj == va0Var) {
                        return va0Var;
                    }
                    rb5Var3 = rb5Var;
                    k33Var3 = k33Var;
                    rg1Var = new rg1(rb5Var3, new Integer(Integer.parseInt(qn1.s((qn1) obj))));
                    this.C = null;
                    this.D = null;
                    this.B = 3;
                    if (k33Var3.e(rg1Var, this) == va0Var) {
                        return va0Var;
                    }
                } else {
                    if (ur1.a(fv1Var, nl3.a(hk.class)) ? true : ur1.a(fv1Var, nl3.a(qn1.class))) {
                        this.C = k33Var;
                        this.D = rb5Var;
                        this.B = 4;
                        obj = ((fk) obj2).p(Long.MAX_VALUE, this);
                        if (obj == va0Var) {
                            return va0Var;
                        }
                        rb5Var2 = rb5Var;
                        k33Var2 = k33Var;
                        rg1Var2 = new rg1(rb5Var2, obj);
                        this.C = null;
                        this.D = null;
                        this.B = 5;
                        if (k33Var2.e(rg1Var2, this) == va0Var) {
                            return va0Var;
                        }
                    } else if (ur1.a(fv1Var, nl3.a(byte[].class))) {
                        this.C = k33Var;
                        this.D = rb5Var;
                        this.A = qg1VarE;
                        this.B = 6;
                        obj = X.E((fk) obj2, this);
                        if (obj == va0Var) {
                            return va0Var;
                        }
                        bArr = (byte[]) obj;
                        mc1 mc1VarA = qg1VarE.a();
                        List<String> list = rf1.a;
                        str = mc1VarA.get("Content-Length");
                        if (str != null) {
                            lValueOf = Long.valueOf(Long.parseLong(str));
                        } else {
                            lValueOf = null;
                        }
                        if (qg1VarE.a().get("Content-Encoding") == null && lValueOf != null && lValueOf.longValue() > 0) {
                            if (!(bArr.length == ((int) lValueOf.longValue()))) {
                                throw new IllegalStateException(("Expected " + lValueOf + ", actual " + bArr.length).toString());
                            }
                        }
                        rg1Var3 = new rg1(rb5Var, bArr);
                        this.C = null;
                        this.D = null;
                        this.A = null;
                        this.B = 7;
                        if (k33Var.e(rg1Var3, this) == va0Var) {
                            return va0Var;
                        }
                    } else if (ur1.a(fv1Var, nl3.a(fk.class))) {
                        os1 os1Var = new os1((ms1) qg1VarE.g().j(ms1.CQf.w));
                        xo xoVarC = xnX3.c(k33Var, qg1VarE.g(), false, new QnHx(obj2, qg1VarE, null));
                        xoVarC.r0(new CQf(os1Var));
                        rg1 rg1Var6 = new rg1(rb5Var, xoVarC.x);
                        this.C = null;
                        this.B = 8;
                        if (k33Var.e(rg1Var6, this) == va0Var) {
                            return va0Var;
                        }
                    } else if (ur1.a(fv1Var, nl3.a(zg1.class))) {
                        ((fk) obj2).l(null);
                        rg1 rg1Var7 = new rg1(rb5Var, qg1VarE.i());
                        this.C = null;
                        this.B = 9;
                        if (k33Var.e(rg1Var7, this) == va0Var) {
                            return va0Var;
                        }
                    }
                }
                return sd5.a;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 9:
                C0239D.H(obj);
                return sd5.a;
            case 2:
                rb5Var3 = (rb5) this.D;
                k33Var3 = this.C;
                C0239D.H(obj);
                rg1Var = new rg1(rb5Var3, new Integer(Integer.parseInt(qn1.s((qn1) obj))));
                this.C = null;
                this.D = null;
                this.B = 3;
                if (k33Var3.e(rg1Var, this) == va0Var) {
                    return va0Var;
                }
                return sd5.a;
            case 4:
                rb5Var2 = (rb5) this.D;
                k33Var2 = this.C;
                C0239D.H(obj);
                rg1Var2 = new rg1(rb5Var2, obj);
                this.C = null;
                this.D = null;
                this.B = 5;
                if (k33Var2.e(rg1Var2, this) == va0Var) {
                    return va0Var;
                }
                return sd5.a;
            case 6:
                qg1VarE = this.A;
                rb5Var = (rb5) this.D;
                k33Var = this.C;
                C0239D.H(obj);
                bArr = (byte[]) obj;
                mc1 mc1VarA2 = qg1VarE.a();
                List<String> list2 = rf1.a;
                str = mc1VarA2.get("Content-Length");
                if (str != null) {
                    lValueOf = Long.valueOf(Long.parseLong(str));
                } else {
                    lValueOf = null;
                }
                if (qg1VarE.a().get("Content-Encoding") == null) {
                    if (!(bArr.length == ((int) lValueOf.longValue()))) {
                        throw new IllegalStateException(("Expected " + lValueOf + ", actual " + bArr.length).toString());
                    }
                }
                rg1Var3 = new rg1(rb5Var, bArr);
                this.C = null;
                this.D = null;
                this.A = null;
                this.B = 7;
                if (k33Var.e(rg1Var3, this) == va0Var) {
                    return va0Var;
                }
                return sd5.a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // defpackage.y81
    public final Object invoke(k33<rg1, ve1> k33Var, rg1 rg1Var, z80<? super sd5> z80Var) {
        ci0 ci0Var = new ci0(z80Var);
        ci0Var.C = k33Var;
        ci0Var.D = rg1Var;
        return ci0Var.i(sd5.a);
    }
}
