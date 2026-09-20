package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class zn4 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ y81<rn4, g30, Integer, sd5> w;
        public final /* synthetic */ rn4 x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(y81<? super rn4, ? super g30, ? super Integer, sd5> y81Var, rn4 rn4Var, int i) {
            super(2);
            this.w = y81Var;
            this.x = rn4Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                this.w.invoke(this.x, g30Var2, Integer.valueOf((this.y >> 3) & 112));
            }
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ rn4 w;
        public final /* synthetic */ pg2 x;
        public final /* synthetic */ y81<rn4, g30, Integer, sd5> y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public F1(rn4 rn4Var, pg2 pg2Var, y81<? super rn4, ? super g30, ? super Integer, sd5> y81Var, int i, int i2) {
            super(2);
            this.w = rn4Var;
            this.x = pg2Var;
            this.y = y81Var;
            this.z = i;
            this.A = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            zn4.a(this.w, this.x, this.y, g30Var, this.z | 1, this.A);
            return sd5.a;
        }
    }

    @if0(c = "androidx.compose.material.SnackbarHostKt$SnackbarHost$1", f = "SnackbarHost.kt", l = {164}, m = "invokeSuspend")
    public static final class LPt8Fixed extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public final /* synthetic */ rn4 B;
        public final /* synthetic */ x_$C C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(rn4 rn4Var, x_$C x__c, z80<? super LPt8Fixed> z80Var) {
            super(2, z80Var);
            this.B = rn4Var;
            this.C = x__c;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new LPt8Fixed(this.B, this.C, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            long jA;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            rn4 rn4Var = this.B;
            if (i == 0) {
                C0239D.H(obj);
                if (rn4Var != null) {
                    un4 duration = rn4Var.getDuration();
                    boolean z = rn4Var.b() != null;
                    int iOrdinal = duration.ordinal();
                    if (iOrdinal == 0) {
                        jA = 4000;
                    } else if (iOrdinal == 1) {
                        jA = 10000;
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jA = Long.MAX_VALUE;
                    }
                    x_$C x__c = this.C;
                    if (x__c != null) {
                        jA = x__c.a(jA, z);
                    }
                    this.A = 1;
                    if (S12N.e(jA, this) == va0Var) {
                        return va0Var;
                    }
                }
                return sd5.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
            rn4Var.dismiss();
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((LPt8Fixed) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    public static final class NUlFixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ co4 w;
        public final /* synthetic */ pg2 x;
        public final /* synthetic */ y81<rn4, g30, Integer, sd5> y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public NUlFixed(co4 co4Var, pg2 pg2Var, y81<? super rn4, ? super g30, ? super Integer, sd5> y81Var, int i, int i2) {
            super(2);
            this.w = co4Var;
            this.x = pg2Var;
            this.y = y81Var;
            this.z = i;
            this.A = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            zn4.b(this.w, this.x, this.y, g30Var, this.z | 1, this.A);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements y81<x81<? super g30, ? super Integer, ? extends sd5>, g30, Integer, sd5> {
        public final /* synthetic */ rn4 w;
        public final /* synthetic */ rn4 x;
        public final /* synthetic */ List<rn4> y;
        public final /* synthetic */ ow0<rn4> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(rn4 rn4Var, rn4 rn4Var2, ArrayList arrayList, ow0 ow0Var) {
            super(3);
            this.w = rn4Var;
            this.x = rn4Var2;
            this.y = arrayList;
            this.z = ow0Var;
        }

        @Override // defpackage.y81
        public final sd5 invoke(x81<? super g30, ? super Integer, ? extends sd5> x81Var, g30 g30Var, Integer num) {
            x81<? super g30, ? super Integer, ? extends sd5> x81Var2 = x81Var;
            g30 g30Var2 = g30Var;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= g30Var2.I(x81Var2) ? 4 : 2;
            }
            int i = iIntValue;
            if ((i & 91) == 18 && g30Var2.t()) {
                g30Var2.x();
            } else {
                rn4 rn4Var = this.x;
                rn4 rn4Var2 = this.w;
                boolean zA = ur1.a(rn4Var2, rn4Var);
                int i2 = zA ? 150 : 75;
                int i3 = (!zA || wu.F0(this.y).size() == 1) ? 0 : 75;
                nb5 nb5Var = new nb5(i2, i3, nq0.QnHx.a);
                yn4 yn4Var = new yn4(rn4Var2, this.z);
                g30Var2.e(1016418159);
                g30Var2.e(-492369756);
                Object objF = g30Var2.f();
                g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
                if (objF == c0132QnHx) {
                    objF = ps0.a(!zA ? 1.0f : 0.0f);
                    g30Var2.B(objF);
                }
                g30Var2.G();
                OVbg oVbg = (OVbg) objF;
                wq0.d(Boolean.valueOf(zA), new ao4(oVbg, zA, nb5Var, yn4Var, null), g30Var2);
                is4 is4Var = oVbg.c;
                g30Var2.G();
                nb5 nb5Var2 = new nb5(i2, i3, nq0.a);
                g30Var2.e(2003504988);
                g30Var2.e(-492369756);
                Object objF2 = g30Var2.f();
                if (objF2 == c0132QnHx) {
                    objF2 = ps0.a(zA ? 0.8f : 1.0f);
                    g30Var2.B(objF2);
                }
                g30Var2.G();
                OVbg oVbg2 = (OVbg) objF2;
                wq0.d(Boolean.valueOf(zA), new bo4(oVbg2, zA, nb5Var2, null), g30Var2);
                is4 is4Var2 = oVbg2.c;
                g30Var2.G();
                pg2 pg2VarA = c94.a(fp1.b0(pg2.QnHx.w, ((Number) is4Var2.getValue()).floatValue(), ((Number) is4Var2.getValue()).floatValue(), ((Number) is4Var.getValue()).floatValue(), null, false, 65528), false, new wn4(rn4Var2));
                g30Var2.e(733328855);
                rb2 rb2VarC = fe.c(One.QnHx.a, false, g30Var2);
                g30Var2.e(-1323940314);
                ij0 ij0Var = (ij0) g30Var2.E(r40.e);
                jy1 jy1Var = (jy1) g30Var2.E(r40.k);
                ti5 ti5Var = (ti5) g30Var2.E(r40.o);
                a30.e.getClass();
                yy1.QnHx qnHx = a30.QnHx.b;
                sz szVarJ = S12N.j(pg2VarA);
                if (!(g30Var2.v() instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                g30Var2.s();
                if (g30Var2.m()) {
                    g30Var2.l(qnHx);
                } else {
                    g30Var2.A();
                }
                g30Var2.u();
                hH.u(g30Var2, rb2VarC, a30.QnHx.e);
                hH.u(g30Var2, ij0Var, a30.QnHx.d);
                hH.u(g30Var2, jy1Var, a30.QnHx.f);
                qc0.c(0, szVarJ, bl2.b(g30Var2, ti5Var, a30.QnHx.g, g30Var2), g30Var2, 2058660585, -2137368960);
                g30Var2.e(-421978688);
                x81Var2.invoke(g30Var2, Integer.valueOf(i & 14));
                g30Var2.G();
                g30Var2.G();
                g30Var2.G();
                g30Var2.H();
                g30Var2.G();
                g30Var2.G();
            }
            return sd5.a;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r8v13 x81<? super g30, ? super java.lang.Integer, sd5>
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public static final void a(defpackage.rn4 r17, defpackage.pg2 r18, defpackage.y81<? super defpackage.rn4, ? super defpackage.g30, ? super java.lang.Integer, defpackage.sd5> r19, defpackage.g30 r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zn4.a(rn4, pg2, y81, g30, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0040  */
    /* JADX WARN: Code duplicated, block: B:27:0x0043  */
    /* JADX WARN: Code duplicated, block: B:29:0x0047  */
    /* JADX WARN: Code duplicated, block: B:31:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:37:0x005c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0071  */
    /* JADX WARN: Code duplicated, block: B:46:0x0075  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    public static final void b(co4 co4Var, pg2 pg2Var, y81<? super rn4, ? super g30, ? super Integer, sd5> y81Var, g30 g30Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        pg2 pg2Var2;
        y81<? super rn4, ? super g30, ? super Integer, sd5> y81Var2;
        pg2 pg2Var3;
        y81<? super rn4, ? super g30, ? super Integer, sd5> y81Var3;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(431012348);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(co4Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 112) == 0) {
                i3 |= j30VarQ.I(pg2Var) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    if (j30VarQ.I(y81Var)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i3 & 731) == 146 || !j30VarQ.t()) {
                    if (i6 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if (i4 != 0) {
                        y81Var2 = j20.a;
                    } else {
                        y81Var2 = y81Var;
                    }
                    rn4 rn4Var = (rn4) co4Var.b.getValue();
                    wq0.d(rn4Var, new LPt8Fixed(rn4Var, (x_$C) j30VarQ.E(r40.a), null), j30VarQ);
                    a((rn4) co4Var.b.getValue(), pg2Var2, y81Var2, j30VarQ, (i3 & 112) | (i3 & 896), 0);
                    pg2Var3 = pg2Var2;
                    y81Var3 = y81Var2;
                } else {
                    j30VarQ.x();
                    pg2Var3 = pg2Var;
                    y81Var3 = y81Var;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new NUlFixed(co4Var, pg2Var3, y81Var3, i, i2);
            }
            i3 |= 384;
            if ((i3 & 731) == 146) {
                if (i6 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                if (i4 != 0) {
                    y81Var2 = j20.a;
                } else {
                    y81Var2 = y81Var;
                }
                rn4 rn4Var2 = (rn4) co4Var.b.getValue();
                wq0.d(rn4Var2, new LPt8Fixed(rn4Var2, (x_$C) j30VarQ.E(r40.a), null), j30VarQ);
                a((rn4) co4Var.b.getValue(), pg2Var2, y81Var2, j30VarQ, (i3 & 112) | (i3 & 896), 0);
                pg2Var3 = pg2Var2;
                y81Var3 = y81Var2;
            } else {
                if (i6 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                if (i4 != 0) {
                    y81Var2 = j20.a;
                } else {
                    y81Var2 = y81Var;
                }
                rn4 rn4Var3 = (rn4) co4Var.b.getValue();
                wq0.d(rn4Var3, new LPt8Fixed(rn4Var3, (x_$C) j30VarQ.E(r40.a), null), j30VarQ);
                a((rn4) co4Var.b.getValue(), pg2Var2, y81Var2, j30VarQ, (i3 & 112) | (i3 & 896), 0);
                pg2Var3 = pg2Var2;
                y81Var3 = y81Var2;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new NUlFixed(co4Var, pg2Var3, y81Var3, i, i2);
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                if (j30VarQ.I(y81Var)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i3 & 731) == 146) {
                if (i6 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                if (i4 != 0) {
                    y81Var2 = j20.a;
                } else {
                    y81Var2 = y81Var;
                }
                rn4 rn4Var4 = (rn4) co4Var.b.getValue();
                wq0.d(rn4Var4, new LPt8Fixed(rn4Var4, (x_$C) j30VarQ.E(r40.a), null), j30VarQ);
                a((rn4) co4Var.b.getValue(), pg2Var2, y81Var2, j30VarQ, (i3 & 112) | (i3 & 896), 0);
                pg2Var3 = pg2Var2;
                y81Var3 = y81Var2;
            } else {
                if (i6 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                if (i4 != 0) {
                    y81Var2 = j20.a;
                } else {
                    y81Var2 = y81Var;
                }
                rn4 rn4Var5 = (rn4) co4Var.b.getValue();
                wq0.d(rn4Var5, new LPt8Fixed(rn4Var5, (x_$C) j30VarQ.E(r40.a), null), j30VarQ);
                a((rn4) co4Var.b.getValue(), pg2Var2, y81Var2, j30VarQ, (i3 & 112) | (i3 & 896), 0);
                pg2Var3 = pg2Var2;
                y81Var3 = y81Var2;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new NUlFixed(co4Var, pg2Var3, y81Var3, i, i2);
        }
        i3 |= 384;
        if ((i3 & 731) == 146) {
            if (i6 != 0) {
                pg2Var2 = pg2.QnHx.w;
            } else {
                pg2Var2 = pg2Var;
            }
            if (i4 != 0) {
                y81Var2 = j20.a;
            } else {
                y81Var2 = y81Var;
            }
            rn4 rn4Var6 = (rn4) co4Var.b.getValue();
            wq0.d(rn4Var6, new LPt8Fixed(rn4Var6, (x_$C) j30VarQ.E(r40.a), null), j30VarQ);
            a((rn4) co4Var.b.getValue(), pg2Var2, y81Var2, j30VarQ, (i3 & 112) | (i3 & 896), 0);
            pg2Var3 = pg2Var2;
            y81Var3 = y81Var2;
        } else {
            if (i6 != 0) {
                pg2Var2 = pg2.QnHx.w;
            } else {
                pg2Var2 = pg2Var;
            }
            if (i4 != 0) {
                y81Var2 = j20.a;
            } else {
                y81Var2 = y81Var;
            }
            rn4 rn4Var7 = (rn4) co4Var.b.getValue();
            wq0.d(rn4Var7, new LPt8Fixed(rn4Var7, (x_$C) j30VarQ.E(r40.a), null), j30VarQ);
            a((rn4) co4Var.b.getValue(), pg2Var2, y81Var2, j30VarQ, (i3 & 112) | (i3 & 896), 0);
            pg2Var3 = pg2Var2;
            y81Var3 = y81Var2;
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new NUlFixed(co4Var, pg2Var3, y81Var3, i, i2);
    }
}
