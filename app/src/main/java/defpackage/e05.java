package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e05 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ x81<g30, Integer, sd5> w;
        public final /* synthetic */ x81<g30, Integer, sd5> x;
        public final /* synthetic */ y81<List<zz4>, g30, Integer, sd5> y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(int i, x81 x81Var, x81 x81Var2, y81 y81Var) {
            super(2);
            this.w = x81Var;
            this.x = x81Var2;
            this.y = y81Var;
            this.z = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                hx0 hx0Var = gm4.a;
                g30Var2.e(1618982084);
                x81<g30, Integer, sd5> x81Var = this.w;
                boolean zI = g30Var2.I(x81Var);
                x81<g30, Integer, sd5> x81Var2 = this.x;
                boolean zI2 = zI | g30Var2.I(x81Var2);
                y81<List<zz4>, g30, Integer, sd5> y81Var = this.y;
                boolean zI3 = zI2 | g30Var2.I(y81Var);
                Object objF = g30Var2.f();
                if (zI3 || objF == g30.QnHx.a) {
                    objF = new h05(this.z, x81Var, x81Var2, y81Var);
                    g30Var2.B(objF);
                }
                g30Var2.G();
                yv4.a(hx0Var, (x81) objF, g30Var2, 6, 0);
            }
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ y81<List<zz4>, g30, Integer, sd5> A;
        public final /* synthetic */ x81<g30, Integer, sd5> B;
        public final /* synthetic */ x81<g30, Integer, sd5> C;
        public final /* synthetic */ int D;
        public final /* synthetic */ int E;
        public final /* synthetic */ int w;
        public final /* synthetic */ pg2 x;
        public final /* synthetic */ long y;
        public final /* synthetic */ long z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public F1(int i, pg2 pg2Var, long j, long j2, y81<? super List<zz4>, ? super g30, ? super Integer, sd5> y81Var, x81<? super g30, ? super Integer, sd5> x81Var, x81<? super g30, ? super Integer, sd5> x81Var2, int i2, int i3) {
            super(2);
            this.w = i;
            this.x = pg2Var;
            this.y = j;
            this.z = j2;
            this.A = y81Var;
            this.B = x81Var;
            this.C = x81Var2;
            this.D = i2;
            this.E = i3;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            e05.a(this.w, this.x, this.y, this.z, this.A, this.B, this.C, g30Var, this.D | 1, this.E);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements y81<List<? extends zz4>, g30, Integer, sd5> {
        public final /* synthetic */ int w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(int i) {
            super(3);
            this.w = i;
        }

        @Override // defpackage.y81
        public final sd5 invoke(List<? extends zz4> list, g30 g30Var, Integer num) {
            num.intValue();
            d05 d05Var = d05.a;
            d05Var.b(0.0f, 3072, 6, 0L, g30Var, new c30(wo1.a, new c05(list.get(this.w))));
            return sd5.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0117  */
    /* JADX WARN: Code duplicated, block: B:103:0x0125  */
    /* JADX WARN: Code duplicated, block: B:104:0x012a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0131  */
    /* JADX WARN: Code duplicated, block: B:109:0x0136  */
    /* JADX WARN: Code duplicated, block: B:110:0x013d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0140  */
    /* JADX WARN: Code duplicated, block: B:113:0x014d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0150  */
    /* JADX WARN: Code duplicated, block: B:116:0x0158 A[PHI: r2 r3 r4 r6 r8
  0x0158: PHI (r2v27 int) = (r2v21 int), (r2v30 int) binds: [B:114:0x014e, B:95:0x0106] A[DONT_GENERATE, DONT_INLINE]
  0x0158: PHI (r3v6 pg2) = (r3v2 pg2), (r3v9 pg2) binds: [B:114:0x014e, B:95:0x0106] A[DONT_GENERATE, DONT_INLINE]
  0x0158: PHI (r4v14 long) = (r4v6 long), (r4v16 long) binds: [B:114:0x014e, B:95:0x0106] A[DONT_GENERATE, DONT_INLINE]
  0x0158: PHI (r6v5 long) = (r6v2 long), (r6v6 long) binds: [B:114:0x014e, B:95:0x0106] A[DONT_GENERATE, DONT_INLINE]
  0x0158: PHI (r8v6 y81<? super java.util.List<zz4>, ? super g30, ? super java.lang.Integer, sd5>) = 
  (r8v1 y81<? super java.util.List<zz4>, ? super g30, ? super java.lang.Integer, sd5>)
  (r8v7 y81<? super java.util.List<zz4>, ? super g30, ? super java.lang.Integer, sd5>)
 binds: [B:114:0x014e, B:95:0x0106] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x0197  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:96:0x010c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x010e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0111  */
    public static final void a(int i, pg2 pg2Var, long j, long j2, y81<? super List<zz4>, ? super g30, ? super Integer, sd5> y81Var, x81<? super g30, ? super Integer, sd5> x81Var, x81<? super g30, ? super Integer, sd5> x81Var2, g30 g30Var, int i2, int i3) {
        int i4;
        long j3;
        long j4;
        int i5;
        y81<? super List<zz4>, ? super g30, ? super Integer, sd5> y81Var2;
        int i6;
        int i7;
        x81<? super g30, ? super Integer, sd5> x81Var3;
        int i8;
        int i9;
        pg2 pg2Var2;
        long jK;
        long jB;
        y81<? super List<zz4>, ? super g30, ? super Integer, sd5> y81VarM;
        int i10;
        x81<? super g30, ? super Integer, sd5> x81Var4;
        rv rvVar;
        x81<? super g30, ? super Integer, sd5> x81Var5;
        pg2 pg2Var3;
        long j5;
        long j6;
        y81<? super List<zz4>, ? super g30, ? super Integer, sd5> y81Var3;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(-249175289);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (j30VarQ.i(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 == 0) {
            if ((i2 & 112) == 0) {
                i4 |= j30VarQ.I(pg2Var) ? 32 : 16;
            }
            if ((i2 & 896) == 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    int i12 = j30VarQ.j(j3) ? 256 : 128;
                    i4 |= i12;
                } else {
                    j3 = j;
                }
                i4 |= i12;
            } else {
                j3 = j;
            }
            if ((i2 & 7168) == 0) {
                if ((i3 & 8) == 0) {
                    j4 = j2;
                    int i13 = j30VarQ.j(j4) ? 2048 : 1024;
                    i4 |= i13;
                } else {
                    j4 = j2;
                }
                i4 |= i13;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((57344 & i2) == 0) {
                    y81Var2 = y81Var;
                    if (j30VarQ.I(y81Var2)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    if ((458752 & i2) == 0) {
                        x81Var3 = x81Var;
                        if (j30VarQ.I(x81Var3)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i4 |= i8;
                    }
                    if ((i3 & 64) != 0) {
                        i4 |= 1572864;
                    } else if ((3670016 & i2) == 0) {
                        if (j30VarQ.I(x81Var2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i4 |= i9;
                    }
                    if ((2995931 & i4) == 599186 || !j30VarQ.t()) {
                        j30VarQ.t0();
                        if ((i2 & 1) != 0 || j30VarQ.Y()) {
                            if (i11 != 0) {
                                pg2Var2 = pg2.QnHx.w;
                            } else {
                                pg2Var2 = pg2Var;
                            }
                            if ((i3 & 4) != 0) {
                                rvVar = (rv) j30VarQ.E(sv.a);
                                if (rvVar.l()) {
                                    jK = rvVar.g();
                                } else {
                                    jK = rvVar.k();
                                }
                                i4 &= -897;
                            } else {
                                jK = j3;
                            }
                            if ((i3 & 8) != 0) {
                                jB = sv.b(jK, j30VarQ);
                                i4 &= -7169;
                            } else {
                                jB = j4;
                            }
                            if (i5 != 0) {
                                y81VarM = X.m(j30VarQ, -553782708, new QnHx(i));
                            } else {
                                y81VarM = y81Var2;
                            }
                            if (i7 != 0) {
                                i10 = i4;
                                x81Var4 = n20.a;
                            }
                            j30VarQ.S();
                            ix4.a(c94.a(pg2Var2, false, l74.w), null, jK, jB, null, 0.0f, X.m(j30VarQ, -1961746365, new CQf(i10, x81Var2, x81Var4, y81VarM)), j30VarQ, (i10 & 896) | 1572864 | (i10 & 7168), 50);
                            y81<? super List<zz4>, ? super g30, ? super Integer, sd5> y81Var4 = y81VarM;
                            x81Var5 = x81Var4;
                            pg2Var3 = pg2Var2;
                            j5 = jK;
                            j6 = jB;
                            y81Var3 = y81Var4;
                        } else {
                            j30VarQ.x();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            pg2Var2 = pg2Var;
                            jK = j3;
                            jB = j4;
                            y81VarM = y81Var2;
                        }
                        i10 = i4;
                        x81Var4 = x81Var3;
                        j30VarQ.S();
                        ix4.a(c94.a(pg2Var2, false, l74.w), null, jK, jB, null, 0.0f, X.m(j30VarQ, -1961746365, new CQf(i10, x81Var2, x81Var4, y81VarM)), j30VarQ, (i10 & 896) | 1572864 | (i10 & 7168), 50);
                        y81<? super List<zz4>, ? super g30, ? super Integer, sd5> y81Var5 = y81VarM;
                        x81Var5 = x81Var4;
                        pg2Var3 = pg2Var2;
                        j5 = jK;
                        j6 = jB;
                        y81Var3 = y81Var5;
                    } else {
                        j30VarQ.x();
                        pg2Var3 = pg2Var;
                        j5 = j3;
                        j6 = j4;
                        y81Var3 = y81Var2;
                        x81Var5 = x81Var3;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new F1(i, pg2Var3, j5, j6, y81Var3, x81Var5, x81Var2, i2, i3);
                }
                i4 |= 196608;
                x81Var3 = x81Var;
                if ((i3 & 64) != 0) {
                    i4 |= 1572864;
                } else if ((3670016 & i2) == 0) {
                    if (j30VarQ.I(x81Var2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i4 |= i9;
                }
                if ((2995931 & i4) == 599186) {
                    j30VarQ.t0();
                    if ((i2 & 1) != 0) {
                        if (i11 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if ((i3 & 4) != 0) {
                            rvVar = (rv) j30VarQ.E(sv.a);
                            if (rvVar.l()) {
                                jK = rvVar.g();
                            } else {
                                jK = rvVar.k();
                            }
                            i4 &= -897;
                        } else {
                            jK = j3;
                        }
                        if ((i3 & 8) != 0) {
                            jB = sv.b(jK, j30VarQ);
                            i4 &= -7169;
                        } else {
                            jB = j4;
                        }
                        if (i5 != 0) {
                            y81VarM = X.m(j30VarQ, -553782708, new QnHx(i));
                        } else {
                            y81VarM = y81Var2;
                        }
                        if (i7 != 0) {
                            i10 = i4;
                            x81Var4 = n20.a;
                        } else {
                            i10 = i4;
                            x81Var4 = x81Var3;
                        }
                    } else {
                        if (i11 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if ((i3 & 4) != 0) {
                            rvVar = (rv) j30VarQ.E(sv.a);
                            if (rvVar.l()) {
                                jK = rvVar.g();
                            } else {
                                jK = rvVar.k();
                            }
                            i4 &= -897;
                        } else {
                            jK = j3;
                        }
                        if ((i3 & 8) != 0) {
                            jB = sv.b(jK, j30VarQ);
                            i4 &= -7169;
                        } else {
                            jB = j4;
                        }
                        if (i5 != 0) {
                            y81VarM = X.m(j30VarQ, -553782708, new QnHx(i));
                        } else {
                            y81VarM = y81Var2;
                        }
                        if (i7 != 0) {
                            i10 = i4;
                            x81Var4 = n20.a;
                        } else {
                            i10 = i4;
                            x81Var4 = x81Var3;
                        }
                    }
                    j30VarQ.S();
                    ix4.a(c94.a(pg2Var2, false, l74.w), null, jK, jB, null, 0.0f, X.m(j30VarQ, -1961746365, new CQf(i10, x81Var2, x81Var4, y81VarM)), j30VarQ, (i10 & 896) | 1572864 | (i10 & 7168), 50);
                    y81<? super List<zz4>, ? super g30, ? super Integer, sd5> y81Var6 = y81VarM;
                    x81Var5 = x81Var4;
                    pg2Var3 = pg2Var2;
                    j5 = jK;
                    j6 = jB;
                    y81Var3 = y81Var6;
                } else {
                    j30VarQ.t0();
                    if ((i2 & 1) != 0) {
                        if (i11 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if ((i3 & 4) != 0) {
                            rvVar = (rv) j30VarQ.E(sv.a);
                            if (rvVar.l()) {
                                jK = rvVar.g();
                            } else {
                                jK = rvVar.k();
                            }
                            i4 &= -897;
                        } else {
                            jK = j3;
                        }
                        if ((i3 & 8) != 0) {
                            jB = sv.b(jK, j30VarQ);
                            i4 &= -7169;
                        } else {
                            jB = j4;
                        }
                        if (i5 != 0) {
                            y81VarM = X.m(j30VarQ, -553782708, new QnHx(i));
                        } else {
                            y81VarM = y81Var2;
                        }
                        if (i7 != 0) {
                            i10 = i4;
                            x81Var4 = n20.a;
                        } else {
                            i10 = i4;
                            x81Var4 = x81Var3;
                        }
                    } else {
                        if (i11 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if ((i3 & 4) != 0) {
                            rvVar = (rv) j30VarQ.E(sv.a);
                            if (rvVar.l()) {
                                jK = rvVar.g();
                            } else {
                                jK = rvVar.k();
                            }
                            i4 &= -897;
                        } else {
                            jK = j3;
                        }
                        if ((i3 & 8) != 0) {
                            jB = sv.b(jK, j30VarQ);
                            i4 &= -7169;
                        } else {
                            jB = j4;
                        }
                        if (i5 != 0) {
                            y81VarM = X.m(j30VarQ, -553782708, new QnHx(i));
                        } else {
                            y81VarM = y81Var2;
                        }
                        if (i7 != 0) {
                            i10 = i4;
                            x81Var4 = n20.a;
                        } else {
                            i10 = i4;
                            x81Var4 = x81Var3;
                        }
                    }
                    j30VarQ.S();
                    ix4.a(c94.a(pg2Var2, false, l74.w), null, jK, jB, null, 0.0f, X.m(j30VarQ, -1961746365, new CQf(i10, x81Var2, x81Var4, y81VarM)), j30VarQ, (i10 & 896) | 1572864 | (i10 & 7168), 50);
                    y81<? super List<zz4>, ? super g30, ? super Integer, sd5> y81Var7 = y81VarM;
                    x81Var5 = x81Var4;
                    pg2Var3 = pg2Var2;
                    j5 = jK;
                    j6 = jB;
                    y81Var3 = y81Var7;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new F1(i, pg2Var3, j5, j6, y81Var3, x81Var5, x81Var2, i2, i3);
            }
            i4 |= 24576;
            y81Var2 = y81Var;
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((458752 & i2) == 0) {
                    x81Var3 = x81Var;
                    if (j30VarQ.I(x81Var3)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
                if ((i3 & 64) != 0) {
                    i4 |= 1572864;
                } else if ((3670016 & i2) == 0) {
                    if (j30VarQ.I(x81Var2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i4 |= i9;
                }
                if ((2995931 & i4) == 599186) {
                    j30VarQ.t0();
                    if ((i2 & 1) != 0) {
                        if (i11 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if ((i3 & 4) != 0) {
                            rvVar = (rv) j30VarQ.E(sv.a);
                            if (rvVar.l()) {
                                jK = rvVar.g();
                            } else {
                                jK = rvVar.k();
                            }
                            i4 &= -897;
                        } else {
                            jK = j3;
                        }
                        if ((i3 & 8) != 0) {
                            jB = sv.b(jK, j30VarQ);
                            i4 &= -7169;
                        } else {
                            jB = j4;
                        }
                        if (i5 != 0) {
                            y81VarM = X.m(j30VarQ, -553782708, new QnHx(i));
                        } else {
                            y81VarM = y81Var2;
                        }
                        if (i7 != 0) {
                            i10 = i4;
                            x81Var4 = n20.a;
                        } else {
                            i10 = i4;
                            x81Var4 = x81Var3;
                        }
                    } else {
                        if (i11 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if ((i3 & 4) != 0) {
                            rvVar = (rv) j30VarQ.E(sv.a);
                            if (rvVar.l()) {
                                jK = rvVar.g();
                            } else {
                                jK = rvVar.k();
                            }
                            i4 &= -897;
                        } else {
                            jK = j3;
                        }
                        if ((i3 & 8) != 0) {
                            jB = sv.b(jK, j30VarQ);
                            i4 &= -7169;
                        } else {
                            jB = j4;
                        }
                        if (i5 != 0) {
                            y81VarM = X.m(j30VarQ, -553782708, new QnHx(i));
                        } else {
                            y81VarM = y81Var2;
                        }
                        if (i7 != 0) {
                            i10 = i4;
                            x81Var4 = n20.a;
                        } else {
                            i10 = i4;
                            x81Var4 = x81Var3;
                        }
                    }
                    j30VarQ.S();
                    ix4.a(c94.a(pg2Var2, false, l74.w), null, jK, jB, null, 0.0f, X.m(j30VarQ, -1961746365, new CQf(i10, x81Var2, x81Var4, y81VarM)), j30VarQ, (i10 & 896) | 1572864 | (i10 & 7168), 50);
                    y81<? super List<zz4>, ? super g30, ? super Integer, sd5> y81Var8 = y81VarM;
                    x81Var5 = x81Var4;
                    pg2Var3 = pg2Var2;
                    j5 = jK;
                    j6 = jB;
                    y81Var3 = y81Var8;
                } else {
                    j30VarQ.t0();
                    if ((i2 & 1) != 0) {
                        if (i11 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if ((i3 & 4) != 0) {
                            rvVar = (rv) j30VarQ.E(sv.a);
                            if (rvVar.l()) {
                                jK = rvVar.g();
                            } else {
                                jK = rvVar.k();
                            }
                            i4 &= -897;
                        } else {
                            jK = j3;
                        }
                        if ((i3 & 8) != 0) {
                            jB = sv.b(jK, j30VarQ);
                            i4 &= -7169;
                        } else {
                            jB = j4;
                        }
                        if (i5 != 0) {
                            y81VarM = X.m(j30VarQ, -553782708, new QnHx(i));
                        } else {
                            y81VarM = y81Var2;
                        }
                        if (i7 != 0) {
                            i10 = i4;
                            x81Var4 = n20.a;
                        } else {
                            i10 = i4;
                            x81Var4 = x81Var3;
                        }
                    } else {
                        if (i11 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if ((i3 & 4) != 0) {
                            rvVar = (rv) j30VarQ.E(sv.a);
                            if (rvVar.l()) {
                                jK = rvVar.g();
                            } else {
                                jK = rvVar.k();
                            }
                            i4 &= -897;
                        } else {
                            jK = j3;
                        }
                        if ((i3 & 8) != 0) {
                            jB = sv.b(jK, j30VarQ);
                            i4 &= -7169;
                        } else {
                            jB = j4;
                        }
                        if (i5 != 0) {
                            y81VarM = X.m(j30VarQ, -553782708, new QnHx(i));
                        } else {
                            y81VarM = y81Var2;
                        }
                        if (i7 != 0) {
                            i10 = i4;
                            x81Var4 = n20.a;
                        } else {
                            i10 = i4;
                            x81Var4 = x81Var3;
                        }
                    }
                    j30VarQ.S();
                    ix4.a(c94.a(pg2Var2, false, l74.w), null, jK, jB, null, 0.0f, X.m(j30VarQ, -1961746365, new CQf(i10, x81Var2, x81Var4, y81VarM)), j30VarQ, (i10 & 896) | 1572864 | (i10 & 7168), 50);
                    y81<? super List<zz4>, ? super g30, ? super Integer, sd5> y81Var9 = y81VarM;
                    x81Var5 = x81Var4;
                    pg2Var3 = pg2Var2;
                    j5 = jK;
                    j6 = jB;
                    y81Var3 = y81Var9;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new F1(i, pg2Var3, j5, j6, y81Var3, x81Var5, x81Var2, i2, i3);
            }
            i4 |= 196608;
            x81Var3 = x81Var;
            if ((i3 & 64) != 0) {
                i4 |= 1572864;
            } else if ((3670016 & i2) == 0) {
                if (j30VarQ.I(x81Var2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i4 |= i9;
            }
            if ((2995931 & i4) == 599186) {
                j30VarQ.t0();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if ((i3 & 4) != 0) {
                        rvVar = (rv) j30VarQ.E(sv.a);
                        if (rvVar.l()) {
                            jK = rvVar.g();
                        } else {
                            jK = rvVar.k();
                        }
                        i4 &= -897;
                    } else {
                        jK = j3;
                    }
                    if ((i3 & 8) != 0) {
                        jB = sv.b(jK, j30VarQ);
                        i4 &= -7169;
                    } else {
                        jB = j4;
                    }
                    if (i5 != 0) {
                        y81VarM = X.m(j30VarQ, -553782708, new QnHx(i));
                    } else {
                        y81VarM = y81Var2;
                    }
                    if (i7 != 0) {
                        i10 = i4;
                        x81Var4 = n20.a;
                    } else {
                        i10 = i4;
                        x81Var4 = x81Var3;
                    }
                } else {
                    if (i11 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if ((i3 & 4) != 0) {
                        rvVar = (rv) j30VarQ.E(sv.a);
                        if (rvVar.l()) {
                            jK = rvVar.g();
                        } else {
                            jK = rvVar.k();
                        }
                        i4 &= -897;
                    } else {
                        jK = j3;
                    }
                    if ((i3 & 8) != 0) {
                        jB = sv.b(jK, j30VarQ);
                        i4 &= -7169;
                    } else {
                        jB = j4;
                    }
                    if (i5 != 0) {
                        y81VarM = X.m(j30VarQ, -553782708, new QnHx(i));
                    } else {
                        y81VarM = y81Var2;
                    }
                    if (i7 != 0) {
                        i10 = i4;
                        x81Var4 = n20.a;
                    } else {
                        i10 = i4;
                        x81Var4 = x81Var3;
                    }
                }
                j30VarQ.S();
                ix4.a(c94.a(pg2Var2, false, l74.w), null, jK, jB, null, 0.0f, X.m(j30VarQ, -1961746365, new CQf(i10, x81Var2, x81Var4, y81VarM)), j30VarQ, (i10 & 896) | 1572864 | (i10 & 7168), 50);
                y81<? super List<zz4>, ? super g30, ? super Integer, sd5> y81Var10 = y81VarM;
                x81Var5 = x81Var4;
                pg2Var3 = pg2Var2;
                j5 = jK;
                j6 = jB;
                y81Var3 = y81Var10;
            } else {
                j30VarQ.t0();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if ((i3 & 4) != 0) {
                        rvVar = (rv) j30VarQ.E(sv.a);
                        if (rvVar.l()) {
                            jK = rvVar.g();
                        } else {
                            jK = rvVar.k();
                        }
                        i4 &= -897;
                    } else {
                        jK = j3;
                    }
                    if ((i3 & 8) != 0) {
                        jB = sv.b(jK, j30VarQ);
                        i4 &= -7169;
                    } else {
                        jB = j4;
                    }
                    if (i5 != 0) {
                        y81VarM = X.m(j30VarQ, -553782708, new QnHx(i));
                    } else {
                        y81VarM = y81Var2;
                    }
                    if (i7 != 0) {
                        i10 = i4;
                        x81Var4 = n20.a;
                    } else {
                        i10 = i4;
                        x81Var4 = x81Var3;
                    }
                } else {
                    if (i11 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if ((i3 & 4) != 0) {
                        rvVar = (rv) j30VarQ.E(sv.a);
                        if (rvVar.l()) {
                            jK = rvVar.g();
                        } else {
                            jK = rvVar.k();
                        }
                        i4 &= -897;
                    } else {
                        jK = j3;
                    }
                    if ((i3 & 8) != 0) {
                        jB = sv.b(jK, j30VarQ);
                        i4 &= -7169;
                    } else {
                        jB = j4;
                    }
                    if (i5 != 0) {
                        y81VarM = X.m(j30VarQ, -553782708, new QnHx(i));
                    } else {
                        y81VarM = y81Var2;
                    }
                    if (i7 != 0) {
                        i10 = i4;
                        x81Var4 = n20.a;
                    } else {
                        i10 = i4;
                        x81Var4 = x81Var3;
                    }
                }
                j30VarQ.S();
                ix4.a(c94.a(pg2Var2, false, l74.w), null, jK, jB, null, 0.0f, X.m(j30VarQ, -1961746365, new CQf(i10, x81Var2, x81Var4, y81VarM)), j30VarQ, (i10 & 896) | 1572864 | (i10 & 7168), 50);
                y81<? super List<zz4>, ? super g30, ? super Integer, sd5> y81Var11 = y81VarM;
                x81Var5 = x81Var4;
                pg2Var3 = pg2Var2;
                j5 = jK;
                j6 = jB;
                y81Var3 = y81Var11;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new F1(i, pg2Var3, j5, j6, y81Var3, x81Var5, x81Var2, i2, i3);
        }
        i4 |= 48;
        if ((i2 & 896) == 0) {
            if ((i3 & 4) == 0) {
                j3 = j;
                if (j30VarQ.j(j3)) {
                }
                i4 |= i12;
            } else {
                j3 = j;
            }
            i4 |= i12;
        } else {
            j3 = j;
        }
        if ((i2 & 7168) == 0) {
            if ((i3 & 8) == 0) {
                j4 = j2;
                if (j30VarQ.j(j4)) {
                }
                i4 |= i13;
            } else {
                j4 = j2;
            }
            i4 |= i13;
        } else {
            j4 = j2;
        }
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((57344 & i2) == 0) {
                y81Var2 = y81Var;
                if (j30VarQ.I(y81Var2)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((458752 & i2) == 0) {
                    x81Var3 = x81Var;
                    if (j30VarQ.I(x81Var3)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
                if ((i3 & 64) != 0) {
                    i4 |= 1572864;
                } else if ((3670016 & i2) == 0) {
                    if (j30VarQ.I(x81Var2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i4 |= i9;
                }
                if ((2995931 & i4) == 599186) {
                    j30VarQ.t0();
                    if ((i2 & 1) != 0) {
                        if (i11 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if ((i3 & 4) != 0) {
                            rvVar = (rv) j30VarQ.E(sv.a);
                            if (rvVar.l()) {
                                jK = rvVar.g();
                            } else {
                                jK = rvVar.k();
                            }
                            i4 &= -897;
                        } else {
                            jK = j3;
                        }
                        if ((i3 & 8) != 0) {
                            jB = sv.b(jK, j30VarQ);
                            i4 &= -7169;
                        } else {
                            jB = j4;
                        }
                        if (i5 != 0) {
                            y81VarM = X.m(j30VarQ, -553782708, new QnHx(i));
                        } else {
                            y81VarM = y81Var2;
                        }
                        if (i7 != 0) {
                            i10 = i4;
                            x81Var4 = n20.a;
                        } else {
                            i10 = i4;
                            x81Var4 = x81Var3;
                        }
                    } else {
                        if (i11 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if ((i3 & 4) != 0) {
                            rvVar = (rv) j30VarQ.E(sv.a);
                            if (rvVar.l()) {
                                jK = rvVar.g();
                            } else {
                                jK = rvVar.k();
                            }
                            i4 &= -897;
                        } else {
                            jK = j3;
                        }
                        if ((i3 & 8) != 0) {
                            jB = sv.b(jK, j30VarQ);
                            i4 &= -7169;
                        } else {
                            jB = j4;
                        }
                        if (i5 != 0) {
                            y81VarM = X.m(j30VarQ, -553782708, new QnHx(i));
                        } else {
                            y81VarM = y81Var2;
                        }
                        if (i7 != 0) {
                            i10 = i4;
                            x81Var4 = n20.a;
                        } else {
                            i10 = i4;
                            x81Var4 = x81Var3;
                        }
                    }
                    j30VarQ.S();
                    ix4.a(c94.a(pg2Var2, false, l74.w), null, jK, jB, null, 0.0f, X.m(j30VarQ, -1961746365, new CQf(i10, x81Var2, x81Var4, y81VarM)), j30VarQ, (i10 & 896) | 1572864 | (i10 & 7168), 50);
                    y81<? super List<zz4>, ? super g30, ? super Integer, sd5> y81Var12 = y81VarM;
                    x81Var5 = x81Var4;
                    pg2Var3 = pg2Var2;
                    j5 = jK;
                    j6 = jB;
                    y81Var3 = y81Var12;
                } else {
                    j30VarQ.t0();
                    if ((i2 & 1) != 0) {
                        if (i11 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if ((i3 & 4) != 0) {
                            rvVar = (rv) j30VarQ.E(sv.a);
                            if (rvVar.l()) {
                                jK = rvVar.g();
                            } else {
                                jK = rvVar.k();
                            }
                            i4 &= -897;
                        } else {
                            jK = j3;
                        }
                        if ((i3 & 8) != 0) {
                            jB = sv.b(jK, j30VarQ);
                            i4 &= -7169;
                        } else {
                            jB = j4;
                        }
                        if (i5 != 0) {
                            y81VarM = X.m(j30VarQ, -553782708, new QnHx(i));
                        } else {
                            y81VarM = y81Var2;
                        }
                        if (i7 != 0) {
                            i10 = i4;
                            x81Var4 = n20.a;
                        } else {
                            i10 = i4;
                            x81Var4 = x81Var3;
                        }
                    } else {
                        if (i11 != 0) {
                            pg2Var2 = pg2.QnHx.w;
                        } else {
                            pg2Var2 = pg2Var;
                        }
                        if ((i3 & 4) != 0) {
                            rvVar = (rv) j30VarQ.E(sv.a);
                            if (rvVar.l()) {
                                jK = rvVar.g();
                            } else {
                                jK = rvVar.k();
                            }
                            i4 &= -897;
                        } else {
                            jK = j3;
                        }
                        if ((i3 & 8) != 0) {
                            jB = sv.b(jK, j30VarQ);
                            i4 &= -7169;
                        } else {
                            jB = j4;
                        }
                        if (i5 != 0) {
                            y81VarM = X.m(j30VarQ, -553782708, new QnHx(i));
                        } else {
                            y81VarM = y81Var2;
                        }
                        if (i7 != 0) {
                            i10 = i4;
                            x81Var4 = n20.a;
                        } else {
                            i10 = i4;
                            x81Var4 = x81Var3;
                        }
                    }
                    j30VarQ.S();
                    ix4.a(c94.a(pg2Var2, false, l74.w), null, jK, jB, null, 0.0f, X.m(j30VarQ, -1961746365, new CQf(i10, x81Var2, x81Var4, y81VarM)), j30VarQ, (i10 & 896) | 1572864 | (i10 & 7168), 50);
                    y81<? super List<zz4>, ? super g30, ? super Integer, sd5> y81Var13 = y81VarM;
                    x81Var5 = x81Var4;
                    pg2Var3 = pg2Var2;
                    j5 = jK;
                    j6 = jB;
                    y81Var3 = y81Var13;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new F1(i, pg2Var3, j5, j6, y81Var3, x81Var5, x81Var2, i2, i3);
            }
            i4 |= 196608;
            x81Var3 = x81Var;
            if ((i3 & 64) != 0) {
                i4 |= 1572864;
            } else if ((3670016 & i2) == 0) {
                if (j30VarQ.I(x81Var2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i4 |= i9;
            }
            if ((2995931 & i4) == 599186) {
                j30VarQ.t0();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if ((i3 & 4) != 0) {
                        rvVar = (rv) j30VarQ.E(sv.a);
                        if (rvVar.l()) {
                            jK = rvVar.g();
                        } else {
                            jK = rvVar.k();
                        }
                        i4 &= -897;
                    } else {
                        jK = j3;
                    }
                    if ((i3 & 8) != 0) {
                        jB = sv.b(jK, j30VarQ);
                        i4 &= -7169;
                    } else {
                        jB = j4;
                    }
                    if (i5 != 0) {
                        y81VarM = X.m(j30VarQ, -553782708, new QnHx(i));
                    } else {
                        y81VarM = y81Var2;
                    }
                    if (i7 != 0) {
                        i10 = i4;
                        x81Var4 = n20.a;
                    } else {
                        i10 = i4;
                        x81Var4 = x81Var3;
                    }
                } else {
                    if (i11 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if ((i3 & 4) != 0) {
                        rvVar = (rv) j30VarQ.E(sv.a);
                        if (rvVar.l()) {
                            jK = rvVar.g();
                        } else {
                            jK = rvVar.k();
                        }
                        i4 &= -897;
                    } else {
                        jK = j3;
                    }
                    if ((i3 & 8) != 0) {
                        jB = sv.b(jK, j30VarQ);
                        i4 &= -7169;
                    } else {
                        jB = j4;
                    }
                    if (i5 != 0) {
                        y81VarM = X.m(j30VarQ, -553782708, new QnHx(i));
                    } else {
                        y81VarM = y81Var2;
                    }
                    if (i7 != 0) {
                        i10 = i4;
                        x81Var4 = n20.a;
                    } else {
                        i10 = i4;
                        x81Var4 = x81Var3;
                    }
                }
                j30VarQ.S();
                ix4.a(c94.a(pg2Var2, false, l74.w), null, jK, jB, null, 0.0f, X.m(j30VarQ, -1961746365, new CQf(i10, x81Var2, x81Var4, y81VarM)), j30VarQ, (i10 & 896) | 1572864 | (i10 & 7168), 50);
                y81<? super List<zz4>, ? super g30, ? super Integer, sd5> y81Var14 = y81VarM;
                x81Var5 = x81Var4;
                pg2Var3 = pg2Var2;
                j5 = jK;
                j6 = jB;
                y81Var3 = y81Var14;
            } else {
                j30VarQ.t0();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if ((i3 & 4) != 0) {
                        rvVar = (rv) j30VarQ.E(sv.a);
                        if (rvVar.l()) {
                            jK = rvVar.g();
                        } else {
                            jK = rvVar.k();
                        }
                        i4 &= -897;
                    } else {
                        jK = j3;
                    }
                    if ((i3 & 8) != 0) {
                        jB = sv.b(jK, j30VarQ);
                        i4 &= -7169;
                    } else {
                        jB = j4;
                    }
                    if (i5 != 0) {
                        y81VarM = X.m(j30VarQ, -553782708, new QnHx(i));
                    } else {
                        y81VarM = y81Var2;
                    }
                    if (i7 != 0) {
                        i10 = i4;
                        x81Var4 = n20.a;
                    } else {
                        i10 = i4;
                        x81Var4 = x81Var3;
                    }
                } else {
                    if (i11 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if ((i3 & 4) != 0) {
                        rvVar = (rv) j30VarQ.E(sv.a);
                        if (rvVar.l()) {
                            jK = rvVar.g();
                        } else {
                            jK = rvVar.k();
                        }
                        i4 &= -897;
                    } else {
                        jK = j3;
                    }
                    if ((i3 & 8) != 0) {
                        jB = sv.b(jK, j30VarQ);
                        i4 &= -7169;
                    } else {
                        jB = j4;
                    }
                    if (i5 != 0) {
                        y81VarM = X.m(j30VarQ, -553782708, new QnHx(i));
                    } else {
                        y81VarM = y81Var2;
                    }
                    if (i7 != 0) {
                        i10 = i4;
                        x81Var4 = n20.a;
                    } else {
                        i10 = i4;
                        x81Var4 = x81Var3;
                    }
                }
                j30VarQ.S();
                ix4.a(c94.a(pg2Var2, false, l74.w), null, jK, jB, null, 0.0f, X.m(j30VarQ, -1961746365, new CQf(i10, x81Var2, x81Var4, y81VarM)), j30VarQ, (i10 & 896) | 1572864 | (i10 & 7168), 50);
                y81<? super List<zz4>, ? super g30, ? super Integer, sd5> y81Var15 = y81VarM;
                x81Var5 = x81Var4;
                pg2Var3 = pg2Var2;
                j5 = jK;
                j6 = jB;
                y81Var3 = y81Var15;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new F1(i, pg2Var3, j5, j6, y81Var3, x81Var5, x81Var2, i2, i3);
        }
        i4 |= 24576;
        y81Var2 = y81Var;
        i7 = i3 & 32;
        if (i7 != 0) {
            if ((458752 & i2) == 0) {
                x81Var3 = x81Var;
                if (j30VarQ.I(x81Var3)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
            if ((i3 & 64) != 0) {
                i4 |= 1572864;
            } else if ((3670016 & i2) == 0) {
                if (j30VarQ.I(x81Var2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i4 |= i9;
            }
            if ((2995931 & i4) == 599186) {
                j30VarQ.t0();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if ((i3 & 4) != 0) {
                        rvVar = (rv) j30VarQ.E(sv.a);
                        if (rvVar.l()) {
                            jK = rvVar.g();
                        } else {
                            jK = rvVar.k();
                        }
                        i4 &= -897;
                    } else {
                        jK = j3;
                    }
                    if ((i3 & 8) != 0) {
                        jB = sv.b(jK, j30VarQ);
                        i4 &= -7169;
                    } else {
                        jB = j4;
                    }
                    if (i5 != 0) {
                        y81VarM = X.m(j30VarQ, -553782708, new QnHx(i));
                    } else {
                        y81VarM = y81Var2;
                    }
                    if (i7 != 0) {
                        i10 = i4;
                        x81Var4 = n20.a;
                    } else {
                        i10 = i4;
                        x81Var4 = x81Var3;
                    }
                } else {
                    if (i11 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if ((i3 & 4) != 0) {
                        rvVar = (rv) j30VarQ.E(sv.a);
                        if (rvVar.l()) {
                            jK = rvVar.g();
                        } else {
                            jK = rvVar.k();
                        }
                        i4 &= -897;
                    } else {
                        jK = j3;
                    }
                    if ((i3 & 8) != 0) {
                        jB = sv.b(jK, j30VarQ);
                        i4 &= -7169;
                    } else {
                        jB = j4;
                    }
                    if (i5 != 0) {
                        y81VarM = X.m(j30VarQ, -553782708, new QnHx(i));
                    } else {
                        y81VarM = y81Var2;
                    }
                    if (i7 != 0) {
                        i10 = i4;
                        x81Var4 = n20.a;
                    } else {
                        i10 = i4;
                        x81Var4 = x81Var3;
                    }
                }
                j30VarQ.S();
                ix4.a(c94.a(pg2Var2, false, l74.w), null, jK, jB, null, 0.0f, X.m(j30VarQ, -1961746365, new CQf(i10, x81Var2, x81Var4, y81VarM)), j30VarQ, (i10 & 896) | 1572864 | (i10 & 7168), 50);
                y81<? super List<zz4>, ? super g30, ? super Integer, sd5> y81Var16 = y81VarM;
                x81Var5 = x81Var4;
                pg2Var3 = pg2Var2;
                j5 = jK;
                j6 = jB;
                y81Var3 = y81Var16;
            } else {
                j30VarQ.t0();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if ((i3 & 4) != 0) {
                        rvVar = (rv) j30VarQ.E(sv.a);
                        if (rvVar.l()) {
                            jK = rvVar.g();
                        } else {
                            jK = rvVar.k();
                        }
                        i4 &= -897;
                    } else {
                        jK = j3;
                    }
                    if ((i3 & 8) != 0) {
                        jB = sv.b(jK, j30VarQ);
                        i4 &= -7169;
                    } else {
                        jB = j4;
                    }
                    if (i5 != 0) {
                        y81VarM = X.m(j30VarQ, -553782708, new QnHx(i));
                    } else {
                        y81VarM = y81Var2;
                    }
                    if (i7 != 0) {
                        i10 = i4;
                        x81Var4 = n20.a;
                    } else {
                        i10 = i4;
                        x81Var4 = x81Var3;
                    }
                } else {
                    if (i11 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    if ((i3 & 4) != 0) {
                        rvVar = (rv) j30VarQ.E(sv.a);
                        if (rvVar.l()) {
                            jK = rvVar.g();
                        } else {
                            jK = rvVar.k();
                        }
                        i4 &= -897;
                    } else {
                        jK = j3;
                    }
                    if ((i3 & 8) != 0) {
                        jB = sv.b(jK, j30VarQ);
                        i4 &= -7169;
                    } else {
                        jB = j4;
                    }
                    if (i5 != 0) {
                        y81VarM = X.m(j30VarQ, -553782708, new QnHx(i));
                    } else {
                        y81VarM = y81Var2;
                    }
                    if (i7 != 0) {
                        i10 = i4;
                        x81Var4 = n20.a;
                    } else {
                        i10 = i4;
                        x81Var4 = x81Var3;
                    }
                }
                j30VarQ.S();
                ix4.a(c94.a(pg2Var2, false, l74.w), null, jK, jB, null, 0.0f, X.m(j30VarQ, -1961746365, new CQf(i10, x81Var2, x81Var4, y81VarM)), j30VarQ, (i10 & 896) | 1572864 | (i10 & 7168), 50);
                y81<? super List<zz4>, ? super g30, ? super Integer, sd5> y81Var17 = y81VarM;
                x81Var5 = x81Var4;
                pg2Var3 = pg2Var2;
                j5 = jK;
                j6 = jB;
                y81Var3 = y81Var17;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new F1(i, pg2Var3, j5, j6, y81Var3, x81Var5, x81Var2, i2, i3);
        }
        i4 |= 196608;
        x81Var3 = x81Var;
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((3670016 & i2) == 0) {
            if (j30VarQ.I(x81Var2)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i4 |= i9;
        }
        if ((2995931 & i4) == 599186) {
            j30VarQ.t0();
            if ((i2 & 1) != 0) {
                if (i11 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                if ((i3 & 4) != 0) {
                    rvVar = (rv) j30VarQ.E(sv.a);
                    if (rvVar.l()) {
                        jK = rvVar.g();
                    } else {
                        jK = rvVar.k();
                    }
                    i4 &= -897;
                } else {
                    jK = j3;
                }
                if ((i3 & 8) != 0) {
                    jB = sv.b(jK, j30VarQ);
                    i4 &= -7169;
                } else {
                    jB = j4;
                }
                if (i5 != 0) {
                    y81VarM = X.m(j30VarQ, -553782708, new QnHx(i));
                } else {
                    y81VarM = y81Var2;
                }
                if (i7 != 0) {
                    i10 = i4;
                    x81Var4 = n20.a;
                } else {
                    i10 = i4;
                    x81Var4 = x81Var3;
                }
            } else {
                if (i11 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                if ((i3 & 4) != 0) {
                    rvVar = (rv) j30VarQ.E(sv.a);
                    if (rvVar.l()) {
                        jK = rvVar.g();
                    } else {
                        jK = rvVar.k();
                    }
                    i4 &= -897;
                } else {
                    jK = j3;
                }
                if ((i3 & 8) != 0) {
                    jB = sv.b(jK, j30VarQ);
                    i4 &= -7169;
                } else {
                    jB = j4;
                }
                if (i5 != 0) {
                    y81VarM = X.m(j30VarQ, -553782708, new QnHx(i));
                } else {
                    y81VarM = y81Var2;
                }
                if (i7 != 0) {
                    i10 = i4;
                    x81Var4 = n20.a;
                } else {
                    i10 = i4;
                    x81Var4 = x81Var3;
                }
            }
            j30VarQ.S();
            ix4.a(c94.a(pg2Var2, false, l74.w), null, jK, jB, null, 0.0f, X.m(j30VarQ, -1961746365, new CQf(i10, x81Var2, x81Var4, y81VarM)), j30VarQ, (i10 & 896) | 1572864 | (i10 & 7168), 50);
            y81<? super List<zz4>, ? super g30, ? super Integer, sd5> y81Var18 = y81VarM;
            x81Var5 = x81Var4;
            pg2Var3 = pg2Var2;
            j5 = jK;
            j6 = jB;
            y81Var3 = y81Var18;
        } else {
            j30VarQ.t0();
            if ((i2 & 1) != 0) {
                if (i11 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                if ((i3 & 4) != 0) {
                    rvVar = (rv) j30VarQ.E(sv.a);
                    if (rvVar.l()) {
                        jK = rvVar.g();
                    } else {
                        jK = rvVar.k();
                    }
                    i4 &= -897;
                } else {
                    jK = j3;
                }
                if ((i3 & 8) != 0) {
                    jB = sv.b(jK, j30VarQ);
                    i4 &= -7169;
                } else {
                    jB = j4;
                }
                if (i5 != 0) {
                    y81VarM = X.m(j30VarQ, -553782708, new QnHx(i));
                } else {
                    y81VarM = y81Var2;
                }
                if (i7 != 0) {
                    i10 = i4;
                    x81Var4 = n20.a;
                } else {
                    i10 = i4;
                    x81Var4 = x81Var3;
                }
            } else {
                if (i11 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                if ((i3 & 4) != 0) {
                    rvVar = (rv) j30VarQ.E(sv.a);
                    if (rvVar.l()) {
                        jK = rvVar.g();
                    } else {
                        jK = rvVar.k();
                    }
                    i4 &= -897;
                } else {
                    jK = j3;
                }
                if ((i3 & 8) != 0) {
                    jB = sv.b(jK, j30VarQ);
                    i4 &= -7169;
                } else {
                    jB = j4;
                }
                if (i5 != 0) {
                    y81VarM = X.m(j30VarQ, -553782708, new QnHx(i));
                } else {
                    y81VarM = y81Var2;
                }
                if (i7 != 0) {
                    i10 = i4;
                    x81Var4 = n20.a;
                } else {
                    i10 = i4;
                    x81Var4 = x81Var3;
                }
            }
            j30VarQ.S();
            ix4.a(c94.a(pg2Var2, false, l74.w), null, jK, jB, null, 0.0f, X.m(j30VarQ, -1961746365, new CQf(i10, x81Var2, x81Var4, y81VarM)), j30VarQ, (i10 & 896) | 1572864 | (i10 & 7168), 50);
            y81<? super List<zz4>, ? super g30, ? super Integer, sd5> y81Var19 = y81VarM;
            x81Var5 = x81Var4;
            pg2Var3 = pg2Var2;
            j5 = jK;
            j6 = jB;
            y81Var3 = y81Var19;
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new F1(i, pg2Var3, j5, j6, y81Var3, x81Var5, x81Var2, i2, i3);
    }
}
