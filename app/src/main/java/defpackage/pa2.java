package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pa2 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;
        public final /* synthetic */ rv w;
        public final /* synthetic */ rc5 x;
        public final /* synthetic */ jj4 y;
        public final /* synthetic */ x81<g30, Integer, sd5> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(rv rvVar, rc5 rc5Var, jj4 jj4Var, x81<? super g30, ? super Integer, sd5> x81Var, int i, int i2) {
            super(2);
            this.w = rvVar;
            this.x = rc5Var;
            this.y = jj4Var;
            this.z = x81Var;
            this.A = i;
            this.B = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            pa2.a(this.w, this.x, this.y, this.z, g30Var, this.A | 1, this.B);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ rc5 w;
        public final /* synthetic */ x81<g30, Integer, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(rc5 rc5Var, x81<? super g30, ? super Integer, sd5> x81Var, int i) {
            super(2);
            this.w = rc5Var;
            this.x = x81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                j55.a(this.w.i, X.m(g30Var2, 181426554, new oa2(this.y, this.x)), g30Var2, 48);
            }
            return sd5.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(rv rvVar, rc5 rc5Var, jj4 jj4Var, x81<? super g30, ? super Integer, sd5> x81Var, g30 g30Var, int i, int i2) {
        rv rvVar2;
        int i3;
        rc5 rc5Var2;
        jj4 jj4Var2;
        int i4;
        float f;
        rc5 rc5Var3;
        jj4 jj4Var3;
        j30 j30VarQ = g30Var.q(-891417079);
        if ((i & 14) == 0) {
            if ((i2 & 1) == 0) {
                rvVar2 = rvVar;
                int i5 = j30VarQ.I(rvVar2) ? 4 : 2;
                i3 = i5 | i;
            } else {
                rvVar2 = rvVar;
            }
            i3 = i5 | i;
        } else {
            rvVar2 = rvVar;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                rc5Var2 = rc5Var;
                int i6 = j30VarQ.I(rc5Var2) ? 32 : 16;
                i3 |= i6;
            } else {
                rc5Var2 = rc5Var;
            }
            i3 |= i6;
        } else {
            rc5Var2 = rc5Var;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                jj4Var2 = jj4Var;
                int i7 = j30VarQ.I(jj4Var2) ? 256 : 128;
                i3 |= i7;
            } else {
                jj4Var2 = jj4Var;
            }
            i3 |= i7;
        } else {
            jj4Var2 = jj4Var;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= j30VarQ.I(x81Var) ? 2048 : 1024;
        }
        if ((i3 & 5851) == 1170 && j30VarQ.t()) {
            j30VarQ.x();
            rc5Var3 = rc5Var2;
            jj4Var3 = jj4Var2;
        } else {
            j30VarQ.t0();
            if ((i & 1) == 0 || j30VarQ.Y()) {
                if ((i2 & 1) != 0) {
                    rvVar2 = (rv) j30VarQ.E(sv.a);
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    rc5Var2 = (rc5) j30VarQ.E(sc5.a);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    jj4Var2 = (jj4) j30VarQ.E(kj4.a);
                    i3 &= -897;
                }
            } else {
                j30VarQ.x();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            }
            int i8 = i3;
            rc5 rc5Var4 = rc5Var2;
            jj4 jj4Var4 = jj4Var2;
            j30VarQ.S();
            j30VarQ.e(-492369756);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (objB0 == c0132QnHx) {
                rv rvVar3 = new rv(rvVar2.g(), rvVar2.h(), rvVar2.i(), rvVar2.j(), rvVar2.a(), rvVar2.k(), rvVar2.b(), rvVar2.d(), rvVar2.e(), rvVar2.c(), rvVar2.f(), ((yu) rvVar2.l.getValue()).a, rvVar2.l());
                j30VarQ.F0(rvVar3);
                objB0 = rvVar3;
            }
            j30VarQ.R(false);
            rv rvVar4 = (rv) objB0;
            jt4 jt4Var = sv.a;
            rvVar4.a.setValue(new yu(rvVar2.g()));
            rvVar4.b.setValue(new yu(rvVar2.h()));
            rvVar4.c.setValue(new yu(rvVar2.i()));
            rvVar4.d.setValue(new yu(rvVar2.j()));
            rvVar4.e.setValue(new yu(rvVar2.a()));
            rvVar4.f.setValue(new yu(rvVar2.k()));
            rvVar4.g.setValue(new yu(rvVar2.b()));
            rvVar4.h.setValue(new yu(rvVar2.d()));
            rvVar4.i.setValue(new yu(rvVar2.e()));
            rvVar4.j.setValue(new yu(rvVar2.c()));
            rvVar4.k.setValue(new yu(rvVar2.f()));
            rvVar4.l.setValue(new yu(((yu) rvVar2.l.getValue()).a));
            rvVar4.m.setValue(Boolean.valueOf(rvVar2.l()));
            p53 p53VarA = vs3.a(false, 0.0f, 0L, j30VarQ, 0, 7);
            j30VarQ.e(-721696685);
            long jG = rvVar4.g();
            long jA = rvVar4.a();
            j30VarQ.e(35572910);
            long jA2 = sv.a(rvVar4, jA);
            long j = (jA2 > yu.h ? 1 : (jA2 == yu.h ? 0 : -1)) != 0 ? jA2 : ((yu) j30VarQ.E(r70.a)).a;
            j30VarQ.R(false);
            rv rvVar5 = rvVar2;
            long jB = yu.b(j, AY.C(j30VarQ, 6));
            yu yuVar = new yu(jG);
            yu yuVar2 = new yu(jA);
            yu yuVar3 = new yu(jB);
            j30VarQ.e(1618982084);
            boolean zI = j30VarQ.I(yuVar) | j30VarQ.I(yuVar2) | j30VarQ.I(yuVar3);
            Object objB1 = j30VarQ.b0();
            if (zI || objB1 == c0132QnHx) {
                long jG2 = rvVar4.g();
                float F = fp1.F(jG, 0.4f, jB, jA);
                float F2 = fp1.F(jG, 0.2f, jB, jA);
                if (F >= 4.5f) {
                    i4 = i8;
                    f = 0.4f;
                } else {
                    i4 = i8;
                    if (F2 < 4.5f) {
                        f = 0.2f;
                    } else {
                        int i9 = 0;
                        float f2 = 0.4f;
                        float f3 = 0.4f;
                        float f4 = 0.2f;
                        for (int i10 = 7; i9 < i10; i10 = 7) {
                            int i11 = i9;
                            float F3 = (fp1.F(jG, f2, jB, jA) / 4.5f) - 1.0f;
                            if (0.0f <= F3 && F3 <= 0.01f) {
                                break;
                            }
                            if (F3 < 0.0f) {
                                f3 = f2;
                            } else {
                                f4 = f2;
                            }
                            f2 = (f3 + f4) / 2.0f;
                            i9 = i11 + 1;
                        }
                        f = f2;
                    }
                }
                objB1 = new t55(jG2, yu.b(jG, f));
                j30VarQ.F0(objB1);
            } else {
                i4 = i8;
            }
            j30VarQ.R(false);
            j30VarQ.R(false);
            q40.a(new ng3[]{sv.a.b(rvVar4), p70.a.b(Float.valueOf(AY.A(j30VarQ))), wj1.a.b(p53VarA), xs3.a.b(ka2.a), kj4.a.b(jj4Var4), u55.a.b((t55) objB1), sc5.a.b(rc5Var4)}, X.m(j30VarQ, -1740102967, new QnHx(rc5Var4, x81Var, i4)), j30VarQ, 56);
            rvVar2 = rvVar5;
            rc5Var3 = rc5Var4;
            jj4Var3 = jj4Var4;
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(rvVar2, rc5Var3, jj4Var3, x81Var, i, i2);
    }
}
